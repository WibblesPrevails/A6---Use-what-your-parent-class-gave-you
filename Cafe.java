/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces;  // The number of ounces of coffee remaining in inventory
    private int nSugarPackets;  // The number of sugar packets remaining in inventory
    private int nCreams;        // The number of "splashes" of cream remaining in inventory
    private int nCups;          // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");

    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (nCoffeeOunces > size && this.nSugarPackets > nSugarPackets && this.nCreams > nCreams && nCups > 1) {
            nCoffeeOunces -= size;
            nSugarPackets -= nSugarPackets;
            nCreams -= nCreams;
            nCups -= 1;
        }
        else {
            restock(5000,2500,2500,200);
        }
        //System.out.println("A size " + Integer.toString(size) + "cup of coffee was sold.");   //This wasnt in the directions but I thought I should include it just in case.
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        nCoffeeOunces += nCoffeeOunces;
        nSugarPackets += nSugarPackets;
        nCreams += nCreams;
        nCups += nCups;
    }

    public static void main(String[] args) {
        new Cafe("HotCaf","9020 Willshire Rd",2,5000,2200,2400,160);
    }
    
}