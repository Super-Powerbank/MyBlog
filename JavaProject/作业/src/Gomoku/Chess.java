package Gomoku;

public class Chess {
    private String chessType;//棋子类型"➕","⭕"，"●"
    private int xPos;//行坐标
    private int yPos;//列坐标

    public Chess(String chessType, int xPos, int yPos) {
        this.chessType = chessType;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String getChessType() {
        return chessType;
    }

    public void setChessType(String chessType) {
        this.chessType = chessType;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

}
