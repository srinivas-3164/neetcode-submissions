class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();

        map.put('{', '}');
        map.put('(', ')');
        map.put('[',']');


        for (int i = 0; i < s.length(); i++) {
            Character iter = s.charAt(i);
            if (map.containsKey(iter)) {
                stack.push(iter);
            } else if (stack.isEmpty() || map.get(stack.peek()) != iter) {
                return false;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
