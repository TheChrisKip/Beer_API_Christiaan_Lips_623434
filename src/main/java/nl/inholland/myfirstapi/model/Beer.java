package nl.inholland.myfirstapi.model;

public class Beer {
    private long id;
    private String brand;
    private String type;
    private int price;
    private int rating;

    public Beer() {
    }

    public Beer(long id, String brand, String type, int price, int rating) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        if (rating < 11 || rating > 0){
            this.rating = rating;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
