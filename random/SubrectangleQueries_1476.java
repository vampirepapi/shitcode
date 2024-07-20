package random;

public class SubrectangleQueries_1476 {
    int[][] rectangle;

    public SubrectangleQueries_1476(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
                // System.out.println(rectangle[i][j]);
            }
        }
    }

    public int getValue(int row, int col) {
        System.out.println(rectangle[row][col]);
        return rectangle[row][col];
    }

}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */