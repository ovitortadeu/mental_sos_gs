package br.com.mental_sos.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfiguration {
	
	@Bean
	OpenAPI configurarSwagger() {
		
		return new OpenAPI().info(new Info()
											.title("Projeto de chat interativo para calamidades")
											.description("Este projeto oferece uma implementação que possibilita "
													+ "que psicólogos possam se conectar com pessoas que sofreram por "
													+ "conta de calamidades climáticas")
											.summary("Sumário: Este projeto oferece uma implementação que possibilita"
													+ " uma conversa entre psicólogos e vitimas de desastres naturais")
											.version("v1.0.0")
											.license(new License().url("www.mentalsos.com.br")
																  .name("Licença - Projeto de chat interativo para calamidades - v1.0.0"))
											.termsOfService("Termos de Serviço"));
		
	}

}
