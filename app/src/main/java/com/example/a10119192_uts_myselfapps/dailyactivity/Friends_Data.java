/*
NIM : 10119192
Nama : Fikri Akbari Karim
Kelas : IF-5
Tanggal pengerjaan : 19 Mei 2022
*/
package com.example.a10119192_uts_myselfapps.dailyactivity;

import com.example.a10119192_uts_myselfapps.R;

import java.util.ArrayList;

public class Friends_Data {
    private static String[] data_nama = {
            "Albe Akbar Fillah",
            "Fajar Nugraha",
            "Kiki Mulyadi",
            "Rama Ramdani",
            "Reza Kurnia"
    };

    private static String[] data_username = {
            "@albeefillah",
            "@fajar.nugrha",
            "@kiki_3393",
            "@ramaramdannii",
            "@zakurr"
    };

    private static int[] data_img = {
            R.drawable.albe,
            R.drawable.fajar,
            R.drawable.kiki,
            R.drawable.rama,
            R.drawable.reza
    };

    public static ArrayList<Friends> getListData() {
        ArrayList<Friends> list = new ArrayList<>();
        for (int position = 0; position<data_nama.length; position++) {
            Friends friends = new Friends();
            friends.setNama(data_nama[position]);
            friends.setUsername(data_username[position]);
            friends.setFoto(data_img[position]);
            list.add(friends);
        }
        return list;
    }
}
