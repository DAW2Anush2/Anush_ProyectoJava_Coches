/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 32490.joan23
 */
public class Cotxes {
    protected String model;
    protected String opcio;
    protected String color;

    public Cotxes(String model, String opcio, String color) {
        this.model = model;
        this.opcio = opcio;
        this.color = color;
    }
    
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOpcio() {
        return opcio;
    }

    public void setOpcio(String opcio) {
        this.opcio = opcio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
      
}
