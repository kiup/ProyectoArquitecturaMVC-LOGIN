/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool.exceptions;

/**
 *
 * @author miguelangel
 */
public class ArchivoConfigNotFoundException extends Exception{
    
    public ArchivoConfigNotFoundException(String mensaje){        
        super(mensaje);
    }
}