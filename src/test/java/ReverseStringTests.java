import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTests {



    @Test
    public void reverseTestwithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
        System.out.println("reverseTestWithNull passed with null");
    }

    @Test
    public void reverseTestWithDigit(){
        Assert.assertEquals("cbA321",ReverseString.reverseString("123Abc"));
        System.out.println("reverseTestWithDigit passed");
    }

    @Test
    public void testHappyPath(){
        Assert.assertEquals("elppa",ReverseString.reverseString("apple"));
        System.out.println("testHappyPath passed");
    }
}
