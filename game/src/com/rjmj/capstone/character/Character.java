package com.rjmj.capstone.character;

import java.io.IOException;

public interface Character {
    // This will warn you that the return value is never used, but it is in the characters.
    String askTheQuestionAndCollectInput() throws IOException;

    String processQuestionAnswer(String questionAnswer) throws IOException;
}
