package laba_8;
//2.	Реализовать многопоточное приложение “Робот”. Надо написать робота,
// который умеет ходить. За движение каждой его ноги отвечает отдельный поток.
// Шаг выражается в выводе в консоль LEFT или RIGHT.
public class Robot {
    private Leg legLeft;
    private Leg legRight;

    private Boolean lastLegLeft;

    public Robot() {
        this.legLeft = new Leg("Left");
        this.legRight = new Leg("Right");

        this.legLeft.start();
        this.legRight.start();

        this.lastLegLeft = null;
    }

    public void walk(String leg) {
        if (lastLegLeft == null) {
            switch (leg) {
                case "left":
                    this.legLeft.makeStep();
                    this.lastLegLeft = true;
                    break;

                case "right":
                    this.legRight.makeStep();
                    this.lastLegLeft = false;
                    break;

                default:
                    System.out.println("there is no such leg");
                    break;
            }
        }
        else {
            if (leg.equals("left") && this.lastLegLeft == false) {
                this.legLeft.makeStep();
                this.lastLegLeft = true;
            }
            else if (leg.equals("right") && this.lastLegLeft == true) {
                this.legRight.makeStep();
                this.lastLegLeft = false;
            }
            else if (leg.equals("left") || leg.equals("right")) {
                System.out.println("this leg made a step in previous time");
            }
            else {
                System.out.println("There is no such a leg");
            }
        }
    }

    public void stop() {
        this.legLeft.stopLeg();
        this.legRight.stopLeg();
    }
}
