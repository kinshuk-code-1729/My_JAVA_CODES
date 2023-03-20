package kinshuk.com.Exception;

import java.io.IOException;

public class CustomExceptionMain {
    static void validate(int age) throws InvalidAgeException, IOException{
        if(age < 18){
            InvalidAgeException iae = new InvalidAgeException("Not Valid !!!");
            iae.setErrorCode("AGE_001_NOT_SATISFIED");
            throw iae;
        }
        else {
            System.out.println("You are Eligible to vote ......");
        }
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            validate(16);
            System.out.println("Not Reachable ...");
        }
        catch (InvalidAgeException e){
            System.out.println(e.getErrorCode());
            System.out.println("Not eligible as you are less than 18 years "+e);
        }
        catch (IOException io){
            System.out.println("IO Exception "+io);
        }
        catch (Exception ex){
            System.out.println("Exception Occurred "+ex);
        }
        System.out.println("Remaining Code.......");
    }
}
