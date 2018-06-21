package jrout.tutorial.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost",3456);
        ICalculator calculator = (ICalculator)registry.lookup("Calculator");
        System.out.println(calculator.calc(34,5,"ADD"));

    }
}
