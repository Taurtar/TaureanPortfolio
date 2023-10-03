import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        //Students p = new Students();
        //int[] arr = {90,85,95,75};
        
        //System.out.println("Average Score: "+p.calculateAverage(arr));
        //System.out.println("Letter Grade: "+p.calculateGrade());

        File myFile = new File("java.txt");
        Scanner scanner = new Scanner(myFile);
        ArrayList<String> data = new ArrayList<String>();

        while(scanner.hasNext()){
            data.add(scanner.next());
        }
        scanner.close();
        
        ArrayList<String> arr = new ArrayList<>();
        System.out.println(data);
        /*arr.add(data.get(0));
        String[] test = new String[arr.size()];
        
        test = arr.toArray(test);
        */
        String[] test = new String[10];

        int count = 0;
        int i = 0;
        for(int row = 0; row < data.size(); row++){
            if(i == 10) break;
            for(i = 0; i < 10; i++){
                if(row == count){
                    //test[col] = data.get
                    count+=6;
                    System.out.print( data.get(row));
                    test[i] = data.get(row);
                
                }
            }

            
               
            
        }
        System.out.println(test);    
        
        
        
        
    }
    
}
/*class Students{
    String name = null;
    int[] testScores = new int[5];
    String grade = null;;
    int avgGrade;
    
    public int calculateAverage(int[] testScores){
        int sum = 0;
        
        for(int i = 0; i < testScores.length; i++){
            sum += testScores[i];
        }
        avgGrade = sum/testScores.length;
        return avgGrade;
    }
    public String calculateGrade(){
        //this.avgGrade = avgGrade;

        if((this.avgGrade < 90)&&(this.avgGrade >= 80)){
            grade = "B";
        }
        return grade;
    }
}*/