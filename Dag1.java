import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Dag1{

    //5
    public static void main(String[] args){

  
try{

int[] laatsteNum = new int[3];
int increase = 0;
int start= 0;
int[] current = new int[3];



BufferedReader br = new BufferedReader(new FileReader("input1.txt"));


String line;

while((line = br.readLine()) != null){

int i = Integer.parseInt(line);

if (start < 3) {
    if (start > 0) {
        current[start - 1] = i;
    }
    laatsteNum[start] = i;
    start++;
    continue;
}


current[2] = i;


int curr = 0;
int laatste = 0;

for (int j = 0; j < 3; j++) {
    laatste += laatsteNum[j];
    curr += current[j];
}

if (curr > laatste) {
    increase++;
}

laatsteNum = Arrays.copyOf(current, 3);

for (int j = 0; j < 2; j++) {
    current[j] = current[j + 1];
    }
}

System.out.println(increase);

} catch (Exception e) {
e.printStackTrace();



       }
    }
  }