/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.model;

/**
 *
 * @author Universidad
 */
public interface Image {
    public Object bitmap();
    public Image prev();
    public Image next();
}
