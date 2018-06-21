package jrout.tutorial.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMICalculatorServer {
    public static void main(String[] args) throws RemoteException {

        ICalculator calculator = new CalculatorImpl();
        Registry registry = LocateRegistry.createRegistry(3456);
        registry.rebind("Calculator",calculator);
        System.out.println("Server has started......");
    }
}
