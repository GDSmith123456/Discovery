package za.ac.nwu.as.logic;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({TranslatorConfig.class})
@Configuration
@ComponentScan(basePackages = {"flow.impl"})
public class LogicConfig {


}
