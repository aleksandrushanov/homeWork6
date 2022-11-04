public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1");
        ///Задание 1
        for (int i=1; i<=10;i++){
            System.out.println("Итерация цикла " + i);
        }

        ///задание 2
        for (int j =10; j>=1;j--){
            System.out.println("Интерация цикла " + j );
        }
        ///задание 3
        for (int a=0;a<=17; a=a+2){
            System.out.println("Интерация цикла " + a);
        }
        ///задание 4
        for (int b=10;b>=-10;b--){
            System.out.println("Интерация цикла " + b);
        }
        System.out.println("Домашнее задание - 2");
        ///Задание 1
        for (int year =1904; year<=2096;year = year + 4){
            System.out.println("Високостный год " + year);
        }
        ///задание 2
        for (int number=7; number<=98 ; number = number+7){
            System.out.println("Число " + number);
        }
        ///задание 3
        for (int numbersMultiplication=1;numbersMultiplication<=512; numbersMultiplication = numbersMultiplication*2){
            System.out.println("число умножения " + numbersMultiplication);
        }
        System.out.println("Домашнее задание - 3");
        ///Задание 1
        int salary= 29000;
        int total=0;
         for (int i=0; i<12;i++){
             ///total=total + total/100; ///Задание 2
             total=total+salary;
             System.out.println("Мессяц " + i + " , сумма накоплений равна " + total);
         }

    }
}