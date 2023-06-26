package org.example.mioeserciziario.curriculum;

import java.util.ArrayList;
import java.util.List;

public class Curriculum {

    private List<Job> jobList;
    private String nomePersona;

    public Curriculum(String nomePersona) {
        this.nomePersona = nomePersona;
        this.jobList= new ArrayList<>();
    }

    public Job addJob(String descrizione, int dataInizio){
        if(!jobList.isEmpty()){
            for (Job job : jobList){
                if(job.getDescrizione().equals(descrizione) && job.getDataInizio() == dataInizio ){
                    System.out.println("Errore, lavoro già inserito nel CV!");
                    return null;
                }
            }
        }

        Job j= new Job(descrizione,dataInizio);
        jobList.add(j);
        return j;
    }


    public class Job{
        private String descrizione;
        private int dataInizio;

        public Job(String descrizione, int dataInizio) {
            this.descrizione = descrizione;
            this.dataInizio = dataInizio;
        }



        public Job next(){
            if(!jobList.isEmpty()){
                if(jobList.contains(this)){
                    int i= jobList.indexOf(this);
                    if(i<jobList.size()-1){
                        return jobList.get(i+1);
                    }else{
                        System.out.println("Errore, non vi sono elementi successivi!");
                        return null;
                    }
                }else{
                    System.out.println("Errore, questo job non è contenuto nella lista!");
                    return null;
                }
            }
            System.out.println("Errore, lista vuota!");
            return null;
        }

        @Override
        public  String toString (){
            return "JOB:\n- descrizione : "+descrizione+"\n- anno : "+dataInizio;
        }

        public String getDescrizione() {
            return descrizione;
        }
        public int getDataInizio() {
            return dataInizio;
        }
    }
}
