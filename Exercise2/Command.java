package com.example.office;

interface Command {
    void execute();
}

class BookRoomCommand implements Command {
    private Room room;
    public BookRoomCommand(Room r){ this.room=r; }
    public void execute(){
        if(room.isBooked()) System.out.println("Room already booked!");
        else { room.book(); System.out.println("Room " + room.getId() + " booked."); }
    }
}

class CancelRoomCommand implements Command {
    private Room room;
    public CancelRoomCommand(Room r){ this.room=r; }
    public void execute(){
        if(!room.isBooked()) System.out.println("Room not booked!");
        else { room.cancelBooking(); System.out.println("Room " + room.getId() + " booking cancelled."); }
    }
}
