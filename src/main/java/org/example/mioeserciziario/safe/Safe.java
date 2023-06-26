package org.example.mioeserciziario.safe;

import java.io.IOException;

public class Safe {
    protected String secretString;
    protected int key;
    protected int tentativiOpen;
    protected boolean blocked;

    public Safe(int key,String secretString) {
        this.secretString = secretString;
        this.key = key;
        this.tentativiOpen=0;
        this.blocked=false;
    }

    public String open(int newKey){
            if(blocked==true)
                throw new IllegalArgumentException();

            if (key == newKey) {
                tentativiOpen=0;
                return secretString;
            }

            ++tentativiOpen;
            if (tentativiOpen == 3){
                blocked = true;
                throw new IllegalArgumentException();
            }


        return null;
    }



}
