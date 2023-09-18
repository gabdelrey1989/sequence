/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosequence;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author Gabriela
 */

public class CasillaTablero {
    JLabel label;
    int row;
    int column;

    public CasillaTablero(int row, int column) {
        this.label = new JLabel();
        this.row = row;
        this.column = column;
        //label.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
    
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}