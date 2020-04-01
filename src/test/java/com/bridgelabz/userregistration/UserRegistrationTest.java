package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenValidFirstName_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkName("First"));
    }

    @Test
    public void givenInvalidFirstName_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkName("fi"));
    }
}
