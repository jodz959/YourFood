package hackbrown.org.goodfood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Created by j on 2/4/2017.
 */

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> breakfast = new ArrayList<String>();
        breakfast.add("breakfast");  //makes a call to the database
        breakfast.add("egg whites");
        breakfast.add("fruit bowl");

        List<String> lunch = new ArrayList<String>();
        lunch.add("Peanut Butter and Jelly Sandwich \n" +
                "1 spoon of peanut butter \n" +
                "1 spoon of Jelly \n" +
                "2 slices of bread \n" +
                "Method \n \n" +
                "Spread each side with one ingredient generously then place them together. ");    //makes a call to the database
        lunch.add("Ceaser salad \n" +
                "6 anchovy fillets packed in oil, drained\n" +
                "1 small garlic clove\n" +
                "Kosher salt\n" +
                "2 large egg yolks\n" +
                "2 tablespoons fresh lemon juice, plus more\n" +
                "¾ teaspoon Dijon mustard\n" +
                "2 tablespoons olive oil\n" +
                "½ cup vegetable oil\n" +
                "3 tablespoons finely grated Parmesan\n" +
                "Freshly ground black pepper \n" +
                "3 cups torn 1\" pieces country bread, with crusts\n" +
                "3 tablespoons olive oil \n" +
                "3 romaine hearts, leaves separated \n" +
                "Parmesan, for serving \n" +
                "Method \n \n" +
                "The Dressing\n" +
                "Chop together anchovy fillets, garlic, and pinch of salt. Use the side of a knife blade to mash into a paste, then scrape into a medium bowl. Whisk in egg yolks, 2 Tbsp. lemon juice, and mustard. Adding drop by drop to start, gradually whisk in olive oil, then vegetable oil; whisk until dressing is thick and glossy. Whisk in Parmesan. Season with salt, pepper, and more lemon juice, if desired. \n" +
                "The Croutons\n" +
                "Make your own. Tearing, not cutting the bread ensures nooks and crannies that catch the dressing and add texture. Preheat oven to 375°. Toss bread with olive oil on a baking sheet; season with salt and pepper. Bake, tossing occasionally, until golden, 10–15 minutes.\n" +
                "The Lettuce\n" +
                "Use whole leaves; they provide the ideal mix of crispness, surface area, and structure.\n" +
                "The Cheese\n" +
                "Caesars crowned with a mound of grated Parmesan may look impressive, but all that clumpy cheese mutes the dressing. Instead, use a vegetable peeler to thinly shave a modest amount on top for little salty bursts.\n" +
                "The Assembly\n" +
                "Skip the tongs. Use your hands to gently toss the lettuce, croutons, and dressing, then top off with the shaved Parm.");


        List<String> dinner = new ArrayList<String>();
        dinner.add("Grilled Chicken \n" +
                "1/4 cup balsamic vinegar\n" +
                "Juice of 1 lemon\n" +
                "2 tablespoons olive oil\n" +
                "2 tablespoons Dijon mustard\n" +
                "2 tablespoons brown sugar, packed\n" +
                "1 tablespoon Worcestershire sauce\n" +
                "2 cloves garlic, minced\n" +
                "1/2 teaspoon dried thyme\n" +
                "1/2 teaspoon dried oregano\n" +
                "1/4 teaspoon dried rosemary\n" +
                "Kosher salt and freshly ground black pepper, to taste\n" +
                "4 boneless, skinless chicken breasts\n" +
                "2 tablespoons chopped fresh parsley leaves \n" +
                "Method \n \n" +
                "1. In a medium bowl, whisk together balsamic vinegar, lemon juice, olive oil, Dijon, brown sugar, Worcestershire, garlic, thyme, oregano and rosemary; season with salt and pepper, to taste. Reserve 1/4 cup and set aside.\n" +
                "2. In a gallon size Ziploc bag or large bowl, combine balsamic vinegar mixture and chicken; marinate for at least 1 hour to overnight, turning the bag occasionally. Drain the chicken from the marinade.\n" +
                "3. Preheat grill to medium high heat. Add chicken to grill and cook, flipping once and basting with reserved 1/4 cup marinade until cooked through, about 5-6 minutes on each side.\n" +
                "4. Serve immediately, garnished with parsley, if desired.");     //makes a call to the database
        dinner.add("Vegetable Soup \n" +
                "\n 2 tablespoons olive oil \n" +
                "2 cups chopped onions or thinly sliced leeks (whites only)\n" +
                "1 cup thinly sliced celery\n" +
                "2 teaspoons Italian seasoning\n" +
                "Coarse salt and ground pepper\n" +
                "3 cans (14 1/2 ounces each) reduced-sodium vegetable or chicken broth\n" +
                "1 can (28 ounces) diced tomatoes, with juice\n" +
                "1 tablespoon tomato paste\n" +
                "8 cups mixed fresh or frozen vegetables, such as carrots, corn, green beans, lima beans, peas, potatoes, and zucchini (cut larger vegetables into smaller pieces) \n" +
                "Method \n \n"+
                "1. Heat oil in a large stockpot over medium heat. Add onions or leeks, celery, and Italian seasoning; season with salt and pepper. Cook, stirring frequently, until onions are translucent, 5 to 8 minutes.\n" +
                "2. Add broth, tomatoes and their juice, tomato paste, and 3 cups water to pot; bring mixture to a boil. Reduce heat to a simmer, and cook, uncovered, 20 minutes.\n" +
                "3. Add vegetables to pot, and return to a simmer. Cook, uncovered, until vegetables are tender, 20 to 25 minutes. Season with salt and pepper, as desired. Let cool before storing.");

        List<String> dessert = new ArrayList<String>();
        dessert.add("dessert");   //makes a call to the data base
        dessert.add("sweet potato pie");
        dessert.add("apple pie");

        expandableListDetail.put("BREAKFAST", breakfast);
        expandableListDetail.put("LUNCH", lunch);
        expandableListDetail.put("DINNER", dinner);
        expandableListDetail.put("DESSERT", dessert);
        return expandableListDetail;
    }
}

