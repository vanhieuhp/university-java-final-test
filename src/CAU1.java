import java.time.LocalDate;

public class CAU1 {
    public static void main(String[] args) {

        // CAU 1
        Milk milk1 = new Milk("Fresh Milk", 2.5f, "500ml", 10, LocalDate.of(2024, 6, 1));
        Milk milk2 = new Milk("Bavi Milk", 2.0f, "450ml", 20, LocalDate.of(2023, 12, 31));
        milk1.showInfo();
        milk1.checkExpired();
        System.out.println("====================================");
        milk2.showInfo();
        milk2.checkExpired();

    }
}