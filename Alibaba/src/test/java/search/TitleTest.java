package search;

import base.CommonAPI;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleTest extends CommonAPI {
    @Test
    public void testTitle() {
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        String actualTitle = "Alibaba.com: Manufacturers, Suppliers, Exporters & Importers from the world's largest online B2B marketplace";
        softAssert.assertEquals(actualTitle, expectedTitle, "Title did not match. So you need to double check");
        softAssert.assertAll();
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
    }
}
