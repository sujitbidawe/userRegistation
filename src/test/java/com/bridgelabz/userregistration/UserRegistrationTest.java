package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenValidFirstName_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.checkName("First"));
    }

    @Test
    public void givenInvalidFirstName_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.checkName("fi"));
    }

    @Test
    public void givenValidLastName_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.checkName("Last"));
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.checkName("la"));
    }

    @Test
    public void givenValidEmail_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.checkEmail("abc@yahoo.com"));
        Assert.assertTrue(userRegistration.checkEmail("abc-100@yahoo.com"));
        Assert.assertTrue(userRegistration.checkEmail("abc.100@yahoo.com"));
        Assert.assertTrue(userRegistration.checkEmail("abc111@abc.com"));
        Assert.assertTrue(userRegistration.checkEmail("abc-100@abc.net"));
        Assert.assertTrue(userRegistration.checkEmail("abc.100@abc.com.au"));
        Assert.assertTrue(userRegistration.checkEmail("abc@1.com"));
        Assert.assertTrue(userRegistration.checkEmail("abc@gmail.com.co"));
        Assert.assertTrue(userRegistration.checkEmail("abc+100@gmail.com"));

    }

    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.checkEmail("abc"));
        Assert.assertFalse(userRegistration.checkEmail("abc@.com.my"));
        Assert.assertFalse(userRegistration.checkEmail("abc123@gmail.a"));
        Assert.assertFalse(userRegistration.checkEmail("abc123@.com"));
        Assert.assertFalse(userRegistration.checkEmail("abc123@.com.com"));
        Assert.assertFalse(userRegistration.checkEmail(".abc@abc.com"));
        Assert.assertFalse(userRegistration.checkEmail("abc()*@gmail.com"));
        Assert.assertFalse(userRegistration.checkEmail("abc@%*.com"));
        Assert.assertFalse(userRegistration.checkEmail("abc..2002@gmail.com"));
        Assert.assertFalse(userRegistration.checkEmail("abc.@gmail.com"));
        Assert.assertFalse(userRegistration.checkEmail("abc@abc@gmail.com"));
        Assert.assertFalse(userRegistration.checkEmail("abc@gmail.com.1a"));
        Assert.assertFalse(userRegistration.checkEmail("abc@gmail.com.aa.au"));
    }

    @Test
    public void givenValidMobileNumber_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.checkMobile("91 9988776655"));
    }

    @Test
    public void givenInvalidMobileNumber_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.checkMobile("1763 1231231231"));
    }

    @Test
    public void givenValidPassword_shouldReturnTrue() {
        Assert.assertTrue(userRegistration.checkPassword("1@234567A"));
    }

    @Test
    public void givenInvalidPassword_shouldReturnFalse() {
        Assert.assertFalse(userRegistration.checkPassword("1@#qweq63A"));
    }

}
