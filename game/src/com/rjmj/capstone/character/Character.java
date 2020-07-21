package com.rjmj.capstone.character;

import java.io.IOException;

public interface Character {
    // This will warn you that the return value is never used, but it is in the characters.
    // Public and Abstract are redundant for an interface, everything inside it is Public Abstract already.
    void askTheQuestionAndCollectInput() throws IOException;

    String processQuestionAnswer(String questionAnswer);
}
