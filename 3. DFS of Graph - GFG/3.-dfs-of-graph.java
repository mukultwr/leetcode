// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
      
      ArrayList<Edge> graph[] = new ArrayList[V];
      for(int i=0;i<V;i++){
          graph[i] = new ArrayList<>();
      }
      for(int i=0;i<adj.size();i++){
          for(int j=0;j<adj.get(i).size();j++){
              int v=i;
              int ngh=adj.get(i).get(j);
              graph[v].add(new Edge(v,ngh));
              
              
          }
      }
      boolean visited[]=new boolean[V];
      ArrayList<Integer>result=new ArrayList<>();
      dfs(graph,0,visited,result);
      return result;
      
      
      
    }
    public static void dfs(ArrayList<Edge> graph[],int src,boolean visited[],ArrayList<Integer> result){
        //visit kro fir print kro fir neighbour place explore kro
        visited[src]=true;
       result.add(src);
        for(int i=0;i<graph[src].size();i++){
            Edge edge=graph[src].get(i);
//            int v=edge.v;
//            int ngh=edge.ngh;
//            int wgh=edge.wgh;
            if(visited[edge.ngh]==false) {
                dfs(graph, edge.ngh,visited,result);
            }
        }
    }
    
    
}
class Edge{
        int vertex;
        int ngh;
        
        
        public Edge(int vertex,int ngh){
            this.vertex=vertex;
            this.ngh=ngh;
            
        }
    }