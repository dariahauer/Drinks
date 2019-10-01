public class Drinks {
    public static void main(String[] args) {
        Drink drink1 = new Drink();

        drink1.name = "Margarita";
        drink1.alcohol = true;
        drink1.price = 15;
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient3 = new Ingredient();

        drink1.ingredient1.ingredientName = "Teuquila";
        drink1.ingredient1.ingredientamount = 40;
        drink1.ingredient2.ingredientName = "Brandy";
        drink1.ingredient2.ingredientamount = 20;
        drink1.ingredient2.ingredientName = "lime juice";
        drink1.ingredient2.ingredientamount = 30;

        Drink drink2 = new Drink();
        drink2.name = "Mojito";
        drink2.alcohol = true;
        drink2.price = 18;
        drink2.ingredient1 = new Ingredient();
        drink2.ingredient2 = new Ingredient();
        drink2.ingredient3 = new Ingredient();
        drink2.ingredient1.ingredientName = "White Rum";
        drink2.ingredient1.ingredientamount = 40;
        drink2.ingredient2.ingredientName = "sparkling water";
        drink2.ingredient2.ingredientamount = 30;
        drink2.ingredient3.ingredientName = "lime juice";
        drink2.ingredient3.ingredientamount = 10;

        int drink1Capacity = (drink1.ingredient1.ingredientamount + drink1.ingredient2.ingredientamount + drink1.ingredient3.ingredientamount);
        int drink2Capacity = (drink2.ingredient1.ingredientamount + drink2.ingredient2.ingredientamount + drink2.ingredient3.ingredientamount);


        System.out.println("Drink name: " + drink1.name + " ,Alcohol: " + drink1.alcohol + " ,Price: " + drink1.price + " PLN, " + " Ingredients: "
                + drink1.ingredient1.ingredientName + " " + drink1.ingredient1.ingredientamount + " ml, " + " " + drink1.ingredient2.ingredientName
                + "  " + drink1.ingredient2.ingredientamount + " ml, " + drink1.ingredient3.ingredientName + " " + drink1.ingredient3.ingredientamount
                + " ml. ");

        System.out.println("Drink name: " + drink2.name + " ,Alcohol: " + drink2.alcohol + " ,Price: " + drink2.price + " PLN, " + " Ingredients: "
                + drink2.ingredient1.ingredientName + " " + drink2.ingredient1.ingredientamount + " ml, " + " " + drink2.ingredient2.ingredientName
                + "  " + drink2.ingredient2.ingredientamount + " ml, " + drink2.ingredient3.ingredientName + " " + drink2.ingredient3.ingredientamount
                + " ml. ");

        System.out.println(" Drink Name: " + drink1.name + ", Total capacity " + drink1Capacity + " ml.");

        System.out.println(" Drink Name: " + drink2.name + ", Total capacity " + drink2Capacity + " ml.");


    }
}
