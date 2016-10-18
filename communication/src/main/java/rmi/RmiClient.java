package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        RmiInterface rmiInterface = (RmiInterface) Naming.lookup("//localhost/person");
        System.out.println(rmiInterface.getName());
        System.out.println(rmiInterface.getAge());
        rmiInterface.sendName("name2");
        rmiInterface.sendAge(31);
    }
}
