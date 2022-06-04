package laba_5.task_2.abitur;
import java.util.ArrayList;
import java.util.regex.*;

public class Abiturient {
    private String name;
    private String surname;
    private String lastname;
    private String ab_address;
    private String ab_phone;
    private ArrayList<Integer> marks;

    public Abiturient(int id, String name, String surname, String lastname, String address, String phone, ArrayList<Integer> marks) throws Exception {

        if ((name.equals("")) || (surname.equals("")) || (lastname.equals(""))) {
            throw new Exception("NOT FULL NAME");
        }
        if (!Pattern.matches("^8-9\\d{9}", ab_phone)) {
            throw new Exception("Phone is NOT correct");
        }
        for(int x : marks){
            if((x < 1) || (x > 5)){
                throw new Exception("Mark is NOT correct!");
            }
        }
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.ab_address = address;
        this.ab_phone = phone;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return ab_address;
    }

    public void setAddress(String address) {
        this.ab_address = address;
    }

    public String getPhone() {
        return ab_phone;
    }

    public void setPhone(String phone) {
        this.ab_phone = phone;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + ab_address + '\'' +
                ", phone='" + ab_phone + '\'' +
                ", marks=" + marks +
                '}';
    }
}
