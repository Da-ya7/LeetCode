class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++){//1 2 3 4
            if(n%i==0 && n/i==i){//false true false false
                for(int j=1;j<i;j++){//1<2
                    if(i%j==0){//true
                        count++;//1
                    }
                }
            }
        }
         return count==1;
    }
}