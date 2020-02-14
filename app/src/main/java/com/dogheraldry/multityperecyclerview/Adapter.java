package com.dogheraldry.multityperecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Model> datalist;
    private Context context;
    private int POST_TYPE_IMAGE = 1;
    private int POST_TYPE_TEXT = 2;

    public Adapter(List<Model> datalist, Context context) {
        this.datalist = datalist;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == POST_TYPE_IMAGE)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
            return new ImageViewHolder(view);
        }
        else
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_text,parent,false);
            return new TextViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (holder.getItemViewType() == POST_TYPE_TEXT)
        {
            TextViewHolder textViewHolder = new TextViewHolder(holder.itemView);
            textViewHolder.textView.setText(datalist.get(position).getTextview());
        }
        else
        {
            ImageViewHolder imageViewHolder = new ImageViewHolder(holder.itemView);
            Glide.with(context).load(datalist.get(position).getImageviewurl()).into(imageViewHolder.imageView);
            imageViewHolder.textViewimg.setText(datalist.get(position).getTextview());
        }

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (datalist.get(position).getImageviewurl().isEmpty())
        {
            return POST_TYPE_TEXT;
        }
        else
        {
            return POST_TYPE_IMAGE;
        }
    }
}
