package Abstract_examble;

public class HatchBack extends Carr{

    public HatchBack(float width, float height, int numberofWheles) {
        super(width, numberofWheles, height);
    }

    @Override
    public void autopilot() {
        System.out.println("this is autopilot for HatchBack  car ");
    }

    @Override
    public void streamingServices() {
        System.out.println("this is streamingServices for HatchBack car ");
    }

    @Override
    public void parkingSensor() {
        System.out.println("this is parking sensors for HatchBack car ");


    }
}
