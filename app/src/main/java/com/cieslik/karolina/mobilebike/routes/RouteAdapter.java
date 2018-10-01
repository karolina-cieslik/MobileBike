package com.cieslik.karolina.mobilebike.routes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class RouteAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    interface RouteAdapterInterface
    {

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return 0;
    }

    public class RouteViewHolder extends RecyclerView.ViewHolder
    {

        public RouteViewHolder(View itemView)
        {
            super(itemView);
        }
    }
}
