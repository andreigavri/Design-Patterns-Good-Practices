package com.sda.dpagp.day3.singleton;

import java.time.LocalDateTime;

public final class Logger { // 4. optional, make class final so that it can't be extended

    // 2. declare and initialize only one instance of this class
    private final static Logger instance = new Logger();

    private Logger() {
        // 1. make constructor private
    }

    public static Logger getInstance() {
        // 3. expose our only instance to the "world" (other classes of the program)
        return instance;
    }


    public void debug(String message) {
        // 2023-08-08:18:52 [DEBUG] Mesajul efectiv
        String line = LocalDateTime.now()+" [DEBUG] "+message;
        System.out.println(line);
    }

    public void error(String message) {
        String line = LocalDateTime.now()+" [ERROR] "+message;
        System.out.println(line);
    }

    // TODO homework: info & warn methods
    // TODO homework: reduce duplicated code
    // TODO homework: save the lines in a file
}
