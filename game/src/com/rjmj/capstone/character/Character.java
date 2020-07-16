package com.rjmj.capstone.character;

import java.io.IOException;

public interface Character {
    public abstract void talk();

    public abstract void askQuestion() throws IOException;

    public abstract void answerQuestion();
}
