package lab2;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {


        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int l = a.length-1;


        for(int i = 0; i < l/2; i++){
            a[i] = a[i] + a[l-i];
            a[l-i] = a[i] - a[l-i];
            a[i] = a[i] - a[l-i];
        }

        System.out.println(Arrays.toString(a));
    }
}