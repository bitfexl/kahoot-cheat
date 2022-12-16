package com.github.bitfexl.kahootcheat.beans;

import com.github.bitfexl.kahootcheat.kahoot.KahootClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Kahoot {
    @Bean
    public KahootClient kahootClientBean() {
        // todo: read password from config
        // login currently not needed
        return new KahootClient("mail", "password");
    }
}
