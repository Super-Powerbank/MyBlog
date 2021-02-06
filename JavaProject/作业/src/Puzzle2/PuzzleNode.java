package Puzzle2;

    public class PuzzleNode {
        private int value;
        private int i;
        private boolean[] wayState;
        public PuzzleNode(int value,int i){
            this.value = value;
            this.i = i;
            wayState = new boolean[Constant.WAYNUM];
        }
        public int getValue() {
            return value;
        }
        public void setWayState(int direction,boolean isAble){
            wayState[direction] = isAble;
        }
        public boolean getWayState(int direction){
            return wayState[direction];
        }
        public int getI(){
            return i;
        }

    }
