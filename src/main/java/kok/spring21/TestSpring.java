package kok.spring21;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kok.spring21.repo.*;
import kok.spring21.models.*;
import kok.spring21.service.*;


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


        System.out.println(bookService.toString());
        context.close();
    }
}
