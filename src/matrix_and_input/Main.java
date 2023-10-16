package matrix_and_input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        String[][] matrix2 = new String[2][3];

        int[][] matrix3 = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };

//        for (int i = 0; i < matrix3.length; i++)
//        {
//            for (int j = 0; j < matrix3[i].length; j++)
//            {
//                System.out.print( matrix3[i][j]  + "\t");
//            }
//            System.out.println();
//        }
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println("Enter row "+i+":\n");
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Enter el "+j+": ");
                matrix1[i][j] = Integer.parseInt(myObj.nextLine());
            }
        }
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

}
