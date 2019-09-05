package br.com.alessanderleite.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import br.com.alessanderleite.api.IpVigilanteClient;

@Configuration
@EnableFeignClients(clients = IpVigilanteClient.class)
public class FeignConfig {

}
