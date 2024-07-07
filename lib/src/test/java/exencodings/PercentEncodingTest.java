package exencodings;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PercentEncodingTest {

    PercentEncoding classUnderTest = new PercentEncoding();
    @Test
    public void EncodeTestReturnsString() {
        assertEquals("encode() should take plaintext string and output encoded string", classUnderTest.encode("<>,/\\\"\'(){}[]=+!~*&^%$#@", 0), "%3C%3E%2C%2F%5C%22%27%28%29%7B%7D%5B%5D%3D%2B%21%7E*%26%5E%25%24%23%40");
    }
    @Test
    public void DecodeTestReturnsString() {
        assertEquals("decode() should take encoded string and output plaintext string", classUnderTest.decode("%3C%3E%2C%2F%5C%22%27%28%29%7B%7D%5B%5D%3D%2B%21%7E*%26%5E%25%24%23%40", 0), "<>,/\\\"\'(){}[]=+!~*&^%$#");
    }
}
