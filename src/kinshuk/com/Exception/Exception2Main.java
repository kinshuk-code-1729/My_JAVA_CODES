package kinshuk.com.Exception;

public class Exception2Main {
    public static void main(String[] args) {
        String str1 = "Hey , I am a valid String !!!";
        String str2 = null;
//        String upCase = str2.toUpperCase();
        displayLength(str1);
        displayLength(str2); // finding length of null string may result in null pointer exception
    }
    public static void displayLength(String str){
        try{
            if(str != null){
                System.out.println(str.length()); // returns length of the string
            }
        }
        catch (Exception e){
            System.out.println("Null Pointer Exception !!!!"); // returns null pointer exception for null string
        }
    }
}
