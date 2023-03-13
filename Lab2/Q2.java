package lab2;


    import java.util.Arrays;

    public class Q2 {
        public static void main(String[] args) {
            int[] x = {1,2,3,4,5};
            int[] y = new int[5];

            for(int i = 0; i < x.length; i++){
                y[i] = x[i];
            }

            System.out.println(Arrays.toString(y));
        }
    }