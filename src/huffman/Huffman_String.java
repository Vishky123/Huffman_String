package huffman;

import java.util.HashMap;

public class Huffman_String {
    public void Huffman_Tree(String string) {
        string = string.toLowerCase();
        String[] hauffman = {"1010", "100000", "00000", "10110", "010", "110011", "100010", "0001", "0110", "11000001011", "11000011", "10111", "110010", "0111", "1001", "100001", "1100001001", "0010", "0011", "1101", "00001", "1100000", "110001", "1100001000", "100011", "1100001010"};
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < hauffman.length; i++) {
            map.put((char) ('a' + i), hauffman[i]);

        }
        map.put(' ', " 111 ");


        String s = "";
        for (int i = 0; i < string.length(); i++) {
            s = s + map.get(string.charAt(i)) + (i < string.length() - 1 ? "-" : " ");
        }
        System.out.println("Huffman String : " + s);
    }
}

