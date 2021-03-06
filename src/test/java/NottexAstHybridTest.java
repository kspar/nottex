import nottexast.BlockNode;
import nottexast.TagUseNode;
import nottexast.TextNode;
import org.junit.Test;

import static grammar.AstParser.parse;

public class NottexAstHybridTest {


    @Test
    public void testSimpleTextTag() {
        String input = "text,,tamm{}";
        BlockNode expected = new BlockNode(
                new TextNode("text"),
                new TagUseNode(null, "tamm")
        );
        TestUtil.assertEquals(expected, parse(input));
    }

}
