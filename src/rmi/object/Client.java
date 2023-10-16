package rmi.object;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws RemoteException {
        try {
            Registry registry;
            String serverUrl = "rmi://10.20.97.27:1099/chat";
            registry = LocateRegistry.getRegistry("10.20.97.27", 1099);
            RMIInterface remoteInterface = (RMIInterface) Naming.lookup(serverUrl);
            String data = "Ha Viet Anh - B20DCDT008";
            remoteInterface.showText(data);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}