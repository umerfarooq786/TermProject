package com.example.umerfarooq.uolbuscheckinsystem;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Umer Farooq on 12/17/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    List<Bus> buses;
    View view;
    public MyAdapter(List<Bus> buses)
    {
        this.buses=buses;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView busId;
        TextView busNumber;
        public MyViewHolder(View itemView){
            super(itemView);
            busId=itemView.findViewById(R.id.busId);
            busNumber=itemView.findViewById(R.id.busNumber);
        }

    }
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Bus bus=buses.get(position);
        holder.busId.setText(bus.getId().toString());
        holder.busNumber.setText(bus.getBusNumber().toString());

    }

    @Override
    public int getItemCount() {
        return buses.size();
    }
}
