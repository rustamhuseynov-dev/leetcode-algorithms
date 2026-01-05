package algoritms;

import java.util.Arrays;
import java.util.Collections;

public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        int[] apple = {1,8,3,3,5};
        int[] capacity = {3,9,5,1,9};
        int i = minimumBoxes(apple, capacity);
        System.out.println(i);
    }
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int apples = appleSum(apple);
        int count = 0;
        Integer[] boxedCapacity = Arrays.stream(capacity)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(boxedCapacity, Collections.reverseOrder());
        for(int a = 0; a < boxedCapacity.length; a++){
            if(apples > 0){
                apples = apples - boxedCapacity[a];
                count++;
            }
        }
        return count;
    }

    public static int appleSum(int[] apple){
        int sum = 0;
        for (int j : apple) {
            sum += j;
        }
        return sum;
    }


}
