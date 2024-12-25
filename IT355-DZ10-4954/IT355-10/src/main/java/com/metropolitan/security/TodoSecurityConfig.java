package com.metropolitan.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class TodoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("user").password("user").authorities("USER")
                .and()
                .withUser("admin").password("admin").authorities("USER", "ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST, "/todos/delete/*").hasAuthority("ADMIN")
                .antMatchers("/todos*").hasAuthority("USER")
                .and()
                .anonymous()
                .and()
                .servletApi()
                .and()
                .securityContext()
                .and()
                .exceptionHandling()
                .and()
                .rememberMe()
                .and()
                .formLogin()
                .loginPage("/login.jsp")
                .loginProcessingUrl("/login")
                .failureUrl("/login.jsp?error=true")
                .defaultSuccessUrl("/todos")
                .permitAll()
                .and()
                .logout().logoutSuccessUrl("/logout-success.jsp")
                .and()
                .headers()
                .and()
                .csrf();

    }

}
