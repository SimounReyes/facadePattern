package FacadePattern;

public class FrontDesk {
    private HotelService service;
    public FrontDesk(HotelService service){
        this.service = service;
    }

    public void chooseService() {
        service.service();

    }
}
