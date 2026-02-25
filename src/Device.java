// device example
class Device {
    public String brand = "Tecno";
    public void switchOn() {
        System.out.println("Switched On: Welcome to your "+brand);
    }
    public void switchOff() {
        System.out.println("Switched Off: Bye Bye from "+brand);
    }
}

// Example 1
class Phone extends Device {
    private static final String modelName = "Spark 8";
    public static void main(String[] args) {

        Device myPhone = new Device();

        myPhone.switchOn();
        System.out.println("Your " + myPhone.brand + " model is: " + modelName);
        myPhone.switchOff();

    }
}


class Laptop extends Device {
    private static final String modelName = "E14";
    public static void main(String[] args) {

        Device myLaptop = new Device();
        myLaptop.brand = "Lenovo";

        myLaptop.switchOn();
        System.out.println("Your " + myLaptop.brand + " model is: " + modelName);
        myLaptop.switchOff();

    }
}