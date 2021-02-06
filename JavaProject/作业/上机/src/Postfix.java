import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public static String infixToPostfix(String infix) {
        Stack<Character> op = new Stack<Character>();
        StringBuilder postfixStr = new StringBuilder();
        char[] prefixs = infix.trim().toCharArray();
        Character ch;
        for (int i = 0; i < prefixs.length; i++) {
            ch = prefixs[i];
            // 如果是数字 0~9
            if (ch >= '0' && ch <= '9') {
                postfixStr.append(ch);
                continue;
            }
            // "("---直接压栈
            if ('(' == ch) {
                op.push(ch);
                continue;
            }
            /*
             * '+ - * /'----空栈直接压栈否则与栈顶元素比较， 优先级低于栈顶元素则弹出栈直到遇到优先级相等或者低的就停止弹栈
             * 最后将该操作符压栈
             */

            if ('+' == ch || '-' == ch) {
                // 只要栈不为空，栈顶元素不是'(' 就弹栈
                while (!op.empty() && (op.peek() != '(')) {
                    postfixStr.append(op.pop());
                }
                op.push(ch);
                continue;
            }
            if ('*' == ch || '/' == ch) {
                // 只要栈不为空，栈顶元素是'* /' 就弹栈
                while (!op.empty() && (op.peek() == '*' || op.peek() == '/')) {
                    postfixStr.append(op.pop());
                }
                op.push(ch);
                continue;
            }
            // ')'----开始弹栈直到遇到第一个'('
            if (')' == ch) {
                while (!op.empty() && op.peek() != '(') {
                    postfixStr.append(op.pop());
                }
                op.pop();// ----将'('元素弹出
                continue;
            }
        }
        // 所有字符遍历完毕操作数栈还有数据就全部弹栈
        while (!op.empty())
            postfixStr.append(op.pop());
        return postfixStr.toString();
    }

    public static void main(String[] args) {
        System.out.println("请输入中缀表达式：");
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        System.out.println("后缀表达式:" + infixToPostfix(str));
    }
}
