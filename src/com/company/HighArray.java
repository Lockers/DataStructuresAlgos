package com.company;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int size)
    {
        a = new long[size];
        nElems = 0;
    }
    public boolean find(long key)
    {
        for(int i = 0; i < nElems; i++)
        {
            if(a[i] == key)
            {
                System.out.println(a[i]);
                return true;
            }
        }
        return false;
    }
    public void insert(int item)
    {
        a[nElems] = item;
        nElems++;
    }
    public void display()
    {
        for(int i = 0; i < nElems; i++)
        {
            System.out.println(a[i]);
        }
    }
    public long delete(long item)
    {
        long deleted = 0;
        for(int i = 0; i < nElems; i++)
        {
            if(a[i] == item)
            {
                deleted = a[i];
                for(int j = i; j < nElems; j++)
                {
                    a[j] = a[j + 1];

                }
                nElems--;
            }
        }
        return deleted;
    }
    public long getMax()
    {
        long max = 0;
        for(int i = 0; i < nElems; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }
    public long removeMax()
    {
        long max = getMax();
        delete(max);
        return max;
    }


}
