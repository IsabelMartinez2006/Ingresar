import java.util.Scanner;

public class Ingresar{

    private static final Scanner scanner = new Scanner(System.in);//se declaro afuera para que fuera global 

    public static String obtenerCadena(String mensaje){//Declara la funcio int que recibira como parametro una cadena 
        String cadenaTemporal;
        System.out.println(mensaje + ":");
        cadenaTemporal = scanner.nextLine();
        return cadenaTemporal;
   
    }

    public static void main(String[] args ){

        String nombreUsuario = "Isabel";
        String contrasenaUsuario = "12345";
        String usuarioIngresado = obtenerCadena("Ingresa tu usuario");
        String contrasenaIngresada = obtenerCadena("Ingresa tu contraseña");

        if ((nombreUsuario.equals(usuarioIngresado)) && (contrasenaIngresada.equals(contrasenaUsuario))){//equals es para hacer la comparacion 
            System.out.println("Bienvenido ha iniciado sesion correctamente ");

        }else{
            System.out.println("Usuario o contraseña incorrecto");
        }
        
        System.out.println("Derechos reservados");

    }
}