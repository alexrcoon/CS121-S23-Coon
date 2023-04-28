package activity16;

import java.util.Arrays;

public class arrayDemo1 {
    public static void main(String[] args) {
        int[][] array1 = { {1,2,3,}, {4,5,6} };
        for (int[] array : array1){
            System.out.println(Arrays.toString(array));
        }
    }
}
