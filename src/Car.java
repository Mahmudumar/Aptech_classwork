class Vehicle {
    protected String brand = "Ford";
    public void move() {
        System.out.println("Vroom vroom!!!");
    }
}

class Car extends Vehicle {
    private final String modelName = "Mustang";
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.move();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}