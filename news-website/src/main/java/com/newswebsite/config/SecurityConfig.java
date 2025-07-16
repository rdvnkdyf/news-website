package com.newswebsite.config;


import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.newswebsite.service.impl.UserSecurityService;
import com.newswebsite.utility.SecurityUtility;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private Environment env;
	
	@Autowired
	private UserSecurityService userSecurityService;
	
	
	private BCryptPasswordEncoder passwordEncoder() {
		return SecurityUtility.passwordEncoder();
		
	}
	
	
	private static final String[] PUBLIC_MATCHERS = {
			
		
			"/assets/css/owl.carousel.min.css",
			"/assets/css/owl.theme.default.min.css",
			"/assets/css/magazinize-newspaper.css",
		     
			"/assets/css/plyr.css",
			"/assets/css/bootstrap.min.css",
			"/assets/css/style.css",
			
			"/assets/js/jquery.min.js",
			"/assets/js/owl.carousel.min.js",
			"/assets/js/bootstrap.bundle.min.js",
			"/assets/js/magazinize.js",
			"/assets/js/plyr.js",
			"/assets/js/538d9daa14.js",
		
		
			
			"/assets/banners/**",
			"/assets/magazinize/**",
			"/assets/avatar/**",
			"/assets/img/**",
			"/assets/1-1/**",
			"/assets/5-3/**",
			
			"/",
			"/newUser",
			"/myAccount",
			"/myProfile",
			"/contact",
			"/contact/add",
			"/about",
			"/forgetPassword",
			"/login",
			"/newsDetail"
			
			
	};

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests().
		/*	antMatchers("/**").*/
			antMatchers(PUBLIC_MATCHERS).
			permitAll().anyRequest().authenticated();

		http
			.csrf().disable().cors().disable()
			.formLogin().failureUrl("/login?error")
			.loginPage("/login").defaultSuccessUrl("/",true).permitAll()
			.and()
			.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/?logout").deleteCookies("remember-me").permitAll()
			.and()
			.rememberMe();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
		
	}
	
	
}
