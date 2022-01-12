// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            


// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        
         int fi = first(arr,x);
        int li=last(arr,x);
        ArrayList<Integer>ans=new ArrayList<>();
        if(fi==-1){
            ans.add(-1);
            return ans;
        }
        
        
        ans.add(fi);
        ans.add(li);
        return ans;
        
    }
    static int first(int []arr,int x){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
             int mid=(start+end)/2;
            
            if(x==arr[mid]){
                result=mid;
                end=mid-1;
                
                
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    static int last(int []arr,int x){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
             int mid=(start+end)/2;
            
            if(x==arr[mid]){
                result=mid;
                start=mid+1;
                
                
            }
            else if(x<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    
}

