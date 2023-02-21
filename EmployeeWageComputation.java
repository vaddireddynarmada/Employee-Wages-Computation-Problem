public class Uc1 {
    public static void main(String[] args) {
        int present = 1;
        int attendance = (int) (Math.random()*100) % 2;
        if (present == attendance) {
            System.out.println("Present");
        }
        else {
            System.out.println("Absent");

        }
    }
}