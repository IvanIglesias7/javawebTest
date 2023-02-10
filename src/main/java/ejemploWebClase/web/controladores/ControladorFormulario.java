package ejemploWebClase.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ejemploWebClase.POJO.cliente;

@Controller
public class ControladorFormulario {

    protected final Log logger = LogFactory.getLog(getClass());
    List<cliente> listaClientes = new ArrayList<cliente>();

	@RequestMapping(value="/navegacionFormulario")
    public String navegacionFormulario(Model modelo) {
        
		logger.info("Navegamos al formulario");
        cliente cliente = new cliente();
        modelo.addAttribute("clienteV", cliente);
        return "formulario";
    } 
    //@PostMapping("/guardarAlumno")
    //public String guardarAlumno(@ModelAttribute("alumnoV") Alumno alumnoV) {
    @RequestMapping(value="/guardarCliente",method = RequestMethod.POST)
    public ModelAndView guardarCliente(@ModelAttribute("clienteV") cliente clienteV){
    	logger.info("Navegamos al guardar alumno");
    	Map<String, Object> modeloClientes = new HashMap<String, Object>();
    	
    	listaClientes.add(clienteV);  
    	
        modeloClientes.put("listaClientes", listaClientes);
    	return new ModelAndView("segunda", "modeloClientes", modeloClientes);
    }
	
}
