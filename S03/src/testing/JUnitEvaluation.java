package testing;
import com.sun.source.doctree.AuthorTree;
import eu.ase.poly.Auto;
import org.junit.Assert;
import org.junit.Test;

public class JUnitEvaluation {
    @Test
    public void testAutoSetDoorsNo()
        throws Exception{
        Auto a = new Auto();
        try{
            a.setDoorsNo(-5);
            Assert.fail("setDoorsNo accepts negative values ");
        }catch (Exception e) {
            //OK
            System.out.println("OK");
        }
    }
    @Test
    public void testSetDoorsNo()
    {
        Auto a = new Auto();
        try{
            a.setDoorsNo(4);
            Assert.assertEquals(4, a.getDoorsNo());
        }catch (Exception e) {

        }
    }
}
