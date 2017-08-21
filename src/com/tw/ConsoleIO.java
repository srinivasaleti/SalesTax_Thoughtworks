package com.tw;

import java.io.PrintStream;

class ConsoleIO implements IO {

    private final PrintStream out;

    ConsoleIO(PrintStream out) {
        this.out = out;
    }

    @Override
    public void print(String message) {
        this.out.print(message);
    }

    @Override
    public void println(String message) {
        this.out.println(message);
    }

}
