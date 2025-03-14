import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //alt + enter = импорт библиотеки
        //Scanner scanner = new Scanner(System.in);
        //  System.out.printf("name");
        //  scanner.nextLine();
        //1)  Напишите программу, которая проверяет день недели по его номеру (1 — Понедельник, 2 — Вторник и т.д.) и выводит название дня недели.
      /*  byte num =7;
        switch (num){
            default:
                System.out.println("Нет такого дня недели !");
                break;
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
                }
       */
        //int s= 1;
        // if (s<=1||s<=2||s<=3||s<=4||s<=5||s<=6||s<=7){

        //   }

        //2)  Напишите программу, которая проверяет, какой месяц по номеру введен пользователем (1 — Январь, 2 — Февраль и т.д.) и выводит его название.
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Какой сегодня месяц : ");
        int num2 = scanner.nextInt();
        switch (num2){
            default:
                System.out.println("Нет такого месяца !");
                break;
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
}

        */

        //3)  Напишите программу, которая проверяет номер счета (от 1 до 5) и выводит текст "Выбран первый счет", "Выбран второй счет" и так далее, в зависимости от номера.
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Номер счета : ");
        int num2 = scanner.nextInt();
        switch (num2) {
            default:
                System.out.println("Нет такого счета !");
                break;
            case 1:
                System.out.println("Выбран первый счет");
                break;
            case 2:
                System.out.println("Выбран второй счет");
                break;
            case 3:
                System.out.println("Выбран третий счет");
                break;
            case 4:
                System.out.println("Выбран четвёртый счет");
                break;
            case 5:
                System.out.println("Выбран пятый счет");
                break;
        }

        */
        //4)  Напишите программу, которая принимает на вход оценку (целое число от 1 до 5) и выводит соответствующую строку: "Неудовлетворительно", "Удовлетворительно", "Хорошо", "Отлично".
        /* Scanner scanner = new Scanner(System.in);
        System.out.print("Отценка : ");
        int num2 = scanner.nextInt();
        switch (num2) {
            default:
                System.out.println("Нет такой отценки !");
                break;
            case 1:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
        }

         */
        //5)  Напишите программу, которая проверяет введенную букву (A-Z) и выводит сообщение о том, является ли она гласной (A, E, I, O, U, Y) или согласной.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("буква : ");
        String input = scanner.next();
        char character = input.charAt(0);
        switch (character) {
            default:
                System.out.println("y - ОТНОСИТСЯ И К ГЛАСНЫМ И СОГЛАСНЫМ! ");
                break;
            case 'B','C','D','F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X',  'Z':
                System.out.println("Согласный");
                break;
            case 'A', 'E', 'I', 'O', 'U':
                System.out.println("Гласные");
                break;

        }

         */
        //6)  Напишите программу, которая по введенному символу определяет его тип: цифра, буква или специальный символ.
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ : ");
        String input = scanner.next();
        char character = input.charAt(0);
        String input1 = scanner.next();
        switch (character) {
            default:
                System.out.println("специальный символ!");
                break;
            case 'A', 'E', 'I', 'O', 'U', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S',
                 'T', 'V', 'W', 'X', 'Z':
                System.out.println("Буква");
                break;
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.println("Цыфра");
                break;
        }

        */
        //7)  Напишите программу, которая выводит название операционной системы в зависимости от введенного кода: 1 — Windows, 2 — Linux, 3 — macOS.
        /*Scanner scanner = new Scanner(System.in);
        System.out.print(" код : ");
        int num2 = scanner.nextInt();
        switch (num2) {
            default:
                System.out.println("Нет такой опреционной системы !");
                break;
            case 1:
                System.out.println("Windows");
                break;
            case 2:
                System.out.println("Linux");
                break;
            case 3:
                System.out.println("macOS");
                break;
        }

         */
        //8)  Напишите программу, которая по введенному возрасту (в годах) выводит категорию человека: "Ребенок", "Подросток", "Взрослый", "Пожилой".
       /* Scanner scanner = new Scanner(System.in);
        System.out.print(" age : ");
        int num2 = scanner.nextInt();
        switch (num2) {
            default:
                System.out.println("Редко кто до таких лет доживает !");
                break;
            case 1,2,3,4,5,6,7,8,9,10,11:
                System.out.println("Ребенок");

                break;
            case 12,13,14,15,16,17,18,19:
                System.out.println("Подросток");
                break;
            case 20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56:
                System.out.println("Взрослый");
                break;
            case 57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90:
                System.out.println("Пожилой");
                break;}

        */
        //9)  Напишите программу, которая по введенному числу месяца (от 1 до 12) выводит сезон года: "Зима", "Весна", "Лето", "Осень".
        /* Scanner scanner = new Scanner(System.in);
        System.out.print(" число месяца : ");
        int num2 = scanner.nextInt();
        switch (num2) {
            default:
                System.out.println("Нет такого месяца  !");
                break;
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
        }

         */
        //10) Напишите программу, которая по введенному коду валюты (USD, EUR, GBP) выводит название валюты на русском языке: "Доллар США", "Евро", "Британский фунт".
       /* Scanner scanner = new Scanner(System.in);
        System.out.print(" Валюта : ");
        String  num2 = scanner.nextLine();
        switch (num2) {
            default:
                System.out.println("Нет такой валюты !");
                break;
            case"USD":
                System.out.println("Доллар США");
                break;
            case"EUR":
                System.out.println("Евро");
                break;
            case"GBP":
                System.out.println("Британский фунт");
                break;

        }
        */
        Scanner scanner = new Scanner(System.in);
        //1  Вывести числа от 10 до 1 в обратном порядке.
