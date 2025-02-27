import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, 
        //si son iguales a los datos dados imprimirá en terminal: 
        //Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        Scanner login = new Scanner(System.in);

        String user = "Mer";
        String psswd = "doremi";

        System.out.print("Por favor elige un nombre de usuario ");
        String userName = login.nextLine();
        
        System.out.print("A continuación, elige una contraseña ");
        String password = login.nextLine();


        if (user.equals(userName) && psswd.equals(password)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }

    

        System.out.println();

        login.close();

    }
}
