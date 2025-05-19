package example_six;

import java.util.Arrays;
import java.util.HashMap;

public class Candy {
    public static void main(String[] args) {
//        HashMap<String,Integer> ratingsToChild = new HashMap<>();
//        ratingsToChild.put();
        int[] candy = new int[]{1, 1, 2}; // 2-cur candy var 1,2,2 ve ya 1.1.2
        int[] child = new int[]{1, 2, 3};
        int[] ratings = new int[]{1,2,2};

        int resultElement = ratings.length - 1;

        for (int i = 0; i < ratings.length; i++) {
            if (resultElement > ratings[i]) {
                if (ratings[i] > ratings[i + 1]) {
                    child[i] = candy[i];
                } else {
                    child[i] = candy[i];
                }
            }else {
                child[i] = candy[i];
            }
        }
        int sum = 0;
        for(int i=0; i < child.length; i++){
            sum = sum + child[i];
        }
        System.out.println("The sum of the elements is " + sum);
    }
}

