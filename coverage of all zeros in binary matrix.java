class Solution {
    public int findCoverage(int[][] matrix) {
        // code with me
        // for row: i-1>=0 , i+1<n
        // for col: j-1>=0, j+1<m
          int count=0;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0; i<n; i++){ 
// here we have taken i and j counters as n and m as code there is only till i and j so n and m doesnt go out of bounds
            for(int j=0; j<m; j++){
                if(matrix[i][j]==1){
                    continue;
                }
                if(i-1>=0 && matrix[i-1][j]==1)
                count++;
                if(i+1<n && matrix[i+1][j]==1)
                count++;
                if(j-1>=0 && matrix[i][j-1]==1)
                count++;
                if(j+1<m && matrix[i][j+1]==1)
                count++;
            }
        }
        return count;
    }
}