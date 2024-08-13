package org.mv.demo.strategy;

/**
 * Title: RemoveConsecutiveStrategy
 * Description：Remove consecutive identical characters strategy
 *
 * @author Lucas
 * @version 1.0
 */
public class RemoveConsecutiveStrategy implements StringProcessorStrategy {

    /**
     * Input the String to remove consecutive identical characters
     *
     * @return process result
     */
    @Override
    public String process(String inputProcess) {
        if (inputProcess == null || inputProcess.isBlank()) {
            //not null
            return "";
        }
        String input = formatInput(inputProcess);

        //handle String with using StringBuilder
        StringBuilder sb = new StringBuilder(input);
        //flag of the repeat
        boolean changesMade;

        do {
            changesMade = false;
            for (int i = 0; i < sb.length() - 2; i++) {
                //count of consecutive identical characters
                int count = 1;
                while (i + count < sb.length() && sb.charAt(i) == sb.charAt(i + count)) {
                    count++;
                }
                if (count >= 3) {
                    //delete consecutive identical characters
                    sb.delete(i, i + count);
                    System.out.println("-> " + sb.toString());
                    changesMade = true;
                    break; // Restart from the beginning
                }
            }
        } while (changesMade);

        return sb.toString();
    }

    @Override
    public String formatInput(String input) {
        return input.replaceAll("[^a-z]", "");
    }
}
