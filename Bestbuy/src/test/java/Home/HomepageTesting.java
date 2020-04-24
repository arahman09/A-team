package Home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HomepageTesting extends CommonAPI
{


    @Test
    public static void getTitle()
    {

       String title = driver.getTitle();
       System.out.println("The Title of Website is : "+title);

    }


}
