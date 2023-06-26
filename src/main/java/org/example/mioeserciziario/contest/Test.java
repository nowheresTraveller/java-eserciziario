package org.example.mioeserciziario.contest;

public class Test {
    public static void main(String[] args) {

        Contest<String> contest= new Contest<>();
        contest.add("Mario");
        contest.add("Giovanni");
        contest.add("Luca");
        contest.vote("Giovanni");
        contest.vote("Fabio");
        String vincitore= contest.winner();
        if(vincitore!=null){
            System.out.println("Il vincitore del contest : "+vincitore);
        }else{
            System.out.println("Non è stato possibile decretare un vincitore!");
        }


    }
}
