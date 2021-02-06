import java.util.Stack;

class Compute{
    public  boolean isNum(String num){
        for (int i=num.length();--i>=0;){
            if (!Character.isDigit(num.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean isOperator(String operator){
        switch (operator){
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
                default:
                    return false;
        }
    }
    public int priority(String operator) {
        switch (operator) {
            case "(":
            case ")":
                return 0;
            case "+":
            case "_":
                return 1;
            case "*":
            case "/":
                return 2;
                default:
                    return -1;
        }
    }

    public  void toBack(String[] middle){
        Stack<String> operator = new Stack<>();
        Stack<String> num = new Stack<>();

        for (int i=0;i<middle.length;i++){
            if (isNum(middle[i])){
                //如果是数字直接入栈
                num.push(middle[i]);
            }else if (middle[i].equals("(")){
                //如果是左括号
                operator.push(middle[i]);
            }else if (middle[i].equals(")")){
                //如果是右括号，则将左右括号两者之间的操作符全入操作数栈，作为最终结果集
                while (!operator.isEmpty()&&!operator.peek().equals("(")){
                    num.push(operator.pop());
                }
                operator.pop();
            }else if (isOperator(middle[i])){
                if (operator.isEmpty()){
                    operator.push(middle[i]);
                }else {
                    while (!operator.isEmpty()&&priority(middle[i])<=priority(operator.peek())){
                        //当前操作符的优先级小于等于栈顶操作符优先级时将栈顶操作符写入操作数栈中，这是一个循环
                        num.push(operator.pop());
                    }
                    //将当前操作符入栈
                    operator.push(middle[i]);
                }
            }else {
                throw new UnsupportedOperationException("The given operator or number don't OK");
            }
        }
        while (!operator.isEmpty()){
            num.push(operator.pop());
        }
        for (String s:num){
            System.out.print(s+" ");
        }
    }
}

public class SuffixTest {
    public static void main(String[] args) {
        Compute compute =new Compute();
        String[] str = {"(", "3", "+", "5", ")", "*", "4","-","6","/","2"};
        compute.toBack(str);
    }
}
