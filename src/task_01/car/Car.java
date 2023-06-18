package task_01.car;

public class Car {
    int age;
    double speed;
    int weight;
    String color;


    public Car() {
    }

    public Car(int age) {
        this.age = age;
        this.speed = 0;
        this.weight = 0;
        this.color = "black";
    }

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
        this.speed = 0;
        this.weight = 0;

    }

    public Car(int age, double speed, String color) {
        this.age = age;
        this.speed = speed;
        this.color = color;
        this.weight = 0;
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
