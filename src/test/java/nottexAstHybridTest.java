import nottex_ast.RootNode;
import nottex_ast.TagUseNode;
import nottex_ast.TextNode;
import org.junit.Test;

import static grammar.TreeTest.traverseTree;

public class nottexAstHybridTest {


    @Test
    public void testSimpleTextTag() {
        String input = "text,,tamm{}";
        RootNode expected = new RootNode(
                new TextNode("text"),
                new TagUseNode(null, "tamm")
        );
        testUtil.assertEquals(expected, traverseTree(input));
    }

}