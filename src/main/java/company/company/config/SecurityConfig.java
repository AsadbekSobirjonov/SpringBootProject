package company.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("Admin").password(passwordEncoder().encode("1234")).roles("ADMIN")
                .and()
                .withUser("User").password(passwordEncoder().encode("1234")).roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                 csrf().
                 disable().
                 headers().
                 frameOptions().
                 disable()
                 .and().
                 authorizeRequests()
                .antMatchers("bolim/save/**").permitAll()
                .antMatchers("api/post/**").permitAll()
                .antMatchers("api/post").permitAll()
                .anyRequest().authenticated()
                .and().httpBasic();
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
