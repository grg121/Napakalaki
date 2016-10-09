/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pinguino
 */
public class PruebaNapakalaki {
    
    static ArrayList<Monster> monstruos = new ArrayList() ; 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // El rey de rosa
       BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles y"
               + " 3 tesoros visibles", 5, 3, 0) ; 
    Prize prize = new Prize(4,2) ; 
    monstruos.add(new Monster("El rey de rosa", 13, badConsequence, prize)) ;
    
    //Ángeles de la noche ibicenca
    badConsequence = new BadConsequence ("Te atrapan para llevarte de fiesta y "
            + "te dejan caer en mitad del vuelo.Descarta 1 mano visible y 1 mano"
            + "oculta",0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
            new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
    prize= new Prize (4,1);
    
    monstruos.add(new Monster("Angeles de la noche ibicenca",14,badConsequence,prize));
    
    //Los Hondos
    badConsequence = new BadConsequence("Estos monstruos resultan bastante"
            + "superficiales y te aburren mortalmente. Estás muerto." , true) ;
    prize = new Prize(2,1) ; 
    
    monstruos.add(new Monster("Los hondos", 8, badConsequence, prize)) ; 
    
    //Semillas Cthulhu 
    badConsequence = new BadConsequence("Pierdes 2 niveles y 2 tesoros ocultos", 
    2,0,2) ;
    
    prize = new Prize(2,1) ; 
    
    monstruos.add(new Monster("Semillas Cthulhu", 4, badConsequence, prize)) ; 
    
    //Dameargo
    badConsequence = new BadConsequence("Te intentas escaquear. Pierdenes "
            + "una mano visible.", 1, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
    new ArrayList()) ; 
    
    prize = new Prize(2,1) ; 
    
    monstruos.add(new Monster("Dameargo",1,badConsequence, prize)) ; 
    
    //Pollipólipo
    badConsequence = new BadConsequence("Da mucho asquito. Pierdes 3 niveles",
    3, 0, 0) ; 
    
    prize = new Prize(2,1) ; 
    
    monstruos.add(new Monster("Pollipólipo", 3, badConsequence, prize)) ; 
    
    //YskgtihyssgGoth"
    badConsequence = new BadConsequence("No le hace gracia que pronuncien mal"
            + "su nombre. Estas muerto.", true) ; 
    
    prize = new Prize(3,1 ) ; 
    
    monstruos.add(new Monster("YskgtihyssgGoth", 14, badConsequence, prize)) ; 
    
    //Familia feliz
    
    badConsequence = new BadConsequence("La familia te atrapa. Estás muerto.",
    true) ; 
    
    prize = new Prize(3,1) ; 
    
    monstruos.add(new Monster("Familia feliz", 1, badConsequence, prize)) ; 
    
    //Roboggoth 
    
    badConsequence = new BadConsequence("La quinta directiva primaria te obliga"
            + "a perder 2 niveles y un tesoro 2 manos visible.", 2, new ArrayList(
            Arrays.asList(TreasureKind.BOTHHANDS)),new ArrayList()) ; 
    
    prize = new Prize(2,1) ; 
    
    monstruos.add(new Monster("Roboggoth", 8, badConsequence, prize)) ; 
    
    //El espía sordo
    
    badConsequence = new BadConsequence("Te asusta en la noche. Pierdes tu"
            + "casco visible", 0, new ArrayList(Arrays.asList(TreasureKind.HELMET)), 
    new ArrayList()) ; 
    
   prize = new Prize(1,1) ; 
   
   monstruos.add(new Monster("El espía sordo", 5, badConsequence, prize)) ; 
   
   // Tongue
   
   badConsequence = new BadConsequence("Menudo susto te levas. Pierdes 2 "
           + "niveles y 5 tesoros visibles", 2, 5, 0) ; 
   prize = new Prize(2,1) ; 
   
   monstruos.add(new Monster("Tongue", 19, badConsequence, prize)) ; 
   
   //Bicéfalo 
   
   badConsequence = new BadConsequence("Te faltan manos para tanta cabeza."
           + "Pierdes 3 niveles y tus tesoros visibles de las manos", 3, 
   new ArrayList(Arrays.asList(TreasureKind.ONEHAND,TreasureKind.BOTHHANDS)),
   new ArrayList()) ;
   
   prize = new Prize(2,1) ; 
   
   monstruos.add(new Monster("Bicéfalo",21, badConsequence, prize)) ; 
   
   
   
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
        
    }
    
}
