package Puzzle2;
import java.util.Stack;
import java.util.Scanner;

public class puzzle {
    private PuzzleNode[] puzzleNodes;
    private int num;
    private Stack<PuzzleNode> stack = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);
    public puzzle(){
        System.out.println("请输入方格数：");
        num = scanner.nextInt();
        puzzleNodes = new PuzzleNode[num];
    }
    public void initValue(){
        System.out.println("请输入方格中的值：");
        for(int i=0;i<num;i++){
            puzzleNodes[i] = new PuzzleNode(scanner.nextInt(),i);
        }
    }
    public void initWayState(){
        for(int i=0;i<num;i++){
            if(puzzleNodes[i].getValue() != 0){
                if(i+puzzleNodes[i].getValue() < num){
                    puzzleNodes[i].setWayState(Constant.WAY_RIGHT,Constant.WAY_ABLE);
                }
                if(i-puzzleNodes[i].getValue() >= 0){
                    puzzleNodes[i].setWayState(Constant.WAY_LEFT,Constant.WAY_ABLE);
                }
            }
        }
    }
    public void goPuzzle(){
        if(puzzleNodes[0].getValue() == 0){
            System.out.println("不能走到结尾");
        }
        stack.push(puzzleNodes[0]);
        while (!stack.isEmpty()){
            PuzzleNode top = stack.peek();
            int i = top.getI();
            if(i == num-1){
                System.out.println("可以走到结尾");
                return;
            }
            if(puzzleNodes[i].getWayState(Constant.WAY_LEFT) == Constant.WAY_DISABLE &&
                    puzzleNodes[i].getWayState(Constant.WAY_RIGHT) == Constant.WAY_DISABLE){
                stack.pop();
            }
            else if(puzzleNodes[i].getWayState(Constant.WAY_RIGHT)){
                stack.push(puzzleNodes[i+puzzleNodes[i].getValue()]);
                puzzleNodes[i].setWayState(Constant.WAY_RIGHT,Constant.WAY_DISABLE);
            }
            else if(puzzleNodes[i].getWayState(Constant.WAY_LEFT)){
                stack.push(puzzleNodes[i-puzzleNodes[i].getValue()]);
                puzzleNodes[i].setWayState(Constant.WAY_LEFT,Constant.WAY_DISABLE);
            }
        }
    }
    public void finish(){
        if(stack.isEmpty()){
            System.out.println("不能走到结尾");
        }else {
            PuzzleNode top = stack.peek();
            if(top == puzzleNodes[num-1] && top.getI() == num -1) {
                int[] arr = new int[stack.size()];
                int i = 0;
                while (!stack.isEmpty()) {
                    top = stack.peek();
                    arr[i++] = top.getI();
                    stack.pop();
                }
                for (int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[j]+" ");
                }
            }else {
                System.out.println("不能走到结尾");
            }
        }
    }
    public void begin(){
        initValue();
        initWayState();
        goPuzzle();
        finish();
    }
}
