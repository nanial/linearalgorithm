package by.training.condition.currencyinword.model;

public class ConvertImpl implements Convert{

    @Override
    public String getUnitInWord(int unit) {
        String word;
        switch (unit){
            case 1: word = "один";
            break;
            case 2: word = "два";
            break;
            case 3: word = "три";
            break;
            case 4: word = "четыре";
            break;
            case 5: word = "пять";
            break;
            case 6: word = "шесть";
            break;
            case 7: word = "семь";
            break;
            case 8: word = "восемь";
            break;
            case 9: word = "девять";
            break;
            case 0: word = "";
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
            case 1: word = "десять";
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
