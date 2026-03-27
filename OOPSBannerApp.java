/**
 * UC6: Refactoring with Static Helper Methods.
 * This approach adheres to the DRY principle by encapsulating ASCII 
 * patterns into reusable functions.
 *
 * @author Praveen
 * @version 6.0
 */
public class OOPSBannerApp {

     // Letter O
    static String[] getO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Letter P
    static String[] getP() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Letter S
    static String[] getS() {
        return new String[] {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o1 = getO();
        String[] o2 = getO();
        String[] p  = getP();
        String[] s  = getS();

        // Combine all letters row-wise
        for (int i = 0; i < 7; i++) {
            String line = o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i];
            System.out.println(line);
        }
    }
}