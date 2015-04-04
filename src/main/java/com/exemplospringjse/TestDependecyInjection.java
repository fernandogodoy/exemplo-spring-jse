package com.exemplospringjse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author Fernando Godóy
 */
@Component
public class TestDependecyInjection {
        
    Logger LOG = Logger.getLogger(TestDependecyInjection.class);
    
    public void testaInjecao(){
       LOG.info("Injeção de dependência funcionando com sucesso");
    }
}
