package org.example.mioeserciziario.roomandreservation;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Room room = new Room();
        Reservation r1 = room.reserve("Paolo",10,20);
        Reservation r2 = room.reserve("Marco",0,8);
        Reservation r3 = room.reserve("Carlo",30,38);
//        List<Reservation> list = room.reservations();
//        for(Reservation res : list){
//            System.out.println(res.getNomeUtente());
//        }
        Reservation r4 = room.reserve("Mario",9,11);
    }
}
