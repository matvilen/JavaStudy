package laba_3.task_4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Faculty {
    private String name;
    private int id;
    private int prohodnoi;
    private ArrayList<Professor> professorArrayList;
    private ArrayList<Student> studentArrayList;
    public HashMap<Student, Integer> student_mark;
    public  ArrayList<Student> real_students;

    public Faculty() {
    }

    public Faculty(String name, Integer id) {
        this.name = name;
        this.id = id;
        this.professorArrayList = new ArrayList<>();
        this.studentArrayList = new ArrayList<>();
        this.student_mark = new HashMap<>();
        this.real_students = new ArrayList<>();
    }

    public void addProfessor(Professor professor){
        professorArrayList.add(professor);
    }

    public void addStudent(Student student){
        this.studentArrayList.add(student);
    }

    public void pass_exams(Student student, Integer mark){
        System.out.println(student+ "  " + mark + "\n");
        this.student_mark.put(student,mark);
    }

    public Professor examenator(){
        Random random = new Random();
        return this.professorArrayList.get(random.nextInt(this.professorArrayList.size()));
    }

    public void addProhodnoi(){
        Integer mark_sum = 0;
            for (int mark : student_mark.values()) mark_sum += mark;
            this.prohodnoi = mark_sum / student_mark.size();
    }

    public Integer prohod_ball(){
        return  this.prohodnoi;
    }
    public Integer get_id(){
        return  this.id;
    }
    public void entered_faculty(){
        for (Map.Entry entry_sm : student_mark.entrySet()) {
            if (prohodnoi <= (Integer) entry_sm.getValue()) {
                real_students.add((Student) entry_sm.getKey());
                }
            }
    }

  /*  public void addSubjects(Integer acc_id, Integer cardNum){
        account_card.put(acc_id, cardNum);
        card_active.put(cardNum, true);
    }
*/


    @Override
    public String toString() {
        return "Faculty " + name +
                "\n Abiturients = " + studentArrayList +
                "\n Professors =" + professorArrayList +
                "\n Real Students =" + real_students +
                "\n Prohodnoi = " + prohodnoi + "\n ";
    }
}
