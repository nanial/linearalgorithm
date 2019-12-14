package by.training.condition.currencyinword.bean;

public class Currency {

    private int unit;
    private int ten;
    private int hundred;
    private int thousand;
    private int amount;

    public Currency() {
    }

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnit() {
        unit = amount % 10;
        return unit;
    }

    public int getTen() {
        ten = (amount % 100) / 10;
        return ten;
    }

    public int getHundred() {
        hundred = (amount % 1000) /100;
        return hundred;
    }

    public int getThousand() {
        thousand = amount / 1000;
        return thousand;
    }
}
