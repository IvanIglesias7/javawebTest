package ejemploWebClase.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ejemploWebClase.POJO.cliente;


@Controller
public class ControladorSegunda {
    protected final Log logger = LogFactory.getLog(getClass());
    List<cliente> listaClientes = new ArrayList<cliente>();
    
  //Creo una lista
    cliente c1 = new cliente("Paco","Perez","Polavieja","+34 219921921", "C/Tormes");
    cliente c2 = new cliente("Manuel","Perez","Polavieja","+34 211233331", "C/Tormes");

    
    //Ejecuta una accion
    @RequestMapping(value="/segunda")
    public ModelAndView gestionSolicitud() {
        
        
        listaClientes.add(c1);
        listaClientes.add(c2); 
        
        logger.info("Navegamos a la vista segunda");
        Map<String, Object> miModelo = new HashMap<String, Object>();
        
        //String mensaje = "Todo ok";      
        
        miModelo.put("mensaje","Todo ok");
        miModelo.put("mensaje2", "Todo perfecto");
        miModelo.put("listaDeClientes", listaClientes);
        
        //Devuelvo un ModelAndView que lleva a "segunda"
        return new ModelAndView("segunda", "miModelo", miModelo);
    }

}
