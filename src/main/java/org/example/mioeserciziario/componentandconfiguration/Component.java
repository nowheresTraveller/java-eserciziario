package org.example.mioeserciziario.componentandconfiguration;

import java.util.ArrayList;
import java.util.List;

public class Component {

    public enum Type{CPU,BOARD,RAM};
    private Type type;
    private String descrizione;
    List<Component> incompCompList;

    public Component(Type type, String descrizione) {
        this.type = type;
        this.descrizione = descrizione;
        this.incompCompList= new ArrayList<>();
    }

    public void setIncompatible(Component c){
        incompCompList.add(c);
    }

    public Type getType() {
        return type;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public List<Component> getIncompCompList() {
        return incompCompList;
    }
}
