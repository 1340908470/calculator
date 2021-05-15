package com.backend;

import java.util.LinkedList;

public class NumberStack extends LinkedList<Double> {
    // 数字缓冲区，0~9数字+'.' -> 整数/小数
    LinkedList<Character> buffer = new LinkedList<>();

    public void PushToBuffer(char character) {
        buffer.push(character);
    }

    // 将buffer中的内容转换为double, 并将其push入NumberStack
    public void ConvertBuffer() {
        double num = Double.parseDouble(buffer.toString());
        this.push(num);
    }
}
