public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter the price of your item: ");
        double itemPrice=176;
        System.out.println(itemPrice);
        double shippingCost;
        double totalPrice;
        if (itemPrice<100)
        {
            shippingCost=itemPrice*0.02;
        }
        else
        {
            shippingCost=0;
        }

        totalPrice = itemPrice + shippingCost;
        System.out.println("The shipping cost is " + shippingCost);
        System.out.println("The total price is " + totalPrice);
    }
}