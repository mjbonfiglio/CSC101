import java.util.*;

class Sphere {

    private double radius;
    private String color;
    private boolean bouncy;

    private final static double PI = 3.1415926535;

    public static int counter = 0;

    //default constructor
    public Sphere(){
        radius = 0.0;
        color = "White";
        bouncy = false;
        counter++;
    }
    //1 arg constructor 
    //double Radius
    public Sphere(double cRadius){
        radius = cRadius;
        color = "White";
        bouncy = false;
        counter++;
    }
    //3 arg constructor
    //double radius, string color, boolean bouncy
    public Sphere(double cRadius, String cColor, boolean cBouncy){
        radius = cRadius;
        color = cColor;
        bouncy = cBouncy;
        counter++;
    }

    //getters
    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public boolean isBouncy(){
        return bouncy;
    }

    //setters
    public void setRadius(double sRadius){
        radius = sRadius;
    }

    public void setColor(String sColor){
        color = sColor;
    }

    public void setBouncy(boolean sBouncy){
        bouncy = sBouncy;
    }

    //tostring
    public String toString(){
        String formattedRadius = String.format("%.2f", radius);
        if(bouncy){
            return "Bouncy " + color + " sphere with a radius of " + formattedRadius;
        }else{
            return "Not bouncy " + color + " sphere with a radius of " + formattedRadius;
        }
    }


    //comparison method
    public boolean equals(Sphere comparisonSphere) {
        if(this.isBouncy() == comparisonSphere.isBouncy() && this.getColor() == comparisonSphere.getColor() && this.getRadius() == comparisonSphere.getRadius()){
            return true;
        }
        return false;
    }

    public Sphere clone(){
        Sphere clone = new Sphere(this.getRadius(), this.getColor(), this.isBouncy());
        return clone;
        
    }

    public double getVolume(){
                        //4 / 3
        double volume = 1.3333333 * PI * Math.pow(radius, 3);

        return volume;
        
    }

    public double getSurfaceArea(){
        double surfaceArea = 4 * PI * Math.pow(radius, 2);
        return surfaceArea;
    }

    public void incrementRadius(double increase){
        radius+=increase;
    }

    public void decrementRadius(double decrease){
        radius-=decrease;
    }

    public void setRandomColor(){

        Random rand = new Random();
        int number = rand.nextInt(6);
        switch(number){
            case 1:
                this.setColor("White");
                break;
            case 2:
                this.setColor("Black");
                break;
            case 3:
                this.setColor("Green");
                break;
            case 4:
                this.setColor("Yellow");
                break;
            case 5:
                this.setColor("Blue");
                break;
            case 6:
                this.setColor("Orange");
                break;
            
        }
    }
}
