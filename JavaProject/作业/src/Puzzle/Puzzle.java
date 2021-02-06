package Puzzle;

import java.util.Scanner;
import java.util.Stack;

public class Puzzle {
    private PuzzleNode[] puzzleNodes;
    private static final int NODESIZE = 10;
    private Stack<PuzzleNode> stack = new Stack<>();
    private static Scanner scanner = new Scanner(System.in);

    public Puzzle() {
        this.puzzleNodes =new PuzzleNode[NODESIZE];
    }
    private void initPuzszle(){//初始化数组
        //随机生成数组
        System.out.println("请输入方格中的值：");
        for(int i=0;i<puzzleNodes.length;i++){
            puzzleNodes[i] = new PuzzleNode(scanner.nextInt(),i);
        }
    }
    private void adjustDirection(){//调整每个节点左右方向是否可走
        for (int i=0;i<puzzleNodes.length;i++){
            //左边
            if(i-puzzleNodes[i].getValue()>=0){
                puzzleNodes[i].setLeft(true);
            }
            //右边
            if (i + puzzleNodes[i].getValue()<puzzleNodes.length){
                puzzleNodes[i].setRight(true);
            }
        }
    }
    public void goPuzzle(){
        initPuzszle();
        adjustDirection();

        stack.push(puzzleNodes[0]);
        while (!stack.isEmpty()){
            //下一个
            PuzzleNode top = stack.peek();
            int value = top.getValue();
            int index = top.getIndex();
            if(value == 0 && index == puzzleNodes.length-1){
                System.out.println("成功找到路径");
                break;
            }
            if(top.isRight()){//右边可走
                //将右边节点入栈
                stack.push(puzzleNodes[index+value]);
                top.setRight(false);
            }else if(top.isLeft()){
                //将左边方向入栈
                stack.push(puzzleNodes[index-value]);
                top.setLeft(false);
            }else{//左右不可走
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println("无路可走");
        }else{
            show();
        }
    }
    private void show(){
        while (!stack.isEmpty()){
            System.out.print(stack.peek().getValue()+"⬅");
            stack.pop();
        }
    }



}
