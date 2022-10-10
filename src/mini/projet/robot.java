/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet;

/**
 *
 * @author DELL
 */
public class robot {
    
    private String nom ;
    private int x , y ; 
    private DIRECTION direction ; 

    public robot(String nom, int x, int y, DIRECTION direction) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public robot(String nom) {
        this.nom = nom;
        x=0 ;
        y=0 ;
        direction= DIRECTION.EST ;
    }
    
    public void avancer() {
      switch (direction) {
          case EST : 
              x++ ; break;
          case OUEST :
              x-- ; break ; 
          case NORD : 
              y++ ; break;   
          case SUD : 
              y-- ; break ; 
          default : break ;     
      } 
    }
    public void droite () {
        switch (direction) {
          case EST : 
              direction= DIRECTION.SUD  ; break;
          case OUEST :
              direction= DIRECTION.NORD  ; break;
          case NORD : 
              direction= DIRECTION.EST  ; break;
          case SUD : 
              direction= DIRECTION.OUEST  ; break;
          default : break ;     
      }
    }
    public void afficher(){
        System.out.println("le nom du robot est  " + nom );
        System.out.println("la position du robot est ( " + x+","+y+")" );
        System.out.println("le direction du robot est  " + direction.toString() );
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public DIRECTION getDirection() {
        return direction;
    }

    public void setDirection(DIRECTION direction) {
        this.direction = direction;
    }
    
    
    
}
