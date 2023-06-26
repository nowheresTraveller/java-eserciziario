package org.example.mioeserciziario.progression;



public class Test {

    public static void main(String[] args) {
        Progression progression = new Progression(1000,200);
        progression.addEmploye("Giovanni",2010);
        progression.addEmploye("Paolo",2012);
        progression.addBonus("Giovanni",2011,100);
        System.out.println(progression.getSalary("Giovanni",2009));

    }
}
