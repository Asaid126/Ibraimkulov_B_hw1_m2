public class Main {
    public static void main(String[] args) {
        CarShowroom carShowroom=new CarShowroom("Тулпар","Бишкек",10);
        CarShowroom carShowroom2=new CarShowroom("Фортуна","Токмок",9);
        PassengerCar passengerCar=new PassengerCar(ColorEnum.RED,carShowroom2,3,2015,"BMW");
        System.out.println(passengerCar.getInfo());
        passengerCar.makeVoice();
        passengerCar.makeVoice("biiib");
        System.out.println("На это авто сейчас вы можете получить скидку в размере "+ passengerCar.getDiscount()+"%");
        Truck truck=new Truck(ColorEnum.BLACK,carShowroom,12,1994,"Камаз",50);
        System.out.println(truck.getInfo());
        truck.makeVoice();
        truck.makeVoice("biiib");
        System.out.println("На это авто сейчас вы можете получить скидку в размере "+ truck.getDiscount()+"%");
        Truck truck2=new Truck(ColorEnum.WHITE,carShowroom,16,2000,"Урал",30);
        System.out.println(truck.getInfo());
        truck.makeVoice();
        truck.makeVoice("biiib");
        System.out.println("На это авто сейчас вы можете получить скидку в размере "+ truck.getDiscount()+"%");
    }
}