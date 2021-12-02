package qr;

public class Cramer extends HelperArithmetic{
    
    HelperArithmetic HA = new HelperArithmetic();
    DataSet DS = new DataSet();
    
    double sumax = HA.Sumax();
    double sumay = HA.Sumay();
    double sumax2 = HA.Sumax2();
    double sumax3 = HA.Sumax3();
    double sumax4 = HA.Sumax4();
    double sumaxy = HA.Sumaxy();
    double sumax2y = HA.Sumax2y();
    double Iteracion = DS.getIteracion();
    
    double determinate = ( sumax2 * sumax2 * sumax2 ) + ( sumax * sumax * sumax4 ) + ( Iteracion * sumax3 * sumax3 ) - ( sumax4 * sumax2 * Iteracion ) - (sumax3 * sumax * sumax2) - (sumax2 * sumax3 * sumax);
        
    double a = ( sumay * sumax2 * sumax2 ) +  ( sumaxy * sumax3 * Iteracion ) + ( sumax2y * sumax * sumax ) - ( sumaxy * sumax * sumax2 ) - (sumay * sumax3 * sumax) - (sumax2y * sumax2 * Iteracion);

    double b = ( sumax2 * sumaxy * sumax2 ) +  ( sumay * sumax * sumax4 ) + ( Iteracion * sumax3 * sumax2y ) - ( sumax4 * sumaxy * Iteracion ) - (sumax2y * sumax * sumax2) - (sumax2 * sumax3 * sumay);

    double c = ( sumax2 * sumax2 * sumax2y ) +  ( sumax * sumaxy * sumax4 ) + ( sumay * sumax3 * sumax3 ) - ( sumax4 * sumax2 * sumay ) - (sumax3 * sumaxy * sumax2) - (sumax2y * sumax3 * sumax);
    
    public double getDeterminante(){
        
    return determinate;
        
    }
    
    public double getB0(){
        
    double b0 = c / determinate;
        
    return b0;
        
    }
    
    public double getB1(){
        
    double b1 = b / determinate;
        
    return b1;
        
    }
    
    public double getB2(){
        
    double b2 = a / determinate;
        
    return b2;
        
}
    
}
