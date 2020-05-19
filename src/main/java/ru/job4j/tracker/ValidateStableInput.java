package ru.job4j.tracker;

public class ValidateStableInput extends ValidateInput {
    private String[] data;
    private int position;

    public ValidateStableInput(String[] data) {
        this.data = data;
    }

    @Override
    public String askStr(String question) {
        return data[position++];
    }
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (select >= 0 && select < max) {
            return select;
        } else {
            throw new IllegalArgumentException(String.format("Your choice %s is out of range > [0, %s]", select, max));
        }
    }
}
