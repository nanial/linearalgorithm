package by.training.condition.currencyinword.model;

public interface Convert {

    String getUnitInWord(int unit);
    String getTenInWord(int ten);
    String getHundredInWord(int hundred);
    String getThousandInWord(int thousand);
}
