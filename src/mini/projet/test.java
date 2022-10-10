package mini.projet;

public class test {
    public static void main(String[] args) {
        robot[] robots =new robot[4] ;
        robots[0]=new robot("adnene") ;
        robots[1] =new robot ("ahmed " , 100 ,20,DIRECTION.NORD) ;
        robots[2] =new robotNG ("khaled " ) ;
        robots[3] =new robotNG ("fatma " , 50 ,50,DIRECTION.OUEST) ;
        //for(int i=0;i<4 ;i++) {
            //System.out.println("robot n "+ (i+1));
            //robots[i].afficher();
            
        //}
        //robots[0].avancer();
        //robots[0].droite();
        //robots[0].afficher();
        ((robotNG)robots[2]).setTurbo(true);
        ((robotNG)robots[2]).avancer(0);
        ((robotNG)robots[2]).demitout();
        ((robotNG)robots[2]).demitout();
        ((robotNG)robots[2]).demitout();
        ((robotNG)robots[2]).demitout();

        robots[0].afficher();
        
        

        
        
        
        
        
        
    }
    
}
