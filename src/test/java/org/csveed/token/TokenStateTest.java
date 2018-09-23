package org.csveed.token;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TokenStateTest {

    @Test
    public void nextState() {
        assertEquals(TokenState.RESET, TokenState.PROCESSING.next());
        assertEquals(TokenState.START, TokenState.RESET.next());
        assertEquals(TokenState.PROCESSING, TokenState.START.next());
    }
}
