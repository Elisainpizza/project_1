package day6;

public class Teacher {
    private String name;
    private String subject;
    private int mark;

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
    private String mark2;
    public void evaluate() {
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

    }

    public String getMark2() {
        return mark2;
    }

    public int getMark() {
    return mark;
    }
}
