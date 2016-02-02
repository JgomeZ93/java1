package java1;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Enumeration;
import java.util.Hashtable;

public class Java1 {
public static void main(String[] args) throws UnknownHostException, IOException {
       Hashtable<String,String> contenedor=new Hashtable<String,String>();
       Enumeration<String> enumeration = contenedor.elements();
while (enumeration.hasMoreElements()) {
  System.out.println(""+"hashtable valores: " + enumeration.nextElement());
}
       contenedor.put("101", "Harry");
       System.out.println(contenedor.get("101"));
    Process p = new ProcessBuilder("ipconfig").start();
InputStream is = p.getInputStream();
BufferedReader br = new BufferedReader(new InputStreamReader(is));
String line;
while ((line = br.readLine()) != null) {
//System.out.println(line);
}
    String dirWeb = "www.google.com";
    int puerto = 80;
try{
  Socket s = new Socket(dirWeb, puerto);
  if(s.isConnected()){
//  System.out.println("Conexión establecida con la dirección: " +  dirWeb + " a travéz del puerto: " + puerto);
}
  }catch(Exception e){
  System.err.println("No se pudo establecer conexión con: " + dirWeb + " a travez del puerto: " + puerto);
}

ServerSocket s = new ServerSocket(2);
//System.out.println("listening on port: " + s.getLocalPort());
    String a = "";
    InetAddress IP=InetAddress.getLocalHost();
    a = a+IP.getHostAddress();
    JOptionPane.showMessageDialog(null,"La IP es: "+a+"\nMascara: " + line); 
    
    
    
      ExecutorService executor = Executors.newCachedThreadPool();
 
      int ini=1,fin=100;
      while(fin<=65500){
      executor.execute(new Run(ini,fin));
      fin+=100;
      ini+=100;
      }
      executor.execute(new Run(65501,65535));
 
      
      
      String ip = ""+IP.getHostAddress(); // Ip de la máquina remota 
try { 
        InetAddress ping = InetAddress.getByName(ip);
if(ping.isReachable(5000)){ 
System.out.println(ip+" - responde!"); 
}else { 
System.out.println(ip+" - no responde!"); 
}
} catch (IOException ex) { System.out.println(ex); } 
        } 
 
    }
 
class Run implements Runnable{
    int puerto = 0;
    int fin;
    public Run(int port,int fin){
    puerto = port;
    this.fin=fin;
    }
 
    public void run(){
    Scanner Scanner = new Scanner(puerto,fin);
    }
}
 
 
class Scanner {
 
public Scanner(int puerto,int fin){
 
Socket dame;
String ip="localhost";
 
        for(int port =puerto;port<=fin;port++){
         try{
         dame = new Socket(ip,80);
 System.out.println(port+" abierto"); 
//         JOptionPane.showMessageDialog(null,"Puerto "+port+" Abierto");
         dame.close();
 
         }
         catch(Exception ex){}
 
      } 
    
    
    
    }
    
}
