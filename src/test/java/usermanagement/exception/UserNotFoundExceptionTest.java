package usermanagement.exception;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserNotFoundExceptionTest {

    @Test
    public void userNotFoundExceptionTest() {
        UserNotFoundException exception = new UserNotFoundException("message", 20);
        assertEquals(20, exception.getUserId().intValue());
    }
}
