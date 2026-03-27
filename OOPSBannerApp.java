/**
 * UC4: Using String Arrays and Loops for the OOPS Banner.
 * This approach improves modularity and scalability by removing repetitive 
 * print statements.
 *
 * @author Praveen
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            " *****    *****    *****    ***** ",
            "*     *  *     *  *     *  *     *",
            "*     *  *     *  *     *  *      ",
            "*     *  *     *  ******    ***** ",
            "*     *  *     *  *               ",
            "*     *  *     *  *        *     *",
            " *****    *****   *         ***** "
        };

        // Enhanced for-loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}