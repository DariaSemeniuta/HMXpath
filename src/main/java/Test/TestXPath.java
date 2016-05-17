package Test;

import PageObgect.PageTable;
import org.junit.Test;

/**
 * Created by Daria on 17.05.2016.
 */
public class TestXPath extends BaseTest {
    private PageTable table;
    private String pointsAdam="67";
    private String nameAdam="Johnson";
    private String pointsEve="94";
    private String nameEve="Jackson";

    @Test
    public void testPoints () throws Exception{
        table=new PageTable(driver);
        assertEquals("Points for Adam are incorrect!",pointsAdam,table.findPoints(nameAdam));
        assertEquals("Points for Eve are incorrect!",pointsEve,table.findPoints(nameEve));
    }
}
