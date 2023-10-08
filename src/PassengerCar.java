public class PassengerCar extends Car{
    private String model;

    public String getModel() {
        return model;
    }

    public PassengerCar(ColorEnum colorEnum, CarShowroom carShowroom, int volume, int year, String model) {
        super(colorEnum, carShowroom, volume, year);
        this.model = model;
    }
    public final void makeVoice() {
        System.out.println("bibiib");

    }

    public void makeVoice(String voice) {
        System.out.println(voice);

    }
    public String getInfo(){
        return super.getInfo()+
                "\nModel:" + model + "" ;
    }
}
