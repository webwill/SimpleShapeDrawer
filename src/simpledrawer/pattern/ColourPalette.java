/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer.pattern;

import java.util.ArrayList;

/**
 *
 * @author ww4953j
 */
public class ColourPalette {
        private ArrayList<Colour> memory;
        
        public void addColour(Colour colour){
            memory.add(colour);
            System.out.println("The colour has been saved to the memory arraylist");
        }
        public void remove(int i){
            memory.remove(i);
            System.out.println("The colour with the index of " + i +" will "
                    + "be removed");
        };
        public int getLenth(){
            return memory.size();
        }
}
