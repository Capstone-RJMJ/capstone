package com.rjmj.capstone.character;

import java.io.IOException;

public interface Character {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final int sleep = 650;

    // This will warn you that the return value is never used, but it is in the characters.
    String askTheQuestionAndCollectInput() throws IOException, InterruptedException;

    String processQuestionAnswer(String questionAnswer) throws IOException, InterruptedException;
}
