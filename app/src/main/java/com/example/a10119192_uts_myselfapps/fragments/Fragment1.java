/*
NIM : 10119192
Nama : Fikri Akbari Karim
Kelas : IF-5
Tanggal pengerjaan : 19 Mei 2022
*/
package com.example.a10119192_uts_myselfapps.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a10119192_uts_myselfapps.R;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater
                .inflate(R.layout.page1,container
                , false);

        return rootView;
    }
}
