import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;

public interface MusicMixInterface extends Remote{
    public void playAudio()throws RemoteException;
    public void stopAudio()throws RemoteException;
}

