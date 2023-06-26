package org.example.mioeserciziario.personandgreenpass;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String nome;
    private List<GreenPass> passList;


    public Person(String nome) {
        this.nome = nome;
        passList=new ArrayList<GreenPass>();

    }

    public GreenPass vaccinate (int data){
        GreenPass pass= new GreenPass(data,passList.size()+1);
        passList.add(pass);
        return pass;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<GreenPass> getPassList() {
        return passList;
    }
}
