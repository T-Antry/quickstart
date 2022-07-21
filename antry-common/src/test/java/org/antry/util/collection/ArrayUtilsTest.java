package org.antry.util.collection;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author T_Antry on 2022/7/21
 */
public class ArrayUtilsTest {

    @Test
    public void test(){
        System.out.println("------test begin------");
        Object[] arr = ArrayUtils.toArray(new ArrayList<>());
        System.out.println(arr);
        System.out.println("-------test end-------");
    }

}