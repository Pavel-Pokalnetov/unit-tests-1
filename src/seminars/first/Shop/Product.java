package seminars.first.Shop;

public class Product implements Comparable<Product> {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public int compareTo(Product o) {
        if(o==this)return 0;
        if(o.getCost()<this.cost)return 1;
        if(o.getCost()>this.cost)return -1;
        return 0;
    }
}