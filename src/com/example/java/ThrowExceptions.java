package com.example.java;

public class ThrowExceptions {
    public static void main(String[] args) {

        // How to structure the error handling. Using Throw and catch Exception.
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try{
            if(chars.length < 10){ // to generate your own exception
                throw (new Exception("My custom message"));
            }
            char lastChar = chars[chars.length -1];
            System.out.println("Substring: " + lastChar);

            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index problem");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String index problem");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
