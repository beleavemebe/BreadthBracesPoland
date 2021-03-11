package tasks.first;

import java.util.ArrayDeque;

public class Braces {

    static String openingBraces = "([{";
    static String closingBraces = ")]}";

    public static Boolean bracketsAreCorrectlyPlaced(String s) {
        char[] input = s.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (Character c : input) {
            if (openingBraces.contains(c.toString())) {
                stack.add(c);
                continue;
            }

            if (!closingBraces.contains(c.toString())) continue;

            if (stack.isEmpty()) return false;

            if (closingBraces.indexOf(c) == openingBraces.indexOf(stack.peekLast())) stack.removeLast();
        }
        return stack.isEmpty();
    }

}
