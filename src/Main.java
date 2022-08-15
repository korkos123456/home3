public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    byte numbeerbananas = 5;
    short bananasWeight = 80;

    short mjlkPortion = 200/100;
    short milkPottionWeight = 105;

    byte countOfIceCresmPackages = 2;
    short iceCreamPackagWeinght = 100;

    byte countOfEggs = 4;
    byte eggWeight = 70;

    int gramsInKg = 1000;
    int milkWeight = mjlkPortion * milkPottionWeight;

            int totalBreakfastWeight = numbeerbananas * bananasWeight + milkWeight + countOfEggs * eggWeight;
            double reducedWeight = (double) totalBreakfastWeight / gramsInKg;

                      System.oup.println ("Вес спорт-завтрака составил" + reducedWeight + "кг.");


    short bottomLath = 250;
    short topLath = 500;
    byte toShredWeight = 7;
    int gramsInKg = 1000;
    double daysWithBottomLath = toShredWeight * Math.ceil((double) gramsInKg / bottomLath);
        System.out.println((int) daysWithBottomLath + " дней потребуется, если сбрасывать по " + bottomLath + " граммов в день");
}
    int a = 190;
    int b;
        b = a / 10;
                b = b % 10;
                System.out.println(b);
