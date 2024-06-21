package backend.backend.app.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "backend.backend.app.repositories")
public class JpaConfig {
}
