package org.example.e11_proxy.gumball;

import java.io.Serializable;
import java.rmi.RemoteException;

public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense() throws RemoteException;
}
