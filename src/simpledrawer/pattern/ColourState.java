/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer.pattern;

import simpledrawer.DrawerMain;

/**
 *
 * @author ww4953j
 */
public class ColourState {
    
        DrawerMain dm = new DrawerMain();
        
        Colour c;
    
    public void setState(Colour c){
    
    }    
        
        
    public void restore(Colour colour){
        c = colour;
        
    }
    
    public void save(Colour c){
        
    }
    
}
