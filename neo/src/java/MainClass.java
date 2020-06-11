package neo.src.java;

public class MainClass {

    private int class_number = 46;
    private String class_string = "Hello, world";

    public String getClassString() {
        return class_string;
    }

    public int getClassNumber(){
        return this.class_number;
    }

    public int getLocalNumber() {

        int number = 14;
        return number;
    }
}