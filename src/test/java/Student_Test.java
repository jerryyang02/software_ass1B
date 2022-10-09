import java.util.*;

public class Student_Test {
    public static void main(String[] args) {
        Student student1 = new Student("XiqianYang ", 23, "07-04-1998", 18280072);
        Student student2 = new Student("YuqiPU ",19, "01-01-1999",18780092);
        Student student3 = new Student("Edward ", 18,"17-09-2000", 18298076);
        List<Student> students = new ArrayList<Student>(Arrays.asList(student3,student2,student1));

        Module module1 = new Module("Software Engineering");
        Module module2 = new Module("Machine Learning");
        Module module3 = new Module("Professional Skills");
        List<Module> modules = new ArrayList<Module>(Arrays.asList(module1,module2,module3));


        Course course1 = new Course("Computer Science and Information Technology","2020-05-01","2024-02-01");
        List<Course> courses = new ArrayList<Course>(Arrays.asList(course1));

        for(Module module : modules){
            module.setListStudent(students);
        }

        course1.setListModules(modules);

        for (Student student : students){
            student.setModules(modules);
            student.setCourses(courses);
        }

        for (Course course : courses){
            System.out.println("Course: ["+course.getCourse()+"]"+"\nCourse Start:"+course.getStartDate()+"=>Course End:"+course.getEndDate());
            for (Module module :course.getModules()){
                System.out.println("Modules:"+module.getName());
            }

            System.out.println("");
        }


        for(Student student : students){
            System.out.println("Student Name:"+student.getSName());
            System.out.println("Student UserName:"+student.getUserName());
            System.out.println("Student Courses: "+student.getCourses());
            System.out.println("Student Modules: "+student.getModules());
            System.out.println("============================================================");

        }



    }
}
