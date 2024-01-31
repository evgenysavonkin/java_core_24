package org.evgenysav.module3.task3;

public class TaskA {
    private static final String EXAMPLE_STR = "Hello, user! How are you?";

    public static String addingTextToEnd(String word) {
        return EXAMPLE_STR + word;
    }

    public static String insertWordInSpecificPos(int pos, String word) {
        StringBuilder stringBuilder = new StringBuilder(EXAMPLE_STR);
        stringBuilder.insert(pos, word);
        return stringBuilder.toString();
    }

    public static String removeCharacterFromString(char c) {
        return EXAMPLE_STR.replaceAll(String.valueOf(c), "");
    }

    public static String replaceSubstrWithAnotherOne(String wordToReplace, String replacement) {
        return EXAMPLE_STR.replace(wordToReplace, replacement);
    }

    public static void main(String[] args) {
//        System.out.println(taskA.addingTextToEnd("Fine!"));
//        System.out.println(taskA.insertWordInSpecificPos(6, "dear"));
//        System.out.println(removeCharacterFromString('!'));
//        System.out.println(replaceSubstrWithAnotherOne("user", "programmer"));
    }
}
