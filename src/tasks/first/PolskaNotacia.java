package tasks.first;

public class PolskaNotacia {

    static Long solve(String arg) {
        String[] str = arg.split(" ");
        Deque<Long> throwMeSomeNumbers = new ArrayDeque<>();
        Deque<Character> operators = new ArrayDeque<>();
        for (String s : str) {
            char guide = s.charAt(0);
            if ("+-*".indexOf(guide) == -1) {
                throwMeSomeNumbers.addLast(Long.parseLong(s));
            } else {
                operators.addLast(guide);
            }
        }
        while (operators.size() != 0) {
            char operator = operators.removeFirst();
            long arg1 = throwMeSomeNumbers.removeFirst();
            long arg2 = throwMeSomeNumbers.removeFirst();
            throwMeSomeNumbers.addFirst(doOperation(operator, arg1, arg2));
        }
        return throwMeSomeNumbers.element();
    }

    static Long doOperation(char key, long x, long y) {
        switch (key) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            default:
                return 0L;
        }
    }

}
