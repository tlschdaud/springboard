package org.koreait.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.build();
    }

    public WebSecurityCustomizer webSecurityCustomizer() {
        return w-> w.ignoring().requestMatchers("/css/**", "/js/**", "/images/**", "/errors/**");
    }
}
