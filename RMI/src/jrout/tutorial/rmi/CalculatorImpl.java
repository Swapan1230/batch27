package jrout.tutorial.rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements ICalculator , Serializable {
    protected CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int calc(int i, int j, String type) throws RemoteException {
        if("MULT".equals(type)){
            return i * j;
        }else if("ADD".equals(type)){
            return i+j;
        }
        return 0;
    }
}
