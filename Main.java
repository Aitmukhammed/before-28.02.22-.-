package com.company;
import Exception_handling.ExcTest_Exception;



import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String args[])
            throws java.io.IOException {
        Integer esep = new Integer();

//        esep.intE1();
//        esep.intE2();
//        esep.intE3();
//        esep.intE4();
//        esep.intE5();
//        esep.intE6();
//        esep.intE7();
//        esep.intE8();
//        esep.intE9();
//        esep.intE10();
//        esep.intE11();
//        esep.intE12();
//        esep.intE13();
//        esep.intE14();
//        esep.intE15();
//        esep.intE16();
//        esep.intE17();
//        esep.intE18();
//        esep.intE19();
//        esep.intE20();
//        esep.intE21();
//        esep.intE21();
//        esep.intE23();
//        esep.intE24();
//        esep.intE25();


//В данном примере программы исключение ArithmeticException генерируется
// при попытке деления на нуль, а исключение ArrayindexOutOfBoundsException -
// при попытке обращения за пределы массива chrs. Оба исключения перехватываются одной инструкцией catch
//Практика 11   - Обр.И

// Создание подклассов, призводных от класса Exception
// Обр.И    Практика - 11  NoIntResultExseption
        int numer5[] = {4,8,16,32,64,128,256,512};
        int denom5[] = {2,0,4,4,0,8};
        for (int i=0; i<numer5.length; i++){
            try{
                if((numer5[i]%2) !=0)
                    throw new NoIntResultException(numer5[i],denom5[i]);
                System.out.println(numer5[i]+" / "+denom5[i]+" равно " + numer5[i]/denom5[i]);
            }catch (ArithmeticException e){
                System.out.println("Попытка деления на нуль");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Соответствующий эл не найден");
            }catch (NoIntResultException e) {
                System.out.println(e);
            }
        }
        System.out.println();
        System.out.println();


// Практика - 12     Обр.И
        UseFinally.genException3(2);
        System.out.println();
        System.out.println();


        int a=88, b=0;
        int result;
        int chrs[] = {'A','B','C'};

        for(int i=0; i<2; i++){
            try{
                if(i==0)
                    result = a/b;
                else
                    chrs[5]='X';
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Перехваченное исключение: "+e);
            }
        }
        System.out.println();
        System.out.println();

// Практика  - 10 Обр.И
        try{
            ExcTest2.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("Стек вызовов: ");
            exc.printStackTrace(); //запись последовательности методов
        }
        System.out.println();

// Практика  - 9 Обр.И
        int numer4[] = {4,8,16,32,64,128,256,512};
        int denom4[] = {2,0,4,4,0,8};

//Практика  - 8  Обр.И   - Rethrow ( Повторное генерирование исключений-- )
        try{
            Rethrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Фатальная ошибка - " +"выполнение программы прервано\n\n");
        }


// Практика - 7 Обр.И   - Генерирование исключений (вручную (throw) )
        try{
            System.out.println("До инструкци throw");
            throw new ArithmeticException(); //класс, производный от класса Throwable или RunTimeException;
        }
        catch (ArithmeticException exc){ //Перехват исключения
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try/catch\n\n");

// Практика - 6 Обр.И   - Перехват исключений,
//генерируемых подклассами  -  ( throw )
        int numer3[]={4,8,16,32,64,128,256,512};
        int denom3[] = {2,0,4,4,0,8};

            for(int i=0; i<numer3.length; i++){
                try{
                    System.out.println(numer3[i] + "/" + denom3[i] + " = "+numer3[i]/denom3[i]);
                }
                catch (ArithmeticException exc){
                    System.out.println("Попытка деления на нуль\n\n "); //перехват подкласса
                }
                catch (Throwable exc){
                    System.out.println("Возникла исключение"); // Перехват суперкласса
                }
            }


// Практика - 5 Обр.И   -  Вложение блоки ( TRY )
        int numer2[]={4,8,16,32,64,128,256,512};
        int denom2[] = {2,0,4,4,0,8};

        try {
            for(int i=0; i<numer2.length; i++){
                try{ //Внутрений блок try
                    System.out.println(numer2[i] + "/" + denom2[i] + " = "+numer2[i]/denom2[i]);
                }
                catch (ArithmeticException exc){
                    System.out.println("Попытка деления на нуль");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Соответствующий элемент не найден");
            System.out.println("Фатальная ошибка - выполнение программы прервано\n\n");
        }

// Практика - 4 Обр.И  - Множественные блоки ( catch )
        int numer[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,4,0,8};

        for(int i=0; i<numer.length; i++){
            try{
                System.out.println(numer[i] + "/" + denom[i] + " = "+numer[i]/denom[i]);
            }
            catch (ArithmeticException exc){
                System.out.println("Попытка деления на нуль!");// 8, 64 не делятся на нуль
            }
            catch(ArrayIndexOutOfBoundsException exc){ //256, 512 Выход за пределы массива
                System.out.println("Соответсвующий элемент не найден");
            }
        }
        System.out.println();

// Практика - 3 Обр.И
        int nums2[] = new int[8];
        try {
            nums2[9]=10;
        } catch (ArithmeticException exc){
            System.out.println("Выход за пределы массива");
        }

// Практика - 2 Класс ExcTest_Exception(Обр.И)
        try{
            ExcTest_Exception.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Ошибка устранено");
        }
        System.out.println("После инст.. catch\n");


// Практика - 1 Обработка исключений
        int nums[] = new int[4];try{
            System.out.println("До генерации исключения");
            nums[7]=10;
            System.out.println("Это строка не будет отображаться");
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Выход за пределы массива! ");
        }
        System.out.println("После инструкции catch");

    }



    }
