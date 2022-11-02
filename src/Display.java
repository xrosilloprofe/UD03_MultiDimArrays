/**
 * Class to display vectors and matrix
 */
public class Display {
    public static void show(int[][] v){
        for (int row = 0; row < v.length; row++) {
            for (int col = 0; col < v[row].length; col++) {
                System.out.print(v[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void show(double[][] v){
        for(double[] vector : v) {
            for(double element : vector) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void show(String[][] v){
        for (int row = 0; row < v.length; row++) {
            for (int col = 0; col < v[row].length; col++) {
                System.out.print(v[row][col] + " ");
            }
            System.out.println();
        }
    }
}
