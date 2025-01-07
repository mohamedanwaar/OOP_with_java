package Abstract_examble;

public class SUV extends Carr{






    public SUV(float width, float height, int numberofWheles)  {
        super(width, numberofWheles, height);

    }


    @Override
    public void  autopilot() {
        System.out.println("this is autopilot for SUV car ");
    }

    @Override
    public void streamingServices() {
        System.out.println("this is streamingServices for SUV car ");

    }

    @Override
    public void parkingSensor() {
        System.out.println("this is parking sensors for SUV car ");
    }
}
