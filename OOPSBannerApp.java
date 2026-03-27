/**
 * UC5: Optimizing banner rendering using Inline Array Initialization.
 * This approach combines declaration and population into a single statement
 * to enhance code conciseness and readability.
 *
 * @author Praveen
 * @version 5.0
 */
public class OOPSBannerApp {

   public static void main(String[] args) {

        String[] banner = {
            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", "*     *", "****** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*      ", "       "),
            String.join("  ", "*     *", "*     *", "*      ", "*     *"),
            String.join("  ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}