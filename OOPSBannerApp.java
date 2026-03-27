/**
 * UC2: Rendering "OOPS" as a large 7-line ASCII banner.
 * This version matches the filename OOPSBannerApp.java and fixes alignment.
 * * @author Praveen
 * @version 2.0
 */
public class OOPSBannerApp {

    /**
     * Main method to print the banner.
     * Each line is carefully spaced to form the letters O O P S.
     */
    public static void main(String[] args) {
        String[] banner = {
            " *****    *****    ******    *****  ",
            "*     *  *     *   *     *  *     * ",
            "*     *  *     *   *     *  *       ",
            "*     *  *     *   ******    *****  ",
            "*     *  *     *   *              * ",
            "*     *  *     *   *        *     * ",
            " *****    *****    *         *****  "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
