package client;

import calc.Calculator;

import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            Registry myReg = LocateRegistry.getRegistry("localhost",54321);
            Calculator myCal = (Calculator) myReg.lookup("MyCalculatorServer");

            int add = myCal.addTwoNumbers(10,20);
            System.out.println("Addition: "+add);

            int sub = myCal.subTwoNumbers(20,10);
            System.out.println("Subtraction: "+sub);

            int mul = myCal.multiTwoNumbers(10,20);
            System.out.println("Multiplication: "+mul);

            int div = myCal.divideTwoNumbers(20,10);
            System.out.println("Division: "+div);

        }catch(Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
