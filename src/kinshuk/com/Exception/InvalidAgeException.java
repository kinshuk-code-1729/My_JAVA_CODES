package kinshuk.com.Exception;

public class InvalidAgeException extends Exception{
    private String errorCode;
    public InvalidAgeException(String message){
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
