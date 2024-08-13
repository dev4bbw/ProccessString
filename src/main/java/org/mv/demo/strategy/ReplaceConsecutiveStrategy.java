package org.mv.demo.strategy;

/**
 * Title: ReplaceConsecutiveStrategy
 * Description：Replace consecutive identical characters strategy
 *
 * @author Lucas
 * @version 1.0
 */
public class ReplaceConsecutiveStrategy implements StringProcessorStrategy {

    /**
     * Replace consecutive identical characters from the input String
     *
     * @return process result
     */
    @Override
    public String process(String inputProcess) {
        if (inputProcess == null || inputProcess.isBlank()) {
            return "";
        }
        String input = formatInput(inputProcess);

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

    @Override
    public String formatInput(String input) {
        return input.replaceAll("[^a-z]", "");
    }
}
