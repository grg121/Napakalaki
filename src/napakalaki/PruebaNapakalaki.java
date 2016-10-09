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
 * @author Redondo
 */


public class PruebaNapakalaki {

    static ArrayList<Monster> monstruos = new ArrayList();
        
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // El Rey de Rosa
        BadConsequence badConsequence = new BadConsequence("Pierdes 5 niveles "
                + "y 3 tesoros visibles", 5, 3, 0);
        Prize prize = new Prize(4, 2);
        monstruos.add(new Monster("El rey de rosa", 13, badConsequence, prize));
        
        // Ángeles de la noche ibicenca
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta "
                + "y te dejan caer en mitad del vuelo. Descarta 1 mano visible y "
                + "una mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), 
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize = new Prize(4, 1);
        monstruos.add(new Monster("Ángeles de la noche ibicenca", 14, badConsequence, prize));
        
        // 3 Byakhees de bonanza
        badConsequence = new BadConsequence("Pierdes tu armadura visible y otra "
                + "oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize = new Prize(2, 1);
        monstruos.add(new Monster("3 Byakhees de bonanza", 8, badConsequence, prize));
        
        // Tenochtitlan
        badConsequence = new BadConsequence("Embobados con el lindo primigenio "
                + "te descartas de tu casco visible", 0, 
                new ArrayList(Arrays.asList(TreasureKind.HELMET)), new ArrayList());
        prize = new Prize(1, 1);
        monstruos.add(new Monster("Tenochtitlan", 2, badConsequence, prize));
        
        // El sopor de Dunwich
        badConsequence = new BadConsequence("El primordial bostezo contagioso. "
                + "Pierdes el calzado visible", 0, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)), 
                new ArrayList());
        prize = new Prize(1, 1);
        monstruos.add(new Monster("El sopor de Dunwich", 2, badConsequence, prize));
        
        // Demonios de Magaluf
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta"
                + "y te dejan caer en mitad del vuelo. Descarta 1 mano visible y "
                + "1 mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), 
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize = new Prize(4, 1);
        monstruos.add(new Monster("Demonios de Magaluf", 2, badConsequence, prize));
        
        // El gorrón en el umbral
        badConsequence = new BadConsequence("Pierdes todos tus tesoros visibles",
                0, Integer.MAX_VALUE, 0);
        prize = new Prize(3, 1);
        monstruos.add(new Monster("El gorrón en el umbral", 13, badConsequence, prize));
        
        // H.P. Munchcraft
        badConsequence = new BadConsequence("Pierdes la armadura visible", 0, 
            new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList());
        prize = new Prize(2, 1);
        monstruos.add(new Monster("H.P. Munchcraft", 6, badConsequence, prize));
        
        // Necrófago
        badConsequence = new BadConsequence("Sientes bichos bajo la ropa. "
                + "Descarta la armadura visble", 0, 
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList());
        prize = new Prize(1, 1);
        monstruos.add(new Monster("Necrófago", 13, badConsequence, prize));
        
        // El rey de rosado
        badConsequence = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles", 5, 3, 0);
        prize = new Prize(3, 2);
        monstruos.add(new Monster("El rey de rosado", 11, badConsequence, prize));
        
        //Flecher
        badConsequence = new BadConsequence("Toses los pulmones y pierdes 2 niveles", 2, 0, 0);
        prize = new Prize(1, 1);
        monstruos.add(new Monster("Flecher", 11, badConsequence, prize));

        
        
        
        
        
        
        
        
        
    }
    
}
