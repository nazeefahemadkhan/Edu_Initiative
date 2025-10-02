package com.example.office;
import java.util.*;

public class Room {
    private int id, capacity, occupants=0;
    private boolean booked=false;
    private List<Observer> observers = new ArrayList<>();

    public Room(int id,int cap){ this.id=id; this.capacity=cap; }
    public int getId(){ return id; }
    public boolean isOccupied(){ return occupants>=2; }
    public boolean isBooked(){ return booked; }

    public void addObserver(Observer o){ observers.add(o); }

    public void setOccupants(int n){
        occupants=n;
        notifyObservers();
    }
    private void notifyObservers(){
        for(Observer o: observers) o.update(this);
    }

    public void book(){ booked=true; }
    public void cancelBooking(){ booked=false; }
}
