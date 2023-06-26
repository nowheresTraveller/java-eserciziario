package org.example.mioeserciziario.personandgreenpass;

public class Test {

    public static void main(String[] args) {
        Person p= new Person("Mario");
        GreenPass pass= p.vaccinate(20);
        System.out.println(pass.belongsTo(p));
    }
}
