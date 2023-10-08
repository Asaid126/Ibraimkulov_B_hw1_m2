import java.util.Arrays;
import java.util.Random;

public class Car {
    private ColorEnum colorEnum;
    private CarShowroom carShowroom;
    private int volume;
    private int year;

    public ColorEnum getColorEnam() {
        return colorEnum;
    }

    public CarShowroom getCarShowroom() {
        return carShowroom;
    }

    public int getVolume() {
        return volume;
    }


    public int getYear() {
        return year;
    }

   public Car(ColorEnum colorEnum, CarShowroom carShowroom, int volume, int year) {
       this.colorEnum = colorEnum;
       this.carShowroom = carShowroom;
       this.volume = volume;
       this.year = year;
   }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(1, 6);
    }
    private int discount=generateDefaultAge();

    public int getDiscount() {
        return discount;
    }

    public String getInfo() {
        return "Year:" + year +
                "\nColor:" + colorEnum + "" +
                "\nVolume:" + volume + "" +
                "\nCar Showroom:" + carShowroom.getName() +
                "\nAddress:" + carShowroom.getAddress() +
                "\nCommission:" + carShowroom.getCommission();
    }
}




