
public class Excep {
    public static void main(String[] args) {

        System.out.println("---------Try-Catch---------");

        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch(ArithmeticException e) {
            System.out.println("ERROR no se puede dividir por cero");
        }

        System.out.println("---------Try-Multi Catch---------");

        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Lobo";
            name = null;
            System.out.println("Name: "+name.toUpperCase());
        } catch(ArithmeticException e) {
            System.out.println("ERROR: "+e);
        } catch(NullPointerException e) {
            System.out.println("Null Pointer");
        } catch(Exception e) {
            System.out.println("Se ha producido un error no esperado");
        }

        System.out.println("---------Try-Catch-Finally---------");

        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch(ArithmeticException e) {
            System.out.println("ERROR no se puede dividir por cero");
        } finally {
            System.out.println("Fin del bloque Try-Catch");
        }

        System.out.println("FIN");
    }
}