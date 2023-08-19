public class RewardValue {
    final double MILES2CASH = 0.0035f;
    final double CASH2MILES = 285.714285714f;

    long miles;

    public RewardValue(double cash) {
        miles = Math.round(cash * CASH2MILES);
    }
    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return miles * MILES2CASH;
    }
    public long getMilesValue() {
        return miles;
    }
}
