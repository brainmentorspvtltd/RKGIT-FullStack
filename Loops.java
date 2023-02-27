import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.forEach((e)->System.out.println(e));
        // Enhance for loop
        int arr[] = {10,20,30,40,50}; // Fixed Size Array 
        int a[][] = {{10,20},{30,40,50},{60,70,80,90}};
        int []m[] = new int[3][];

        m[0] =new int[10];
        m[1] = new int[20];
        m[2] = new int[30];
        m[0] [2] = 1;
        // Trad Loop
        // for(int i = 0; i<m.length; i++){
        //     for(int j = 0; j<m[i].length; j++){
        //         System.out.print(m[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int w[] : m){
            for(int e : w){
                System.out.print(e+" ");
            }
            System.out.println();
        }    
        for(int w : arr){
            System.out.println(w);
        }



        long startTime = System.currentTimeMillis();
        for(int i = 1; i<=100000; i++){

        }
        long endTime = System.currentTimeMillis();
        //System.out.println(endTime- startTime);
        
        // for loop 


        for(int i = 1; i<=10; i++){

        }
        int j = 1;
        while(j<=10){
            if(j%2==0){
                j+=2;
            }
            else{
                j++;
            }
        }
    }
}
