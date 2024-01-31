package org.evgenysav.module3.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskATest {

    @Test
    void adding_text_to_end_case() {
        String result = TaskA.addingTextToEnd("Fine!");
        assertEquals("Hello, user! How are you?Fine!", result);
    }

    @Test
    void insert_word_in_specific_pos() {
        String result = TaskA.insertWordInSpecificPos(6, "dear");
        assertEquals("Hello,dear user! How are you?", result);
    }

    @Test
    void removeCharacterFromString() {
        String result = TaskA.removeCharacterFromString('!');
        assertEquals("Hello, user How are you?", result);
    }

    @Test
    void replaceSubstrWithAnotherOne() {
        String result = TaskA.replaceSubstrWithAnotherOne("user", "programmer");
        assertEquals("Hello, programmer! How are you?", result);
    }
}