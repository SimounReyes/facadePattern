package FacadePattern;

import java.util.Scanner;

public class HouseKeeping implements HotelService{
    private Integer roomNumber;
    @Override
    public void service() {
        Scanner eat = new Scanner(System.in);
        System.out.print("\nWe offer room cleaning!\n------------------");
        System.out.print("\nPlease input the room number that needs to be clean: ");

        this.roomNumber = Integer.parseInt(eat.nextLine());

        cleanRoom(roomNumber);

    }
    public void cleanRoom(Integer roomNumber){
        System.out.println("------------------\n" +
                "The room number " + roomNumber + " is now clean!\n\n---------------------------------------------");
    }
}
