package com.zdf.demo.oauth;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 我们认证之前需要先校验用户的账户密码是否正确，所以我们先配置WebSecurityConfig拦截
 * @author 00291315
 *
 */
@Resource
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SsoSpringSecurityWebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Autowired
	private SsoUserDetailsService userDetailsService;
	
	 /*
    spring security 先通过ResourceSecurityConfiguration的配置先执行
    ，再执行webSecurityConfiguration的配置，所以要规划好不同断点对应的过滤链不冲突，需要清晰规划好。
     */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 http.formLogin()
	         .loginPage("/login")
	         .and()
	         .authorizeRequests()
	         .antMatchers("/login","/index").permitAll()
	         .anyRequest()
	         .authenticated()
	         .and().csrf().disable().cors();
		    
		
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
	// 不定义没有password grant_type
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
}
