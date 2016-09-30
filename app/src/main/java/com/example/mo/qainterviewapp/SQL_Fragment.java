package com.example.mo.qainterviewapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SQL_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SQL_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ExpandableListView expandableListView;
    List<String> quesList;
    Map<String,String> ques_ans_map;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public SQL_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SQL_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SQL_Fragment newInstance(String param1, String param2) {
        SQL_Fragment fragment = new SQL_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        fillData();
    }

    private void fillData(){

        quesList = new ArrayList<>();
        quesList.add("Ques1");

        quesList.add("Ques5");

        quesList.add("Ques3");

        ques_ans_map = new HashMap<>();
        ques_ans_map.put(quesList.get(0),"Ans1");
        ques_ans_map.put(quesList.get(1),"Ans2");
        ques_ans_map.put(quesList.get(2),"Ans3");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sql, container, false);
        // Inflate the layout for this fragment




        expandableListView = (ExpandableListView)view.findViewById(R.id.expandableListViewsql);
        QABasic_ExList_Adapter qaAdapterObj = new QABasic_ExList_Adapter(quesList, ques_ans_map, getContext());
        expandableListView.setAdapter(qaAdapterObj);

        return view;
    }

}
