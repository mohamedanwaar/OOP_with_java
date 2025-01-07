package Abstract_examble;

public abstract class Carr {
    float height;
    float width ;
    int NumberofWheles;


    // this is non abstract methods we can use it in subclasses
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getNumberofWheles() {
        return NumberofWheles;
    }

    public void setNumberofWheles(int numberofWheles) {
        NumberofWheles = numberofWheles;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // we can implement constructor for this abstract class to use this in sub classes to initialize there attribute

    public Carr(float width, int numberofWheles, float height) {
        this.width = width;
        NumberofWheles = numberofWheles;
        this.height = height;
    }

    abstract void autopilot();
    abstract void streamingServices();
    abstract void parkingSensor();




}
