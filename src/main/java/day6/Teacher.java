package day6;

public class Teacher {
    private String name;
    private String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
    int mark = 0;
    public void evaluate(Student student) {
        String mark2 = "";
            mark = (int) (2 + (Math.random() * 4));
            switch (mark) {
                    case 2:
                        mark2 = "неудовлетворительно";
                        break;
                    case 3:
                        mark2 = "удовлетворительно";
                        break;
                    case 4:
                        mark2 = "хорошо";
                        break;
                    case 5:
                        mark2 = "отлично";
                        break;
            }
        System.out.println("Преподаватель " +
                this.name + " оценил студента с именем " +
                student.getName() + " по предмету " +
                this.subject + " на оценку " + mark2);

    }


}
