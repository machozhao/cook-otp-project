package com.ibm.lbs.otp;

import org.jboss.aerogear.security.otp.Totp;
import org.jboss.aerogear.security.otp.api.Base32;

/**
 * Created by zhaodonglu on 2017/9/13.
 */
public class TotpGenerator {

    public static void main(String[] args) throws Exception {
        // VABROZVZEASYM7KE
        String secret = Base32.random();
        secret = "GIE7DCVBWGDQNRQU";
        Totp totp = new Totp(secret);
        for (int i = 0; i < 1000; i++) {
            System.out.println(totp.now()); //427773
            Thread.sleep(10000);
        }
        totp.verify("427773"); //true
        Thread.sleep(40);
        totp.verify("427773"); //false
    }
}
