package com.example.sivakrishna.myapplication;

public class Grid {

    String gridStr;
    int[][] grid;

    public Grid(String gridStr, int[][] grid) {
        this.gridStr = gridStr;
        this.grid = grid;
    }

    public static Grid createGrid(int numRows, int numColumns) {
        int[][] grid = createGridIntArray(numRows, numColumns);
        String gridStr = createGridString(numRows, numColumns, grid);
        return new Grid(gridStr, grid);
    }

    public static int[][] createGridIntArray(int numRows, int numColumns) {
        int[][] grid = new int[numRows][numColumns];

        grid[00][0]=3;grid[00][01]=4;grid[00][02]=1;grid[00][03]=2;grid[00][04]=8;grid[00][05]=6;
        grid[01][0]=6;grid[01][01]=1;grid[01][02]=8;grid[01][03]=2;grid[01][04]=7;grid[01][05]=4;
        grid[02][0]=5;grid[02][01]=9;grid[02][02]=3;grid[02][03]=9;grid[02][04]=9;grid[02][05]=5;
        grid[03][0]=8;grid[03][01]=4;grid[03][02]=1;grid[03][03]=3;grid[02][04]=2;grid[02][05]=6;
        grid[04][0]=3;grid[04][01]=7;grid[04][02]=2;grid[04][03]=1;grid[04][04]=2;grid[04][05]=3;




        return grid;
    }

    public static String createGridString(int numRows, int numColumns, int[][] grid) {
        String gridStr = "";

        int rowLength = numRows;
        int columnLength = numColumns;

        for (int row = 0; row < rowLength; row++) {
            for (int column = 0; column < columnLength; column++) {
                String numberString = String.valueOf(grid[row][column] + "  ");

                if (numberString.length() == 3) {
                    numberString += "   ";
                } else {
                    numberString += " ";
                }

                gridStr += numberString;
            }
            gridStr += "\n";
        }
        return  gridStr;
    }

    public String getGridString() {
        return gridStr;
    }

    public int[][] getGridArray() {
        return grid;
    }
}
