import java.io.*;
import java.net.*;

public class ClientTimer implements Closeable{
    private Socket socket;
    private long startTime;
    private BufferedReader reader;
    private BufferedWriter writer;
    public ClientTimer(Socket s) throws IOException{
        this.socket = s;
        this.reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        this.writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    }

    private void start(){
        this.startTime = System.currentTimeMillis();
    }
    private long elapsed(){
        return System.currentTimeMillis() - this.startTime;
    }

    // Send then wait for result on the same socket
    // Returns the elapsed time
    public long sendAndReceive(int count) throws Exception{
        char[] dat = new char[count];
        for (int i = 0; i < dat.length; i ++){
            dat[i] = '0';
        }
        System.out.println("\""+new String(dat)+"\"");
        // Start timer
        start();
        // Send byte stream
        writer.write(dat);
        writer.newLine();
        writer.flush();
        String res = reader.readLine();
        if(res == null){
            throw new Exception("server disconnected unexpectedly.");
        }
        long el = elapsed();
        return el;
    }

    public void close() throws IOException{
        this.reader.close();
        this.writer.close();
        this.socket.close();
    }
}