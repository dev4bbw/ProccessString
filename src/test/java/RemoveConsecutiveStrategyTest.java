import org.junit.Test;
import org.mv.demo.strategy.RemoveConsecutiveStrategy;
import org.mv.demo.strategy.StringProcessorStrategy;

import static org.junit.Assert.assertEquals;

/**
 * Title: RemoveConsecutiveStrategyTest
 * Description：Test of remove consecutive identical characters strategy
 *
 * @author Lucas
 * @version 1.0
 */
public class RemoveConsecutiveStrategyTest {

    @Test
    public void testRemoveConsecutiveIdenticalCharactersForExample() {
        StringProcessorStrategy strategy = new RemoveConsecutiveStrategy();

        // testcase
        assertEquals("d", strategy.process("aabcccbbad"));
        assertEquals("", strategy.process("aaabbbccc"));
        assertEquals("abac", strategy.process("abac"));
        assertEquals("abc", strategy.process("a123tttboo&&&ocw@#$ww"));

    }
}
