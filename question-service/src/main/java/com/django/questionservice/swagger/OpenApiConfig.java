package com.django.questionservice.swagger;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "EDOUGA JEAN PATRICK",
                        email = "edougajean@gmail.com"
                ),
                description = "OpenApi documentation for app natamon",
                title = "OpenApi specification - EDOUGA",
                version ="1.0",
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local Dev",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "Prod Dev",
                        url = "http://localhost:8081"
                )
        }
)
public class OpenApiConfig {
}
