package Graphs.Algorithms;

public class Redundant {
    int[] parent;
     public int[] findRedundantConnection(int[][] edges){
        int n = edges.length;
        parent = new int[n + 1];
        for (int i = 0; i < edges.length; i++) {
            parent[i] = i;
        }
        for(int[] edge : edges){
            int r = edge[0];
            int c = edge[1];

            int pr = find(r);
            int pc = find(c);

            if (pr == pc) {
                return edge;
            }
            union(pr , pc);
        }
        return new int[]{};
     }
     private int find(int x){
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
     }
     private void union(int a , int b){
        parent[a] = b;
     }
}
