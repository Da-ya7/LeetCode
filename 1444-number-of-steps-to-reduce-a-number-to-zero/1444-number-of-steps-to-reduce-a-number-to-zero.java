class Solution {
    public int numberOfSteps(int num) {
        int count=0;
       while(num>0)//14 7 6 3 2 1
       {
        if(num%2==0){//14 6 2 
            num=num/2;//7 3 1
            count++;//5
        }
        else{
            num=num-1;//6 2 0 
            count++;//2 4 6
        }
       }
       return count;
    }
}