package day9.Task1;

public class Human {
    String name;
    public Human (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    void printInfo(){
        System.out.println("Этот человек с именем " + name);
    }
}
