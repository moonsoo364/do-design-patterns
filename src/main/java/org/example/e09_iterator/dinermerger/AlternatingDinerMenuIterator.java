package org.example.e09_iterator.dinermerger;

import java.util.Calendar;

public class AlternatingDinerMenuIterator {
    MenuItem[] list;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] list){
        this.list = list;
        position = Calendar.DAY_OF_WEEK % 2;
    }
}
