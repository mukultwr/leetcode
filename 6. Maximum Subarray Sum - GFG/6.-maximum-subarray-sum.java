// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    for(int i = 0;i<n;i++)
                        {
                            int p = sc.nextInt();
                            arr.add(p);
                        }
                        
                    Sol obj = new Sol();  
                    System.out.println(obj.maxSubArray(arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    
    public static int maxSubArray(ArrayList<Integer> array)
    {
        int sum=0;
        int max=array.get(0);
        for(int i=0;i<array.size();i++ ){
            sum+=array.get(i);
          
            if(sum>max) max=sum;
              if(sum<0) sum=0;
        }
        return max;
    }
}