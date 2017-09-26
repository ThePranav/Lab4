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
     * @param a first String input
     * @param b second String input
     * @return returns longest common substring between a and b
     */
    static String longestCommonSubstring(final String a, final String b) {
        String longStr = a;
        String shortStr = b;
        if (longStr.length() < shortStr.length()) {
            longStr = b;
            shortStr = a;
        }
        String r  = "";
        for (int longStrStart = 0; longStrStart < longStr.length(); longStrStart++) {
            for (int longStrEnd = longStr.length() - longStrStart; longStrEnd > 0; longStrEnd--) {
                for (int shortStrStart = 0; shortStrStart < shortStr.length() - longStrEnd;
                        shortStrStart++) {
                    if (longStr.regionMatches(longStrStart, shortStr, shortStrStart, longStrEnd)
                            && longStrEnd > r.length()) {
                        r = longStr.substring(longStrStart, longStrStart + longStrEnd);
                    }
                }
            }
        } return r; }
}
