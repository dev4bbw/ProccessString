package org.mv.demo.adapter;

import org.mv.demo.processor.StringProcessor;
import org.mv.demo.strategy.StringProcessorStrategy;

/**
 * (Adapter Pattern)
 * Title: StringProcessorAdapter
 * Description：Processing adapter, dynamically selecting strategies
 *
 * @author Lucas
 * @version 1.0
 */
public class StringProcessorAdapter {

    private StringProcessor processor;

    public StringProcessorAdapter(StringProcessorStrategy strategy) {
        this.processor = new StringProcessor(strategy);
    }

    /**
     * Call processing method
     */
    public String process(String input) {
        return processor.execute(input);
    }
}
