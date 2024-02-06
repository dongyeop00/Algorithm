package CodingTest;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,1);
        List<Integer> b = Arrays.asList(1,2);
        int n=2;

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i + 1, new ArrayList<>());
        }
        for (int i = 0; i < a.size(); i++) {
            int dependency = a.get(i);
            int task = i + 2;
            graph.get(dependency).add(task);
        }

        // 주 작업 배열을 내림차순으로 정렬
        Collections.sort(b, Collections.reverseOrder());

        int completedTasks = 0;

        // 각 주 작업에 대해 의존 작업이 이미 완료되었는지 확인
        for (int task : b) {
            if (graph.containsKey(task)) {
                List<Integer> dependencies = graph.get(task);
                boolean dependenciesCompleted = true;
                for (int dependency : dependencies) {
                    if (dependency > 0) {
                        dependenciesCompleted = false;
                        break;
                    }
                }
                if (dependenciesCompleted) {
                    completedTasks++;
                    // 해당 작업을 완료했으므로 의존 작업을 제거
                    for (int i = 1; i <= n; i++) {
                        graph.get(i).remove(Integer.valueOf(task));
                    }
                }
            }
        }

        System.out.println(completedTasks);
    }
}
