package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterface extends Remote {

    String getName() throws RemoteException;
    int getAge() throws RemoteException;

    void sendName(String name) throws RemoteException;
    void sendAge(int age) throws RemoteException;
}
