public class RewardValue {
    public static final double MILES2CASH = 0.0035f;
    public static final double CASH2MILES = 285.714285714f;

    long miles;
    double cash;

    public RewardValue(double cash) {
        this.cash = cash;
        miles = Math.round(cash * CASH2MILES);
    }
    public RewardValue(long miles) {
        this.miles = miles;
        this.cash = miles * MILES2CASH;
    }

    public double getCashValue() {
        return cash;
    }
    public long getMilesValue() {
        return miles;
    }
}
