package Enum;

public enum Country {
    USA("США", true), FRANCE("ФРАНЦиЯ", false), GERMANY("ГЕРМАНиЯ", true), RUSSIA("РОССиЯ", false);

    final private String ruName;
    final private boolean isOpen;


    Country(String ruName, boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }


    public String getRuName() {
        return ruName;
    }

    public boolean getisOpen() {
        return isOpen;
    }

    @Override
    public String toString() {
        return super.toString()+" ("+ruName+")";
    }

    public void printstatus () {

        if (getisOpen()) {

            System.out.println("Страна: " + toString() + " открыта для посещения");
        } else {
            System.out.println("Страна: " + toString() + " для посещения закрта");
        }
    }


}
