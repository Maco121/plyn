/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgago
 */
public class zac_stav {

    private int stav;

    public zac_stav() {
        stav = 0;
    }

    public int getStav() {
        return stav;
    }

    public void setStav(int stav) {
        this.stav = stav;
    }
    @Override
    public String toString(){
    return "Začiatočný stav je "+stav;
    }
}
