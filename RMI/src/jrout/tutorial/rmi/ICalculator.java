package jrout.tutorial.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {
    int calc(int i , int j , String type) throws RemoteException;
}