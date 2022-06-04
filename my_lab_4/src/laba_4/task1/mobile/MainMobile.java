package laba_3.task1.mobile;

//3. Создать класс Mobile с внутренним классом, с помощью объектов которого
// можно хранить информацию о моделях телефонов и их свойствах.
public class MainMobile {
    public static void main(String[] args) {

        Mobile mobile = new Mobile("Xiaomi");

        mobile.addModel("Mi 11");
        mobile.models.get(0).addAttribute("RAM", 8);
        mobile.models.get(0).addAttribute("ROM", 256);
        mobile.models.get(0).addAttribute("Accumulator", 4600);
        mobile.models.get(0).addAttribute("NFC");

        mobile.addModel("Mi 8");
        mobile.models.get(1).addAttribute("RAM", 6);
        mobile.models.get(1).addAttribute("ROM", 128);
        mobile.models.get(0).addAttribute("Accumulator", 3400);

        System.out.println(mobile);


    }
}
