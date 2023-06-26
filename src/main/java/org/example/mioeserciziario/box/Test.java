package org.example.mioeserciziario.box;

public class Test {
    public static void main(String[] args) {
        Box firstBox = new Box(10,10,10);
        Box secondBox = new Box(10,10,10);
        Box thirdBox = new Box(30,30,30);
        System.out.println (firstBox.equals(secondBox));
        System.out.println(firstBox.fitsIn(thirdBox));
    }
}
