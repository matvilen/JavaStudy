package laba_3.task_3;
import java.util.ArrayList;
import java.util.Objects;

public class Array_class implements Array{
    private ArrayList<Float> content;
    public Array_class() {
    }
    public Array_class(ArrayList<Float> content) {
        this.content = content;
    }

    @Override
    public void summation(Object o) {
        if(o.getClass().equals(Array_class.class)){
            if(this.content.size() == ((Array_class) o).content.size()){
                for (int i = 0; i < content.size(); i++) {
                    this.content.set(i, (this.content.get(i) + ((Array_class) o).content.get(i)));
                }
            } else {
                System.out.println("Arrays length mismatch!");
            }
        } else {
            System.out.println("Сlass mismatch!");
        }
    }

    @Override
    public void subtraction(Object o) {
        if(o.getClass().equals(Array_class.class)){
            if(this.content.size() == ((Array_class) o).content.size()){
                for (int i = 0; i < content.size(); i++) {
                    this.content.set(i, (this.content.get(i) - ((Array_class) o).content.get(i)));
                }
            } else {
                System.out.println("Arrays length mismatch!");
            }
        } else {
            System.out.println("Сlass mismatch!");
        }
    }

    @Override
    public void multiplication(Object o) {
        if(o.getClass().equals(Array_class.class)){
            if(this.content.size() == ((Array_class) o).content.size()){
                for (int i = 0; i < content.size(); i++) {
                    this.content.set(i, (this.content.get(i) * ((Array_class) o).content.get(i)));
                }
            } else {
                System.out.println("Arrays length mismatch!");
            }
        } else {
            System.out.println("Сlass mismatch!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array_class Array_class = (Array_class) o;
        return Objects.equals(content, Array_class.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        return "Array1Dim{" +
                "content=" + content +
                '}';
    }

    public Array_class getClone(){
        return new Array_class((ArrayList)(this.content.clone()));
    }

}