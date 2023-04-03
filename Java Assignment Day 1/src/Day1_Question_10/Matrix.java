package Day1_Question_10;

public class Matrix {
	 private int[][] matrix;
	    private int rows;
	    private int columns;

	    public Matrix() {
	        matrix = new int[10][10];
	        rows = 10;
	        columns = 10;
	    }

	    public Matrix(int r, int c) {
	        this();
	        if (r <= 10 && c <= 10) {
	            rows = r;
	            columns = c;
	        }
	    }

	    public void setElement(int r, int c, int value) {
	        if (r >= 0 && r < rows && c >= 0 && c < columns && value > 0) {
	            matrix[r][c] = value;
	        } else {
	            matrix[r][c] = 0;
	        }
	    }

	    // Transpose function for transposing the matrix
	    public Matrix transpose() {
	        Matrix transposedMatrix = new Matrix(columns, rows);
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                transposedMatrix.setElement(j, i, matrix[i][j]);
	            }
	        }
	        return transposedMatrix;
	    }

	    public void printMatrix() {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	

}
