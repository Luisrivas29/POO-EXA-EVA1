/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificar_acceso_15_pts;

/**
 *
 * @author alex_
 */
public class Password {
    private String usuario;
    private String contraseña;

    // Constructor sin parámetros
    public Password() {
        // Inicialización con valores predeterminados
        usuario = "default";
        contraseña = "default";
    }

    // Constructor con parámetros
    public Password(String Usuario, String Contraseña) {
        usuario = Usuario;
        contraseña = Contraseña;
    }

    // Método para establecer el usuario
    public void setUsuario(String Usuario) {
        usuario = Usuario;
    }

    // Método para establecer la contraseña
    public void setContraseña(String Contraseña) {
        contraseña = Contraseña;
    }

    // Método para verificar el acceso
    public boolean verificarAcceso(String Usuario, String Contraseña) {
        return usuario.equals(Usuario) && contraseña.equals(Contraseña);
    }

    }

    