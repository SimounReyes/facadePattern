package FacadePattern;

import java.util.Scanner;

public class Valet implements HotelService{
    private String plateNumber;
    @Override
    public void service() {
        Scanner eat = new Scanner(System.in);
        System.out.println("\nWe offer vehicle valet parking and pick-up!\n------------------");
        System.out.print("Input the Plate Number of your car here: ");

        this.plateNumber = eat.nextLine();

        pickUpVehicle(plateNumber);

    }
    public void pickUpVehicle(String plateNumber){
        System.out.println("------------------\n" +
                "We've picked up and parked your car ("+plateNumber+ ")!\n\n---------------------------------------------");

    }
}
