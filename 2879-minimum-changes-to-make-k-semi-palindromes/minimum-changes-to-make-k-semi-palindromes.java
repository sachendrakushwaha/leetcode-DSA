class Solution {
    public int minimumChanges(String s, int k) {
        int n=s.length();
        List<Integer>[] divisors=new ArrayList[n+1];
        for(int len=2;len<=n;len++){
            divisors[len]=new ArrayList<>();
            for(int d=1;d<len;d++){
                if(len%d==0){
                    divisors[len].add(d);
                }
            }
        }
        int INF=1__000_000_000;
        int[][] cost=new int[n][n];
        for(int[] row:cost){
            Arrays.fill(row,INF);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int len=j-i+1;
                int minChanges=INF;
                for(int d:divisors[len]){
                    int changes=0;
                    for(int start=0;start<d;start++){
                        int left=i+start;
                        int right=j-(d-1-start);
                        while(left<right){
                            if(s.charAt(left)!=s.charAt(right)){
                                changes++;
                            }
                            left+=d;
                            right-=d;
                        }
                    }
                    minChanges=Math.min(minChanges,changes);
                }
                cost[i][j]=minChanges;
            }
        }
        int[][] dp=new int[n+1][k+1];
        for(int[] row:dp){
            Arrays.fill(row,INF);

        }
        dp[0][0]=0;
        for(int parts=1;parts<=k;parts++){
            for(int i=2*parts;i<=n;i++){
                for(int p=2*(parts-1);p<=i-2;p++){
                    if(dp[p][parts-1]!=INF&&cost[p][i-1]!=INF){
                        dp[i][parts]=Math.min(dp[i][parts],dp[p][parts-1]+cost[p][i-1]);
                    }
                }
            }
        }
        return dp[n][k];
    }
}