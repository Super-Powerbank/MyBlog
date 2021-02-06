package Gomoku;

import java.util.Scanner;

public class Gomoku {
    private Chess [][] board;//棋盘
    private static final int BOARD_SIZE =10;//棋盘大小
    private static final int CONNECTION =5;//连成棋子个数 5
    private int size;//保存已经下的棋子个数 size==格子数 此局平局

    public Gomoku() {
        this.board = new Chess[BOARD_SIZE][BOARD_SIZE];
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                board[i][j]=new Chess("➕",i,j);
            }
        }
    }
    public void printChessboard(){
        for(int i = 0; i<BOARD_SIZE; i++){
            for(int j = 0; j <BOARD_SIZE; j++){
                System.out.print(board[i][j].getChessType());
            }
            System.out.println();
        }
    }
    private String gameChoiceChess(){
        System.out.println("请输入棋子类型：黑棋or白棋");
        Scanner scanner = new Scanner(System.in);
        String chess;
        if (scanner.next().equals("黑棋")){
            chess="●";
        }else {
            chess="⭕";
        }
        return chess;
    }
    private boolean isSearchSuccessChess(String chess,int i,int j) {//当前位置周围四个方向是否连成五个棋子
        int x = i, y = j;//当前i j位置的坐标
        int count = 1;//计数器 本身算一个棋子
        //竖方向
        if (i + 1 < board.length && board[i + 1][j].getChessType().equals(chess)
                || i - 1 >= 0 && board[i - 1][j].getChessType().equals(chess)) {
            //下边
            while (x + 1 < board.length && board[x + 1][y].getChessType().equals(chess)) {
                count++;
                x++;
            }
            //上边
            x =i;y=j;
            while (x - 1 >= 0 && board[x - 1][y].getChessType().equals(chess)) {
                count++;
                x--;
            }
            System.out.println(count);
            if (count >= CONNECTION) {
                System.out.println(chess + "类型棋子赢");
                return true;
            }
        }

        //横方向
         x =i;y=j;//当前i j位置的坐标
         count = 1;//计数器 本身算一个棋子
        if (j + 1 < board.length && board[i][j + 1].getChessType().equals(chess) || j - 1 >= 0 && board[i][j - 1].getChessType().equals(chess)) {
            while (y + 1 < board.length && board[x][y + 1].getChessType().equals(chess)) {// 右方
                count++;
                y++;
            }
            x =i;y=j;
            while (y - 1 >= 0 && board[x][y - 1].getChessType().equals(chess)) {//左方
                count++;
                y--;
            }
            System.out.println(count);
            if (count >= CONNECTION) {
                System.out.println(chess + "获胜");
                return true;
            }
        }
        //斜方向 /
        x = i; y = j;//当前i j位置的坐标
        count = 1;//计数器 本身算一个棋子
        if (i-1>=0 && j+1<board.length &&board[i - 1][j + 1].getChessType().equals(chess) || i+1<board.length && j-1>=0 && board[i + 1][j - 1].getChessType().equals(chess)) {
            while (x-1>=0 && y+1<board.length &&board[x - 1][y + 1].getChessType().equals(chess)) {// 右上方
                count++;
                x--;
                y++;
            }
            x =i;y=j;
            while (x + 1 < board.length && y - 1 >= 0 && board[x + 1][y - 1].getChessType().equals(chess)) {//左下方
                count++;
                x++;
                y--;
            }
            System.out.println(count);
            if (count >= CONNECTION) {
                System.out.println(chess + "获胜");
                return true;
            }
        }
        //反斜方向\
        x = i;y = j;//当前i j位置的坐标
        count = 1;//计数器 本身算一个棋子
        if (x - 1 >= 0 && y - 1 >= 0 && board[x - 1][y - 1].getChessType().equals(chess) || x + 1 < board.length && y + 1 < board.length && board[x + 1][y + 1].getChessType().equals(chess)) {
            while (x - 1 >= 0 && y - 1 >= 0 && board[x - 1][y -1].getChessType().equals(chess)) {// 左上方
                count++;
                x--;
                y--;
            }
            x =i;y=j;
            while (x + 1 < board.length && y + 1 < board.length && board[x + 1][y + 1].getChessType().equals(chess)) {//右下方
                count++;
                x++;
                y++;
            }
            System.out.println(count);
            if (count >= CONNECTION) {
                System.out.println(chess + "获胜");
                return true;
            }
        }
        return false;
    }

    public void start() { //游戏入口函数
        String beginChess = gameChoiceChess();//"棋子选择"●"
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请" + beginChess + "下棋");
            System.out.println("请输入第x行 第y列坐标，以x y形式：");
            int xPos = scanner.nextInt();
            int yPos = scanner.nextInt();
            if (board[xPos - 1][yPos - 1].getChessType().equals("➕")) {//当前位置是否有元素"⭕"，"●"
                board[xPos - 1][yPos - 1].setChessType(beginChess);//在当前位置放置元素⭕"，"●"
                printChessboard();
                boolean result = isSearchSuccessChess(beginChess, board[xPos - 1][yPos - 1].getxPos(), board[xPos - 1][yPos - 1].getyPos());//统计当前位置的四个方向的相同棋子类型相加是否等于5
                size++;//统计棋子个数


                if (result == true) {
                    System.out.println("是否进行新游戏？ 是or否");
                    if (scanner.next().equals("是")) {
                        start(); //重新开始
                    } else {
                        break;
                    }
                }
                //判断是否平局
                if (size == 10 * 10) {
                    System.out.println("此局平局，是否进行新游戏？ 是or否");
                    if (scanner.next().equals("是")) {
                        start();
                    } else {
                        break;
                    }
                }
//                    白棋黑棋相互交替
                if (beginChess.equals("⭕")) {
                    beginChess = "●";
                } else {
                    beginChess = "⭕";
                }
            } else {//不是➕
                System.out.println("此位置有元素，重新选择坐标");
            }

        }

    }
}
