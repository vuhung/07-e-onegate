/*
 * @(#)ValidatorExt.java
 *
 * Copyright (c) 2006 CyberVietnam, Inc.
 * 185 Giang Vo street, Ba Dinh district, Hanoi, Vietnam.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * CyberVietnam, Inc. ("Confidential Information").  You shall not 
 * disclose such Confidential Information and shall use it only in 
 * accordance with the terms of the license agreement you entered 
 * into with CyberVietnam, Inc.
 *
 */
package com.vportal.portal.util;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import org.apache.regexp.RE;


/**
 * 
 * @author VPortal Group (2008), VSI
 * 
 */
public class ValidatorExt extends Validator {

    private static String prohibitedWords = "(\\w*)shit(\\w*)|(\\w*)cyber(\\w*)|(\\w*)name(\\w*)|(\\w*)poop(\\w*)|(\\w*)ch\u00ednh ph\u1ee7(\\w*)|(\\w*)c\u1ed9ng s\u1ea3n(\\w*)|(\\w*)fuck(\\w*)|(\\w*)fucking(\\w*)|(\\w*)fucker(\\w*)|(\\w*)cunt(\\w*)|(\\w*)asshole(\\w*)|(\\w*)bitch(\\w*)|(\\w*)m\u1eb9 ki\u1ebfp(\\w*)|(\\w*)ch\u00f3 m\u00e1(\\w*)|(\\w*)c\u01b0\u1ee1ng hi\u1ebfp(\\w*)|(\\w*)\u0111\u00e9o(\\w*)|(\\w*)\u0111\u00e90(\\w*)|(\\w*)c\u1ee9t(\\w*)|(\\w*)v\u00e3i \u0111\u00e1i(\\w*)|(\\w*)bu\u1ed3i(\\w*)|(\\w*)l\u1ed3n(\\w*)|(\\w*)l\u00ecn(\\w*)|(\\w*)n\u1ed3n(\\w*)|(\\w*)v\u00e3i l\u00ecn(\\w*)|(\\w*)v\u00e3i l\u1ed3n(\\w*)|(\\w*)v\u00e3i n\u1ed3n(\\w*)|(\\w*)loo^`n(\\w*)|(\\w*)lo^`n(\\w*)|(\\w*)\u0111\u1ecbt(\\w*)|(\\w*)hi\u1ebfp(\\w*)|(\\w*)gi\u1ebft(\\w*)|(\\w*)vai lon(\\w*)|(\\w*)\u0111\u1ee5(\\w*)|(\\w*)c\u1eb7c(\\w*)|(\\w*)k\u1eb7c(\\w*)|(\\w*)d\u00e1i(\\w*)|(\\w*)Minh r\u00e2u(\\w*)|(\\w*)\u0111\u1ea3 \u0111\u1ea3o(\\w*)|(\\w*)t\u1ed5ng b\u00ed th\u01b0(\\w*)|(\\w*)ph\u1ea3n \u0111\u1ed9ng(\\w*)|(\\w*)nh\u00e2n quy\u1ec1n(\\w*)|(\\w*)H\u1ed3 Ch\u00f3 Minh(\\w*)|(\\w*)\u0111\u1ea3ng c\u01b0\u1edbp(\\w*)|(\\w*)Vi\u1ec7t C\u1ed9ng(\\w*)|(\\w*)Vi\u1ec7t gian(\\w*)|(\\w*)b\u1ed9 ch\u00ednh tr\u1ecb(\\w*)|(\\w*)PA25(\\w*)|(\\w*)\u0111\u1ed9c \u0111\u1ea3ng(\\w*)|(\\w*)\u0111a \u0111\u1ea3ng(\\w*)|(\\w*)\u0111\u01a1n \u0111\u1ea3ng(\\w*)|(\\w*)\u0111a nguy\u00ean(\\w*)|(\\w*)trung \u01b0\u01a1ng \u0110\u1ea3ng(\\w*)|(\\w*)k\u1ed9ng s\u1ea3n(\\w*)|(\\w*)c\u1ed9ng x\u1ea3n(\\w*)|(\\w*)c\u1ed9ngs\u1ea3n(\\w*)|(\\w*)cong san(\\w*)|(\\w*)nhan quyen(\\w*)|(\\w*)tu do ngon luan(\\w*)|(\\w*)tu do bao chi(\\w*)|(\\w*)b\u1ecd ch\u00ednh tr\u1ecb(\\w*)|(\\w*)b\u00f2 ch\u00ednh tr\u1ecb(\\w*)|(\\w*)Trung C\u1ed9ng(\\w*)|(\\w*)c\u01b0\u1edbp ch\u00ednh quy\u1ec1n(\\w*)|(\\w*)\u0111\u1ecbt con m\u1eb9(\\w*)|(\\w*)l\u1ed3n m\u1eb9(\\w*)|(\\w*)t\u1ed5 cha(\\w*)|(\\w*)ti\u00ean s\u01b0 b\u1ed1(\\w*)|(\\w*)c\u1ee9t th\u1eadt(\\w*)|(\\w*)h\u00e0ng h\u1ecd(\\w*)|(\\w*)con h\u00e0ng(\\w*)|(\\w*)ch\u00f3 th\u1eadt(\\w*)|(\\w*)l\u1ed3n th\u1eadt(\\w*)|(\\w*)sex(\\w*)|(\\w*)l\u00e0m t\u00ecnh(\\w*)|(\\w*)gh\u1eb9(\\w*)|(\\w*)ch\u00f3 th\u1ebf(\\w*)|(\\w*)\u0111cs(\\w*)|(\\w*)t\u1ef1 do ng\u00f4n lu\u1eadn(\\w*)|(\\w*)ngu d\u00e2n(\\w*)|(\\w*)nh\u1ed3i s\u1ecd(\\w*)|(\\w*)t\u1ef1 do b\u00e1o ch\u00ed(\\w*)|(\\w*)H\u1ed3 ch\u1ee7 t\u1ecbt(\\w*)|(\\w*)CSHN(\\w*)|(\\w*)\u0110CS(\\w*)|(\\w*)CSVN(\\w*)|(\\w*)n\u1ed9i chi\u1ebfn(\\w*)|(\\w*)\u0111\u00e0n \u00e1p(\\w*)|(\\w*)ch\u1ebf \u0111\u1ed9 CS(\\w*)|(\\w*)Ch\u00f3 H\u1ed3(\\w*)|(\\w*)Ho\u00e0ng Minh Ch\u00ednh(\\w*)|(\\w*)L\u00ea Th\u1ecb C\u00f4ng Nh\u00e2n(\\w*)|(\\w*)Nguy\u1ec5n Minh C\u1ea7n(\\w*)|(\\w*)N\u00f4ng \u0110\u1ee9c M\u1ea1nh(\\w*)|(\\w*)Nguy\u1ec5n T\u1ea5n D\u0169ng(\\w*)|(\\w*)V\u00f5 Nguy\u00ean Gi\u00e1p(\\w*)|(\\w*)Nguy\u1ec5n Minh Tri\u1ebft(\\w*)|(\\w*)\u0110\u1ed7 M\u01b0\u1eddi(\\w*)|(\\w*)T\u00f4 Huy R\u1ee9a(\\w*)|(\\w*)N\u00f4ng Th\u1ecb Xu\u00e2n(\\w*)|(\\w*)N\u00f4ng Th\u1ecb Tr\u01b0ng(\\w*)|(\\w*)H\u00e0 S\u0129 Phu(\\w*)|(\\w*)Th\u00edch Qu\u1ea3ng \u0110\u1ed9(\\w*)|(\\w*)L\u00fd T\u1ed1ng(\\w*)|(\\w*)Ng\u00f4 Nh\u00e2n D\u1ee5ng(\\w*)|(\\w*)heroin(\\w*)|(\\w*)thu\u1ed1c phi\u1ec7n(\\w*)|(\\w*)serial number(\\w*)|(\\w*)crack(\\w*)|(\\w*)fucking(\\w*)|(\\w*)Ti\u00ean s\u01b0 cha(\\w*)|(\\w*)T\u1ed5 s\u01b0 b\u1ed1(\\w*)|(\\w*)fuck con m\u1eb9(\\w*)|(\\w*)v\u00e3i h\u00e0ng(\\w*)|(\\w*)k\u1ee9t(\\w*)|(\\w*)c-\u1ed9-n-g s-\u1ea3-n(\\w*)|(\\w*)thu\u1ed1c l\u1eafc(\\w*)|(\\w*)thu\u1ed1c phi\u1ec7n(\\w*)";

    public static boolean foundProhibitedWords(String[] inputs) {

        if ((inputs == null) || (inputs.length == 0)) { return false; }

        return foundProhibitedWords(StringUtil.merge(inputs, StringPool.SPACE));
    }

    public static boolean foundProhibitedWords(String input) {

        // There are some problems with this regular expression utility, so let
        // everything passes
        if (true) { return false; }

        if (Validator.isNull(input)) { return false; }

        RE r = null;

        try {
            r = new RE(prohibitedWords, RE.MATCH_CASEINDEPENDENT
                    | RE.MATCH_MULTILINE);
        } catch (Exception e) {
            // ...
        }

        return (r == null) ? false : r.match(input);
    }
}
