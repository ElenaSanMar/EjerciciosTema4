//Creado por: Elena Sánchez Márquez
public class Main {
    public static void main(String[] args) {
        var numeroIF = 8;
        var numeroWhile = 0;
        var numeroFor = 0;
        String estacion = "OTOÑO";

        //Bucle IF:
        System.out.println("Este es el bucle IF");
        if (numeroIF < 0){
            System.out.println("El numero es negativo");
        } else if (numeroIF > 0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es cero");
        }

        //Bucle While:
        System.out.println("Este es el bucle WHILE");
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        //Bucle DoWhile
        System.out.println("Este es el bucle DO WHILE");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while(numeroWhile < 3);

        //Bucle for:
        System.out.println("Este es el bucle FOR");
        for (; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Bucle switch:
        System.out.println("Este es el bucle SWITCH CASE");
        switch (estacion){
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}