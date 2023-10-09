public class TipCalculator {

    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip = 0.0;
    private double tip;
    private double totalCost;
    private double perPersonCostBeforeTip;
    private double tipPerPerson;
    private double totalCostPerPerson;

    public TipCalculator(int numPeople, double tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        this.totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }
    
    public double tipAmount() {
        tip = totalBillBeforeTip * (tipPercentage / 100);
        tip = (double) Math.round(tip * 100) / 100;
        return tip;
    }

    public double totalBill() {
        totalCost = tip + totalBillBeforeTip;
        return (double) Math.round(totalCost * 100) / 100;
    }

    public double perPersonCostBeforeTip() {
        perPersonCostBeforeTip = totalBillBeforeTip / numPeople;
        return Math.round(perPersonCostBeforeTip * 100) / 100.0;
    }

    public double perPersonTipAmount() {
        tipPerPerson = tip / numPeople;
        return (double) Math.round(tipPerPerson * 100) / 100;
    }

    public double perPersonTotalCost() {
        totalCostPerPerson = totalCost / numPeople;
        return Math.round(totalCostPerPerson * 100) / 100.0;
    }

}
 
   


