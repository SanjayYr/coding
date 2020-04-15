// Naive LCA
// TC- O(N), SC- O(N)
int LCA(int a, int b){
         int d = level[b] - level[a];
         while(d > 0){
             d = par[b];
             d--;
         }
         
         if(a==b) return a;
         while(par[a] != par[b]){
             a = par[a];
             b = par[b];
         }
         
         return par[a];
}

// Binary lifting method

// Instead of making jump of 1, we will make jump of highest l such that
// 1 . l is a power of 2
// 2. L <= d

// N - # of nodes
// maxN = log2(N)

// int LCA[N+1][maxN] where LCA[i][j] is (2^j)th parent of i

// Fill LCA[][]

void dfs(int node, int par){
  LCA[node][0] = par;
  for(int child: adj[node]){
    if(child != par){
      dfs(child, node);
    }
  }
}

// init code

void init(){
  dfs(root, -1);
  for(int j=1; j<=maxN; ++j){
    for(int i=1; i<=N; ++i){
      if(LCA[i][j-1] != -1){
        int par = LCA[i][j-1];
        LCA[i][j] = LCA[par][j-1];
      }
    }
  }
}

// Binary Lifting LCA

int LCA(int a, int b){
    if(level[a] > level[b]) swap(a, b);
    int d = level[b] - level[a];
    while(d > 0){
      int i = log2(d);
      b = LCA[b][i];
      d -= (1<<i);
    }         
    
    if(a==b) return a;
    
    for(int i=maxN; i>=0; i--){
      if(LCA[a][i] != -1 && LCA[a][i] != LCA[b][i]){
        a = LCA[a][i];
        b = LCA[b][i];
      }
    }
    
    return par[a];
}
