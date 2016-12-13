package com.example.user.magiceightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 12/12/2016.
 */
public class Answer implements Answerable {
    private ArrayList<String> answers;


    public Answer(ArrayList<String> answers){
        this.answers = new ArrayList<String>(answers);
    }
    public Answer(){
        answers = new ArrayList<String>();
        setupAnswers();
    }
    //bad practice to just return this.answers - as passes by reference, making internal list public and externally modifiable
    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(this.answers);
    }

    public void addAnswer(String answer){
        answers.add(answer);
    }

    public int getAnswerCount(){
        return answers.size();
    }

    public String getAnswerAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getAnswerCount();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
        return answer;
    }

    private void setupAnswers() {
        String[] answersToAdd = {
                "Yes!",
                "That would be an ecumenical matter.",
                "If you insist.",
                "Of course not!",
                "Rio."

        };
        for(String answer : answersToAdd) {
            answers.add(answer);
        }
    }
}
