public class GasSign {
    public static void main(String args[]) {
        // Creating three GasPriceTracker Objects, and then giving them a String name and double value
        GasPriceTracker unlead = new GasPriceTracker();
        GasPriceTracker prem = new GasPriceTracker();
        GasPriceTracker plus = new GasPriceTracker();

        unlead.setGasPrice(2.49);
        unlead.setType("Unleaded");

        plus.setGasPrice(2.79);
        plus.setType("Plus");

        prem.setGasPrice(2.99);
        prem.setType("Premium");
        // Printing proof of Objects
        System.out.println(prem.getType() + " : " + prem.getGasPrice());
        System.out.println(plus.getType() + " : " + plus.getGasPrice());
        System.out.println(unlead.getType() + " : " + unlead.getGasPrice());

    }
}