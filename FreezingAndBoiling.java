import java.util.Scanner;

/**
 * @author jaymar jaramillo
 * starting out with >>> JAVA by Tony Gaddis Chapter 6 challenge 11
 */

public class FreezingAndBoiling {
    private short temperature;

    public void setTemperature(short temperature) {
        this.temperature = temperature;
    }

    public short getTemperature() {
        return temperature;
    }

    public boolean isEthylFreezing() {
        return temperature <= -173; //Ethyl Alcohol Freezing Point
    }

    public boolean isEthylBoiling() {
        return temperature >= 172; //Ethyl Alcohol Boiling Point
    }

    public boolean isOxygenFreezing() {
        return temperature <= -362; //Oxygen Freezing Point
    }

    public boolean isOxygenBoiling() {
        return temperature >= -306; //Oxygen Boiling Point
    }

    public boolean isWaterFreezing() {
        return temperature <= 32; //Water Freezing Point
    }

    public boolean isWaterBoiling() {
        return temperature >= 212; //Water Boiling Point
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSubstance\tFreezing Point\tBoiling Point");
        System.out.println("==============================================");
        System.out.println("Ethyl Alcohol\t-173\t\t172\n" +
                           "Oxygen\t\t-362\t\t-306\n" +
                           "Water\t\t32\t\t212\n");
        
        System.out.print("Enter in a temperature: ");
        short temp = scan.nextShort();

        FreezingAndBoiling fab = new FreezingAndBoiling();
        fab.setTemperature(temp);

        System.out.println();

        if (fab.isEthylBoiling()) {
            System.out.println("Ethyl Alcohol boil at F" + temp);
        }

        if (fab.isEthylFreezing()) {
            System.out.println("Ethyl Alcohol will freeze at F" + temp);
        }

        if (fab.isOxygenBoiling()) {
            System.out.println("Oxygen will boil at F" + temp);
        }

        if (fab.isOxygenFreezing()) {
            System.out.println("Oxygen will freeze at F" + temp);
        }

        if (fab.isWaterBoiling()) {
            System.out.println("Water will boil at F" + temp);
        }

        if (fab.isWaterFreezing()) {
            System.out.println("Water will freeze at F" + temp);
        }
        
    }
}