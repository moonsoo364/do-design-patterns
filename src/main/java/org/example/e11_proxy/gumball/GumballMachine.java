package org.example.e11_proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine
        extends UnicastRemoteObject
        implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;
    String location;


    protected GumballMachine(String location, int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
        this.location = location;

    }

    public void insertQuarter() {state.insertQuarter();}

    public void ejectQuarter(){state.ejectQuarter();}

    void setState(State state) {
        this.state = state;
    }
    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
    public void refill(int count){
        this.count = count;
        state = noQuarterState;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }
    @Override
    public State getState() throws RemoteException {
        return null;
    }
    @Override
    public String getLocation() throws RemoteException {
        return "";
    }

    public State getSoldOutState() {
        return soldOutState;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getWinnerState() {
        return winnerState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2014");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }




}
