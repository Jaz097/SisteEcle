/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisteecle;

/**
 *
 * @author edwincabrera
 */
public class temporal_cambio {

    /**
     * @return the correo
     */
    public static String getCorreo() {
        return correo;
    }

    /**
     * @param aCorreo the correo to set
     */
    public static void setCorreo(String aCorreo) {
        correo = aCorreo;
    }

    /**
     * @return the usuario
     */
    private static String usuario = "";
    private static String correo = "";

    public static String getUsuario() {
        return usuario;
    }

    /**
     * @param aUsuario the usuario to set
     */
    public static void setUsuario(String aUsuario) {
        usuario = aUsuario;
    }
    
    

}
