import java.awt.*;

public class Main {

    public static void main(String[] args){
        Car myCar = new Car(25.5, "K02STY", Color.BLUE, true);

        System.out.println("My new car's license Plate: " + myCar.licensePlate);
        System.out.println("My new car's MPG: " + myCar.averageMpg);
        System.out.println("Tail Lights work: " + myCar.areTailLightsWorking);
        System.out.println("My new car's color: " + myCar.paintColor);

        myCar.changePaintColor(Color.RED);
        System.out.println("I changed my new car's paint color to " + myCar.paintColor);
    }
}
