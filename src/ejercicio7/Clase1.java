package ejercicio7;

public class Clase1 {
    public static void main(String[] args) {

        //Para que me imprima 10 ip usamos un bucle for
        //Para que nos cree de forma aleatoria las ip, voy generando numeros con la clase Math.random hasta el 255, y voy separando los número con puntos
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 255) + "." + (int) (Math.random() * 255) + "." + (int) (Math.random() * 255) + "." + (int) (Math.random() * 255));
        }
    }
}
