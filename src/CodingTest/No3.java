package CodingTest;
import java.io.*;
import java.util.*;

public class No3 {

    // Complete the tasks function below.
    static int tasks(int n, List<Integer> a, List<Integer> b) {
        Map<Integer, Integer> completedTasks = new HashMap<>();
        int maxCompletedTasks = 0;

        for (int i = 0; i < n; i++) {
            int task = b.get(i);
            int dependentTask = a.get(i);

            // If the dependent task is completed, update the completed tasks count
            if (completedTasks.containsKey(dependentTask)) {
                int currentCompletedTasks = completedTasks.get(dependentTask);
                completedTasks.put(task, Math.max(completedTasks.getOrDefault(task, 0), currentCompletedTasks + 1));
                maxCompletedTasks = Math.max(maxCompletedTasks, completedTasks.get(task));
            } else {
                // If the dependent task is not completed, start from the beginning
                completedTasks.put(task, Math.max(completedTasks.getOrDefault(task, 0), 1));
                maxCompletedTasks = Math.max(maxCompletedTasks, completedTasks.get(task));
            }
        }

        return maxCompletedTasks;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Use System.out instead of FileWriter if OUTPUT_PATH is not specified
        BufferedWriter bufferedWriter = new BufferedWriter(System.getenv("OUTPUT_PATH") != null ?
                new FileWriter(System.getenv("OUTPUT_PATH")) : new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < aCount; i++) {
            int aItem = Integer.parseInt(bufferedReader.readLine().trim());
            a.add(aItem);
        }

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < bCount; i++) {
            int bItem = Integer.parseInt(bufferedReader.readLine().trim());
            b.add(bItem);
        }

        int res = tasks(n, a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

