package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question){
        String answer = "This is too hard for me to answer you question. Please make another one.";
        if ("Hello, Bot.".equals(question)){
            answer = "Hello, smart ass.";
        }else if("Bye.".equals(question)){
            answer = "See you soon.";
        }
        return answer;
    }
}
