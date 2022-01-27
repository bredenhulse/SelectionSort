/*
Name: Breden Hulse
Class: Computer Science 2
Program: It is a Selection Sort.
*/
import java.io.*;
import java.util.*;
public class SelectionSort {
    public static void main(String[]args)throws IOException{
		Scanner scan = new Scanner(new File("src/text.dat"));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
			while(scan.hasNext()){ //Add Numbers to ArrayList
				numbers.add(scan.nextInt());
			}
        int mincount = 0;
        int placeholder = 0;
		for(int i = 1; i < numbers.size(); i++){
            int minimium = numbers.get(mincount);
            for(int j = i; j < numbers.size(); j++){
                if(minimium > numbers.get(j)){//Swap if Lower
                    int temp = numbers.get(j);
                    numbers.set(j, minimium);
                    minimium = temp;
                    numbers.set(placeholder, minimium);
                }
            }
            placeholder++;//Tells where previous minimium was
            mincount++;
        }
        for(int i = 0; i < numbers.size(); i++){//Print ArrayList
            System.out.println(numbers.get(i));
        }
	}
}
