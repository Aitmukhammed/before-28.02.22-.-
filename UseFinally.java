package com.company;

public class UseFinally {
    public static void genException3(int what){
        int t;
        int nums[] = new int[2];

        System.out.println("Плоучено: "+what);
        try{
            switch (what){
                case 0:
                    t = 10/what; //сгенерировать ошибку деления на ноль
                    break;
                case 1:
                    nums[4]=4; //сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; //возврат из блока try
            }
        }
        catch (ArithmeticException exc){
            System.out.println("Попытка деления на нуль");
            return; //Возврат из блока catch
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Соответствующий элемент не найден");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }

}
