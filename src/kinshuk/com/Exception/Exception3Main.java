package kinshuk.com.Exception;

public class Exception3Main {
    public static void main(String[] args) {
        int[] arr = new int[]{15,36,78,69,26};
        show(arr);
    }
    public static void show(int[] arr){
        try{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (Exception e){
            System.out.println("Array Index Out of Bounds Exception occurred !!!");
        }
        System.out.println("Continuing..........");
    }
}
