package io.diffblue.corebanking.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AccountExceptionTest {
    /**
     * Method under test: {@link AccountException#AccountException(String)}
     */
    @Test
    public void testConstructor() {
        AccountException actualAccountException = new AccountException("An error occurred");
        assertNull(actualAccountException.getCause());
        assertEquals(0, actualAccountException.getSuppressed().length);
        assertEquals("An error occurred", actualAccountException.getMessage());
        assertEquals("An error occurred", actualAccountException.getLocalizedMessage());
    }
}

