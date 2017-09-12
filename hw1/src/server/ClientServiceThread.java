import java.io.*;
import java.net.*;

public class ClientServiceThread implements Runnable, Closeable{
    private Socket client;
    private BufferedReader reader;
    private BufferedWriter writer;
    ClientServiceThread(Socket client) throws IOException{
        this.client = client;
        this.reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        this.writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
    }

    public void run(){
        try{
            this.writer.write(this.reader.readLine());
            this.writer.newLine();
            this.writer.flush();
            close();
        }catch(IOException e ){
            System.err.println(e.toString());
        }
    }
    public void close() throws IOException{
        this.client.close();
        this.reader.close();
        this.writer.close();
    }

}