package org.example.mioeserciziario.color;

public class Test {
    public static void main(String[] args) {
        Color blue= Color.BLUE;
        Color otherBlue = Color.make(255,255,255);
        Color tryThis= blue;

        if(blue == otherBlue){
            System.out.println("ok");
        }

        System.out.println(blue);
    }

}
