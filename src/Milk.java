import java.time.LocalDate;

public class Milk extends Product {

    private LocalDate expirationDate;

    public Milk(String name, float price, String description, int quantity, LocalDate expirationDate) {
        super(name, price, description, quantity);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    void checkExpired() {
        if (LocalDate.now().isAfter(expirationDate)) {
            System.out.println("This product has expired");
        } else {
            System.out.println("This product is still valid");
        }
    }


}
