package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Hello, Bot."),
                is("Hello, smart ass.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Bye."),
                is("See you soon.")
        );
    }

    @Test
    public void whenUnknownQuestionBot() {
        assertThat(
                DummyBot.answer("How much is 2 + 2?"),
                is("This is too hard for me to answer you question. Please make another one.")
        );
    }

}