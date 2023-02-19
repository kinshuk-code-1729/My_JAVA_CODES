package kinshuk.com.Arrays;

import java.util.Arrays;

public class Arraytest {
    public static void main(String[] args) {
        int[] MyArr = new int[5];
        System.out.println(Arrays.toString(MyArr));
        MyArr[3] = 25568;
        for(int i = 0; i < MyArr.length; i++) {
            System.out.println(MyArr[i]);
        }
        for(int x:MyArr){    // Enhanced for loop
            System.out.println(x);
        }
        MyArr = new int[5];
        MyArr[0]=145601;
        MyArr[1]=145602;
        MyArr[2]=145603;
        MyArr[3]=145604;
        MyArr[4]=145605;

        int[] MyArr1 = null;
        System.out.println("-----------------");
        int found = 0;
        for(int j:MyArr){
            System.out.println(j);
        }
        /* for (int i = 0; i < MyArr.length; i++) {
            if(MyArr[i] == 145603){
                found++;
                for (int j = i; j < MyArr.length-1; j++) {
                    MyArr[j] = MyArr[j+1];
;                }
            }
        }
        if(found == 0){
            System.out.println("Not Found");
        }
        else{
            for(int y:MyArr){
                System.out.println(y);
            }
        }*/
        for (int i = 0; i < MyArr.length; i++) {
            if(MyArr[i] == 145602){
                found++;
//                break;
            }
        }
        if(found == 0){
            System.out.println("Not Found");
        }
        else{
            MyArr1 = new int[MyArr.length - found];
            for (int i = 0; i < MyArr1.length; i++) {
                for (int j = i; j < MyArr1.length; j++) {
                    if(MyArr[j] != 145602){
                        MyArr1[i] = MyArr[j];
                        break;
                    }
                }
            }
        }
        System.out.println("-------------------");
        for(int z:MyArr){
            System.out.println(z);
        }
        for(int x:MyArr1){
            System.out.println(x);
        }
        /*
        boolean isStudentArray[] = new boolean[7];
        System.out.println(isStudentArray[3]);
        isStudentArray[9] = true;
        for (int i = 0; i < isStudentArray.length; i++) {
            System.out.println(isStudentArray[i]);
        }*/
    }
}
