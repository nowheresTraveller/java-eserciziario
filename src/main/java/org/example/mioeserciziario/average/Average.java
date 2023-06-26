package org.example.mioeserciziario.average;

import org.example.mioeserciziario.aereo.MyException;

import java.util.ArrayList;
import java.util.List;

public class Average {
    private List<Integer> listValori;

    public Average() {
        listValori= new ArrayList<Integer>();
    }

    public void add(Integer v){
         listValori.add(v);
    }

    public int getAverage(){
        int cont=0, tot=0;
        try{
            if(listValori.size()==0)
                throw new MyException();

            for (Integer i : listValori){
                tot+=i;
                cont++;
            }
        }catch(MyException e){
            e.printStackTrace();
        }

        return tot/cont;
    }
}
