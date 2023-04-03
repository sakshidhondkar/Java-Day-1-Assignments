package Day1_Question_10;
import java.util.Scanner;
public class TestMatrix {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        Matrix matrix = new Matrix(rows, columns);

        System.out.println("Enter matrix elements:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                int value = scanner.nextInt();
                matrix.setElement(r, c, value);
            }
        }

        System.out.println("Matrix:");
        matrix.printMatrix();

        System.out.println("Transposed Matrix:");
        Matrix transposedMatrix = matrix.transpose();
        transposedMatrix.printMatrix();
    }

}
