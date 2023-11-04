/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package INF331.Test;

import INF331.concepts.Voiture;

public class Test2 {

    public static void main(String[] args) {
        // TODO code application logic here
        // Une premiere voiture
        Voiture maVoiture = new Voiture("Clio",10,false,0);
        maVoiture.demarre();
        maVoiture.accelere(120);
        
        // Création 2ieme voiture
        Voiture maVoitureCopie = new Voiture("Mercedez",5,false,1);
        maVoiture.afficher();
        System.out.println("\n");
        maVoitureCopie.afficher();
        System.out.println("\n");
        
        //affectation
        maVoiture=maVoitureCopie;
        maVoitureCopie.accelere(3);
        
        System.out.println("\n---Aprés affectation---\n");
        maVoiture.afficher();
        System.out.println("\n");
        maVoitureCopie.afficher();
    }
    
}
