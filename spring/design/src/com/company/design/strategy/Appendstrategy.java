package com.company.design.strategy;

public class Appendstrategy implements EncodingStrategy
{

    @Override
    public String encode(String text) {
        return "ABCD" + text;
    }
}
