package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ConsoleIOTest {

    private IO consoleIO;
    private PrintStream out;

    @BeforeEach
    void beforeEach() {
        this.out = mock(System.out.getClass());
        this.consoleIO = new ConsoleIO(this.out);
    }

    @Test
    void displayHello() {
        this.consoleIO.print("Hello");

        verify(this.out).print("Hello");
    }

    @Test
    void displayHi() {
        this.consoleIO.print("Hi");

        verify(this.out).print("Hi");
    }

    @Test
    void displayHelloWithNewLine() {
        this.consoleIO.println("Hello");

        verify(this.out).println("Hello");
    }

    @Test
    void displayHiWithNewLine() {
        this.consoleIO.println("Hi");

        verify(this.out).println("Hi");
    }

}
