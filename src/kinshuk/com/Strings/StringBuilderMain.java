package kinshuk.com.Strings;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kunaal");
        String s1 = sb.toString();
        /*
        if(sb.toString() == s1){
            System.out.println("sb and s1 are equal");
        }
        else{
            System.out.println("sb and s1 are not equal");
        }
        if(s1 == sb.toString()){
            System.out.println("s1 and sb are equal");
        }
        else{
            System.out.println("s1 and sb are not equal");
        }
        if(s1.equals(sb)){
            System.out.println("s1 and sb are equal using equals method");
        }
        else{
            System.out.println("s1 and sb are not equal using equals method");
        }
        if(sb.equals(sb)){
            System.out.println("sb and s1 are equal using equals method");
        }
        else{
            System.out.println("sb and s1 are not equal using equals method");
        }
         */
        System.out.println(sb);
        System.out.println(s1);
        sb.append(" ");
        sb.append("Bansal");
        System.out.println(sb);
        sb.insert(6, " Prasad");
        System.out.println(sb);
//        System.out.println(sb.reverse());
//        System.out.println(sb.delete(6,13));
        System.out.println(sb.replace(7,13,"Singh"));
    }
}
