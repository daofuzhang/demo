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
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * ������֤֮ǰ��Ҫ��У���û����˻������Ƿ���ȷ����������������WebSecurityConfig����
 * @author 00291315
 *
 */
@Resource
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MallSpringSecurityWebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Autowired
	private MallUserDetailsService userDetailsService;
	
	 /*
    spring security ��ͨ��ResourceSecurityConfiguration��������ִ��
    ����ִ��webSecurityConfiguration�����ã�����Ҫ�滮�ò�ͬ�ϵ��Ӧ�Ĺ���������ͻ����Ҫ�����滮�á�
     */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*
		http    // ���õ�½ҳ/login���������
                 .formLogin().permitAll()
		         // �ǳ�ҳ
		         .and().logout().logoutUrl("/logout").logoutSuccessUrl("/")
		         .and().authorizeRequests().antMatchers("/oauth/**").permitAll()
		         // ������������ȫ����Ҫ��Ȩ��֤
		         .and().authorizeRequests().anyRequest().authenticated()
		         // ����ʹ�õ���JWT���������ﲻ��Ҫcsrf
		         .and().csrf().disable(); 
		         */
        http
        .antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/oauth/**",
        		"/user",
                "/v1.1/**",
                "/v1.0/**",
                "/open/**") //
        .permitAll()//  ��webSecurityConfiguration������Ҫweb����֤
        .and()
        .authorizeRequests()
        .anyRequest().authenticated()//��������ģ��κ�����Ҫ��֤
        .and()
        .csrf().requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize")).disable()
        .sessionManagement().maximumSessions(1);//  ���Ự������
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
