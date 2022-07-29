// Swapping two numbers using addition & subtraction.
class swapnum{
    public static void main(String[] args) {
        int p=45,q=56;
        System.out.println("Before Swapping");
        System.out.println("p = "+p);
        System.out.println("q = "+q);

        p = p+q;
        q = p-q;
        p = p-q;

        System.out.println("After swapping");
        System.out.println("p = "+p);
        System.out.println("q = "+q);
    }
}
