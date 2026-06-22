class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String curr : tokens) {
           if (curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                switch (curr) {
                    case "+": {
                        stack.push(a + b);
                        break;
                    } case "-": {
                        stack.push(b - a);
                        break;
                    } case "*" : {
                        stack.push(a * b);
                        break;
                    } case "/" :{
                        stack.push(b / a);
                        break;
                    }
                }
           } else 
                stack.push(Integer.parseInt(curr));
        }


        return stack.pop();
    }
}
