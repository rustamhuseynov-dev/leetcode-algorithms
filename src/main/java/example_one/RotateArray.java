package example_one;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,8,9,4,5,6,7};
        int k = 3;
        Arrays.sort(array);
        rotateArray(array,k);
    }

    private static void rotateArray(int[] array, int k) {
        int min = 0;  // İlk elementin indeksi
        int max = array.length - 1;  // Sonuncu elementin indeksi

        System.out.println("Əvvəl: " + Arrays.toString(array));  // İlk vəziyyət

        while (min < max) {  // 'min' indeks 'max' indeksdən kiçik olduğu müddətcə
            int temp = array[min];  // 'min' elementini müvəqqəti saxlayırıq
            array[min] = array[max]; // 'min' elementinə 'max' elementini təyin edirik
            array[max] = temp;       // 'max' elementinə 'min' elementini təyin edirik

            min++;  // 'min' indeksini artırırıq
            max--;  // 'max' indeksini azaldırıq
        }

        System.out.println("Sonra: " + Arrays.toString(array));


    }
}
