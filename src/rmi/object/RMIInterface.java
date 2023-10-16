package rmi.object;

public interface RMIInterface extends java.rmi.Remote{
    public void showText(String s) throws java.rmi.RemoteException;

    public void getArray(char a[]) throws java.rmi.RemoteException;
}
