package com.example;

public class Security {

    public static void main(String[] args) {
        String s = "i am lxchild.";
        String en = encrypt(s);
        System.out.println(en);
        System.out.println(decrypt(en));
    }
    private static final char SECURET_CODE = 'b';

    public static String encrypt(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i ++) {
            chars[i] ^= SECURET_CODE;
        }
        return String.valueOf(chars);
    }

    public static String decrypt(String s) {
        return encrypt(s);
    }
}
