package dev.karahanyavuzkara.movies;

import me.paulschwarz.springdotenv.DotenvPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class MoviesAppApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment = new StandardEnvironment();
        environment.getPropertySources().addFirst(new DotenvPropertySource());

        SpringApplication app = new SpringApplication(MoviesAppApplication.class);
        app.setEnvironment(environment);
        app.run(args);
    }
}
