import java.text.DecimalFormat;

public class Sinka {
    private String name;
    private double price;
    private String category;
    private int jamnuan;

    public Sinka(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.jamnuan = random();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private int random(){
        int min = 1;
        int max = 20;
        int range = max - min + 1;
        return (int)(Math.random() * range) + 1;
    }
}
