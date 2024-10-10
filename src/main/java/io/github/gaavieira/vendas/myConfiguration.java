package io.github.gaavieira.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myConfiguration {

    @Bean(name = "aplicationName")
    public String aplicationName(){
        return "Sistemas de Vendas";
    }
}
