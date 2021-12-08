import java.io.BufferedReader;
import java.io.FileReader;

public class Dag3 {

    //Binary checker

    public static void main(String[] args){

        
   int getal;
   
   int aantal0Rij1 = 0;
   int aantal1Rij1 = 0;
   
   int aantal0Rij2 = 0;
   int aantal1Rij2 = 0;

   int aantal0Rij3 = 0;
   int aantal1Rij3 = 0;

   int aantal0Rij4 = 0;
   int aantal1Rij4 = 0;

   int aantal0Rij5 = 0;
   int aantal1Rij5 = 0;

   int aantal0Rij6 = 0;
   int aantal1Rij6 = 0;

   int aantal0Rij7 = 0;
   int aantal1Rij7 = 0;

   int aantal0Rij8 = 0;
   int aantal1Rij8 = 0;

   int aantal0Rij9 = 0;
   int aantal1Rij9 = 0;

   int aantal0Rij10 = 0;
   int aantal1Rij10 = 0;

   int aantal0Rij11 = 0;
   int aantal1Rij11=  0;
   
   int aantal0Rij12 = 0;
   int aantal1Rij12=  0;
  

    String rij1;
    String rij2;
    String rij3;
    String rij4;
    String rij5;
    String rij6;
    String rij7;
    String rij8;
    String rij9;
    String rij10;
    String rij11;
    String rij12;



    // String data =

    // """
    // 00100
    // 11110
    // 10110
    // 10111
    // 10101
    // 01111
    // 00111
    // 11100
    // 10000
    // 11001
    // 00010
    // 01010
    // """;
   
//    for(String s : data.split("\n")){

try{

    BufferedReader br = new BufferedReader(new FileReader("input3.txt"));
    
    String file;
  

   while((file = br.readLine()) != null){


    //Rij 1 check
    rij1 = file.substring(0, 1);
    getal = Integer.parseInt(rij1);
     if(getal == 0){
        aantal0Rij1+=1;
     } else{
        aantal1Rij1 +=1;
     }
    

    //Rij 2 check
     rij2 = file.substring(1, 2);
     getal = Integer.parseInt(rij2);
      if(getal ==0){
        aantal0Rij2+=1;
      } else{
        aantal1Rij2+=1;
      }
   

      //Rij 3 check
      rij3 = file.substring(2, 3);
      getal = Integer.parseInt(rij3);
       if(getal ==0){
         aantal0Rij3+=1;
       } else{
         aantal1Rij3+=1;
       }
      

         //Rij 4 check
         rij4 = file.substring(3, 4);
         getal = Integer.parseInt(rij4);
          if(getal ==0){
            aantal0Rij4+=1;
          } else{
            aantal1Rij4+=1;
          }
        
         //Rij 5 check
         rij5 = file.substring(4, 5);
         getal = Integer.parseInt(rij5);
          if(getal ==0){
            aantal0Rij5+=1;
          } else{
            aantal1Rij5+=1;
          }

        

        //Rij 6 check
        rij6 = file.substring(5, 6);
        getal = Integer.parseInt(rij6);
         if(getal ==0){
           aantal0Rij6+=1;
         } else{
           aantal1Rij6+=1;
         }

       

       //Rij 7 check
       rij7 = file.substring(6, 7);
       getal = Integer.parseInt(rij7);
        if(getal ==0){
          aantal0Rij7+=1;
        } else{
          aantal1Rij7+=1;
        }

      
      //Rij 8 check
      rij8 = file.substring(7, 8);
      getal = Integer.parseInt(rij8);
       if(getal ==0){
         aantal0Rij8+=1;
       } else{
         aantal1Rij8+=1;
       }
         
        //Rij 9 check
       rij9 = file.substring(8, 9);
      getal = Integer.parseInt(rij9);
       if(getal ==0){
         aantal0Rij9+=1;
       } else{
         aantal1Rij9+=1;
       }
       
        //Rij 10 check
       rij10 = file.substring(9, 10);
       getal = Integer.parseInt(rij10);
        if(getal ==0){
          aantal0Rij10+=1;
        } else{
          aantal1Rij10+=1;
        }
        
          //Rij 11 check
        rij11 = file.substring(10, 11);
        getal = Integer.parseInt(rij11);
         if(getal ==0){
           aantal0Rij11+=1;
         } else{
           aantal1Rij11+=1;
         }
         
         //Rij 12 check
         rij12 = file.substring(11, 12);
         getal = Integer.parseInt(rij12);
          if(getal ==0){
            aantal0Rij12+=1;
          } else{
            aantal1Rij12+=1;
          }

        }

     } catch(Exception e){

            e.getStackTrace();
        }

         
 


//controle
    
    if(aantal1Rij1 > aantal0Rij1){
        System.out.println("Aantal 1 is groter (rij1)");
    } else{
        System.out.println("Aantal 0 is groter (rij1)");
    }
        
    if(aantal1Rij2> aantal0Rij2){
        System.out.println("Aantal 1 is groter (rij2)");
    } else{
        System.out.println("Aantal 0 is groter (rij2)");
    }

    if(aantal1Rij3> aantal0Rij3){
        System.out.println("Aantal 1 is groter (rij3)");
    } else{
        System.out.println("Aantal 0 is groter (rij3)");
    }

    if(aantal1Rij4> aantal0Rij4){
        System.out.println("Aantal 1 is groter (rij4)");
    } else{
        System.out.println("Aantal 0 is groter (rij4)");
    }

    if(aantal1Rij5> aantal0Rij5){
        System.out.println("Aantal 1 is groter (rij5)");
    } else{
        System.out.println("Aantal 0 is groter (rij5)");
    }  

    if(aantal1Rij6> aantal0Rij6){
        System.out.println("Aantal 1 is groter (rij6)");
    } else{
        System.out.println("Aantal 0 is groter (rij6)");
    }  

    if(aantal1Rij7> aantal0Rij7){
        System.out.println("Aantal 1 is groter (rij7)");
    } else{
        System.out.println("Aantal 0 is groter (rij7)");
    }  

    if(aantal1Rij8> aantal0Rij8){
        System.out.println("Aantal 1 is groter (rij8)");
    } else{
        System.out.println("Aantal 0 is groter (rij8)");
    }  

    if(aantal1Rij9> aantal0Rij9){
        System.out.println("Aantal 1 is groter (rij9)");
    } else{
        System.out.println("Aantal 0 is groter (rij9)");
    }  

    if(aantal1Rij10> aantal0Rij10){
        System.out.println("Aantal 1 is groter (rij10)");
    } else{
        System.out.println("Aantal 0 is groter (rij10)");
    }  

    if(aantal1Rij11> aantal0Rij11){
        System.out.println("Aantal 1 is groter (rij11)");
    } else{
        System.out.println("Aantal 0 is groter (rij11)");
    }  

    if(aantal1Rij12> aantal0Rij12){
        System.out.println("Aantal 1 is groter (rij12)");
    } else{
        System.out.println("Aantal 0 is groter (rij12)");
    }  
   



    }
    
}
