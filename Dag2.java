import java.io.BufferedReader;
import java.io.FileReader;

public class Dag2 {

    public static void main(String[] args){

        int forward = 0;
        int down = 0;
        int up = 0;
        int finaldepth = 0;
        int finalposition = 0;
        int aim = 0;
        int finalhorizontal = 0;
        int final_final = 0;
        
        



        // String test =

        //     """
        //     forward 5
        //     down 5
        //     forward 8
        //     up 3
        //     down 8
        //     forward 2

        //     """;
        
       


try {
 BufferedReader br = new BufferedReader(new FileReader("input2.txt"));



// for(String s : test.split("\n")){

    String line;

    while((line = br.readLine()) != null){

    if(line .startsWith("for")){
      String waarde = line .substring(line .length() -1);
      int waarde1 = Integer.parseInt(waarde);
 
      finalhorizontal += waarde1 * aim;
      forward += waarde1;
      

     
    }
    if(line.startsWith("down")){
        String waarde = line .substring(line.length() -1);
        int waarde1 = Integer.parseInt(waarde);
        down += waarde1;
        aim += waarde1;
       
      }
    if(line.startsWith("up")){
        String waarde = line.substring(line.length() -1);
        int waarde1 = Integer.parseInt(waarde);
        up += waarde1;
        aim -= waarde1;
       
      }
}
    


finaldepth =  (down - up);
finalposition = forward * finaldepth;
final_final = forward * finalhorizontal;




System.out.println("forward: " + forward);
System.out.println("down: " + down);
System.out.println("final depth: " + finaldepth);
System.out.println("up: " + up);
System.out.println("aim: " + aim);
System.out.println("final position: " + finalposition);
System.out.println("final horizontal: " + finalhorizontal);
System.out.println("final final: " + final_final);

    } catch(Exception e){
        e.getStackTrace();
    }

    
    
}
    
}

