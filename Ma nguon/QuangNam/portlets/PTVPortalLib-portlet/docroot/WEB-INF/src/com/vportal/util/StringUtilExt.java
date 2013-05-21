/*
 * @(#)StringUtilExt.java
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
package com.vportal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author Nguyen Tuan Anh
 * @version 1.0.00, Nov 20, 2006
 */
public class StringUtilExt extends StringUtil {

    public static List normalize(String s) {

        if (Validator.isNull(s)) { return null; }

        s = s.replaceAll("[\\p{Cntrl}]", ".");

        List ret = new ArrayList();
        Pattern patt = Pattern.compile("[\\p{Punct}]");
        Pattern patt2 = Pattern.compile("[\\p{Space}]");

        String[] sentences = patt.split(s);
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim();

            if (Validator.isNull(sentence) || (sentence.length() <= 2)) {
                continue;
            }

            String[] words = patt2.split(sentence);

            sentence = "";
            for (int j = 0; j < words.length; j++) {
                String word = words[j].trim();

                if (Validator.isNull(word)) {
                    continue;
                }

                sentence += word + StringPool.SPACE;
            }

            ret.add(sentence.trim());
        }

        return ret;
    }

    public static String normalize(String s, String separator) {

        if (Validator.isNull(s)) { return s; }

        s = s.replaceAll("[\\p{Cntrl}]", ".");

        String ret = "";
        Pattern patt = Pattern.compile("[\\p{Punct}]");
        Pattern patt2 = Pattern.compile("[\\p{Space}]");

        String[] sentences = patt.split(s);
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim();

            if (Validator.isNull(sentence) || (sentence.length() <= 2)) {
                continue;
            }

            String[] words = patt2.split(sentence);

            sentence = "";
            for (int j = 0; j < words.length; j++) {
                String word = words[j].trim();

                if (Validator.isNull(word)) {
                    continue;
                }

                sentence += word + StringPool.SPACE;
            }

            ret += sentence.trim() + separator;
        }

        return ret.trim();
    }

    public static String[] wordStatistic(String s, boolean asc) {

        Pattern pattern = Pattern.compile(".*$", Pattern.MULTILINE);
        Pattern wordBreakPattern = Pattern.compile("[\\p{Punct}\\s}]");
        Matcher matcher = pattern.matcher(s);

        HashMap map = new HashMap();
        Integer ONE = new Integer(1);

        while (matcher.find()) {
            CharSequence line = matcher.group();
            String words[] = wordBreakPattern.split(line);

            for (int i = 0, n = words.length; i < n; i++) {
                String word = words[i].trim();
                Integer frequency = (Integer) map.get(word);

                if (frequency == null) {
                    frequency = ONE;
                } else {
                    int value = frequency.intValue();
                    frequency = new Integer(value + 1);
                }

                map.put(word, frequency);
            }
        }

        if (map.isEmpty()) { return null; }

        String[] words = (String[]) map.keySet()
                .toArray(new String[map.size()]);

        for (int i = 0; i < words.length; i++) {
            words[i] = map.get(words[i]) + "_" + words[i];
        }

        Arrays.sort(words, new StringComparator(asc));
        map.clear();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int pos = word.indexOf("_");
            words[i] = word.substring(pos + 1);
        }

        return words;
    }

    public static List wordStatistic(HashMap wordsMap, boolean asc) {

        if (wordsMap == null) { return null; }

        final Integer ONE = new Integer(1);
        HashMap map = new HashMap();

        String[] words = (String[]) wordsMap.keySet()
                .toArray(new String[wordsMap.size()]);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Integer frequency = (Integer) map.get(word);

            if (frequency == null) {
                frequency = ONE;
            } else {
                int value = frequency.intValue();
                frequency = new Integer(value + 1);
            }

            map.put(word, frequency);
        }

        if (map.isEmpty()) { return null; }

        words = (String[]) map.keySet().toArray(new String[map.size()]);

        for (int i = 0; i < words.length; i++) {
            words[i] = map.get(words[i]) + ";" + wordsMap.get(words[i]) + "_"
                    + words[i];
        }

        Arrays.sort(words, new StringComparator(asc));

        List lst = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            int pos = word.indexOf("_");
            lst.add(word.substring(pos + 1));
        }

        return lst;
    }

    public static int parseInt(String input, int defaultValue) {

        int value = 0;

        try {
            value = Integer.parseInt(input);
        } catch (Exception ex) {
            value = defaultValue;
        }

        return value;
    }
}


final class StringComparator implements Comparator {

    private boolean _asc;

    public StringComparator(boolean asc) {
        _asc = asc;
    }

    public int compare(Object o1, Object o2) {

        if (!(o1 instanceof String) || !(o2 instanceof String)) { return -1; }

        String[] s1 = ((String) o1).split("_");
        String[] s2 = ((String) o2).split("_");

        String[] s10 = s1[0].split(";");
        String[] s20 = s2[0].split(";");

        int val10 = Integer.parseInt(s10[0]);
        int val11 = Integer.parseInt(s10[1]);

        int val20 = Integer.parseInt(s20[0]);
        int val21 = Integer.parseInt(s20[1]);

        if (val11 >= val21) {
            if (val10 >= val20) {
                return _asc ? 1 : -1;
            } else {
                return _asc ? -1 : 1;
            }
        } else {
            if (val10 <= val20) {
                return _asc ? -1 : 1;
            } else {
                return _asc ? 1 : -1;
            }
        }
    }
}
