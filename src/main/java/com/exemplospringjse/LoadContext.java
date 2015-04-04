package com.exemplospringjse;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

/**
 * Respável por inicializar o contexto do Spring
 *
 * @author Fernando Godóy
 */
public class LoadContext {
    
    static Logger LOG = Logger.getLogger(LoadContext.class);

    private static StaticApplicationContext context;
    
    private LoadContext(){
        
    }

    /**
     * Inicia o contexto do Spring
     */
    private static void initContext() {
        LOG.info("Carregando o contexto do spring");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/ApplicationContext.xml");
        autoRegister(applicationContext);
    }

    /**
     * Registra a classe como um sigleton
     * 
     * @param applicationContext
     * @throws BeansException 
     */
    private static void autoRegister(ApplicationContext applicationContext) throws BeansException {
        LOG.info("Registratando contexto como singleton");
        context = new StaticApplicationContext(applicationContext);
        context.registerSingleton("loadContext", LoadContext.class);
    }

    /**
     * Recupera o contexto da aplicação 
     * 
     * @return ApplicationContext
     */
    public static ApplicationContext getContext() {
        initContext();
        return context;
    }

}
