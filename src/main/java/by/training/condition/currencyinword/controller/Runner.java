package by.training.condition.currencyinword.controller;

import by.training.condition.currencyinword.bean.Currency;
import by.training.condition.currencyinword.model.Convert;
import by.training.condition.currencyinword.model.ConvertImpl;

public class Runner {

    public static void main(String[] args) {

        Convert word = new ConvertImpl();
        Currency currency = new Currency(1236);

        System.out.println(word.getThousandInWord(currency.getThousand()) + " " +
                word.getHundredInWord(currency.getHundred()) + " " +
                word.getTenInWord(currency.getTen()) + " " +
                word.getUnitInWord(currency.getUnit()) + " рублей");

    }
}
