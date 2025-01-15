package lambda;

@FunctionalInterface
//pattern SAM
public interface Operazione {
    //metodo astratto definisce la signature ma non il comportamento
    double calcola (double a, double b);
}
