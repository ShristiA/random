package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Random r =  new Random();
	for(int i = 0; i <10; i++){
	int x = 1+ r.nextInt(10);
	System.out.println("Your random is" + x);
		}
    }
}
