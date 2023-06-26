package org.example.mioeserciziario.answerandquestion;

public class Answer {

    private int voto;
    private String sentence;

    public Answer(Question question, String sentence) {
        this.sentence = sentence;
        this.voto=0;
        addAnswerToQuestion(question);
    }

    public void voteUp(){
        ++this.voto;
    }

    public void addAnswerToQuestion(Question question){
        question.addAnswer(this);
    }

    public int getVoto() {
        return voto;
    }
}
