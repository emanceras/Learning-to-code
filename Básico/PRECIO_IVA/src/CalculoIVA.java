public class CalculoIVA {
    public static void main(String[] args) {
        double resultado = precioConIVA(150d,0.21d);
        if (resultado == 0) {
            System.out.println("Error al introducir los datos");
        }
        else{
            System.out.println(resultado);
        }

}

    public static double precioConIVA(double precio, double IVA) {
        if (IVA < 1 && IVA >= 0){
            return ((precio * IVA)+precio);
        }
        return (0);
    }
}