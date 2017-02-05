package hackbrown.org.goodfood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by j on 2/5/2017.
 */

public class ExpandableListDataPump2 {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> fruits = new ArrayList<String>();
        fruits.add("apples");  //makes a call to the database
        fruits.add("bananas");
        fruits.add("grapes");

        List<String> vegetables = new ArrayList<String>();
        vegetables.add("spinach");    //makes a call to the database
        vegetables.add("carrot");
        vegetables.add("celery");

        List<String> protien = new ArrayList<String>();
        protien.add("chicken");     //makes a call to the database
        protien.add("turkey");
        protien.add("red beans");

        List<String> carbohydrate = new ArrayList<String>();
        carbohydrate.add("rice");   //makes a call to the data base
        carbohydrate.add("bread");
        carbohydrate.add("potatoes");

        expandableListDetail.put("VEGETABLES", vegetables);
        expandableListDetail.put("FRUITS", fruits);
        expandableListDetail.put("PROTIEN", protien);
        expandableListDetail.put("CARBOHYDRATES", carbohydrate);
        return expandableListDetail;
    }
}
