package tasks.first;

public class FirstTaskSolution implements FirstTask {

    public static void main(String[] args) {

    }

    @Override
    public String breadthFirst(boolean[][] adjacencyMatrix, int startIndex) {
        return BreadthSearch.doSearch(adjacencyMatrix, startIndex);
    }

    @Override
    public Boolean validateBrackets(String s) {
        return Braces.bracketsAreCorrectlyPlaced(s);
    }

    @Override
    public Long polishCalculation(String s) {
        return null;
    }
}

