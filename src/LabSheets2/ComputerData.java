package LabSheets2;

import javax.swing.*;

public class ComputerData {

    static String serial, harddiskasString, processor, priceasString;

    static float price, harddisk, avPrice, cheapest= 9999999;

    public static void main(String[] args) {
        serial();
        harddisk();
        processor();
        price();

        JOptionPane.showMessageDialog(null, serial + "  hrd-dsk" + harddisk + "  prcessr" + processor+ "  prce" + price+ "  cheap" + cheapest);
    }

    public static void serial() {

        serial = JOptionPane.showInputDialog(null, "Please Enter a Serial Number");
    }

    public static void harddisk() {
        harddiskasString = JOptionPane.showInputDialog(null, "Please Enter the Available Hard-Disk Space");


   while(harddisk>5000 || harddisk <50){
        harddiskasString = JOptionPane.showInputDialog(null, "Please Enter a Value under 5000 or above 50");
        harddisk = Float.parseFloat(harddiskasString);

     }
    }

    public static void processor(){
        processor = JOptionPane.showInputDialog(null, "Please Enter the Processor Model");

    }


    public static void price()
    {
        priceasString = JOptionPane.showInputDialog(null, "Please enter a price");
        price= Float.parseFloat(priceasString);


        if (price<cheapest){
            cheapest=price;
        }



    }
}



