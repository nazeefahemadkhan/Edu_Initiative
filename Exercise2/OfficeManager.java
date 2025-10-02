package com.example.office;
import java.util.*;

public class OfficeManager {
    private static OfficeManager instance;
    private Map<Integer, Room> rooms = new HashMap<>();
    private OfficeManager(){}
    public static synchronized OfficeManager getInstance(){
        if(instance==null) instance=new OfficeManager();
        return instance;
    }
    public void addRoom(int id, int capacity){
        rooms.put(id, new Room(id, capacity));
        System.out.println("Room " + id + " added with capacity " + capacity);
    }
    public Room getRoom(int id){ return rooms.get(id); }
}
