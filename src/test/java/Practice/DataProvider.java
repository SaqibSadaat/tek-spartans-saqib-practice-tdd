package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvider {
        @Test
        public void testAdding(){
            int result = 20 + 10;
            Assert.assertEquals(result, 30);
        }
}

