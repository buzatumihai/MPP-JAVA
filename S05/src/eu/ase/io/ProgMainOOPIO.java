package eu.ase.io;
import java.util.List;
import java.util.ArrayList;

public class ProgMainOOPIO {
    public static void main(String[] args)
    {
        String[] descriptions = new String[] {"T-Shirt", "Mug", "Pen"};
        double[] prices = new double[] {19.99,8.76,15.89};
        int[] units = new int[]{12,8,9};
        Invoice invoice = new Invoice(descriptions,prices,units);
        invoice.saveInvoiceToFile("invoice.txt");
        double total = invoice.readInvoiceFromFile("invoice.txt");
        System.out.println("TOTAL: " + total);

        //*******************************************

        List<InvoiceItem> items = new ArrayList<>();
        items.add(new InvoiceItem("T-Shirt",12,19.99));
        items.add(new InvoiceItem("Mug",8,8.76));
        items.add(new InvoiceItem("Pen",9,15.89));

        InvoiceWithItems invoiceWithItems = new InvoiceWithItems(items);
        invoiceWithItems.saveToFile("test_items.txt");
        List<InvoiceItem> returnIt = invoiceWithItems.readFromFile("test_items.txt");

        for(InvoiceItem it: returnIt)
        {
            System.out.println(it);
        }
    }
}
