package org.example.mioeserciziario.aereo;

public class Aereo {

    private String stato;
    private int nVoli;

    public Aereo() {
        this.stato = "";
        this.nVoli = 0;
    }

    public void decollo() {
        try{
            if(!((stato.equals("") || stato.equals("atterraggio"))))
                throw new MyException();

            stato="decollo";
        }catch(MyException e){
            e.printStackTrace();
        }

    }

    public void crociera() {
        try{
            if(!stato.equals("decollo"))
                throw new MyException();

            stato="crociere";
        }catch(MyException e){
            e.printStackTrace();
        }
    }

    public void atterraggio() {
        try{
            if(!stato.equals("crociera"))
                throw new MyException();

            stato="atterraggio";
        }catch(MyException e){
            e.printStackTrace();
        }
    }

    public void atterrato() {
        try{
            if(stato.equals("atterraggio"))
                throw new MyException();

            stato="atterrato";
            ++nVoli;
        }catch(MyException e){
            e.printStackTrace();
        }
    }

    public int nVoli(){
        return nVoli;
    }


}
