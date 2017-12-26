package com.example.arturmusayelyan.scrollabletabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by artur.musayelyan on 26/12/2017.
 */

public class FragmentC extends Fragment {
    public FragmentC() {

    }

    public static FragmentC newInstance() {
        Bundle args = new Bundle();
        FragmentC fragment = new FragmentC();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_c, container, false);
    }
}
