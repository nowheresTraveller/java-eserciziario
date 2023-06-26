package org.example.mioeserciziario.interval;

public class Test {
    public static void main(String[] args) {
        Interval firstI= Interval.closed(2,4);

        Interval secondI= Interval.open(3,6);
        System.out.println(firstI);
        System.out.println (firstI.join(secondI));
    }
}
