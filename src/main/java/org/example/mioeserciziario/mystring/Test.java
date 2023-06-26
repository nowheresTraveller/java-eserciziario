package org.example.mioeserciziario.mystring;

public class Test {

    public static void main(String[] args) {
        MyString myString= new MyString ("mauuon");
        System.out.println(myString.equals(new MyString("maoony")));
        MyString secondMyStr= myString.clone();
        System.out.println(myString.equals(secondMyStr));

        System.out.println(myString.hashCode());
    }
}
