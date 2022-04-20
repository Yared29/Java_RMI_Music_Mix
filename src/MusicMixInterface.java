import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;

public interface MusicMixInterface extends Remote {
  public void playAudio(String audioName) throws RemoteException;
  public void stopAudio(String audioName) throws RemoteException;
}