package cn.zenghome.bbs.configuration;

import cn.zenghome.bbs.model.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private UserService userService;

    private SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/", "*.html", "*.css", "*.js", "*.jpg", "*.png")
                    .permitAll()
                    .anyRequest()
                    .authenticated()
                    .and()
                .formLogin()
                    .loginPage("/v2/login")
                    .usernameParameter("username")
                    .passwordParameter("password")
                    ;
    }

    @Override
    protected UserDetailsService userDetailsService() {
        return userService;
    }
}
