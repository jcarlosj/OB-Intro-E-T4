public class Main {
    public static void main(String[] args) {
        usandoUnIf();
        usandoUnWhile();
        usandoUnDoWhile();
        usandoUnFor();
        usandoUnSwitch();
    }

    public static void usandoUnIf() {
        /** Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0. */
        int numeroif = 9;

        System.out.println( "*** Usando un if ***" );
        if( numeroif > 0 )
            System.out.println( " " + numeroif + " es positivo." );
        else if( numeroif < 0 )
            System.out.println( " " + numeroif + " es negativo.");
        else
            System.out.println( " " + numeroif + " es cero.");
    }

    public static void usandoUnWhile() {
        /** Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
            - Incrementar el valor de la variable en uno cada vez que se ejecute.
            - Mostrarlo por pantalla cada vez que se ejecute. */

        int numeroWhile = 0;

        System.out.println( "*** Usando un While ***" );
        while( numeroWhile < 3 ) {
            numeroWhile++;
            System.out.print( " " + numeroWhile );
        }
        System.out.println();

    }

    public static void usandoUnDoWhile() {
        /** Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez. */
        int numeroWhile = 0;

        System.out.println( "*** Usando un Do-While ***" );
        do {
            numeroWhile++;
            System.out.print( " " + numeroWhile );
        } while( numeroWhile < 1 );
        System.out.println();

    }

    public static void usandoUnFor() {
        /** Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla. */
        int numeroFor = 0;

        System.out.println( "*** Usando un For ***" );
        for( int i = 0; numeroFor <= 3; i++ ) {
            numeroFor ++;
            System.out.print( " " + numeroFor );
        }
        System.out.println();

    }

    public static void usandoUnSwitch() {
        /** Por último, para el Switch, deberás crear la variable estacion, y distintos *case* para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación. */
        String estacion = "lola";

        System.out.println( "*** Usando un Switch ***" );
        switch ( estacion ) {
            case "invierno":
                System.out.println( " BRRR... que frio estamos en invierno" );
                break;
            case "verano":
                System.out.println( " UFFF!!! que calor vamos por una bebida fria que estamos en un fuerte verano" );
                break;
            case "primavera":
                System.out.println( " Mira cuantas flores... empezó la primavera" );
                break;
            case "otoño":
                System.out.println( " El viento levanta las hojas que caen de los árboles... es por que estamos en otoño" );
                break;
            default:
                System.out.println( " A ver, a ver '" + estacion + "' no es una estación del año." );
        }
    }
}
