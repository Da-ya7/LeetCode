class Solution {
    public int singleNumber(int[] n) {
     int count = 0;
    for (int i = 0 ; i < n.length ; i ++){
        count=count^n[i];
    }
    return count;
    }
}

