package pkg7pixelexercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author federico.pozzi
 */
public class Cart {


    private Map<Item, Integer> cart;
    private double total_price;
    private double total_taxes;


    public Cart(){
        // LinkedHashMap to maintain the item insertion order
        this.cart = new LinkedHashMap<>();

        this.total_price = 0;
        this.total_taxes = 0;
    }

    public void addToCart(Item item, int quantity){

        double calculated_taxes = item.CalculateTaxes();
        double totPrice = item.getPrice() + calculated_taxes;
        item.setTaxedPrice(totPrice);
        cart.put(item, quantity);

        this.total_taxes += calculated_taxes * quantity;
        this.total_price += totPrice * quantity;
    }


    public void printCart(){
        System.out.println(toString());
    }


    @Override
    public String toString() {

        String res = "";
        for (Map.Entry<Item, Integer> it : cart.entrySet()){
            Item item = it.getKey();
            res += it.getValue()+" "+item.getName()+": "+
                    String.format(Locale.US, "%.2f", item.getTaxedPrice() * it.getValue())+"\n";
        }


        return res+"Sales Taxes: "+String.format(Locale.US, "%.2f", this.total_taxes)+
                "\nTotal: "+String.format(Locale.US, "%.2f", this.total_price)+"\n";


    }


    public double getTotal_price() {
        return total_price;
    }

    public double getTotal_taxes() {
        return total_taxes;
    }



}
