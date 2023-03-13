package lab2;

import java.util.Arrays;
import java.util.Random;

public class Q3 {

    static String[] remove(String [] x){

        Random r = new Random();
        while(x.length > 0){
            String []a = new String[x.length -1];
            int index = r.nextInt(x.length);
            for(int i = 0; i < index; i++){
                a[i] = x[i];
            }
            for(int i = index; i < x.length - 1; i++){
                a[i] = x[i + 1];
            }
            x = a;
        }
        return x;
    }

    public static void main(String[] args) {
        String[] array = { "a", "b", "c", "d", "e" };
        array = remove(array);
        System.out.println(Arrays.toString(array));
    }
}