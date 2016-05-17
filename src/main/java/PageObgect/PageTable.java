package PageObgect;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Daria
 */
public class PageTable {
    private final WebDriver driver;
    private String startPage = "http://www.w3schools.com/html/html_tables.asp";
    private String pathToRows = "//table[@class='w3-table-all']//tbody/tr";
    private String pathToCell = "/td[last()]";

    public PageTable(WebDriver driver) {
        this.driver = driver;
        driver.get(startPage);
        PageFactory.initElements(driver,this);
    }
    public String findPoints(String name) throws Exception{
        String points="";
        WebElement cell;
        Integer numRow=0;
        Integer num=0;
        List<WebElement> allRows = driver.findElements(By.xpath(pathToRows));
        for (WebElement i: allRows){
            num++;
            if (i.getText().contains(name))
                numRow=num;
        }
        cell=driver.findElement(By.xpath(pathToRows+"["+numRow+"]"+pathToCell));
        points=cell.getText();
        return points;
    }
}
