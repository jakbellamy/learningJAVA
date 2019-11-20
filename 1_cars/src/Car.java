import java.awt.*;

public class Car {

    //INIT VARIABLES/ATTRIBUTES
    double averageMpg;
    String licensePlate;
    Color paintColor;
    boolean areTailLightsWorking;

    //FUNCTION TO ALLOW NEW CAR INSTANCES
    public Car(
            double inputAverageMpg,
            String inputLicesnsePlate,
            Color inputPaintColor,
            boolean inputAreTailLightsWorking
    ) {
        this.averageMpg = inputAverageMpg;
        this.licensePlate = inputLicesnsePlate;
        this.paintColor = inputPaintColor;
        this.areTailLightsWorking = inputAreTailLightsWorking;
    }

    //FUNCTION TO MODIFY A CAR INSTANCE
    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }
}
