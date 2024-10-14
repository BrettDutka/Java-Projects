/**
 * Creates a matrix
 */
public class Matrix {
    private int[][] matrix;
    private int rows;
    private int columns;

    /**
     * Creates the matrix object with the given number of rows and columns. Then it initializes it with the values from the array.
     * @param rows number of rows in the matrix
     * @param columns number of columns in the matrix
     * @param v an array that initializes the matrix
     */
    public Matrix(int rows, int columns, int[][] v){
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = v[i][j];
            }
        }
    }

    /**
     * Returns the number of rows that are in the full matrix
     * @return number of rows
     */
    public int getRows(){
        return rows;
    }

    /**
     * Returns the number of columns that are in the full matrix
     * @return number of columns
     */
    public int getColumns(){
        return columns;
    }

    /**
     * Sets the value of a certain row and column to the given.
     * @param i row index
     * @param j column index
     * @param val the value that will be set
     */
    public void set(int i, int j, int val){
        if(i >= 0 && i < rows && j >= 0 && j < columns)
            matrix[i][j] = val;
    }

    /**
     * Adds the given matrix to the current matrix. If the dimensions of the matrix are not the same then it will do nothing.
     * @param m matrix that will be added
     */
    public void add(Matrix m){
        if(rows == m.rows && columns == m.columns){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] += m.matrix[i][j];
                }
            }
        }
    }

    /**
     * Multiplies the current matrix by the given matrix.
     * @param m matrix that will be multiplied
     */
    public void multiply(Matrix m){
        if(columns == m.rows){
            int[][] ans = new int[rows][m.columns];
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < m.columns; j++){
                    for(int x = 0; x < columns; x++){
                        ans[i][j] += matrix[i][x] * m.matrix[x][j];
                    }
                }
            }
            columns = m.columns;
            matrix = ans;
        }
    }

    /**
     * Transposes the matrix by switching the rows and columns
     */
    public void transpose(){
        if(rows == 0 || columns == 0)
            return;

        int[][] t = new int[columns][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                t[j][i] = matrix[i][j];
            }
        }
        rows = columns;
        columns = t[0].length;
        matrix = t;
    }

    /**
     * Rotates the matrix
     */
    public void rotate(){
        if(rows == 0 || columns == 0)
            return;

        int[][] r = new int[columns][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                r[j][rows - i - 1] = matrix[i][j];
            }
        }
        rows = r.length;
        columns = r[0].length;
        matrix = r;
    }

    /**
     * Returns the array of integers that make up the matrix
     * @return array of integers that make up the matrix
     */
    public int[][] getMatrix(){
        return matrix;
    }

    /**
     * Returns a string format of the matrix in a box
     * @return the matrix
     */
    @Override
    public String toString(){
        StringBuilder fullMatrix = new StringBuilder();
        for(int[] row : matrix) {
            for (int v : row) {
                fullMatrix.append(v).append("\t");
            }
            fullMatrix.append("\n");
        }
        return fullMatrix.toString();
    }
}


