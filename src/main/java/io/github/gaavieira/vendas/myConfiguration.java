package io.github.gaavieira.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class myConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("EXECUTANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }
}


