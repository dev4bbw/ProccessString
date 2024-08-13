package org.mv.demo;

import org.mv.demo.adapter.StringProcessorAdapter;
import org.mv.demo.strategy.RemoveConsecutiveStrategy;
import org.mv.demo.strategy.ReplaceConsecutiveStrategy;

import java.util.Scanner;

/**
 * Title: Main
 * Description：Main, example for input and use
 *
 * @author Lucas
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //Select strategy based on demand

        Scanner scanner = new Scanner(System.in);
        //input example :"abcccbad","qeweweqsss"
        System.out.println("Please enter the string you want to process");

        String input = scanner.nextLine();

        // Use the strategy of removing consecutive identical characters
        StringProcessorAdapter removeAdapter = new StringProcessorAdapter(new RemoveConsecutiveStrategy());
        String removed = removeAdapter.process(input);
        System.out.println("Removed Consecutive: " + removed);
        System.out.println("=================================");
        // Using the strategy of replacing consecutive identical characters
        StringProcessorAdapter replaceAdapter = new StringProcessorAdapter(new ReplaceConsecutiveStrategy());
        String replaced = replaceAdapter.process(input);
        System.out.println("Replaced Consecutive: " + replaced);

    }
}