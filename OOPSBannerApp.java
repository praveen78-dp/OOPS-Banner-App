/**
 * UC3: Refactoring the "OOPS" banner using String.join().
 * This approach optimizes memory management by avoiding excessive 
 * temporary object creation.
 * * @author Praveen
 * @version 3.0 
 */
public class OOPSBannerApp {

    /**
     * Main Method: Entry point of the application.
     * Uses String.join() to construct banner lines efficiently. 
     */
    public static void main(String[] args) {

        String banner = String.join("\n",
            " *****    *****    ******    *****  ",
            "*     *  *     *   *     *  *     * ",
            "*     *  *     *   *     *  *       ",
            "*     *  *     *   ******    *****  ",
            "*     *  *     *   *              * ",
            "*     *  *     *   *        *     * ",
            " *****    *****    *         *****  "
        );

        System.out.println(banner);
    }
}
