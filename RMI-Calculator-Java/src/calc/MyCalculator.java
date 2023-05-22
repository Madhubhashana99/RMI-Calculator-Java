package calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {


    protected MyCalculator() throws RemoteException {
        super();
    }

    @Override
    public int addTwoNumbers(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int subTwoNumbers(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int multiTwoNumbers(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int divideTwoNumbers(int x, int y) throws RemoteException {
        return 0;
    }
}
