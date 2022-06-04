package laba_3.task2.employee;

//3.	interface Сотрудник <- class Инженер <- class Руководитель.
public class MainEngineer {
    public static void main(String[] args) {

        Engineer engineer = new Engineer("Ivanov Ivan Ivanovich", "process engineer", "NII CHAVO", "Magic");
        Ruler head = new Ruler("Petrov Petr Petrovich", "main engineer", "NII CHAVO", "Magic");

        System.out.println(engineer.introduce());
        System.out.println();
        System.out.println(head.introduce());
    }
}

