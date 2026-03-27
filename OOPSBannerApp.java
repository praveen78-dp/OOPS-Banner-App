/**
 * UC7: Transitioning to an Object-Oriented structure using Inner Classes.
 * This version encapsulates character patterns into a dedicated class
 * for better organization, reusability, and scalability.
 *
 * @author Praveen
 * @version 7.0
 */
public class OOPSBannerApp {

      // Static Inner Class
    static class CharacterPatternMap {
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(String[] pattern) {
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    // Methods to create patterns using the inner class
    static CharacterPatternMap getO() {
        return new CharacterPatternMap(new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });
    }

    static CharacterPatternMap getP() {
        return new CharacterPatternMap(new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });
    }

    static CharacterPatternMap getS() {
        return new CharacterPatternMap(new String[] {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });
    }

    public static void main(String[] args) {

        CharacterPatternMap o1 = getO();
        CharacterPatternMap o2 = getO();
        CharacterPatternMap p  = getP();
        CharacterPatternMap s  = getS();

        String[] patternO1 = o1.getPattern();
        String[] patternO2 = o2.getPattern();
        String[] patternP  = p.getPattern();
        String[] patternS  = s.getPattern();

        // Build and print banner
        for (int i = 0; i < 7; i++) {
            String line = patternO1[i] + "  " + patternO2[i] + "  " +
                          patternP[i]  + "  " + patternS[i];
            System.out.println(line);
        }
    }
}
