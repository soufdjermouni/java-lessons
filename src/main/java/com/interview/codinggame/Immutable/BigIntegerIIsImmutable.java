package com.interview.codinggame.Immutable;

import java.math.BigInteger;

public interface BigIntegerIIsImmutable {



    public static void main(String[] args) {

        //BigInteger : Immutable arbitrary-precision integers. All operations behave as if BigIntegers were represented
        // in two's-complement notatio
        BigInteger bi = new BigInteger("1");
        bi.add(new BigInteger("1"));
        System.out.println(bi); //1
    }
}
