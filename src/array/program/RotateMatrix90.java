package array.program;

public class RotateMatrix90 {
	
	
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	static void rotateMatrix(int[][] matrix) {
		int n = matrix.length;
		 // Transpose the matrix (swap rows and columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        

        // Reverse elements in each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
	}

	public static void main(String[] args) {
		int[][] matrix = { {1,2,3}, {4,5,6}, {6,8,9} };

		rotateMatrix(matrix);
		printMatrix(matrix);

	}

}
