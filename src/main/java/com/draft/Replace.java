package com.draft;

import java.sql.SQLOutput;

public class Replace {
    public static void main (String[] args) {
        String str = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
        char k = 'k';
        char o = 'q';
        char e = 'g';

        String newStr = str.replace(k, 'm');
        str = newStr;
        String newStr2 = str.replace(o, 'q');
        newStr = newStr2;
        String newStr3 = str.replace(e, 'g');
        newStr2 = newStr3;
        System.out.println(str);
        System.out.println(newStr);
        System.out.println(newStr2);
        System.out.println(newStr3);
    }
}
