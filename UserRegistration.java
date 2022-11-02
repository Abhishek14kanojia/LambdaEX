package com.lambdaExp;

public class UserRegistration {

	private static final String First_Name = "^[A-Z]{1}[a-z]{2,}$";;
    private static final String Last_Name = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Email_ID =  "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private static final String Mobile_No =  "^([0-9]{2}\\s)?[6789]{1}[0-9]{9}";
    private static final String Password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";

    
    public boolean validateFirstName(String firstName) throws InvalidUserException {
        try
        {
            if (firstName.matches(First_Name)) {
                return true;
            } else {
                throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
            }
        }catch(NullPointerException e){
            throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }

    public boolean validateLastName(String lastName) throws InvalidUserException {
        try
        {
            if (lastName.matches(Last_Name)) {
                return true;
            } else {
                throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
            }
        }catch(NullPointerException e){
            throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }

    public boolean validateEmailID(String emailId) throws InvalidUserException {
        try
        {
            if (emailId.matches(Email_ID)) {
                return true;
            } else {
                throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
            }
        }catch(NullPointerException e){
            throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }


    public boolean validateMobileNumber(String mobileNumber) throws InvalidUserException {
        try
        {
            if (mobileNumber.matches(Mobile_No)) {
                return true;
            } else {
                throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
            }
        }catch(NullPointerException e){
            throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }

    public boolean validatePassword(String password) throws InvalidUserException {
        try
        {
            if (password.matches(password)) {
                return true;
            } else {
                throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_INVALID, "Please provide Specific format");
            }
        }catch(NullPointerException e){
            throw new InvalidUserException(InvalidUserException.ExceptionType.ENTERED_NULL, "Please don't pass null value");
        }
    }
}
