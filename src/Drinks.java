public class Drinks {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Margarita";
        drink1.alcohol = true;
        drink1.price = 15;
        drink1.ingredients = new Ingredients();
        drink1.ingredients.ingredientName1 = "Teuquila";
        drink1.ingredients.ingredient1amount = 40;
        drink1.ingredients.ingredientName2 = "Brandy";
        drink1.ingredients.ingredient2amount = 20;
        drink1.ingredients.ingredientName3 = "lime juice";
        drink1.ingredients.ingredient3amount = 30;

        Drink drink2 = new Drink();
        drink2.name = "Mojito";
        drink2.alcohol = true;
        drink2.price = 18;
        drink2.ingredients = new Ingredients();
        drink2.ingredients.ingredientName1 = "White Rum";
        drink2.ingredients.ingredient1amount = 40;
        drink2.ingredients.ingredientName2 = "sparkling water";
        drink2.ingredients.ingredient2amount = 30;
        drink2.ingredients.ingredientName3 = "lime juice";
        drink2.ingredients.ingredient3amount = 10;

        int drink1Capacity = (drink1.ingredients.ingredient1amount + drink1.ingredients.ingredient2amount + drink1.ingredients.ingredient3amount);
        int drink2Capacity = (drink2.ingredients.ingredient1amount + drink2.ingredients.ingredient2amount + drink2.ingredients.ingredient3amount);


        System.out.println("Drink name: " + drink1.name + " ,Alcohol: " + drink1.alcohol + " ,Price: " + drink1.price + " PLN, " + " Ingredients: "
                + drink1.ingredients.ingredientName1 + " " + drink1.ingredients.ingredient1amount + " ml, " + " " + drink1.ingredients.ingredientName2
                + "  " + drink1.ingredients.ingredient2amount + " ml, " + drink1.ingredients.ingredientName3 + " " + drink1.ingredients.ingredient3amount
                + " ml. ");

        System.out.println("Drink name: " + drink2.name + " ,Alcohol: " + drink2.alcohol + " ,Price: " + drink2.price + " PLN, " + " Ingredients: "
                + drink2.ingredients.ingredientName1 + " " + drink2.ingredients.ingredient1amount + " ml, " + " " + drink2.ingredients.ingredientName2
                + "  " + drink2.ingredients.ingredient2amount + " ml, " + drink2.ingredients.ingredientName3 + " " + drink2.ingredients.ingredient3amount
                + " ml. ");

        System.out.println(" Drink Name: " + drink1.name + ", Total capacity " + drink1Capacity + " ml.");

        System.out.println(" Drink Name: " + drink2.name + ", Total capacity " + drink2Capacity + " ml.");



    }
}
