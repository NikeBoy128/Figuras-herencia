 class Circulo extends Figura {
     private double radio;
     private double pi=3.1416;

     public Circulo(double radio) {
         this.radio = radio;
     }

     @Override
     public void calcilarperimetro() {
         double diametro=radio*2;
         double resultado;
         resultado=diametro*pi;

         System.out.println("el perimetro del circulo es "+resultado);

         super.calcilarperimetro();
     }

     @Override
     public void calculararea() {
         double resultado=pi*(radio*radio);
         System.out.println("el area del circulo  es "+resultado);

         super.calculararea();
     }

     public double getRadio() {
         return radio;
     }

     public void setRadio(double radio) {
         this.radio = radio;
     }
 }
