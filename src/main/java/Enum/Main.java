package Enum;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Country usa = Country.USA;
        Country rus = Country.RUSSIA;
        Country ger = Country.GERMANY;
        Country fra = Country.FRANCE;

        System.out.println("Доступные страны:");


        System.out.println(usa.toString());
        System.out.println(rus.toString());
        System.out.println(ger.toString());
        System.out.println(fra.toString());


        while (true) {                                                 // создал бесконечный цикл, в котором будет крутиться сканер

            Scanner in = new Scanner(System.in, "Cp1251");  // Создал объект класса сканер, System.in - стандартный поток вх данных.
            System.out.println("Введи интересующую тебя страну на русском, хочешь закрыть программу - введи 'Закрыть'");
            String vvood = in.nextLine();


            if (vvood.equals("Закрыть")) {
                break;
            }

            if (vvood.equals("США")) {
                usa.printstatus();
                continue;
            }

            if (vvood.equals("РОССиЯ")) {
                rus.printstatus();

            }
            if (vvood.equals("ГЕРМАНия")) {
                ger.printstatus();
            }

            if (vvood.equals("ФРАНЦиЯ")) {
                fra.printstatus();
            }


            try {
                if (vvood.isEmpty()) {
                    throw new Exep("Пустая строка, нужно ввести страну");       //объявляю свою ошибку и ожидаю её
                }
            } catch (Exep e) {                                                //обрабатываю свою личную ошибку,Exep-свой класс,унаследованный от родительского ошибочного класса
                System.out.println(e);
                continue;
            }


            try {
                if (vvood.equals("USA") || vvood.equals("Norway") || vvood.equals("Mexico") || vvood.equals("Turkey")) {
                    throw new Exep("Введи страну по РУССКи!");
                }

            } catch (Exep e) {
                System.out.println(e);
                continue;
            }


        }
    }
}

