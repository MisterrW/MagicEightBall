package com.example.user.magiceightball;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by User on 12/12/2016.
 */
public class AnswerTest {
    public Answer answer;
    public ArrayList<String> testAnswers;

    @Before
    public void init() {
        answer = new Answer();
        testAnswers = new ArrayList<String>();
        testAnswers.add("What");
        testAnswers.add("Up");

    }

    @Test
    public void testWithArgumentsConstruction() {
        Answer otherAnswer = new Answer(testAnswers);
        assertEquals("Up", otherAnswer.getAnswerAtIndex(1));
    }

    @Test
    public void getAnswersTest() {
        assertNotNull(answer.getAnswers());
    }

    @Test
    public void testGetAnswerCount() {
        assertEquals(2, answer.getAnswerCount());
    }

    @Test
    public void testGetAnswerAtIndex() {

        assertEquals("That would be an ecumenical matter.", answer.getAnswerAtIndex(1));
    }



    @Test
    public void testAddAnswer() {
        int firstCount = answer.getAnswerCount();
        answer.addAnswer("If you like.");
        int secondCount = answer.getAnswerCount();
        assertEquals(firstCount+1, secondCount);
        assertEquals("If you like.", answer.getAnswerAtIndex(2));

    }

    @Test
    public void testGetAnswer() {
        String randomAnswer = answer.getAnswer();
        assertNotNull(randomAnswer);
        assertTrue(randomAnswer.equals("Yes!") || randomAnswer.equals("That would be an ecumenical matter."));
        System.out.println(randomAnswer);
    }
}
