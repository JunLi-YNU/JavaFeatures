package beans;

import java.util.Optional;

public class Student extends Person {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * 获取学生的成绩
     * @param student
     * @return
     */
    public int getStudentGrade(Student student){
        //before java 8
        if(student != null){
            return -1;
        }
        return student.getGrade();
    }

    public int getStudentGradeJava8(Student student){
        // java 8
        return Optional.ofNullable(student).map(s->s.getGrade()).orElse(-1);
    }
}
