package com.example.office;

public class SmartOfficeApp {
    public static void main(String[] args){
        OfficeManager office = OfficeManager.getInstance();
        office.addRoom(1,10);

        Room r1 = office.getRoom(1);
        r1.addObserver(new Light());
        r1.addObserver(new AirConditioner());

        Command book = new BookRoomCommand(r1);
        Command cancel = new CancelRoomCommand(r1);

        book.execute();
        r1.setOccupants(2);
        r1.setOccupants(0);
        cancel.execute();
    }
}
