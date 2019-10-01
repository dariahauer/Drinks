public class Drinks {
    public static void main(String[] args) {
        Drink drink1 = new Drink();

        drink1.name = "Margarita";
        drink1.alcohol = true;
        drink1.price = 15;
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient3 = new Ingredient();

        drink1.ingredient1.name = "Teuquila";
        drink1.ingredient1.amount = 40;
        drink1.ingredient2.name = "Brandy";
        drink1.ingredient2.amount = 20;
        drink1.ingredient2.name = "lime juice";
        drink1.ingredient2.amount = 30;

        Drink drink2 = new Drink();
        drink2.name = "Mojito";
        drink2.alcohol = true;
        drink2.price = 18;
        drink2.ingredient1 = new Ingredient();
        drink2.ingredient2 = new Ingredient();
        drink2.ingredient3 = new Ingredient();
        drink2.ingredient1.name = "White Rum";
        drink2.ingredient1.amount = 40;
        drink2.ingredient2.name = "sparkling water";
        drink2.ingredient2.amount = 30;
        drink2.ingredient3.name = "lime juice";
        drink2.ingredient3.amount = 10;

        int drink1Capacity = (drink1.ingredient1.amount + drink1.ingredient2.amount + drink1.ingredient3.amount);
        int drink2Capacity = (drink2.ingredient1.amount + drink2.ingredient2.amount + drink2.ingredient3.amount);


        System.out.println("Drink name: " + drink1.name + " ,Alcohol: " + drink1.alcohol + " ,Price: " + drink1.price + " PLN, " + " Ingredients: "
                + drink1.ingredient1.name + " " + drink1.ingredient1.amount + " ml, " + " " + drink1.ingredient2.name
                + "  " + drink1.ingredient2.amount + " ml, " + drink1.ingredient3.name + " " + drink1.ingredient3.amount
                + " ml. ");

        System.out.println("Drink name: " + drink2.name + " ,Alcohol: " + drink2.alcohol + " ,Price: " + drink2.price + " PLN, " + " Ingredients: "
                + drink2.ingredient1.name + " " + drink2.ingredient1.amount + " ml, " + " " + drink2.ingredient2.name
                + "  " + drink2.ingredient2.amount + " ml, " + drink2.ingredient3.name + " " + drink2.ingredient3.amount
                + " ml. ");

        System.out.println(" Drink Name: " + drink1.name + ", Total capacity " + drink1Capacity + " ml.");

        System.out.println(" Drink Name: " + drink2.name + ", Total capacity " + drink2Capacity + " ml.");


    }
}
