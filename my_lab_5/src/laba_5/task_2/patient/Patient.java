package laba_5.task_2.patient;
import java.util.regex.Pattern;

public class Patient {
    private String name;
    private String surname;
    private String lastname;
    private String address;
    private String phone;
    private String diagnos;


    public Patient( String name, String surname, String lastname, String address, String phone, String diagnos)throws Exception {

        if ((name.equals("")) || (surname.equals("")) || (lastname.equals(""))) {
            throw new Exception("NOT FULL NAME");
        }
        if (!Pattern.matches("^8-9\\d{9}", phone)) {
            throw new Exception("Phone is NOT correct");
        }
        if (diagnos.equals("")) {
            throw new Exception("Diagnos is not set");
        }
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.diagnos = diagnos;
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
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDiagnosis() {
        return diagnos;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnos = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", diagnosis='" + diagnos + '\'' +
                '}';
    }
}
