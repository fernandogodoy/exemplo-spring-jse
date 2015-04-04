package com.exemplospringjse;

import org.springframework.context.ApplicationContext;


/**
 *
 * @author Fernando Godóy
 */
public class Principal {
        
    public static void main(String[] args) {
        ApplicationContext context = LoadContext.getContext();
        TestDependecyInjection teste  = context.getBean(TestDependecyInjection.class);
        teste.testaInjecao();
    }
    
  
}
