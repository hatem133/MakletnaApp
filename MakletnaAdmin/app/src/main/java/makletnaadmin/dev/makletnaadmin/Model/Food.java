package makletnaadmin.dev.makletnaadmin.Model;



public class Food {
    private String Name,Image,Description,Ingredients,Preparation,MenuId;

    public Food() {
    }

    public Food(String name, String image, String description, String ingredients, String preparation, String menuId) {
        Name = name;
        Image = image;
        Description = description;
        Ingredients = ingredients;
        Preparation = preparation;
        MenuId = menuId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public String getPreparation() {
        return Preparation;
    }

    public void setPreparation(String preparation) {
        Preparation = preparation;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
