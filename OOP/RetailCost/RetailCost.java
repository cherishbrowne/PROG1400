package OOP.RetailCost;

// If an items wholesale cost is 5.00 and its markup
// percentage is 100 percent, then the items retail
// price is 10.00.

public class RetailCost {

    public static float calculateRetail(float wholesaleCost, int percentMarkup) {
        return wholesaleCost + wholesaleCost * percentMarkup / 100.0f;
    }

    public static void main(String[] args) {

        float retailCost = calculateRetail(5.00f, 100);
        System.out.println("Retail cost = " + retailCost);
    }

}