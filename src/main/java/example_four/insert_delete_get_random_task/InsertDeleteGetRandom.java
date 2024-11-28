package example_four.insert_delete_get_random_task;

import java.util.HashMap;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        RandomizedSet randomizedSet = new RandomizedSet(hashMap);
        boolean insert = randomizedSet.insert(2);
        boolean remove = randomizedSet.remove(2);
        int random = randomizedSet.getRandom();
        System.out.println(remove);
        System.out.println(insert);
        System.out.println(random);

    }
}
