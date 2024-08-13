package org.mv.demo.processor;

import org.mv.demo.strategy.StringProcessorStrategy;

/**
 * Title: StringProcessor
 * Description：String processor
 *
 * @author Lucas
 * @version 1.0
 */
public class StringProcessor {
    private StringProcessorStrategy strategy;

    public StringProcessor(StringProcessorStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Execute processing strategy
     *
     * @param input Input the String for execution processing
     * @return result
     */
    public String execute(String input) {
        return strategy.process(input);
    }
}
