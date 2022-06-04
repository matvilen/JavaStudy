package laba_3.task_4;

 //Абитуриент регистрируется на Факультет, сдает Экзамены.
// Преподаватель выставляет Оценку. Система подсчитывает средний балл и
// определяет Абитуриентов, зачисленных в учебное заведение

//на всех факультетах м.б. все студенты и там уже хранятся их оценки

//добавить ф-ю, кот выводит абитуров по факультетам

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class University {
    private ArrayList<Faculty> facultyArrayList;
   // private ArrayList<Student> studentsArrayList;
  //  private HashMap<Faculty, Student> student_faculty;
    private Iterator itr;

    public University(){
        this.facultyArrayList = new ArrayList<>();
   //     this.studentsArrayList = new ArrayList<>();
   //     this.student_faculty = new HashMap<>();
    }

    public void addFaculty(Faculty faculty){
        this.facultyArrayList.add(faculty);
    }
    public void addProhodnoiUniv(){
        for (int i=0;i<this.facultyArrayList.size();i++){
            this.facultyArrayList.get(i).addProhodnoi();
        }
    }
    public void enteranced_students(){
        for (int i=0;i<this.facultyArrayList.size();i++) {
            this.facultyArrayList.get(i).entered_faculty();
        /*    Faculty obj = this.facultyArrayList.get(i);
            HashMap<Student, Integer> student_mark = obj.student_mark;
            for (Map.Entry entry_sm : obj.student_mark.entrySet()) {
                System.out.println(obj.get_id() +"  " + obj.prohod_ball()+ "  "+ entry_sm.getValue());
                if (obj.prohod_ball() <= (Integer) entry_sm.getValue()) {
                    this.student_faculty.put(obj, (Student) entry_sm.getKey());
                    if (!this.studentsArrayList.contains((Student) entry_sm.getKey())) {
                        this.studentsArrayList.add((Student) entry_sm.getKey());
                    }
                }
            } */
        }
    //Почему так не получается (не возвращается поле faculty)?
       /* itr = facultyArrayList.iterator();
        while(itr.hasNext()){
           // Faculty obj =
            Object obj = itr.next();
            obj.student_mark
       */
    }
    @Override
    public String toString() {
        return "University:" + "\n" +
                "---All_faculties=" + facultyArrayList + ",\n" +
               // "---all_entered_students=" + studentsArrayList + ",\n" +
               // "---Entered_Student_Faculty=" + student_faculty + ",\n" +
                '.';
    }

}