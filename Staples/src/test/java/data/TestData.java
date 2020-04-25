package data;
import java.util.ArrayList;
import java.util.List;

public class TestData
{
    public static String item1 = "fountain pens";
    public static String item2 = "notebooks";
    public static String item3 = "bottled water";
    public static String item4 = "trash bags ";
    public static String item5 = "disinfectant wipes";

    public static List<String>  getListOfItems()
    {
        List<String> list = new ArrayList<String>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);

        return list;
    }
}
