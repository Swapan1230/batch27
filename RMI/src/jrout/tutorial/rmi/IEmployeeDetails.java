package jrout.tutorial.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IEmployeeDetails extends Remote {
    String getEmployeeName(int empId) throws RemoteException;
    List<String> getAllEmployeeWithName(String firstName) throws RemoteException;
}