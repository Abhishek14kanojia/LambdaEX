package com.lambdaExp;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	static UserRegistration userRegistration = new UserRegistration();

    @BeforeClass
    public  static void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void testUserFirstNameSuccess(){
        try {
            boolean result = userRegistration.validateFirstName("Abhishek");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserFirstNameReturnException(){
        try {
            boolean result = userRegistration.validateFirstName("Abhishek");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserFirstName_Null_ReturnException(){
        try {
            boolean result = userRegistration.validateFirstName(null);
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserLastName_Valid_ReturnSucess(){
        try {
            boolean result = userRegistration.validateLastName("Kanojia");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserLastName_whenInValid_ShouldReturnException(){
        try {
            boolean result = userRegistration.validateLastName("Kanojia");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserLastName_whenNull_ShouldReturnException(){
        try {
            boolean result = userRegistration.validateLastName(null);
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserEmailID_whenValid_ShouldReturnSucess(){
        try {
            boolean result = userRegistration.validateEmailID("abhishek14kanojia@gmail.com");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserEmailID_whenInValid_ShouldReturnException(){
        try {
            boolean result = userRegistration.validateEmailID("Abhi14@gmail.com");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserEmailID_whenNull_ShouldReturnException(){
        try {
            boolean result = userRegistration.validateEmailID(null);
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserMobileNumber_whenValid_ShouldReturnSucess(){
        try {
            boolean result = userRegistration.validateMobileNumber("91 8989232830");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserMobileNumber_InValid_ReturnException(){
        try {
            boolean result = userRegistration.validateMobileNumber("5333475850");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserMobileNumber_Null_ReturnException(){
        try {
            boolean result = userRegistration.validateEmailID(null);
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserPassword_whenValid_ShouldReturnSucess(){
        try {
            boolean result = userRegistration.validatePassword("Absgh12@");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserPassword_InValid_ReturnException(){
        try {
            boolean result = userRegistration.validatePassword("tfndf575@");
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

    @Test
    public void testUserPassword_Null_ReturnException(){
        try {
            boolean result = userRegistration.validatePassword(null);
            Assert.assertTrue(result);
        }catch (InvalidUserException e){
            System.out.println(e);
        }
    }

}
