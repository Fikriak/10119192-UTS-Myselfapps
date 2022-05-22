/*
NIM : 10119192
Nama : Fikri Akbari Karim
Kelas : IF-5
Tanggal pengerjaan : 19 Mei 2022
*/
package com.example.a10119192_uts_myselfapps.dailyactivity;

import java.util.ArrayList;

public class Daily_Data {
    private static String[] data_kegiatan = {
            "Bangun Tidur",
            "Mandi",
            "Sarapan",
            "Kuliah",
            "Main Game",
            "Nonton Film",
            "Shalat",
            "Makan Malam",
            "Tidur"
    };

    public static ArrayList<Daily> getListData() {
        ArrayList<Daily> list = new ArrayList<>();
        for (int position = 0; position < data_kegiatan.length; position++) {
            Daily daily = new Daily();
            daily.setKegiatan(data_kegiatan[position]);
            list.add(daily);
        }
        return list;
    }
}
