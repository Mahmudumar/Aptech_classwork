public class Student{
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public void introduce() {
        System.out.println("Hi, my name is " + name +"."+ " I am " + age + " years. I study " + course + ".");
    }

    public static void main(String[] args) {
        
       Student guy1=new Student ("Geoffrey hinton", 20, "Neural networks");
Student guy2=new Student ("Steven Bartlett", 102, "Marketing");


        guy1.introduce();
        guy2.introduce();
    }

}