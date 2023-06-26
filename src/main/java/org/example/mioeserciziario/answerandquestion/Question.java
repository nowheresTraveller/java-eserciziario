package org.example.mioeserciziario.answerandquestion;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String domanda;
    private List<Answer> answerList;

    public Question(String domanda) {
        this.domanda = domanda;
        this.answerList= new ArrayList<Answer>();
    }

    public Answer getBestAnswer(){
        Answer bestAnswer=null,answer;
        int maxVote=0,sizeList=answerList.size();

        if(sizeList!=0){
          for(int i=0;i<sizeList;++i){
            answer=answerList.get(i);
            if(answer.getVoto()>=maxVote){
                bestAnswer=answer;
            }
          }
          return bestAnswer;
        }

        return null;
    }

    public void addAnswer(Answer answer){
        answerList.add(answer);
    }
}
