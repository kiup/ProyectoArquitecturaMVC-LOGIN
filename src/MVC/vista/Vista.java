
package MVC.vista;

import MVC.enlace.Enlace;
import MVC.excepciones.ArgumentosNoCorrectos;
import MVC.excepciones.ClaseNoEncontrada;
import MVC.excepciones.ErrorAlInvocarObjetivo;
import MVC.excepciones.FalloInstanciaDeClase;
import MVC.excepciones.MetodoNoExiste;
import MVC.excepciones.NoEsSubclaseControlador;
import MVC.excepciones.NoSePuedeAccederAlaClase;
import MVC.excepciones.ViolacionDeSeguridad;


public abstract class Vista {
    
    private Enlace enlace;
    
    public Vista(){
        enlace = Enlace.getInstanceEnlace();
    }
    
    public void callService(Evento e) throws ClaseNoEncontrada, NoEsSubclaseControlador, FalloInstanciaDeClase, NoSePuedeAccederAlaClase, MetodoNoExiste, ViolacionDeSeguridad, ArgumentosNoCorrectos, ErrorAlInvocarObjetivo{
        enlace.mandarEvento(e);
    }
    
    public void setConfiguracion(String xml){
        enlace.setArchivoConfiguracion(xml);
    }
}