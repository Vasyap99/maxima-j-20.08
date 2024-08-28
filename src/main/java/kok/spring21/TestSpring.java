package kok.spring21;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kok.spring21.repo.*;
import kok.spring21.models.*;
import kok.spring21.service.*;

import java.util.Scanner;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        /*BeanPlayer p=context.getBean("beanPlayer",BeanPlayer.class);
        p.playBean();

        BeanPlayer p1=context.getBean("beanPlayer",BeanPlayer.class);
        p1.playBean();

        System.out.println(p.getB());//при Singleton TestBean  одиналовые значения
        System.out.println(p1.getB());
        //System.out.println(tb.getName());
        */

        BookService bookService=context.getBean("bookService",BookService.class);

        bookService.save(Book.builder()
                             .name("Evgenij Onegin")
                             .author("Pushkin")
                             .build() 
        );
        bookService.save(Book.builder()
                             .name("Mzyri")
                             .author("Lermontov")
                             .build() 
        );

        Scanner s=new Scanner(System.in);
        int id=0;
        Book b=null;
        String n=null,a=null;
        while(true){
            System.out.println("-".repeat(50));
            System.out.println(bookService.toString());
            System.out.println("<Enter command: C R U D, E for exit>");
                String i=s.nextLine();
                switch(i){
                    case "C":
                        System.out.println("-Enter name:");
                        n=s.nextLine();
                        System.out.println("-Enter author:");
                        a=s.nextLine();
                        bookService.save(Book.builder()
                             .name(n)
                             .author(a)
                             .build() 
                        );
                        break;
                    case "R":
                        System.out.println("-Enter id:");
                        id=Integer.parseInt(s.nextLine());
                        b=bookService.getBookById(id);
                        System.out.println(b!=null ? b.toString() : "null");
                        break;
                    case "U":
                        System.out.println("-Enter id:");
                        id=Integer.parseInt(s.nextLine());
                        System.out.println("-Enter name:");
                        n=s.nextLine();
                        System.out.println("-Enter author:");
                        a=s.nextLine();
                        bookService.updateBook(new Book(id,n,a));                        
                        break;
                    case "D":
                        System.out.println("-Enter id:");
                        id=Integer.parseInt(s.nextLine());
                        bookService.deleteBook(id);                       
                        break;
                    case "E":
                        context.close();
                        return;
                    default:
                        ;
                }
        }

        //context.close();
    }
}
