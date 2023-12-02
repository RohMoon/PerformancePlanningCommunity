package moon.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springOpenAPi() {
        final Info info = new Info()
                .title("PerformancePlanningCommunity")
                .description("it Rest API All of")
                .version("v1.0");
        return new OpenAPI().info(info);
    }
}
