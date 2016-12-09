/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.excepciones;

import org.apache.log4j.Logger;

/**
 *
 * @author Milka
 */
public class ViolacionDeSeguridad extends Exception{
    
    private final String mensaje = "Ha habido una violación de seguridad";    
    private static Logger log = Logger.getLogger(ViolacionDeSeguridad.class);
    
    public String getMensaje(){
        log.error(mensaje);
        return mensaje;
    }
}
