package laba_5.task_1;

public class MyVectorClass {
    private float x_1;
    private float x_2;
    private float y_1;
    private float y_2;
    private float z_1;
    private float z_2;

    public MyVectorClass() {
    }

    public MyVectorClass(float x_1, float x_2, float y_1, float y_2, float z_1, float z_2) {
        this.x_1 = x_1;
        this.x_2 = x_2;
        this.y_1 = y_1;
        this.y_2 = y_2;
        this.z_1 = z_1;
        this.z_2 = z_2;
    }

    public float scalarnost(MyVectorClass other){
        try {
            return (this.x_2 - this.x_1) * (other.x_2 - other.x_1) + (this.y_2 - this.y_1) * (other.y_2 - other.y_1) + (this.z_2 - this.z_1) * (other.z_2 - other.z_1);
        } catch (Exception error) {
            System.out.println("Error in Scalarny method");
            return 0;
        }
    }

    public boolean ortogonalnost(MyVectorClass other){
        try {
            //два вектора являются ортогональными (перпендикулярными), если их скалярное
            // произведение равно нулю.
            if(scalarnost(other) == 0.){
                return true;
            } else {
                return false;
            }
        } catch (Exception error){
            System.out.println("Error in Orthogonal method");
            return false;
        }
    }

    public boolean peresechenie(MyVectorClass other, float eps){
        try {
            //https://habr.com/ru/post/267037/
            double s = ((other.y_2 - this.y_2)/(this.y_1 - this.y_2) - (other.x_2 - this.x_2)/(this.x_1 - this.x_2))/((other.x_1 - other.x_2)/(this.x_1 - this.x_2) - (other.y_1 - other.y_2)/(this.y_1 - this.y_2));
            double t = s*((other.x_1 - other.x_2)/(this.x_1 - this.x_2)) + (other.x_2 - this.x_2)/(this.x_1 - this.x_2);
            double left = this.z_1 * t + this.z_2 * (1 - t);
            double right = other.z_1 * s + other.z_2 * (1 - s);

            if((left - right) <= eps){
                return true;
            } else {
                return false;
            }
        } catch (Exception error){
            System.out.println("Error in Peresechenie method");
            return false;
        }
    }

    public String compareVectors(MyVectorClass other){
        try {
            double firstModulus = Math.sqrt(Math.pow((this.x_2 - this.x_1), 2) + Math.pow((this.y_2 - this.y_1), 2) + Math.pow((this.z_2 - this.z_1), 2));
            double secondModulus = Math.sqrt(Math.pow((other.x_2 - other.x_1), 2) + Math.pow((other.y_2 - other.y_1), 2) + Math.pow((other.z_2 - other.z_1), 2));
            if(firstModulus > secondModulus){
                return "First vector is bigger";
            } else if(firstModulus < secondModulus){
                return "Second vector is bigger";
            } else {
                return "Vectors have the same length";
            }
        } catch (Exception error) {
            System.out.println("Error in compareVectors method");
            return "error";
        }

    }

    public boolean complenarnost(MyVectorClass other, MyVectorClass another) {
        try {
            //векторы, которые параллельны одной плоскости или лежат на одной плоскости
            // если смешанное произведение 3-х векторов равно нулю, то эти три вектора компланарны.
            float this_x = this.x_2 - this.x_1;
            float this_y = this.y_2 - this.y_1;
            float this_z = this.z_2 - this.z_1;

            float other_x = other.x_2 - other.x_1;
            float other_y = other.y_2 - other.y_1;
            float other_z = other.z_2 - other.z_1;

            float tmpX = this_y * other_z - this_z * other_y;
            float tmpY = -(this_x * other_z - this_z * other_x);
            float tmpZ = this_z * other_y - this_y * other_x;

            float another_x = another.x_2 - another.x_1;
            float another_y = another.y_2 - another.y_1;
            float another_z = another.z_2 - another.z_1;

            float sumOfMuls = tmpX * another_x + tmpY * another_y + tmpZ * another_z;

            if(sumOfMuls == 0.){
                return true;
            } else {
                return false;
            }
        }catch (Exception error){
            System.out.println("Error in complenarnost method");
            return false;
        }
    }

    @Override
    public String toString() {
        return
                "x_1=" + x_1 +
                        ", x_2=" + x_2 +
                        ", y_1=" + y_1 +
                        ", y_2=" + y_2 +
                        ", z_1=" + z_1 +
                        ", z_2=" + z_2 ;
    }
}

