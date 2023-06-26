package org.example.mioeserciziario.clinica;

import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();
        clinica.prenota(Clinica.Specialista.OCULISTA, "Giovanni");
        clinica.prenota(Clinica.Specialista.OCULISTA, "Pietro");
        clinica.prenota(Clinica.Specialista.PEDIATRIA, "Marco");
        clinica.prenota(Clinica.Specialista.PEDIATRIA, "Luca");
        clinica.prenota(Clinica.Specialista.PEDIATRIA, "Giovanni");
        clinica.cancellaPrenotazione(Clinica.Specialista.PEDIATRIA, "Luca");
        Collection<String> prenotazioniPediatra = clinica.getPrenotati(Clinica.Specialista.PEDIATRIA);
        Collection<String> prenotazioniOculista = clinica.getPrenotati(Clinica.Specialista.OCULISTA);

        if (prenotazioniPediatra != null) {
            System.out.println("Clienti che hanno prenotato dal pediatra: ");
            for (String cliente : prenotazioniPediatra) {
                System.out.print(cliente + ", ");
            }
        }

        if (prenotazioniOculista != null) {
            System.out.println("\nClienti che hanno prenotato dall'oculista: ");
            for (String cliente : prenotazioniOculista) {
                System.out.print(cliente + ", ");
            }
        }
    }
}
