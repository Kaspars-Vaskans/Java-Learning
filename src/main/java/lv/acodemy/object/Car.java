package lv.acodemy.object;

public class Car {

    private String color;
    private String model;

    public Car() {
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }



    public void start() {
        System.out.println("Car start");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //Getters- vozvrat peremen
    //Setters- menjaet peremen


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




}
