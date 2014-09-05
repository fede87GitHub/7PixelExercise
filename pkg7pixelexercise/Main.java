package pkg7pixelexercise;

/**
 *
 * @author federico.pozzi
 */
public class Main {

    public static void main(String[] args) {


        Taxes basic_sales = new Taxes(10, 0);
        Taxes imported = new Taxes(0, 5);
        Taxes imported_basic_sales = new Taxes(10, 5);


        Cart basket1 = new Cart();
        basket1.addToCart(new Item("book", 12.49), 1);
        basket1.addToCart(new Item("music CD", 14.99, basic_sales), 1);
        basket1.addToCart(new Item("chocolate bar", 0.85), 1);

        basket1.printCart();




        Cart basket2 = new Cart();
        basket2.addToCart(new Item("imported box of chocolates", 10, imported), 1);
        basket2.addToCart(new Item("imported bottle of perfume", 47.5, imported_basic_sales), 1);

        basket2.printCart();


        

        Cart basket3 = new Cart();
        basket3.addToCart(new Item("imported bottle of perfume", 27.99, imported_basic_sales), 1);
        basket3.addToCart(new Item("bottle of perfume", 18.99, basic_sales), 1);
        basket3.addToCart(new Item("packet of headache pills", 9.75), 1);
        basket3.addToCart(new Item("box of imported chocolates", 11.25, imported), 1);

        basket3.printCart();


    }
}
