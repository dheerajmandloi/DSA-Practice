package NumberSystem;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("it is Leap year");
        } else {
            System.out.println("No its not leap year its a normal year");
        }
    }

}
