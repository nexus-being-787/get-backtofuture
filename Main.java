import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception {
        BufferedWriter br = new BufferedWriter(new FileWriter("test.txt"));
        //String Line;
        //while((Line = br.readLine())!=null){
        //    System.out.println((String)Line);
        br.write("hello!!!!!");
        br.close();
        
        //br.close();
    }   
}



public class Main
{
    public static void main(String[] args) throws Exception {
        BufferedWriter br = new BufferedWriter(new FileWriter("test.txt"));
        String Line;
        while((Line = br.readLine())!=null){
            System.out.println((String)Line);
        br.write("hello!!!!!");
        }
        br.close();
    }   
}