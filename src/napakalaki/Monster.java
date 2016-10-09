/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author pinguino
 */
public class Monster {
    
    private String name ;
    private int combatLevel ; 
    private Prize prize ; 
    private BadConsequence badConsequence ; 

    public Monster(String name, int combatLevel, BadConsequence badConsequence, Prize prize) {
        this.name = name;
        this.combatLevel = combatLevel;
        this.prize = prize;
        this.badConsequence = badConsequence;
    }

    public String getName() {
        return name;
    }

    public int getCombatLevel() {
        return combatLevel;
    }

    public Prize getPrize() {
        return prize;
    }

    public BadConsequence getBadConsequence() {
        return badConsequence;
    }

    @Override
    public String toString() {
        return "Monster{" + "name=" + name + ", combatLevel=" + combatLevel + ", prize=" + prize + ", badConsequence=" + badConsequence + '}';
    }
    
    
    
}
