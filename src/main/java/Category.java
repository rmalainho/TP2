public class Category {
    private String Name;
    private String Description;
    private String Color;

    public  Category(String Name, String Description, String Color){
        this.Name = Name;
        this.Description = Description;
        this.Color = Color;
    }

    public String getName() {return Name;}
    public String getDescription() {return Description;}
    public String getColor() {return Color;}

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
}