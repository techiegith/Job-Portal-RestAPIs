//package com.telusko.springbootrest.Config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//
//public class SecurityConfig {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public AuthenticationProvider authProvide(){
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//
//        provider.setUserDetailsService(userDetailsService);
//        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
//        return provider;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.csrf(customizer -> customizer.disable());
//        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
////        http.formLogin(Customizer.withDefaults());
//        http.httpBasic(Customizer.withDefaults());
//        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//        return http.build();
//    }
//
//
//
//
////    @Bean
////    Spring by deafalut use the userDetailsService,it uses this class to basically check t
////    application properties inwant to def
////
////
////
////    ne my own userdetservi
//// bean return the object of uds so basically i want to return the object
////    of uds  this particular object to get the data for the user and whatever the dta you return on this this the data is our actual data
//
////    public UserDetailsService userDetailsService(){
////
////        UserDetails user = User
////                            .withDefaultPasswordEncoder()
////                            .username("shruti")
////                            .password("s@123")
////                            .roles("USER")
////                            .build();
////
////        UserDetails admin = User
////                .withDefaultPasswordEncoder()
////                .username("navin")
////                .password("n@987")
////                .roles("ADMIN")
////                .build();
////
////        return new InMemoryUserDetailsManager(user,admin);
//
////    }
//}
