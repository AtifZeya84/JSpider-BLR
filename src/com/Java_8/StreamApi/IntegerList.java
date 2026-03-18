package com.Java_8.StreamApi;

import java.util.*;

public class Smallest_Int_In_List  { //implements Comparator
    static void main() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(36);
        list.add(85);
        list.add(72);
        list.add(15);
        list.add(68);

        //using sort
//        Collections.sort(list);
//        System.out.println(list.get(0));
        //Collections.sort(list, );    //custom sorting order for comparing in descending order
        //    @Override
        //    public int compare(int x, int y) {
        //        return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //    }

        //using basic logic
//        int min = list.get(0);
//        for (Integer integer : list) {
//            if (integer < min)
//                min = integer;
//        }
//        System.out.println(min);

        //using streams
        int smallest = list.stream(). min((x,y)->(x < y) ? -1 : ((x == y) ? 0 : 1)) .get();
 /*                                  <--min is a method of list which takes comparator as input-->    */
        System.out.println(smallest);
        int largest = list.stream(). max((x,y)->(x < y) ? -1 : ((x == y) ? 0 : 1)) .get();
        /*                                  <--min is a method of list which takes comparator as input-->    */
        System.out.println(largest);
    }
    }

