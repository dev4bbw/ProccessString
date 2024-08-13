package org.mv.demo.strategy;

/**
 * (Strategy Pattern)
 * Title: StringProcessor
 * Description：Process strategy interface, all strategy need to implement this interface
 *
 * @author Lucas
 * @version 1.0
 */
public interface StringProcessorStrategy {
    /**
     * process input that only contains alphabet characters a-z
     */
    String process(String input);

    /**
     * check and remove characters all not in alphabet characters a-z
     */
    String formatInput(String input);
}
