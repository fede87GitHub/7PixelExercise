package pkg7pixelexercise;

/**
 *
 * @author federico.pozzi
 */
public class Taxes {

    private double sales_tax;
    private double import_duty;


    public Taxes(double sales_tax, double import_duty) {

        this.sales_tax = sales_tax;
        this.import_duty = import_duty;

     
        if((int)sales_tax == sales_tax)
            this.sales_tax /= 100;


        if((int)import_duty == import_duty)
            this.import_duty /= 100;
    }


    public double getSales_tax() {
        return sales_tax;
    }

    public void setSales_tax(double sales_tax) {
        this.sales_tax = sales_tax;
    }

    public double getImport_duty() {
        return import_duty;
    }

    public void setImport_duty(double import_duty) {
        this.import_duty = import_duty;
    }



}
