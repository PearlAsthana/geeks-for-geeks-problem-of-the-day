class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        int n=mat.length;
        int m=mat[0].length;
        k%=m;
        if(k==0)
        return mat;
        int[][] ans=new int[n][m];
        for( int i=0; i<n; i++){
            int x=0;
            for(int j=k; j<m; j++,x++){
                ans[i][x]=mat[i][j];
            }
            for(int j=0; j<k; j++,x++){
                ans[i][x]=mat[i][j];
            }
        }return ans;
    }
}