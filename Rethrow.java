package com.company;

public class Rethrow {
    public static void genException(){
        int numer3[]={4,8,16,32,64,128,256,512};
        int denom3[] = {2,0,4,4,0,8};

        for(int i=0; i<numer3.length; i++){
            try{
                System.out.println(numer3[i] + "/" + denom3[i] + " = "+numer3[i]/denom3[i]);
            }
            catch (ArithmeticException exc){
                System.out.println("Попытка деления на нуль "); //перехват подкласса
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Соответствующий элемент не найден"); // Перехват суперкласса
                throw exc; //Повторно сгенерировать исключение
            }
        }
    }
}
