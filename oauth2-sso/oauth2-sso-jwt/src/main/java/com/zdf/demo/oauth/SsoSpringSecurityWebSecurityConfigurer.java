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
 * ������֤֮ǰ��Ҫ��У���û����˻������Ƿ���ȷ����������������WebSecurityConfig����
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
    spring security ��ͨ��ResourceSecurityConfiguration��������ִ��
    ����ִ��webSecurityConfiguration�����ã�����Ҫ�滮�ò�ͬ�ϵ��Ӧ�Ĺ���������ͻ����Ҫ�����滮�á�
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
	// ������û��password grant_type
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
}
