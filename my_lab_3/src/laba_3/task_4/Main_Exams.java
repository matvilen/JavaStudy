package laba_3.task_4;
//Система Вступительные экзамены. Абитуриент регистрируется на Факультет, сдает Экзамены.
// Преподаватель выставляет Оценку. Система подсчитывает средний балл и
// определяет Абитуриентов, зачисленных в учебное заведение.

public class Main_Exams {
    public static void main(String[] args) {

        Student st1 = new Student("Ivanov Ivan Ivanovich", 1);
        Student st2 = new Student("Petrov Petr Petrovich", 2);
        Student st3 = new Student("Smirnov Igor Igorevich", 3);
        Student st4 = new Student("Ivanova Alena Petrovna", 4);
        Student st5 = new Student("Matvienko Lena Petrovovna", 5);
        Student st6 = new Student("Semenov Egor Igorevich", 6);

        Faculty informatics = new Faculty("informatics",1);
        Faculty physics = new Faculty("physics",2);
        Faculty english = new Faculty("english",3);
        Faculty biology = new Faculty("Biology",4);

        University My_university = new University();
        My_university.addFaculty(informatics);
        My_university.addFaculty(physics);
        My_university.addFaculty(english);
        My_university.addFaculty(biology);

        Professor pr1 = new Professor("Vasiliev Kassian Alvianovich", 1);
        Professor pr2 = new Professor("Denisov Kliment Rubenovich", 2);
        Professor pr3 = new Professor("Nikolaev Arsen Artemovich", 3);
        Professor pr4 = new Professor("Davydov Bogdan Germanovich", 4);

        pr1.addPlus(40);
        pr2.addPlus(30);
        pr3.addPlus(20);
        pr4.addPlus(50);

        //prof -> facul
        informatics.addProfessor(pr1);
        informatics.addProfessor(pr2);
        physics.addProfessor(pr2);
        physics.addProfessor(pr3);
        physics.addProfessor(pr4);
        english.addProfessor(pr3);
        english.addProfessor(pr1);
        biology.addProfessor(pr4);

        //st -> facul - facultet.add_st (запись на факультет)

         informatics.addStudent(st1);
         informatics.addStudent(st2);
         informatics.addStudent(st3);
         physics.addStudent(st3);
         physics.addStudent(st4);
         physics.addStudent(st5);
         english.addStudent(st5);
         english.addStudent(st6);
         english.addStudent(st1);
         biology.addStudent(st1);
         biology.addStudent(st2);
         biology.addStudent(st3);

        //st - pass.exams - informatics.(st.get_id, fac.proff_array(1(rand))) ->return st-mark

        informatics.pass_exams(st1, informatics.examenator().assess());
        informatics.pass_exams(st2, informatics.examenator().assess());
        informatics.pass_exams(st3, informatics.examenator().assess());
        physics.pass_exams(st3,physics.examenator().assess());
        physics.pass_exams(st4,physics.examenator().assess());
        physics.pass_exams(st5,physics.examenator().assess());
        english.pass_exams(st5, english.examenator().assess());
        english.pass_exams(st6, english.examenator().assess());
        english.pass_exams(st1, english.examenator().assess());
        biology.pass_exams(st1, biology.examenator().assess());
        biology.pass_exams(st2, biology.examenator().assess());
        biology.pass_exams(st3, biology.examenator().assess());

        My_university.addProhodnoiUniv();

        My_university.enteranced_students();

        System.out.println(My_university);
    }
}
