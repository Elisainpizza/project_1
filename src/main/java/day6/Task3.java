package day6;

public class Task3 {
    public static void main(String[] args) {
        Student first = new Student("Bob");
        Teacher second = new Teacher("Bob", "Literature");
        second.evaluate();
        System.out.println("Преподаватель " +
                second.getName() + " оценил студента с именем " +
                first.getName() + " по предмету " +
                second.getSubject() + " на оценку " + second.getMark2());


    }
}
