/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Intel
 */
import java.util.*;
public class crypt {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int d= sc.nextInt();
        System.out.println(Integer.toBinaryString(d));
        Random rand= new Random();
        int c=rand.nextInt(d);
        System.out.print("c value taken: ");
        System.out.println(Integer.toBinaryString(c));
        int r=d-c;
        System.out.print("generated r value: ");
        System.out.println(Integer.toBinaryString(r));
        int key=rand.nextInt(1000);
        System.out.print("key value taken: ");
        System.out.println(Integer.toBinaryString(key));
        int A=c^key;
        System.out.print("Cloud A: ");
        System.out.println(Integer.toBinaryString(A));
        int B=r^key;
        System.out.print("Cloud B: ");
        System.out.println(Integer.toBinaryString(B));
        int d1=A^key;
        int d2=B^key;
        System.out.println("Original data Decrypted: "+(d1+d2));
        System.out.println(Integer.toBinaryString(d1+d2));
    }
}