//for (int i = 10; i >=1; i--) {
        //          System.out.print( i+  " ");
        //     }
        //2  Вывести все нечётные числа от 1 до 50.
        //   for (int i = 1; i <=50;i+=2){
        //       System.out.print(i+ " ");}

        //3  Посчитать сумму всех чётных чисел от 1 до N.
        //  System.out.print("Введите число :");
        //  int num= scanner.nextInt();
        // int num1= 0;
        // for (int i = 1; i <=num; i++) {
        //    if(i%2==0){
        //        num1=num1+i;
        //    }//0=0+1
        //}    //1=1+2
        // System.out.print(num1);
        //4  Найти количество чисел, кратных 5, в диапазоне от 1 до 100.
        //for (int i = 1; i <=100 ; i++) {
        //  if(i%5==0){
        //    System.out.print(i+ " ");}
        //  }
        //5  Вывести квадраты чисел от 1 до 10.
        //for (int i = 1; i <=10 ; i++) {
        //    System.out.println(i+ "=" +i*i);
        //}
        //6  Вывести числа  от 1 до N.  Посчитать сколько там
        //   -четных
        //  System.out.print("Введите число : ");
        // int x = scanner.nextInt();
        //   for (int i = 1; i <=x ; i++) {
        //     if (i % 2 == 0) {
        //       System.out.print(i + " ");}
        // }
        //   -нечетных
        //  System.out.print("Введите число : " );
        //  int x = scanner.nextInt();
        //  for (int i = 1; i <=x; i++) {
        //      if(i%2>0){
        //       System.out.print(i+ " ");
        //    }
        // }
        //   -деляться без остатка на 5 и на 6
        // System.out.print("Введите число : " );
        // int x = scanner.nextInt();
        //int y=0;
        //for (int i = 1; i <=x; i++) {
        //  if(i%5==0 && i%6==0){
        //    System.out.print(i+" ");
        //  }
        // }
        //   -деляться без остатка на 2 и на 3
        //    System.out.print("Введите число : " );
        //int x = scanner.nextInt();
        //for (int i = 1; i <=x; i++) {
        //if(i%2==0 && i%3==0){
        //System.out.print(i+" ");}
        // }

        //   -деляться без остатка на 2 или на 10
//         System.out.print("Введите число : " );
//         int x = scanner.nextInt();
//         for (int i = 1; i <=x; i++) {
//           if(i%2==0 || i%10==0){
//             System.out.print(i+" ");
//         }
//         }
        //   -деляться без остатка на 2 или на 4
        //    System.out.print("Введите число : " );
        //  int x = scanner.nextInt();
        //  for (int i = 1; i <=x; i++) {
        //     if(i%2==0 || i%4==0){
        //       System.out.print(i+" ");}
        //}
        //   -деляться без остатка на 7 и на 3
        //   System.out.print("Введите число : " );
        //  int x = scanner.nextInt();
        // for (int i = 1; i <=x; i++) {
        //   if(i%7==0 && i%3==0){
        //     System.out.print(i+" ");}
        //}
        //7  Вывести числа от 1 до 100, которые делятся на 3 без остатка.
//          for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.print(i + " ");
//            }
//        }
        //8  Вывести сумму чисел от 1 до 50.
//        int x=0;
//        for (int i = 1; i <= 50; i++) {
//                x=x+i;
//            }System.out.print( x + " ");
//
//

        //9  Вывести все числа от 1 до N в одну строку через пробел.
//        System.out.print("Введте число :");
//        int x = scanner.nextInt();
//        for (int i = 1; i <=x; i++) {
//            System.out.print(i +" ");
//
//        }
        //10 Вывести произведение чисел от 1 до N.
//        System.out.print("Введте число :");
//        int x = scanner.nextInt();
//        int y = 0;
//        for (int i = 1; i <= x; i++) {
//            y = i * i;
//
//        }System.out.print(y+" ");

            //11 Найти количество чисел от 1 до N, которые делятся на 2 или 5.
//        System.out.print("Введте число :");
//        int x = scanner.nextInt();
//        for (int i = 1; i <=x; i++) {
//            if(i%2==0||i%5==0){
//                System.out.print( i+" ");
//            }
//
            //        };
            //12 Вывести сумму чисел от 1 до N.
//        System.out.print("Введте число :");
//        int x = scanner.nextInt();
//        int y =0;
//        for (int i = 1; i <= x; i++) {
//            y=i+i;
//            }
//        System.out.print(y);


    }
}



















