package pkg7pixelexercise;

/**
 *
 * @author federico.pozzi
 */
public class Item {

    private static long id_item_start=0;
    private long id_item;
    private String name;
    private double unit_price;
    private Taxes taxes = null;
    private double unit_taxedPrice;



    public Item(String name, double price, Taxes taxes) {
        this(name, price);
        this.taxes = taxes;
    }


    public Item(String name, double price) {
        this.id_item = id_item_start++;
        this.name = name;
        this.unit_price = price;
        this.unit_taxedPrice = price;
    }


    public double CalculateTaxes(){
        return taxes != null ?
                Math.ceil((taxes.getSales_tax() + taxes.getImport_duty())
                * unit_price * 20.0) / 20.0 : 0;
    }


    public static long getId_item_start() {
        return id_item_start;
    }

    public static void setId_item_start(long id_item_start) {
        Item.id_item_start = id_item_start;
    }

    public long getId_item() {
        return id_item;
    }

    public void setId_item(long id_item) {
        this.id_item = id_item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return unit_price;
    }

    public void setPrice(double price) {
        this.unit_price = price;
    }

    public Taxes getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }


    public double getTaxedPrice() {
        return unit_taxedPrice;
    }

    public void setTaxedPrice(double taxedPrice) {
        this.unit_taxedPrice = taxedPrice;
    }


}
