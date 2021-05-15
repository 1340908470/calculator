package com.backend;

public class Calculate {
    public String BasicCalculate(String s) {
        // 建栈
        BracketStack bs = new BracketStack();
        NumberStack ns = new NumberStack();
        SignStack ss = new SignStack();

        char[] chars = new char[s.length()];
        s.getChars(0, s.length(), chars, 0);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') {

            } else if ((chars[i] - '0') >= 0 || (chars[i] - '0') <= 9 || chars[i] == '.') {

            } else if (chars[i] == '(' || chars[i] == ')') {
                if (chars[i] == '(') {
                    bs.push(BracketStack.LB);
                }
            }
        }
        return "";
    }
}
