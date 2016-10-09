/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author pinguino
 */
public class BadConsequence {
    
    private String text ; 
    private int levels ; 
    private int nVisibeTreasures ; 
    private int nHiddenTreasures ; 
    private boolean death ; 

    public BadConsequence(String text, int levels, int nVisibeTreasures, int nHiddenTreasures) {
        this.text = text;
        this.levels = levels;
        this.nVisibeTreasures = nVisibeTreasures;
        this.nHiddenTreasures = nHiddenTreasures;
    }

    public BadConsequence(String text, boolean death) {
        this.text = text;
        this.death = death;
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels ; 
        specificHiddenTreasures = tHidden ; 
        specificVisibleTreasures = tVisible ; 
        
    }
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList() ; 
    
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();

    public String getText() {
        return text;
    }

    public int getLevels() {
        return levels;
    }

    public int getnVisibeTreasures() {
        return nVisibeTreasures;
    }

    public int getnHiddenTreasures() {
        return nHiddenTreasures;
    }

    public boolean isDeath() {
        return death;
    }

    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }

    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }

    @Override
    public String toString() {
        return "BadConsequence{" + "text=" + text + ", levels=" + levels + ", nVisibeTreasures=" + nVisibeTreasures + ", nHiddenTreasures=" + nHiddenTreasures + ", death=" + death + ", specificHiddenTreasures=" + specificHiddenTreasures + ", specificVisibleTreasures=" + specificVisibleTreasures + '}';
    }

   
    
    
    
}
