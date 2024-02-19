package org.evgenysav.module10.task10;

import java.io.IOException;

public class EmptyFileException extends IOException {
    public EmptyFileException(String message, String filePath) {
        System.err.println("An empty file is located on path '" + filePath + "'");
    }

    public EmptyFileException(String message, Throwable cause, String filePath) {
        System.err.println("An empty file is located on path '" + filePath + "'. Caused by: " + cause.getMessage());
    }

}
