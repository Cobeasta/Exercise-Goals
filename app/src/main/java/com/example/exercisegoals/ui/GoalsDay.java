package com.example.exercisegoals.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.exercisegoals.R;


public class GoalsDay extends Fragment {

    public GoalsDay() {
        // Required empty public constructor
    }
    public static GoalsDay newInstance() {
        GoalsDay fragment = new GoalsDay();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_goals_day, container, false);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
