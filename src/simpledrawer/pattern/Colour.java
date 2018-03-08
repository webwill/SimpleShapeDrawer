/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer.pattern;

import java.awt.Color;

/**
 *
 * @author ww4953j
 */
public class Colour {
    
    
    
    private Color current;
    
    public Colour(Color c){
        current = c;
    }
    
    public void update(Color c){
        current = c;
    }
    public Color getColour(){
        return current;
    }
}
