package tasks.first;

import java.util.ArrayDeque;
import java.util.Deque;

public class BreadthSearch {

    static String doSearch(boolean [][] adjacencyMatrix, int startIndex) {
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();
        int nodeCount = adjacencyMatrix.length;
        boolean[] visitedNodes = new boolean[nodeCount];
        queue.offerFirst(startIndex);
        while (queue.size() != 0) {
            int focus = queue.pollFirst();
            visitedNodes[focus] = true;
            for (int i = 0; i < adjacencyMatrix.length; i++) {
                if (adjacencyMatrix[i][focus] && !visitedNodes[i]) {
                    queue.offerLast(i);
                    visitedNodes[i] = true;
                }
            }
            output.append(focus).append(",");
        }
        return output.substring(0, output.length() - 1);
    }

}
