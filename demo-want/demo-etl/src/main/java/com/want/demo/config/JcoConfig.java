package com.want.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "demo.jco")
public class JcoConfig {

	private String ashost;
	private String lang;
	private String passwd;
	private String sysnr;
	private String client;
	private String pool_capacity;
	private String user;
	private String peak_limit;
	
	
	public String getAshost() {
		return ashost;
	}
	public void setAshost(String ashost) {
		this.ashost = ashost;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSysnr() {
		return sysnr;
	}
	public void setSysnr(String sysnr) {
		this.sysnr = sysnr;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getPool_capacity() {
		return pool_capacity;
	}
	public void setPool_capacity(String pool_capacity) {
		this.pool_capacity = pool_capacity;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPeak_limit() {
		return peak_limit;
	}
	public void setPeak_limit(String peak_limit) {
		this.peak_limit = peak_limit;
	}
}
