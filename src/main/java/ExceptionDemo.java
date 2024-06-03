package main.java;

public class ExceptionDemo {
    public static void main(String[] args) {
        try
        {
            System.out.println("try block");

            throw new NullPointerException("NullPointerException occured");
        }
        catch (NullPointerException e)
        {
            System.out.println("catch block 1");

            throw new NumberFormatException("NumberFormatException occurred");
        }
        catch (NumberFormatException e)
        {
            System.out.println("catch block 2");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}
