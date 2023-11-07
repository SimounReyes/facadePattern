package FacadePattern;

public class HotelApp {
    public static void main(String[] args) {

        System.out.print("WELCOME TO THE HOTEL!");
        HotelService valet = new Valet();
        HotelService houseKeeping = new HouseKeeping();
        HotelService cart = new Cart();

        FrontDesk fdValet = new FrontDesk(valet);
        FrontDesk fdHouseKeeping = new FrontDesk(houseKeeping);
        FrontDesk fdCart = new FrontDesk(cart);

        fdValet.chooseService();
        fdHouseKeeping.chooseService();
        fdCart.chooseService();

        System.out.println("\n---------------------------------------------\n" +
                "Thank You! Just message us if you need any help!");
    }
}
