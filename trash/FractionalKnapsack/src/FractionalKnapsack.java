import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3};

        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());//quickSort by unit value

        System.out.println(Arrays.toString(items));

        final int maxWeight = 7;

        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        while(currentItem < items.length && weightSoFar != maxWeight){
            if(weightSoFar + items[currentItem].getWeight() < maxWeight){
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else{
                valueSoFar += ((maxWeight - weightSoFar) / (double)items[currentItem].getWeight()) *
                        items[currentItem].getValue();

                weightSoFar = maxWeight;
            }
            currentItem++;
        }

        System.out.println(valueSoFar);
    }
}

















