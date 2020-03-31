package com.htp.aspect;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        for (int i = 264; i <= 324; i = i + 2) {
            result.add(i);
        }
        String join = StringUtils.join(result, ",");
        System.out.println(join);
    }
}
