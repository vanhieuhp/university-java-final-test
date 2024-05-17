public abstract class  Product {

    private String name;
    protected float price;
    private String description;
    protected int quantity;

    public Product(String name, float price, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    void showInfo() {
        System.out.println("Product Information:");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Quantity: " + getQuantity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
