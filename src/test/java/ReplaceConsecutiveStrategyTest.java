import org.junit.Test;
import org.mv.demo.strategy.ReplaceConsecutiveStrategy;
import org.mv.demo.strategy.StringProcessorStrategy;

import static org.junit.Assert.assertEquals;

/**
 * Title: ReplaceConsecutiveStrategyTest
 * Description：Test of replace consecutive identical characters strategy
 *
 * @author Lucas
 * @version 1.0
 */
public class ReplaceConsecutiveStrategyTest {

    @Test
    public void testReplaceConsecutiveIdenticalCharacters() {
        StringProcessorStrategy strategy = new ReplaceConsecutiveStrategy();

        // testcase
        assertEquals("d", strategy.process("abcccbad"));
        assertEquals("aacc", strategy.process("abbbcc"));
        assertEquals("", strategy.process("aaa"));
        assertEquals("abc", strategy.process("abc"));
        assertEquals("asbncv", strategy.process("a123tttboo&&&ocw@#$ww"));

    }
}
