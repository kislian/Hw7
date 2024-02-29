public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        short vklad = 15_000;
        int sumAccum = 0;
        int month = 0;
        while (sumAccum <= 2_459_000) {
            sumAccum = sumAccum + vklad;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений=" + sumAccum);
        }
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");

        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Задание 3");
        int countPopul = 12_000_000;
        int birthOn_1000 = 17;
        int deathOn_1000 = 10;
        i = 1;
        for (; i <= 12; i++) {
            countPopul = countPopul + countPopul / 1000 * (birthOn_1000 - deathOn_1000);
            System.out.println("Год=>" + i + " численность населения составит " + countPopul);
        }
        System.out.println("Задание 4");
        vklad = 15_000;
        sumAccum = 0;
        month = 0;
        int summa = 12_000_000;
        sumAccum = vklad;
        for (; sumAccum < summa; ) {
            sumAccum = sumAccum + vklad / 100 * 7;
            month = month + 1;
            System.out.println("Месяц==>" + month + " ;сумма накоплений=" + sumAccum);
        }
        System.out.println("Задание 5");
        vklad = 15_000;
        sumAccum = 0;
        month = 0;
        summa = 12_000_000;
        sumAccum = vklad;
        for (; sumAccum < summa; ) {
            sumAccum = sumAccum + vklad / 100 * 7;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц===>" + month + " ;сумма накоплений=" + sumAccum);
            }
        }
        //*******************************  Задание 6 ****************************************
        System.out.println("Задание 6 вариант for");
        vklad = 15_000;
        sumAccum = 0;
        int countMonthAccum = 9 * 12;
        month = 0;
        sumAccum = vklad;
        for (; month < countMonthAccum; ) {
            sumAccum = sumAccum + vklad / 100 * 7;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц====>" + month + " ;сумма накоплений=" + sumAccum);
            }
        }
        System.out.println("Задание 6 вариант while");
        vklad = 15_000;
        sumAccum = 0;
        int period=6
        int god=9;
        countMonthAccum = god * 12;
        month = 0;
        sumAccum = vklad;
        while (month < countMonthAccum) {
            sumAccum = sumAccum + vklad / 100 * 7;
            month = month + 1;
            if (month % period == 0) {
                System.out.println("Месяц====>" + month + " ;сумма накоплений=" + sumAccum);
            }
        }
        //*******************************  Задание 7 ****************************************
        System.out.println("Задание 7 вариант while");
        int dayOfFriday = 7;
        while (dayOfFriday < 31) {
            System.out.println("Сегодня пятница, " + dayOfFriday + " -е число");
            dayOfFriday = dayOfFriday + 7;
        }
        System.out.println("Задание 7 вариант for");
        for (int friday = 1; friday < 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число");
        }
        System.out.println("Задание 7 вариант do while");
        dayOfFriday = 1;
        do {
            System.out.println("Сегодня пятница, " + dayOfFriday + " -е число");
            dayOfFriday = dayOfFriday + 7;
        }
        while (dayOfFriday < 31);
        //*******************************  Задание 8 ****************************************
        System.out.println("Задание 8");
        int currYear = 2024;
        for (int j = 0; j < currYear + 100; j += 79) {
            if (j > currYear - 200) {
                System.out.println(j);
            }
        }

    }
}




