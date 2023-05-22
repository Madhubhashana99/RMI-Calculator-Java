package server;

import calc.Calculator;
import calc.MyCalculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {

        try{
            Registry myReg = LocateRegistry.createRegistry(54321); //Create a Registry
            Calculator myCal = new MyCalculator();
            myReg.rebind("MyCalculatorServer",myCal); //Binding the remote object

            System.out.println("My Calculator is Running..");

        }catch (Exception e){
            System.out.println("Exception Occured: "+ e.getMessage());
        }
    }
}
