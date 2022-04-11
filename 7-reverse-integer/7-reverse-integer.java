class Solution {
//     public int reverse(int x) {
//         int rev=0;
//         int temp=x;
//         while(temp!=0){
//             int ans=temp%10;
//             rev=rev*10+ans;
            
//             temp=temp/10;
//         }
//         return rev;
//     }
// }
public int reverse(int x) {
        int prevRev = 0 , rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            if((rev - x % 10) / 10 != prevRev){
                return 0;
            }
            prevRev = rev;
            x= x/10;
        }
        return rev;
    }
}