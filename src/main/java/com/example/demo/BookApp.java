package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static  void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean done =false;
        String result ="";
       //
        // Integer x = 0;
        ArrayList<Book> allbooks = new ArrayList<>();
        Book aBook;

        while (done !=true){
            //x++;
        aBook = new Book();
          System.out.println("Enter Book Titile ");
          aBook.setTitle(keyboard.nextLine());
          System.out.println("Enter Book Author ");
          aBook.setAuther(keyboard.nextLine());
          System.out.println("Enter Book Description ");
          aBook.setDescription(keyboard.nextLine());
          System.out.println("Enter Book Price ");
          aBook.setPrice(keyboard.nextDouble());
          keyboard.nextLine();
            System.out.println("Enter Book is in Stock , Enter false or true");
            aBook.setInStock(keyboard.nextBoolean());
            keyboard.nextLine();

          allbooks.add(aBook);
 //System.out.println(aBook);

            System.out.print("Do you want to go again? (Y)");
            result = keyboard.nextLine();
            if (result.equalsIgnoreCase("Y")){
                done = false;
            }else
                done=true;

        }

        System.out.println(" The loop is over.print the ArrayList");
       // System.out.println(allbooks);
        for (Book eachBooks :allbooks){

            // System.out.print(eachBooks.getAuther()+" " +eachBooks.getTitle()+"  "+eachBooks.getDescription());
            eachBooks.getDisplayText();
        }



    }

}
