package com.example.mo.qainterviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Mo on 28-09-2016.
 */
public class QABasic_ExList_Adapter extends BaseExpandableListAdapter {


    List<String> quesList;
    Map<String,String> ques_ans_map;
    Context context;

    public QABasic_ExList_Adapter(List<String> quesList, Map<String,String> ques_ans_map, Context context) {
        this.quesList = quesList;
        this.ques_ans_map= ques_ans_map;
        this.context = context;
    }



    @Override
    public int getGroupCount() {

        return quesList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {

        String groupName = quesList.get(groupPosition);

        return groupName;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        String groupName = quesList.get(groupPosition);
       String childValue =  ques_ans_map.get(groupName);


        return childValue;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
       return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        if  (convertView==null) {
         //Load convertView for the first time
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.parent_list_fragment_qabasic, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.parent_qabasic);
        String groupName = (String)getGroup(groupPosition);
        textView.setText(groupName);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {


        if(convertView==null){

            LayoutInflater childLayoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView  = childLayoutInflater.inflate(R.layout.child_list_fragment_qabasic,null);
        }

        TextView textView = (TextView)convertView.findViewById(R.id.child_qabasic);
        String childValue = (String)getChild(groupPosition,childPosition);
        textView.setText(childValue);



        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
