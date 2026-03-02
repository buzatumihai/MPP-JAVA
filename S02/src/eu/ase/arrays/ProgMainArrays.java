package eu.ase.arrays;

import java.util.Arrays;

public class ProgMainArrays
{
    public static void main(String[] args)
    {
        int[] v;
        v = new int[5];
        // 0 -> v.lenght - 1
        //System.out.println(v[5]);
        for(int i = 0; i < v.length; i++) {
            System.out.println(i + " " + v[i]);
        }
        v[2] = 30;
        for(int x: v)
        {
            System.out.println(x);
        }
        int[] v2 = v;
        //v2 = Arrays.copyOf(v, v.length);
        //System.arraycopy(v, 0, v2, 0, v.length);
        v2 = v.clone();
        v2[0] = 50;
        System.out.println("v:");
        for(int i = 0; i < v.length; i++) {
            System.out.println(i + " " + v[i]);
        }
        System.out.println("v2:");
        for(int i = 0; i < v2.length; i++) {
            System.out.println(i + " " + v2[i]);
        }
        modifyArray(v);
        System.out.println(v[0]);

    }
    public static void modifyArray(int[] arr)
    {
        arr[0] = 999;
    }
}
