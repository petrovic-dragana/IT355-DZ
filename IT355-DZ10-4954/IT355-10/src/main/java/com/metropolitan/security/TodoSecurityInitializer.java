package com.metropolitan.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class TodoSecurityInitializer
        extends AbstractSecurityWebApplicationInitializer {

    public TodoSecurityInitializer() {
        super(TodoSecurityConfig.class);
    }
}

