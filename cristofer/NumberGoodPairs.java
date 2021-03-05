public class NumberGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        var hash = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            if (-1 == hash.getOrDefault(num, -1)) {
                hash.put(num, 1);
            } else {
                int n = hash.get(num);
                hash.replace(num, n+1);
            }
        }
        
        int good = 0;
        
        for (Integer value : hash.values()) {
            good += value * (value - 1) / 2;
        }
        
        return good;
    }
}

// Time: O(n) we have to traverse all the elements in the array
// Space: O(n) we build the hash table
/*
[1,2,3,1,1,3]
1: 3 -> 3*2/2 -> 3
2: 1 -> 1*0/2 -> 0
3: 2 -> 2*1/2 -> 1
{
    1: 3,
    2: 1,
    3: 2,
}
*/