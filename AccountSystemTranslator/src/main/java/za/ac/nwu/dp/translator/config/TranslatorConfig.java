package za.ac.nwu.dp.translator.config;

import org.apache.maven.model.Repository;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RepositoryConfig.class})
@Configuration
public class TranslatorConfig{

}