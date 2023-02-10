package ejemploWeb.web.controladores;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;
import ejemploWebClase.aplicacion.AplicacionConfiguracionContexto;
import ejemploWebClase.web.WebConfiguracionContexto;
import ejemploWebClase.web.controladores.ControladorSegunda;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AplicacionConfiguracionContexto.class, WebConfiguracionContexto.class})
@WebAppConfiguration
public class ControladorSegundaTest {

	@Autowired
	private ControladorSegunda controladorSegunda;
	
	@Test
	public void testHandleRequestView() {
		ModelAndView modelAndView = controladorSegunda.gestionSolicitud();
	
		assertEquals("segunda.jsp", modelAndView.getView());
	}
	
}
