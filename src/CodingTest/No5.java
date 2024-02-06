import java.io.*;
import java.util.*;

class Solve {

    /*
     * Complete the 'countMatches' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY grid1
     *  2. STRING_ARRAY grid2
     */

    public static int countMatches(List<String> grid1, List<String> grid2) {
        // Write your code here
        // Implement the logic to count matching regions
        List<List<int[]>> regions1 = findRegions(grid1.toArray(new String[0]));
        List<List<int[]>> regions2 = findRegions(grid2.toArray(new String[0]));

        int matches = 0;
        for (List<int[]> region2 : regions2) {
            for (List<int[]> match : regions1) {
                if (isContained(region2, match)) {
                    matches++;
                    break;
                }
            }
        }

        return matches-1;
    }

    private static List<List<int[]>> findRegions(String[] grid) {
        List<List<int[]>> regions = new ArrayList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length()];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) == '1' && !visited[i][j]) {
                    List<int[]> region = new ArrayList<>();
                    dfs(grid, i, j, visited, region);
                    regions.add(region);
                }
            }
        }

        return regions;
    }

    private static void dfs(String[] grid, int i, int j, boolean[][] visited, List<int[]> region) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length() || grid[i].charAt(j) != '1' || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        region.add(new int[]{i, j});
        dfs(grid, i + 1, j, visited, region);
        dfs(grid, i - 1, j, visited, region);
        dfs(grid, i, j + 1, visited, region);
        dfs(grid, i, j - 1, visited, region);
    }

    private static boolean isContained(List<int[]> region1, List<int[]> region2) {
        for (int[] cell : region2) {
            boolean found = false;
            for (int[] matchCell : region1) {
                if (cell[0] == matchCell[0] && cell[1] == matchCell[1]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}

public class No5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int grid1Count = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid1 = new ArrayList<>();

        for (int i = 0; i < grid1Count; i++) {
            String grid1Item = bufferedReader.readLine();
            grid1.add(grid1Item);
        }

        int grid2Count = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid2 = new ArrayList<>();

        for (int i = 0; i < grid2Count; i++) {
            String grid2Item = bufferedReader.readLine();
            grid2.add(grid2Item);
        }

        int result = Solve.countMatches(grid1, grid2);
        System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
