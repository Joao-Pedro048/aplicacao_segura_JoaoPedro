package application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.Configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.noOpPasswordEnconder;
import org.springframework.security.web.securityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .anyRequest().authenticated();
        http
                .formLogin();

        return http.build();
    }
    @SuppressWarnings("deprecation")
    @Bean
    public noOpPasswordEnconder passwordEnconder() {
        return (noOpPasswordEnconder) noOpPasswordEnconder.getInstance();
    }
}