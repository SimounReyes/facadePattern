package FacadePattern;

import java.util.Scanner;

public class Cart implements HotelService{
    private Integer numberOfCarts;
    @Override
    public void service() {
        Scanner eat = new Scanner(System.in);
        System.out.print("\nWe offer carts to handle your luggage!\n------------------");

        System.out.print("\nPlease input the desired number of carts for you luggage: ");

        this.numberOfCarts = Integer.parseInt(eat.nextLine());

        requestCart(numberOfCarts);
    }

    public void requestCart(Integer numberOfCarts){
        System.out.println("------------------\n"+
                "The " + numberOfCarts + " carts that you've requested is now ready!");

    }
}
