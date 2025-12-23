import java.util.Scanner;

class MatrixAddition {
    public static void main(String args[]) {
        // Check if the command-line argument is provided
        if (args.length < 1) {
            System.out.println("Please provide the size of the matrix as a command-line argument.");
            return;
        }

        // Parse matrix size
        int n = Integer.parseInt(args[0]);
        int i, j;

        // Declare matrices
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        int C[][] = new int[n][n];

        Scanner sc = new Scanner(System.in);

        // Input Matrix A
        System.out.println("Enter the elements into Matrix A:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter the elements into Matrix B:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Compute Matrix C = A + B
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display Matrix C
        System.out.println("Elements of Matrix C (A + B):");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
