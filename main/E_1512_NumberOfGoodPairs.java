package main;

import java.util.*;

public class E_1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            if (hm.containsKey(num)) {
                ans += hm.get(num);
                hm.put(num, hm.get(num) + 1);
            } else
                hm.put(num, 1);
        }
        return ans;
    }
}
/* example: [1,2,3,1,1,3]

1 --> no key --> put(1, 1)
2 --> no key --> put(2, 1)
3 --> no key --> put(3, 1)
1 --> has key --> ans += 1 --> put(1, 2) (delete 1, 1)
1 --> has key --> ans += 2 --> put(1, 3) (delete 1, 2)
3 --> has key --> ans += 1 --> put(3, 2) (delete 3, 1)
ans = 4

 */