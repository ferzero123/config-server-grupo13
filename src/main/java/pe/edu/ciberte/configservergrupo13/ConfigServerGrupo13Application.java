package pe.edu.ciberte.configservergrupo13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerGrupo13Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGrupo13Application.class, args);
    }

}
