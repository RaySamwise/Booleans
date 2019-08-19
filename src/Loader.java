
public class Loader
{
    public static void main(String[] args)
    {
        int milkAmount = 200; // ml
        int powderAmount = 500; // g
        int eggsCount = 8; // items
        int sugarAmount = 25; // g
        int oilAmount = 45; // ml
        int appleCount = 8;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >=10 && milkAmount >= 200 && oilAmount >= 30)
            {
                System.out.println("Pancakes");
            }
        //milk - 300 ml, powder - 5 g, eggs - 5
        if (powderAmount >= 5 && eggsCount >=5 && milkAmount >= 300)
        {
            System.out.println("Omelette");
        }


        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (powderAmount >= 300 && appleCount >= 3 && milkAmount >= 100 && eggsCount >= 4)
        {
            System.out.println("Apple pie");
        }

    }
}