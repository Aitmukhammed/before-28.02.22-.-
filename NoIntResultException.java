package com.company;

public class NoIntResultException extends Exception{
    int n;
    int d;

    NoIntResultException(int i, int j){
        n=i;
        d=j;
    }
    public String toString(){
        return "Результат операции "+n+" / "+d+" не является целым числом";
    }
}
