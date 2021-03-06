package pl.reaktor.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception{
	//nieuwierzytelnione dla poniższych url "/"
		http.authorizeRequests()
	.antMatchers("/").permitAll()
	//uwierzytelnione dla każdego innego adresu url
	.anyRequest().authenticated()
	//korzystamy z dostępnego formularza logowania
	.and().formLogin().loginPage("/logowanie")
	//to action z formularza
	.loginProcessingUrl("/processLogin").permitAll()
	//wylogowywanie .adres do wylogowania .adres na ktory sie przenosimy
	.and().logout().logoutUrl("/logout").logoutSuccessUrl("/").permitAll();
	}
}
