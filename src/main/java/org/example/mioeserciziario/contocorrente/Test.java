package org.example.mioeserciziario.contocorrente;

public class Test {
    public static void main(String[] args) {
        ContoCorrente cc = new ContoCorrente("Francesco","213jsdohjds23",300);
        cc.versamento(200);
        cc.versamento(300);
        cc.prelievo(100);
        cc.stampaListaMovimenti();
        cc.stampaSaldo();
        cc.versamento(200);
        cc.versamento(300);
        cc.stampaListaMovimenti();
    }
}
