package alcoholStore;

public class Alcohol {
    private String title;
    private int price;

    public Alcohol(String title, int price) throws Exception  {
        this.title = title;
        if (price < 0) {
            throw new Exception("Цена не может быть отрицательной");
        }
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        }

        this.price = price;
    }
}