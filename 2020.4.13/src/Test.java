import java.util.Scanner;
public class Test {
    public static String path = "";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        int[][] maze = new int[n][m];
        boolean[][] realpath = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = in.nextInt();
            }
        }
        Solution(maze,realpath,0,0,"",p);
        System.out.println(path);
    }
    public static void Solution(int[][] maze,boolean[][] realpath,int i,int j,String trypath,int p){
        if(i==0&&j==maze[0].length-1&&maze[i][j]==1){
            if(p>=0){
                path = trypath + "["+i+","+j+"]";
            }else {
                path="Can not escape!";
            }
            return;
        }
        if(i>=0&&j>=0&&i < maze.length && j < maze[0].length && maze[i][j] == 1 && !realpath[i][j]){
            realpath[i][j] = true;
            trypath += "["+i+","+j+"],";
            Solution(maze,realpath,i,j+1,trypath,p-1);//向右
            Solution(maze,realpath,i+1,j,trypath,p);//向下
            Solution(maze,realpath,i,j-1,trypath,p-1);//向左
            Solution(maze,realpath,i-1,j,trypath,p-3);//向前
        }
    }
}
