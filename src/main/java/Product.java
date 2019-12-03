public class Product {

    private String Name;
    private String Description;
    private String Picture;
    private Category Category;
    private float Price;
    private String UnityType;

    public Product (String Name, String Description, String Picture, Category Category, Float Price, String UnityType)
    {
        this.Name=Name;
        this.Description=Description;
        this.Picture=Picture;
        this.Category=Category;
        this.Price=Price;
        this.UnityType=UnityType;
    }


    public String getname()
    {
        return Name;
    }
    public void setname(String Name)
    {
        this.Name = Name;
    }


    public String getdescription()
    {
        return Description;
    }
    public void setdescription(String Description)
    {
        this.Description = Description;
    }


    public String getpicture()
    {
        return Picture;
    }
    public void setpicture(String Picture)
    {
        this.Picture = Picture;
    }


    public Category getcategory()
    {
        return Category;
    }
    public void setcategory(Category Category)
    {
        this.Category = Category;
    }


    public float getprice()
    {
        return Price;
    }
    public void setprice(float price)
    {
        this.Price = Price;
    }


    public String getunityType()
    {
        return UnityType;
    }
    public void setunityType(String UnityType)
    {
        this.UnityType = UnityType;
    }
}