import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Category category1 = new Category("Vegetais", "Verdes", "Verde");
        Category category2 = new Category("Frutas", "Madura", "Vermelho");
        Category category3 = new Category("Cereais","Chocolate","Castanhos");

        Product product1 = new Product("Maçã", "Madura", "Imagem", category2, (float) 1.20, "kg");
        Product product2 = new Product("Alface","Fresca","Imagem",category1,(float) 1.80,"kg");
        Product product3 = new Product("Pêra","maduras","Imagem",category2,(float) 26,"kg");
        Product product4 = new Product("Chocapics","Sabor a chocolate","imagem",category3,(float) 4.50,"un");
        Product product5 = new Product("Nesquik","Sabor a chocolate","Imagem",category3, (float) 5.80,"un");
        Product product6 = new Product("Couve-flor","Fresca","Imagem",category1,(float) 1.40,"kg");
        Product product7 = new Product("Romã","Exótico","Imagem",category2,(float) 1.60,"kg");

        Address address1 = new Address("Rua Cidade do Porto","51","4705-263");
        Address address2 = new Address("Rua dos Alfaiates","4E","4282-144");

        User user1 = new User("João Machado","joaomachado@gmail.com","joaomachado04","12pass34",address1);
        User user2 = new User("Manuela Fernandes","manuelafernandes@gmail.com","manuealfernandes88","pass1234word",address2);

        ShoppingList lista1= new ShoppingList("Lista 1",user1,user2);
        ShoppingList lista2= new ShoppingList("Lista 2",user1,user2);

        List<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        newProductList.add(product3);
        newProductList.add(product4);
        newProductList.add(product5);
        newProductList.add(product6);
        newProductList.add(product7);
        lista1.setProductlist1(newProductList);

        List<Product> newProductList2 = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        lista1.setProductlist2(newProductList2);

        System.out.println(lista1.getUsername()+"\n"+ lista2.getTotalofproductsonshoppingcart()+"\n"+ lista1.getTotalofproducts());
    }
}