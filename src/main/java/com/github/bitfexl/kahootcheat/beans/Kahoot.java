package com.github.bitfexl.kahootcheat.beans;

import com.github.bitfexl.kahootcheat.kahoot.KahootClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Kahoot {
    @Bean
    public KahootClient kahootClientBean() {
        // todo: read password from config
        return new KahootClient("vuoesnknhbwhrkmahr@tmmbt.net", "vuoesnknhbwhrkmahr@tmmbt.net");
    }
}
