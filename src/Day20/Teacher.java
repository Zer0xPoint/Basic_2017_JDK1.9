package Day20;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Teacher {
    private String name, course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public Teacher() {
    }
}

class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Allen","JDBC");
        Teacher teacher2 = new Teacher("Lucy","CoreJava");
        Teacher teacher3 = new Teacher("Henry","JSP");
        Map<String, String> stringMap = new HashMap<>(){
            {
                put(teacher1.getName(),teacher1.getCourse());
                put(teacher2.getName(),teacher2.getCourse());
                put(teacher3.getName(),teacher3.getCourse());
            }
        };
        stringMap.entrySet().parallelStream().map(entry -> entry + "").map(s -> s.replace("="," ")).forEach(System.out::println);
        stringMap.entrySet().parallelStream().filter(entry -> entry.getValue().equals("JSP")).map(entry -> entry + "").map(s -> s.replace("="," ")).forEach(System.out::println);
    }
}