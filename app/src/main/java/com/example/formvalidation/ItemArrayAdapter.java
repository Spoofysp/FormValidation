package com.example.formvalidation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.MyViewHolder>{
    public item[] newListData;

    //RecyclerView
        public ItemArrayAdapter(item[] newListData){
      this.newListData = newListData;
        }

        public ItemArrayAdapter(int listView, item[] newListData) {
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
         LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
         View listItem= layoutInflater.inflate(R.layout.dashboard_list,parent,false);
            MyViewHolder viewHolder=new MyViewHolder(listItem);
         return viewHolder;
        }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
     final item itemList =newListData[position];
        holder.textview.setText(itemList.getName());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+itemList.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return newListData.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
    public TextView textview;
    public RelativeLayout relativeLayout;
    public MyViewHolder(View itemView){
        super(itemView);
            this.textview = (TextView) itemView.findViewById(R.id.listView);
            relativeLayout=(RelativeLayout) itemView.findViewById(R.id.relativeLayout);
        }

        }

}
