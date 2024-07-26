package Patterns;

public class PrintDiamondInStar {
    public static void main(String[] args) {
        for (int row = 0; row < 2 * 4; row++) {
            int totalColsInRow = row > 4 ? 2 * 4 - row: row;

            int noOfSpaces = 4 - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}