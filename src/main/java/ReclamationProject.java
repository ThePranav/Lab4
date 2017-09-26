/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Reclamation Project contains method to find longest common substring between two strings.
 */
public class ReclamationProject {
    /**
     *
     * @param a first String input to find longest common substring
     * @param b first String input to find longest common substring
     * @return returns longest common substring between a and b
     */
    static String longestCommonSubstring(final String a, final String b) {
        String longerString = a;
        String shorterString = b;
        if (longerString.length() < shorterString.length()) {
            longerString = b;
            shorterString = a;
        }
        String r  = "";
        for (int i = 0; i < longerString.length(); i++) {
            for (int j = longerString.length() - i; j > 0; j--) {
                for (int k = 0; k < shorterString.length() - j; k++) {
                    if (longerString.regionMatches(i, shorterString, k, j) && j > r.length()) {
                        r = longerString.substring(i, i + j);
                    }
                }
            }
        } return r; }
}
