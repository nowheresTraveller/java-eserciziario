package org.example.mioeserciziario.binrel;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        BinRel<String> firstBinRel = new BinRel<>();
        firstBinRel.addPair("Marco","Rossi");
        firstBinRel.addPair("Rossi","Marco");
//        System.out.println(firstBinRel.areRelated("Marco","Rossi"));
//        System.out.println(firstBinRel.isSimmetric());
        firstBinRel.addPair("Fausto","Bianchi");
        System.out.println(firstBinRel.isSimmetric());
    }
}
