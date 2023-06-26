package org.example.mioeserciziario.safe;

public class ResettableSafe extends Safe{
    private int tentativiChange;
    public ResettableSafe(int key, String secretString) {
        super(key, secretString);
        tentativiChange=0;
    }

    public boolean changeKey(int old, int newkey){
        try {
            if (super.blocked == true)
                throw new Exception();

            if(super.key==old){
                super.key=newkey;
                tentativiChange=0;
                return true;
            }

            ++tentativiChange;
            if(tentativiChange==3){
                super.blocked=true;
            }

        }catch(Exception e){
            System.out.println("Errore, cassaforte bloccata!");
        }
        return false;
    }
}
