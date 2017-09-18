
import java.io.*;
import java.net.*;

public class Server{
        private static int DEFAULT_PORT = 12345;
        
        private static void reportErr(String e ){
		System.err.println("err: " + e);
        }

        public static void main (String[] args){
                int port = DEFAULT_PORT;
                if(args.length == 1){
                        try{
                                port = Integer.parseInt(args[0]);
                        }catch(NumberFormatException e ){
                                reportErr("convert port argument: "+e.toString());
                                return;
                        }
                }

                try(ServerSocket serv = new ServerSocket(port)){
                        System.out.println("Server is listening on port "+port);
                        while(true ){
                                final Socket newSocket = serv.accept();
                                Thread t = new Thread(new ClientServiceThread(newSocket));
                                t.run();
                        }
                }catch(IOException e ){
                        reportErr("create server socket"+e.toString());
                        return;
                }
                
        }
}