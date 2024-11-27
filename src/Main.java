import com.company.School;
import java.util.Arrays;
/**
 * The Main class creates an array of School objects, sorts them by average marks and age, and prints the sorted lists.
 */
public class Main {
    /**
     * The main method
     * It creates School objects, sorts them by average marks and age, and prints the sorted arrays.
     *
     * @param args
     */
    public static void main(String[] args) {
        School[] obj = new School[5];

        obj[0] = new School(172, 1, 24, 10, 2);
        obj[1] = new School(986, 4, 9, 96, 4);
        obj[2] = new School(287, 2, 38, 33, 5);
        obj[3] = new School(460, 3, 26, 49, 3);
        obj[4] = new School(3683, 5, 120, 123, 2);
/**
 *  Sort and print the array by average marks
 */
        Arrays.sort(obj, School.avgmarksComparator);
        System.out.println(Arrays.asList(obj) + "\n");
      /**
         *  Sort and print the array by age
         */
        Arrays.sort(obj, School.ageComparator);
        System.out.println(Arrays.asList(obj));
    }
}