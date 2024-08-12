package org.mv.demo;

public class StringProcessor {

    /**
     * Process String
     *
     * @param input input source string
     * @return process result
     */
    public static String processString(String input) {
        if (input == null || input.isBlank()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(input);
        //flag of the repeat
        boolean changesMade;

        do {
            changesMade = false;
            for (int i = 0; i < sb.length() - 2; i++) {
                //count of identical characters
                int count = 1;
                while (i + count < sb.length() && sb.charAt(i) == sb.charAt(i + count)) {
                    count++;
                }
                if (count >= 3) {
                    //delete identical characters
                    sb.delete(i, i + count);
                    System.out.println("-> " + sb.toString());
                    changesMade = true;
                    break; // Restart from the beginning
                }
            }
        } while (changesMade);

        return sb.toString();
    }

    /**
     * Advanced ProcessString String
     *
     * @param input input source string
     * @return process result
     */
    public static String advancedProcessString(String input) {
        if (input == null || input.isBlank()) {
            return "";
        }

        StringBuilder sb = new StringBuilder(input);

        //flag of the repeat
        boolean changeMode;
        do {
            changeMode = false;
            for (int i = 0; i < sb.length() - 2; i++) {
                //count of identical characters
                int count = 1;
                while (i + count < sb.length() && sb.charAt(i) == sb.charAt(i + count)) {
                    count++;
                }
                if (count >= 3) {
                    //replace identical characters
                    char replacement = (char) (sb.charAt(i) - 1);
                    String replace = !Character.isLowerCase(replacement) ? "" : String.valueOf(replacement);
                    String tempTarget = sb.substring(i, i + count);
                    sb.replace(i, i + count, replace);

                    System.out.println("-> " + sb + ", " + tempTarget + " is replaced by " + replace);
                    changeMode = true;
                    break;
                }
            }

        } while (changeMode);
        return sb.toString();
    }
}
