/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

/**
 *
 * @author willi
 */
public class SimpleRectangle extends Shape{
    public SimpleRectangle(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
    }
}
