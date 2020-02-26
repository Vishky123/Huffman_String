package Main;

import StringtoBinary.StringToBinary;
import huffman.Huffman_String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        StringToBinary Binary = new StringToBinary();
        Binary.Tobinary(input);
        Huffman_String hauff = new Huffman_String();
        hauff.Huffman_Tree(input);
    }
}
