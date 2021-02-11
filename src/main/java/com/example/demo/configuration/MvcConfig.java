package com.example.demo.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

public class MvcConfig {
	@Bean
	public LocaleResolver localeResolver() {
	SessionLocaleResolver sessionLocaleResolver = new
	SessionLocaleResolver();
	sessionLocaleResolver.setDefaultLocale(Locale.FRANCE);
	return sessionLocaleResolver;
	}
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
	LocaleChangeInterceptor localeChangeInterceptor = new
	LocaleChangeInterceptor();
	localeChangeInterceptor.setParamName("language");
	return localeChangeInterceptor;
	}
	public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(localeChangeInterceptor());
	}
}
