import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
              //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java
        
        Scanner quiz = new Scanner(System.in);

        int counter = 0;

        System.out.println("¿Quién fue la hacker que escribió en 1994 'Hacking the Wetware'?");
        System.out.println("\ta. Ada Lovelace\n\tb. Jude Milhon\n\tc. Martha Ackelsberg\n\td. Jane Jacobs");        
        
        
        
        String firstQ = quiz.nextLine();
        
        if (firstQ.equals("b")) {
            
            counter += 5;
            System.out.println("Correcto, ganas 5 puntos");
        } else {
            System.out.println("ohhh");
        }

        System.out.println("¿Quién es Fuencisla Clemares?  " );
        System.out.println("\ta. La directora general de IBM Europa, Oriente Medio y África,\n\tb. La vicepresidenta de Microsoft Western Europe\n\tc. La directora general de Google en España y Portugal\n\td. Fundadora y CEO de Marsi Bionics" );


        String secondQ = quiz.nextLine();
        
        if (secondQ.equals("c")) {

            counter += 5;
            System.out.println("Correcto, ganas 5 puntos");
        } else {
            System.out.println("ohhh");
        }


        System.out.println("¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        System.out.println("\ta. Primera programadora de software\t\n" + //
                        "                b. Una actriz de cine\t\n" + //
                        "                c. Inventora del procesador de datos\t\n" + //
                        "                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");

        String thirdQ = quiz.nextLine();
        
        if (thirdQ.equals("b") || thirdQ.equals("d")) {

            counter += 5;
            System.out.println("Correcto, ganas 5 puntos");
        } else {
            System.out.println("ohhh");
        }

         System.out.println("¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
         System.out.println("\ta. Katherine Johnson, Dorothy Vaughan y Mary Jackson\t\n" + //
                          "                b. Jessica Miller, Emily Johnson, Sarah Davis\t\n" + //
                          "                c. bell hooks, Toni Morrison y Alice Walker\t\n" + //
                          "                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");

        String fourthQ = quiz.nextLine();
        
        if (fourthQ.equals("a")) {

            counter += 5;
            System.out.println("Correcto, ganas 5 puntos");
        } else {
            System.out.println("ohhh");
        }
        
        //Respuestas: 1. b / 2. c / 3. b y d / 4. a
        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics

                
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */


        quiz.close();

        if (counter >= 15) {
            System.out.println("Tú si que sabes mucho");
        } else if (  counter >= 5) {
            System.out.println("No lo has hecho mal");

        } else {
            System.out.println("Better luck next time !");
        }

    }
    
}

  //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
