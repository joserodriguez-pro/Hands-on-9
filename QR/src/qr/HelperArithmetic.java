package qr;

import static java.lang.Math.pow;

public class HelperArithmetic extends DataSet{
    
    double sumax, sumay, sumax2, sumax3, sumax4, sumaxy, sumax2y;
    
    public double Sumax(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sumax = x[i] + sumax;
            
}
        
    return sumax;
        
}
    
    public double Sumay(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sumay = y[i] + sumay; 
            
}
        
    return sumay;
        
}
    
    public double Sumax2(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sumax2 = pow(x[i], 2) + sumax2;
            
}
        
    return sumax2;
        
}
    
    public double Sumax3(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sumax3 = pow(x[i], 3) + sumax3;
            
}
        
    return sumax3;
        
}
    
    public double Sumax4(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sumax4 = pow(x[i], 4) + sumax4;
            
}
        
    return sumax4;
        
}
    
    public double Sumaxy(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sumaxy = x[i] * y[i] + sumaxy;
            
}
        
    return sumaxy;
        
}
    
    public double Sumax2y(){
        
    for(int i = 0; i < Iteracion; i++){
            
    sumax2y = pow(x[i], 2) * y[i] + sumax2y;
            
}
        
    return sumax2y;
        
}
    
}