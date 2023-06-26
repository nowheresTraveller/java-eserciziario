package org.example.mioeserciziario.moneta;

public class PortaMonete {

    private Moneta[] monete;

    public PortaMonete() {
        monete = new Moneta[10];
    }

    private PortaMonete(int dim) {
        monete = new Moneta[dim];
    }

    public static PortaMonete setDimPortaMonete(int dim) {
        if (dim <= 10)
            return new PortaMonete(dim);

        System.out.println("Errore, l'oggetto può contenere max 10 elementi!");
        return null;
    }


    public boolean aggiungi(Moneta newMoneta){
        for(int i=0;i< monete.length;++i){
            if (monete[i]==null){
                monete[i]=newMoneta;
                return true;
            }
        }
        return false;
    }

    public void stato(){
        String m="";

        for (Moneta moneta : monete){
            if(moneta!=null){
                m+=moneta.toString()+"\n";
            }
        }

        if (m==""){
            System.out.println("Il portamente è vuoto");
        }else{
            System.out.println("Ecco il contenuto del portaMonete:\n"+m);
        }


    }

    public Moneta preleva(Moneta m){
        for (int i=0; i<monete.length;++i){
            if(monete[i]==null){
                System.out.println("Il portamente non contiene questa moneta");
                return null;
            }

            if (monete[i].equals(m)){
                monete[i]=null;
                ++i;
                //rimozione con shift
                while(i<monete.length){
                    if(monete[i]!=null){
                        monete[i-1]=monete[i];
                        monete[i]=null;
                    }
                    ++i;
                }
                return m;
            }
        }
        System.out.println("Il portamente non contiene questa moneta");
        return null;
    }


}
