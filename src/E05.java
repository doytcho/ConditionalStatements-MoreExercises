import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hoursToCompleteProjekt = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int emploiers = Integer.parseInt(scan.nextLine());
        double firmHours = 0.9 * days * 8;
        int workersExtraHours = emploiers * days * 2;
        double totalHours = Math.floor(firmHours) + workersExtraHours;
        if (totalHours >= hoursToCompleteProjekt) {
            System.out.printf("Yes!%.0f hours left.", totalHours - hoursToCompleteProjekt);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursToCompleteProjekt - totalHours);
        }
    }
}
