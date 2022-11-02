/**
 * Create a program to store the notes of students for several subjects.
 * For this, you have to create a multidimensional array, where all student grades will appear in the rows,
 * and subject grades for a particular student will appear at the columns
 */
public class Main {
    public static void main(String[] args) {
        String[][] course = new String[Input.getInteger("Please, introduce the amount of subjects: ")+1]
                [Input.getInteger("Please, introduce the amount of students: ")+1];

        fillStudents(course);
        fillSubjects(course);
        fillCourse(course);
        Display.show(course);
    }

    public static void fillStudents(String[][] matrix) {
        for (int i = 1; i < matrix[0].length; i++) {
            matrix[0][i] = Input.getString("Please, introduce the student's name #"+i+":");
        }
    }
    public static void fillSubjects(String[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = Input.getString("Please, introduce the subject name #"+i+":");
        }
    }
    public static void fillCourse(String[][] matrix) {
        for (int subjects = 1; subjects < matrix.length; subjects++) {
            for (int students = 1; students < matrix[0].length; students++) {
                double grade = Input.getDouble("Please, introduce a grade for " + matrix[subjects][0] + " and student " + matrix[0][students]);
                matrix[subjects][students] = String.format("%.2f",grade);
            }
        }
    }

}