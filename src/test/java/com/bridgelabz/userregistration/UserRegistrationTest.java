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

    @Test
    public void givenValidLastName_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkName("Last"));
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkName("la"));
    }

    @Test
    public void givenValidEmail_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.checkEmail("abc+123@gmail.com.in"));
    }

    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.checkEmail("1abc.abc@gmail.com"));
    }
}
