package example_four.insert_delete_get_random_task;

import java.util.HashMap;
import java.util.Set;

public class RandomizedSet {

    HashMap<Integer,String> map;

    public RandomizedSet(HashMap<Integer,String> hashMap){
        map = hashMap;
    }

    public boolean insert(Integer val) {
        if (!map.containsKey(val)){
            map.put(val,"RandomizedSet");
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)){
            map.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int key = 0;
        Set<Integer> integers = map.keySet();
        for (int ints: integers){
            key = ints;
        }
        return key;
    }

}
