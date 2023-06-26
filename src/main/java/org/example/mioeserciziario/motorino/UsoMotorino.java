package org.example.mioeserciziario.motorino;

public class UsoMotorino {
    public static void main(String[] args) {
        Motorino primaMoto= new Motorino("grigio_metallizato",40.5,"Piaggio Liberty");
        double v= primaMoto.getVelocita();

        MotorinoImmatricolato motoImm = new MotorinoImmatricolato("rosso",30.5,"Aprilio Scarabeo",60,"CV1234");
        motoImm.getMax();

        primaMoto.accelera(20.2);
        motoImm.accelera(2.1);

        System.out.println(primaMoto.getVelocita());
        System.out.println(motoImm.getVelocita());
    }

}
