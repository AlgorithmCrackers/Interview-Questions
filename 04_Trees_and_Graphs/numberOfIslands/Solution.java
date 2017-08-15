public class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int l = grid.length;
        if(l == 0) return islands;
        int b = grid[0].length;
        if(b == 0) return islands;
        
        for(int i = 0; i < l; i++) {
        	for(int j = 0; j < b; j++) {
        		if(grid[i][j] == '1') {
        			islands++;
        			dfs(i, j, l, b, grid); // dfs marks individual island groups
        		}
        	}
        }
        return islands;
    }

    private void dfs(int i, int j, int l, int b, char[][] grid) {
    	if(i < 0 || j < 0 || i >= l || j >= b || grid[i][j] != '1') return;
    	grid[i][j] = '0';         // mark as complete ( you can also use visited )
    	dfs(i-1, j, l, b, grid); // check top
    	dfs(i+1, j, l, b, grid); // check bottom
    	dfs(i, j-1, l, b, grid); // check left
    	dfs(i, j+1, l, b, grid); // check right
    }
}
