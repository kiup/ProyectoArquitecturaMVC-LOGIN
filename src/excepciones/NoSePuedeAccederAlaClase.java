/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import org.apache.log4j.Logger;

/**
 *
 * @author Milka
 */
public class NoSePuedeAccederAlaClase extends Exception{
    private final String mensaje = "Ocurrio un error al acceder a la clase";
    private static Logger log = Logger.getLogger(NoSePuedeAccederAlaClase.class);
    
    public String getMensaje(){
        log.error(mensaje);
        return mensaje;
    }
}
