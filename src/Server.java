import java.rmi.*;

public class Server {
  public static void main(String args[]) {
    try {
      MusicMixInterface stub = new MusicMixRemote();
      Naming.rebind("rmi://10.194.119.32:5000/MUSIC", stub);
      System.out.println("Server running ...");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}