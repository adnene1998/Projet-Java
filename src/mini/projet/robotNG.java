/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.projet;

public class robotNG extends robot  {
    private boolean turbo ; 
    
    public robotNG(String nom, int x, int y, DIRECTION direction) {
        super(nom, x, y, direction);
        turbo = false ; 
    }
     public robotNG (String nom) {
         super(nom) ;
         turbo = false ; 
     }

    public boolean hasTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public void avancer() {
        if(turbo)
            avancer(3);
       else             
        super.avancer(); 
    }

    @Override
    public void afficher() {
        super.afficher(); 
        if(turbo)
            System.out.println("turbo active");
        else
            System.out.println("turbo desactive");

    }
    
     
     public void avancer (int nombrepas ){
       if (turbo)
           nombrepas*=3 ; 
         switch(getDirection()){
             case NORD :
                  setY( getY()+nombrepas) ; break ; 
             case SUD :
                  setY( getY()+ nombrepas) ; break ;
              case EST :
                  setY( getX()+nombrepas) ; 
             case OUEST :
                  setX( getX()+nombrepas) ; 
             default:break ; 
                 
         }
          
   
     }
     public void gauche() {
         switch (getDirection()) {
          case EST : 
               setDirection(DIRECTION.NORD) ; break ; 
          case OUEST :
              setDirection(DIRECTION.SUD) ; break ; 
          case NORD : 
             setDirection(DIRECTION.OUEST) ; break ; 
          case SUD : 
             setDirection(DIRECTION.EST) ; break ; 
          default : break ;     
      }
         
                 
     }
     public void demitout() {
         
         switch (getDirection()) {
          case EST : 
               setDirection(DIRECTION.OUEST) ; break ; 
          case OUEST :
              setDirection(DIRECTION.EST) ; break ; 
          case NORD : 
             setDirection(DIRECTION.SUD) ; break ; 
          case SUD : 
             setDirection(DIRECTION.NORD) ; break ; 
          default : break ;     
      }
        
     }
     
    
    
    
    
    
}
