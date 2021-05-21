
package figuras;


public class Figuras {

    public static void main(String[] args) {
         // PRIMER RECTANGULO
        Rectanguo r1 = new Rectanguo (2.0,4.0);
       
        System.out.println("RECTANGULOS");
        System.out.println("PERIMETROS");
        System.out.println("RECTANGULO BASE:"+r1.getBase()+"ALTURA"+r1.getAltura()+"PERIMETRO"+r1.calcularperimetro());
        System.out.println("RECTANGULO BASE"+r1.getBase()+"ALTURA"+r1.getAltura()+"AREA"+r1.calculararea());
        //PRIMER CIRCULO
        Circulo c1 = new Circulo (2);
        System.out.println("CIRCULOS");
        System.out.println("PERIMETROS");
        System.out.println("CIRCULO RADIO:"+c1.getRadio()+"PERIMETRO"+c1.calcularPerimetro());
        System.out.println("CIRCULO RADIO:"+c1.getRadio()+"AREA"+c1.calcularArea());
        
        
        
    }
    
}
