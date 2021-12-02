package qr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class QRAgent extends Agent{
    
    @Override
    protected void setup(){
        
    System.out.println("Agent " + getLocalName() + " Started.");
    addBehaviour(new MyOneShotBehaviour());
        
}
    
    private class MyOneShotBehaviour extends OneShotBehaviour{
    
        @Override
        
    public void action(){
           
        QR qr = new QR();
        HelperArithmetic HA = new HelperArithmetic();
        Cramer CR = new Cramer();

        qr.QR();
                
}
    
    @Override
    public int onEnd(){
            
    myAgent.doDelete();
    return super.onEnd();
            
}
        
}
        
}
