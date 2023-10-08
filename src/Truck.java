public final class Truck extends PassengerCar {
    private int liftingCapacity;

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public Truck
            (ColorEnum colorEnum, CarShowroom carShowroom, int volume, int year, String model, int liftingCapacity) {
        super(colorEnum, carShowroom, volume, year, model);
        this.liftingCapacity = liftingCapacity;
    }

    public void makeVoice(String voice) {
        super.makeVoice();
        System.out.println(voice + "!!!");

    }

    public String getInfo() {
        return super.getInfo() +
                "\nLiftingCapacity:"+liftingCapacity;
    }
}
