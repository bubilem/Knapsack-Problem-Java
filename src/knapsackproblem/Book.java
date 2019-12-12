package knapsackproblem;

import knapsackproblem.item.IItem;
import java.util.Random;

public class Book implements IItem {

    private static int maxPrice = 999;
    private static int maxWeight = 99;
    private static int count = 0;

    private int id;
    private int price;
    private int weight;

    public Book(int price, int weight) {
        this.price = price;
        this.weight = weight;
        id = ++count;
    }

    public Book() {
        this((new Random()).nextInt(maxPrice) + 1, (new Random()).nextInt(maxWeight) + 1);
    }

    public static void setLimits(int maxPrice, int maxWeight) {
        Book.maxPrice = maxPrice;
        Book.maxWeight = maxWeight;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        //System.out.format("%3d\t%2d\n", price, weight);
        System.out.format("Book id:%3d\tp:%3d\tw:%2d\n", id, price, weight);
    }

}
