package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer extends UnicastRemoteObject implements RmiInterface{

    protected RmiServer() throws RemoteException {
        super(0);
    }

    public String getName() {
        return "name1";
    }

    public int getAge() {
        return 29;
    }

    public void sendName(String name) throws RemoteException {
        System.out.println(name);
    }

    public void sendAge(int age) throws RemoteException {
        System.out.println(age);
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        System.out.println("RMI Server started");

        try {
            LocateRegistry.createRegistry(1099);
        } catch (RemoteException e) {
            System.err.println("Java RMI registry already exists.");
        }

        RmiServer rmiServer = new RmiServer();
        Naming.rebind("//localhost/person", rmiServer);

        System.out.println("Peer server bound in registry");
    }
}
