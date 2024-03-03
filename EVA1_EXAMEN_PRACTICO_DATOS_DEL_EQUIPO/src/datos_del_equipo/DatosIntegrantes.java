package datos_del_equipo;
public class DatosIntegrantes {
    private static String nombreEquipo = "Proyecto Manhattan";
    private static String[] integrantes = {
            "Raul Eduardo Ornelas Muñoz",
            "Alexis Cruz Martínez",
            "Luis Raul Rivas Sanchez",
            "Emiliano Cano Maro"
    };

    // Método para imprimir los datos del equipo
    public static void imprimirDatosEquipo() {
        System.out.println("Datos del equipo " + nombreEquipo);

        // Datos comunes de todos los integrantes
        String carrera = "Ingeniería en Sistemas Computacionales";
        int[] numerosControl = {23550408, 23550373, 23550331, 23550385};
        // Imprimir datos de cada integrante
        for (int i = 0; i < integrantes.length; i++) {
            String nombreCompleto = integrantes[i];
            String[] partesNombre = new String[]{nombreCompleto};
            String nombre = partesNombre[partesNombre.length - 1];
            System.out.println(numerosControl[i] + " | " +nombre + " | " +carrera );
        }
    }

    // Método para imprimir los problemas resueltos
    public static void imprimirProblemasResueltos() {
        System.out.println(" ");
        System.out.println("Problemas resueltos:");
        System.out.println("1. CLASE DATOS DEL EQUIPO");
        System.out.println("2. CLASE TEST COVID");
        System.out.println("3. FIBONACCI");
        System.out.println("4. CLASE ACCESO DE USUARIO");
        System.out.println("5. CLASE CONTRASEÑA");
    }

}
