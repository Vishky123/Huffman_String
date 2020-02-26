package StringtoBinary;

public class StringToBinary {
    public void Tobinary(String string) {
        String binary = "";
        for (int i = 0; i < string.length(); i++) {
            String s = "";
            s = Integer.toBinaryString(string.charAt(i));
            if (s.length() < 8) {
                String zero = "0";
                zero.repeat(8 - s.length());
                s = s + zero;
            }
            binary = binary + s + (i < string.length() - 1 ? "-" : "");
        }
        System.out.println("Binary String: " + binary);
    }

}
