import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private String name;
    private User user;
    private User userlist;

    //List
    private List<Product> productlist1 = new ArrayList<>();
    private List<Product> productlist2 = new ArrayList<>();

    //List
    public void setProductlist1(List<Product> Productlist1) {
        productlist1 = Productlist1;
    }

    public void setProductlist2(List<Product> Productlist2) {
        productlist2 = Productlist2;
    }

    public ShoppingList(String name, User user, User userlist) {
        this.name = name;
        this.user = user;
        this.userlist = userlist;
    }

    public String getListname() {
        return name;
    }

    public User getUsername() {
        return user;
    }

    public float getPercentagecompleted() {
        float percentagem = 0;
        int product1 = productlist1.size();
        int product2 = productlist2.size();
        percentagem = product2 * 100 / product1;
        return percentagem;
    }

    public List<Product> getTotalofproducts() {
        return productlist1;
    }

    public List<Product> getTotalofproductsonshoppingcart() {
        return productlist2;
    }

    public float getTotalprice() {
        float total = 0;
        if (productlist1.size() == 0) {
            return 0;
        }
        for (int i = 0; i < productlist1.size(); i++) {
            total = total + productlist1.get(i).getprice();
        }
        return total;

    }

    public float getTotalpriceoncart() {
        float totaloncart = 0;
        if (productlist2.size() == 0) {
            return 0;
        }
        for (int i = 0; i < productlist2.size(); i++) {
            totaloncart = totaloncart + productlist2.get(i).getprice();
        }
        return totaloncart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean AddProduct(Product product) {
        boolean success = productlist1.add(product);
        return success;
    }

    public boolean Removeproduct(Product product) {
        return Removeproduct(product);
    }
}