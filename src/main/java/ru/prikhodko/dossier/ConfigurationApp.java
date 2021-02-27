package ru.prikhodko.dossier;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("ru.prikhodko.dossier.dao")
public class ConfigurationApp {
}
