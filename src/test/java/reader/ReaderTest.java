package reader;

import common.product.RealEstate;
import common.product.RealEstateBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReaderTest {

    @Test
    public void test1() throws IOException {
        String filePath = "src/test/java/reader/res/test.json";
        String dirPath  = "src/test/java/reader/res";
        Reader reader = new TestReader();
        TestClass testClass = reader.readFile(new File(filePath),TestClass.class);
        List<TestClass> testList;
        File dir = new File(dirPath);
        assertEquals("test",testClass.getName());
        assertEquals("1.0.0",testClass.getVersion());
        assertEquals(2,testClass.getNumber());
        testList = reader.readFiles(dir.listFiles(),TestClass.class);
        int i = 1;

        for (TestClass testClass1 : testList) {
            assertEquals("test",testClass1.getName());
            assertEquals("1.0.0",testClass1.getVersion());
            assertEquals(i++,testClass1.getNumber());
        }
    }

    @Test
    public void test2() {
        RealEstate estate = RealEstateBuilder.aRealEstate().withNumber(10)
                            .withCityNumber(5).withUpperNumber(3).withFinNumber(1).withGovNumber(1).build();

    }
}
