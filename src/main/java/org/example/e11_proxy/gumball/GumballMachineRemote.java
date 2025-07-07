package org.example.e11_proxy.gumball;

import java.rmi.RemoteException;

public interface GumballMachineRemote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
