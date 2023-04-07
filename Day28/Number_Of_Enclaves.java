// User function Template for Java

class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0||j==0||i==grid.length-1||j==grid[0].length-1){
                    dfs(grid,i,j);
                }
            }
        }
        for(int l=0;l<grid.length;l++){
            for(int h=0;h<grid[0].length;h++){
                if(grid[l][h]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public void  dfs(int grid[][], int i , int j){
        if(i==grid.length||i<0||j==grid[0].length||j<0||grid[i][j]==0 || grid[i][j]==2 ){
            return ;
        }
        grid[i][j]=2;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}