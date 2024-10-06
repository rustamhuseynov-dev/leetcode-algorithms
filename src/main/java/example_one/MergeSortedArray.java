package example_one;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,0,0,0};
        int[] arrayM = new int[]{2,5,6};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                System.out.println(array[i]);
                array[i] = arrayM[count++];
            }

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
