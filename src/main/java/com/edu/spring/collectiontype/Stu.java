package com.edu.spring.collectiontype;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] arrays;// 数组类型
    private List<String> list;// List类型
    private Map<String, String> map;// Map类型
    private Set<String> set;// set集合类型

    @Override
    public String toString() {
        return "Stu{" +
                "arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
}
