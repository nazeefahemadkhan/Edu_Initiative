package com.example.office;

public interface Observer {
    void update(Room room);
}

class Light implements Observer {
    public void update(Room room){
        System.out.println("Lights in Room " + room.getId() + (room.isOccupied()? " ON":" OFF"));
    }
}

class AirConditioner implements Observer {
    public void update(Room room){
        System.out.println("AC in Room " + room.getId() + (room.isOccupied()? " ON":" OFF"));
    }
}
