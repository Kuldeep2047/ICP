package Assignment_3;

public class Number_of_Islands {
    public static void main(String[] args){
        char[][] grid = {
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
                        };
        int ans =0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    Islands(grid,i,j);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void Islands(char[][] grid,int cr,int cc){
        if(cc<0 || cr<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]!='1'){
            return;
        }

        grid[cr][cc] = '*';

        Islands(grid,cr+1,cc);
        Islands(grid,cr-1,cc);
        Islands(grid,cr,cc+1);
        Islands(grid,cr,cc-1);
    }
}
