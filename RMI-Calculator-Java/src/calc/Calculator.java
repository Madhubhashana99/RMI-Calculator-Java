package calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    public int addTwoNumbers(int x,int y) throws RemoteException;
    public int subTwoNumbers(int x,int y) throws RemoteException;
    public int multiTwoNumbers(int x,int y) throws RemoteException;
    public int divideTwoNumbers(int x,int y) throws RemoteException;
}
