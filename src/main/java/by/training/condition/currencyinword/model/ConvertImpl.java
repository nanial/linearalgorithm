package by.training.condition.currencyinword.model;

import by.training.condition.currencyinword.bean.Currency;

public class ConvertImpl implements Convert{

    private Currency currency;

    public ConvertImpl(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String getUnitInWord(int unit) {

        String word;
        switch (unit){
            case 1:
                if (currency.getTen() == 1 ){
                    word = "одиннадцать рублей";
                }
                else {
                    word = "один рубль";
                }
            break;
            case 2:
                if (currency.getTen() == 1 ){
                    word = "двенадцать рублей";
                } else {
                    word = "два рубля";
                }
            break;
            case 3:
                if (currency.getTen() == 1 ){
                word = "тринадцать рублей";
                } else {
                    word = "три рубля";
                }
            break;
            case 4:
                if (currency.getTen() == 1 ){
                    word = "четырнадцать рублей";
                } else {
                    word = "четыре рубля";
                }
            break;
            case 5:
                if (currency.getTen() == 1 ){
                    word = "пятнадцать рублей";
                } else {
                    word = "пять рублей";
                }
            break;
            case 6:
                if (currency.getTen() == 1 ){
                    word = "шестнадцать рублей";
                } else {
                    word = "шесть рублей";
                }
            break;
            case 7:
                if (currency.getTen() == 1 ){
                    word = "семнадцать рублей";
                } else {
                    word = "семь рублей";
                }
            break;
            case 8:
                if (currency.getTen() == 1 ){
                    word = "восемнадцать рублей";
                } else {
                    word = "восемь рублей";
                }
            break;
            case 9:
                if (currency.getTen() == 1 ){
                    word = "девятнадцать рублей";
                } else {
                    word = "девять рублей";
                }
            break;
            case 0: word = "рублей";
            break;

            default:
                throw new IllegalStateException("Unexpected value: " + unit);
        }
        return word;
    }

    @Override
    public String getTenInWord(int ten) {
        String word;
        switch (ten){
            case 1:
                if(currency.getUnit() == 0){
                    word = "десять";
                }else {
                word = "";
                }
                    break;
            case 2: word = "двадцать";
                break;
            case 3: word = "тридцать";
                break;
            case 4: word = "сорок";
                break;
            case 5: word = "пятьдесят";
                break;
            case 6: word = "шестьдесят";
                break;
            case 7: word = "семьдесят";
                break;
            case 8: word = "восемьдесят";
                break;
            case 9: word = "девяноста";
                break;
            case 0: word = "";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + ten);
        }
        return word;
    }

    @Override
    public String getHundredInWord(int hundred) {
        String word;
        switch (hundred){
            case 1: word = "сто";
                break;
            case 2: word = "двести";
                break;
            case 3: word = "триста";
                break;
            case 4: word = "четыреста";
                break;
            case 5: word = "пятьсот";
                break;
            case 6: word = "сестьсот";
                break;
            case 7: word = "семьсот";
                break;
            case 8: word = "восемьсот";
                break;
            case 9: word = "девятьсот";
                break;
            case 0: word = "";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + hundred);
        }
        return word;
    }

    @Override
    public String getThousandInWord(int thousand) {
        String word;
        switch (thousand){
            case 1: word = "Одна тысяча";
                break;
            case 2: word = "Две тысячи";
                break;
            case 3: word = "Три тысячи";
                break;
            case 4: word = "Четыре тысячи";
                break;
            case 5: word = "Пять тысяч";
                break;
            case 6: word = "Шесть тысяч";
                break;
            case 7: word = "Семь тысяч";
                break;
            case 8: word = "Восемь тысяч";
                break;
            case 9: word = "Девять тысяч";
                break;
            case 0: word = "";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + thousand);
        }
        return word;
    }}
