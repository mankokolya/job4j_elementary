package ru.job4j.tracker;

public class StableInput implements Input {
    private String[] answers;
    private int position;

    public StableInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(String.format("Your choice %s is out of range > [0, %s]", select, max));
        }
        return select;
    }
}
