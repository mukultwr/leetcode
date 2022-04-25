// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    
		    //appending result to a String
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    //printing the String
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // ArrayList<Integer> toAdd=new ArrayList<>();
        // boolean res=true;
        // for(int i=0;i<n;i++){
        //     res=true;
        //     for(int j=i+1;j<n;j++){
        //         if(!(arr[i]>=arr[j])){
        //             res=false;
        //             break;
        //         }
        //     }
        //     if(res==true){
                
        //         toAdd.add(arr[i]);
        //     }
        // }
        // return toAdd;
        ArrayList<Integer> toAdd=new ArrayList<>();
        int curLeader= arr[n-1];
        toAdd.add(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=curLeader){
                toAdd.add(arr[i]);
                curLeader = arr[i];
            }
        }
        reverse(toAdd);
        return toAdd;
    }
    static void reverse(ArrayList<Integer> toAdd){
        int i = 0;
        int j = toAdd.size()-1;
        while(i < j){
            int temp = toAdd.get(i);
            toAdd.set(i,toAdd.get(j));
            toAdd.set(j,temp);
            i++;
            j--;
        }
    }
}
