/*
NIM : 10119192
Nama : Fikri Akbari Karim
Kelas : IF-5
Tanggal pengerjaan : 19 Mei 2022
*/
package com.example.a10119192_uts_myselfapps.music;

import java.util.ArrayList;

public class Music_Data {
    private static String[] data_musik = {
            "Hilang Harapan by Stand Here Alone",
            "Mantan by Stand Here Alone",
            "Sesaat Kau Hadir by Utha Likumahuwa",
            "As It Was by Harry Style",
            "Bertahan Terluka by Fabio Asher",
            "Rip Love by Faouzia",
            "Ghost by Justin Bieber",
            "Runtuh by Fiersa Besari",
            "Pesan Terakhir by Lyodra",
            "Wish You Were Here by Neck Deep"
    };

    public static ArrayList<Music_Item> getListData() {
        ArrayList<Music_Item> list = new ArrayList<>();
        for (int position = 0; position <data_musik.length; position++) {
            Music_Item mi = new Music_Item();
            mi.setMusicList(data_musik[position]);
            list.add(mi);
        }
        return list;
    }
}
