package ejemploWebClase.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfiguracionContexto {

	/**
	 * 
	 * Lo que hace es que en el controlador de las vistas
	 * no sea necesario poner la ruta, sino el nombre de la
	 * vista.
	 */
	@Bean
	public ViewResolver mapeo() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/vistas/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
