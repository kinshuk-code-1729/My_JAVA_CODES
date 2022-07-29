// Swapping two numbers using multiplication and division.
class swap2{
    public static void main(String[] args) {
        int u=45,v=56;
        System.out.println("Before Swapping");
        System.out.println("u = "+u);
        System.out.println("v = "+v);

        u = u*v;
        v = u/v;
        u = u/v;

        System.out.println("After swapping");
        System.out.println("u = "+u);
        System.out.println("v = "+v);
    }
}
