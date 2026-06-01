package Graphs;
class genral {
class DSU{
    int[] parent;
    int[] rank;

    DSU (int x){
        parent = new int[x];
        rank = new int[x];

        for(int i = 0; i < x; i++){
            parent[x] = x;
        }
    }
    public int findParent(int x){
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = findParent(parent[x]);
    }

    public void union(int x, int y){
        int px = findParent(x);
        int py = findParent(y);

        if (px == py) {
            return;
        }

        if (rank[px] < rank[py]) {
            parent[px] = py;
        }
        else if (rank[px] > rank[py]) {
            parent[py] = px;
        }
        else{
            rank[py] = px;
            rank[px]++;
        }
    }
}

    
}
