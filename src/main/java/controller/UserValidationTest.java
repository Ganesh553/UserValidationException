package controller;

import org.junit.Assert;
import org.junit.Test;
import service.UserValidator;

public class UserValidationTest {

    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateFirstName("Ganesh");
        Assert.assertEquals(true, results);
    }

    @Test
    public void giveFirstName_WhenProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateFirstName("ganesh");
        Assert.assertEquals(false, results);
    }

    @Test
    public void giveFirstName_When_empty_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateFirstName(" ");
        Assert.assertEquals(false, results);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateLastName("Kumar");
        Assert.assertEquals(true, results);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateLastName("kumar");
        Assert.assertEquals(false, results);
    }

    @Test
    public void giveLastName_When_empty_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateLastName(" ");
        Assert.assertEquals(false, results);
    }

}
