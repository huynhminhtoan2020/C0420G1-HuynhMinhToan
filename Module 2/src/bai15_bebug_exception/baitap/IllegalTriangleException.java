package bai15_bebug_exception.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException (String message){super(message);}

    @Override
    public String getMessage() {
        return  " nhap lai canh cho tam giac " + super.getMessage();
    }
}
