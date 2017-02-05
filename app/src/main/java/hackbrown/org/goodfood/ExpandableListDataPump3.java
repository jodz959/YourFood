package hackbrown.org.goodfood;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by j on 2/5/2017.
 */

public class ExpandableListDataPump3 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> juice = new ArrayList<String>();
        juice.add("Spinach Spectacular");  //makes a call to the database
        juice.add("Green Filler");
        juice.add("Fruity Fusion");

        List<String> juice2 = new ArrayList<String>();
        juice2.add("Orange and Pineapple");    //makes a call to the database
        juice2.add("Mango and Carrot");
        juice2.add("Orange, Strawberry and Kiwi");

        List<String> juice3 = new ArrayList<String>();
        juice3.add("Pinapple");     //makes a call to the database
        juice3.add("Orange");
        juice3.add("Beets");

        expandableListDetail.put("JUICE AS A MEAL", juice);
        expandableListDetail.put("JUICE AS A SNACK", juice2);
        expandableListDetail.put("JUICE AS JUICE", juice3);
        return expandableListDetail;
    }
}
