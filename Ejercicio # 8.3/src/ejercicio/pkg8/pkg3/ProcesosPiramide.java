package ejercicio.pkg8.pkg3;

/**
 *
 * author 57302
 */
public class ProcesosPiramide extends Figuras {

    private double apotema, base, altura;

    public ProcesosPiramide(double apotema, double base, double altura) {
        this.apotema = apotema;
        this.altura = altura;
        this.base = base;
    }

    @Override
    protected Double volumen() {
        double volumen = (1.0 / 3.0) * base * altura;
        return volumen;
    }

    @Override
    protected Double superficie() {
        double superficie = (base * apotema) + (base * calcularLongitudLateral());
        return superficie;
    }

    private double calcularLongitudLateral() {
        double longitudLateral = Math.sqrt(Math.pow(apotema, 2) + Math.pow((base / 2.0), 2));
        return longitudLateral;
    }

}
