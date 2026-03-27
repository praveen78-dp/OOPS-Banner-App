import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Final Architecture using HashMap and StringBuilder.
 * This version separates pattern storage from display logic for 
 * professional-grade maintainability and scalability.
 *
 * @author Praveen
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Store patterns in a Map
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[] {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        String text = "OOPS";

        // Step 2: Build banner using nested loops + StringBuilder
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line.toString());
        }
    }
}
