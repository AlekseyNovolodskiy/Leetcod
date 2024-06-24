public class IslandPerimetr {
    public static int islandPerimeter(int[][] grid) {
        int top=0;
        int bot=0;
        int right=0;
        int left=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if((i==0 && grid[i][j]==1)||(grid[i][j]==1 && grid[i-1][j]==0)){
                    left++;
                }
                if( (i== grid.length-1 && grid[i][j]==1) || (grid[i][j]==1 && grid[i+1][j]==0)){
                    right++;
                }
                if((j==0 && grid[i][j]==1) || (grid[i][j]==1 && grid[i][j-1]==0) ){
                    top++;
                }
                if( (j==grid[0].length-1 && grid[i][j]==1) || (grid[i][j]==1 && grid[i][j+1]==0) ){
                    bot++;
                }
            }
        }

            return top+bot+right+left;
    }

    public static void main(String[] args) {
        int [][] twoDimArray = {{1,0,0,0}, {0,0,0,0}, {0,0,0,0},{0,0,0,0}};
        System.out.println(islandPerimeter(twoDimArray));
    }
}
