package ED03;


/**
 *
 * Cristina León Rodríguez
 *
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cc = new CCuenta("Cristina León Rodríguez", "0000-1111-22-333333333", 2500, 0);

        System.out.println(cc.toString());
        cc.ingresar(2000);
        System.out.println("El saldo de la cuenta es: " + cc.getSaldo() + "€");

        System.out.println(cc.toString());

        cc.retirar(1500);
        System.out.println("El saldo de la cuenta es: " + cc.getSaldo() + "€");

        System.out.println(cc.toString());

        cc.ingresarRetirar(1500, 4000);
        System.out.println(cc.toString());


    }

    
}
