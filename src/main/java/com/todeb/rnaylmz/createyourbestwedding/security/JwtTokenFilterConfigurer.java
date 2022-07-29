package com.todeb.rnaylmz.createyourbestwedding.security;

import com.sun.org.apache.xerces.internal.parsers.SecurityConfiguration;

public class JwtTokenFilterConfigurer extends SecurityConfiguration {

    private JwtTokenProvider jwtTokenProvider;

    public JwtTokenFilterConfigurer(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        JwtTokenFilter customFilter = new JwtTokenFilter(jwtTokenProvider);
        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
