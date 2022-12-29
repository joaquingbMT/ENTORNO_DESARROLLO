package ED03;

/**
 *
 * Cristina León Rodríguez
 *
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInterés = tipoInterés;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public void ingresar(double cantidad){
        if(cantidad > 0){
            System.out.println("Se han añadido " + cantidad + "€ a los " + getSaldo() + "€ ya depositados en la cuenta.");   
            setSaldo(saldo + cantidad); 
            System.out.println("Quedando un total de " + getSaldo() + "€");
            
        }else{
            System.out.println("La cantidad a ingresar no puede ser negativa");
        }
    }

    public void retirar(double cantidad){
        if(cantidad < saldo){
            System.out.println("Se han retirtado " + cantidad + "€ de los " + getSaldo() + "€ dispobibles en la cuenta");   
            setSaldo(saldo -cantidad);
            System.out.println("Quedando un total de " + getSaldo() + "€");
        }else{
            System.out.println("No puedes retirar más de lo que tienes");
        }

    }

public void ingresarRetirar(double cantidadIngresar, double cantidadRetirar){
    ingresar(cantidadIngresar);
    retirar(cantidadRetirar);


}


    public String toString(){
        String cadena = "\n###########################\nTitular: " + getNombre() + "\nCuanta: " + getCuenta() + "\nSaldo: " + getSaldo() + "€\nInteres: " + getTipoInterés() + "\n###########################\n";

        return cadena;
    }



    
}
