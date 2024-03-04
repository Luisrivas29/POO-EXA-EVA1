/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificar_acceso_15_pts;

/**
 *
 * @author alex_
 */
public class Verificar_Acceso_15_pts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Password password1 = new Password();
        password1.setUsuario("usuario1");
        password1.setContraseña("contraseña1");

        // Crear un objeto Password con datos proporcionados por el usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        Password password2 = new Password(usuario, contraseña);

        // Verificar acceso
        System.out.print("Ingrese su usuario para verificar acceso: ");
        String usuarioInput = scanner.nextLine();
        System.out.print("Ingrese su contraseña para verificar acceso: ");
        String contraseñaInput = scanner.nextLine();
        if (password2.verificarAcceso(usuarioInput, contraseñaInput)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
   
}
}
