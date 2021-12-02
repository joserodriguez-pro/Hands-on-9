package qr;

import static java.lang.Math.pow;

public class QR extends Cramer{

    Cramer CR = new Cramer();
    
    double sse, Media, sst, r2 = 0;
    
    double b0 = CR.getB0();
    double b1 = CR.getB1();
    double b2 = CR.getB2();
    
    public double SSE(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sse = pow((y[i] - b0 * pow(x[i], 2) - b1 * x[i] - b2),2) + sse;
            
}
        
    return sse;
        
}
    
    public double SST(){
        
    for(int i = 0; i < Iteracion; i++){
            
    Media = Media + y[i];
            
}
        
    Media = Media / Iteracion;
        
    for(int i = 0; i < Iteracion; i++){
            
    sst = pow((y[i] - Media ),2) + sst;
            
}
        
    return sst;
        
}
    
    public double getR2(){
        
    r2 = 1 - (SSE()/SST());
        
    return r2;
        
}
    
    public void QR(){
        
        System.out.println(" -B0= " + String.format("%.2f", CR.getB0()));
        System.out.println(" ");
        System.out.println(" -B1= " + String.format("%.2f", CR.getB1()));
        System.out.println(" ");
        System.out.println(" -B2= " + String.format("%.2f", CR.getB2()));

        System.out.println(" ");
        System.out.println(" -Y= " + String.format("%.2f", CR.getB0()) + "x² + " + String.format("%.2f", CR.getB1()) + "x + " + String.format("%.2f", CR.getB2()));
        
        System.out.println(" ");
        System.out.println(" -R2= " + String.format("%.2f", getR2()));
        
        System.out.println(" ");
        System.out.println(" -Sumax=   " + String.format("%.2f", HA.Sumax()));
        System.out.println(" ");
        System.out.println(" -Sumay=   " + String.format("%.2f", HA.Sumay()));
        System.out.println(" ");
        System.out.println(" -Sumax2=  " + String.format("%.2f", HA.Sumax2()));
        System.out.println(" ");
        System.out.println(" -Sumax3=  " + String.format("%.2f", HA.Sumax3()));
        System.out.println(" ");
        System.out.println(" -Sumax4=  " + String.format("%.2f", HA.Sumax4()));
        System.out.println(" ");
        System.out.println(" -Sumaxy=  " + String.format("%.2f",  HA.Sumaxy()));
        System.out.println(" ");
        System.out.println(" -Sumax2y= " + String.format("%.2f", HA.Sumax2y()));
        System.out.println("");
               
}
    
}
