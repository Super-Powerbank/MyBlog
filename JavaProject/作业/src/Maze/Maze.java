package Maze;
import javafx.geometry.Pos;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

class Position {
    protected int row; //某一位置的行坐标
    protected int col; //某一位置的列坐标

    public Position() {
        super();
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Maze {
    protected int[][] maze; //迷宫数组
    protected int row; // 行长度
    protected int col; // 列长度
    //如何表示当前某一个位置点的8个方向
    protected int[][] addMaze = {{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
    protected boolean[][] flag;//迷宫数组中已经走过的
    protected Stack stack;

    //构造迷宫
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入迷宫的行数：");
        row = scanner.nextInt();
        System.out.println("请输入迷宫的列数：");
        col = scanner.nextInt();
        System.out.println("请输入" + row + "行" + col + "列的迷宫：");
        maze = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }

        System.out.println("maze: --------------");
        for (int i = 0; i < maze.length; i++) {
            System.out.println(Arrays.toString(maze[i]));
        }
        flag = new boolean[row][col];
        System.out.println("flag: --------------");
        for (int i = 0; i < flag.length; i++) {
            System.out.println(Arrays.toString(flag[i]));
        }
    }

    //查找路径
    public void findPath() {
        //i,j保存的迷宫数组中第一个可走的为位置点
        int i = 0;
        int j = 0;
        boolean entrance = false;
        for (; i < maze.length; i++) {
            for (; j < maze[i].length; j++) {
                if (maze[i][j] == 0) {
                    entrance = true;
                    break;
                }
            }
            if (entrance) {
                break;
            }
        }
        stack = new Stack();
        System.out.println("第一个可走位置点：" + i + "， " + j);
        stack.push(new Position(i, j));
        stack.push(new Position(i, j));

        while (!stack.empty()) {
            stack.pop();//回退
            Position top = (Position) stack.peek();
            //判断top下一个位置点下一个可走的点
            i = top.row;
            j = top.col;
            int index = 0;
            while (index < addMaze.length) {
                int x = i + addMaze[index][0];//x,y表示下一个可走的位置点
                int y = j + addMaze[index][1];
                //x,y所对应的位置点为0，该点必须是没有走过的
                if (x >= 0 && x < maze.length && y >= 0 && y < maze[x].length && maze[x][y] == 0 && flag[x][y] == false) {
                    System.out.println("x:" + x + " y:" + y);
                    flag[x][y] = true;//该店已经走过
                    stack.push(new Position(x, y));//找到新的可走的位置点，新点入栈

                    i = x;
                    j = y;
                    if (x == maze.length - 1) {
                        return;
                    } else {
                        //针对新位置点的8个人方向进行确认
                        index = 0;
                    }
                } else {
                    //反之当前位置不可走，顺时针找下一个可走的位置点
                    index++;
                }
            }
        }
    }

    public void printPath() {
        findPath();
        if (stack.empty()) {
            System.out.println("没有有效路径存在");
        } else {
            System.out.println("存在有效路径，输出如下");
        }

        String[][] result = new String[row][col];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = maze[i][j] + "";
            }
        }

        while (!stack.empty()) {
            Position pos = (Position) stack.pop();
            result[pos.row][pos.col] = "*";
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class MazeTest {
    public static void main(String[] args) {
        Maze demo = new Maze();
        demo.init();
        demo.printPath();

    }
}

