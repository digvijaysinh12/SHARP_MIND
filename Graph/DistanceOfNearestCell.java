// Distance of the nearest cell having 1

/*
 
    1   0   1               0   1   0
    1   1   0     ===>      0   0   1
    1   0   0               0   1   2
 
 */

/*
 
    pick all 1 and take one step on the all the four direction
    if zero and then take one more step
    start with bfs and take step still reach all 0 s 

    --> Take same size of matrix for visited array and marked with all 0
    --> we will create one distance matrix that store distance of the particular node
    --> all 1 are stored in queue in formate like ((r,c),0)
    --> update vis array by 1 and also give dist matrix to 0
    --> Now travese queue and go each node top right bottom and left and update vis and 

    Function nearest(grid):
    n ← number of rows in grid
    m ← number of columns in grid

    Create a 2D array vis[n][m] initialized to 0  // Visited array
    Create a 2D array dis[n][m] initialized to 0  // Distance array

    Create an empty queue q

    // Step 1: Add all cells with 1 to the queue
    for i from 0 to n-1:
        for j from 0 to m-1:
            if grid[i][j] == 1:
                Mark vis[i][j] = 1
                Enqueue (i, j, distance = 0) into q

    // Direction arrays for 4-connected neighbors (top, right, bottom, left)
    drow = [-1, 0, 1, 0]
    dcol = [0, 1, 0, -1]

    // Step 2: BFS traversal
    while queue is not empty:
        (r, c, distance) ← dequeue from q
        dis[r][c] ← distance

        for each direction i from 0 to 3:
            nrow ← r + drow[i]
            ncol ← c + dcol[i]

            // Check for valid unvisited 0-cell
            if nrow in bounds and ncol in bounds and vis[nrow][ncol] == 0:
                Mark vis[nrow][ncol] = 1
                Enqueue (nrow, ncol, distance + 1) into q

    return dis
 
 */

import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCell {

    public int[][] nearest(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int dis[][] = new int[n][m];
        Queue<Node> q = new LinkedList<Node>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] ==1){
                    q.add(new Node(i, j, 0));
                    vis[i][j] = 1;
                     System.out.println("Initial 1 at: (" + i + "," + j + ")");
                }else{
                    vis[i][j] = 0;
                }
            }
        }

        int row[] = {-1,0,+1,0};
        int col[] = {0,+1,0,-1};

        while (!q.isEmpty()) {
            int r = q.peek().first;
            int c = q.peek().second;
            int distance = q.peek().third;
            q.remove();
            dis[r][c] = distance;
            System.out.println("Visited: (" + r + "," + c + ") with distance: " + distance);

            for(int i=0;i<4;i++){
                int nrow = r + row[i];
                int ncol = c + col[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == 0){
                    vis[nrow][ncol] = 1;
                    q.add(new Node(nrow, ncol, distance+1));
                    System.out.println("  Added to queue: (" + nrow + "," + ncol + ") with distance: " + (distance + 1));
                }
            }
        }
        return dis;
    }
    public static void main(String[] args) {
        DistanceOfNearestCell obj = new DistanceOfNearestCell();
        int[][] grid = {
            {1, 0, 1},
            {1, 1, 0},
            {1, 0, 0}
        };

        int[][] result = obj.nearest(grid);
          System.out.println("\nFinal Distance Matrix:");
        for(int[] row : result){
            for(int cell : row){
                System.out.print(cell + " ");
            }
            System.out.println();
        } 
    }
}

class Node {
    int first;
    int second;
    int third;
    Node(int first,int second,int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}