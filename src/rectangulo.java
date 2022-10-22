public class rectangulo extends Figura {
    private double base;
    private double altura;

    public rectangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcilarperimetro() {
        double resultado;
        resultado=2*(base+altura);
        System.out.println("perimetro del rectangulo "+resultado);

        super.calcilarperimetro();
    }

    @Override
    public void calculararea() {
        double area=base*altura;
        System.out.println("el area del rectangulo  es "+area);

        super.calculararea();
    }
}
