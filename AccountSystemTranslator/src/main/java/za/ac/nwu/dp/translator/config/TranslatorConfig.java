package za.ac.nwu.dp.translator.config;

import org.apache.maven.model.Repository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RepositoryConfig.class})
@ComponentScan(basePackages = "za.ac.nwu.dp")
@Configuration
public class TranslatorConfig{

}