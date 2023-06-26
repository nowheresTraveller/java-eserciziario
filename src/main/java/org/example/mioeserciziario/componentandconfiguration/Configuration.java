package org.example.mioeserciziario.componentandconfiguration;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
    private List<Component> componentList;

    public Configuration() {
        this.componentList=new ArrayList<>();
    }

    public boolean add (Component newComponent){
        List<Component> inCompList;

        for (Component c: componentList){
            if(c.getType()!= newComponent.getType()){
                inCompList= newComponent.getIncompCompList();
                for (Component x : inCompList) {
                    if (x.getDescrizione().equals(c.getDescrizione()))
                        return false;
                }
            }else{
                return false;
            }
        }

        componentList.add(newComponent);
        return true;
    }
}
