package task_02.car;

public class Car {
    int age;
    double speed;
    int weight;
    String color;


    public Car() {
        this(1);
    }

    public Car(int age) {
        this(age, "black" );

    }

    public Car(int age, String color) {
       this(age,199.9, color);

    }

    public Car(int age, double speed, String color) {
        this(age,speed,2000,color);
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
