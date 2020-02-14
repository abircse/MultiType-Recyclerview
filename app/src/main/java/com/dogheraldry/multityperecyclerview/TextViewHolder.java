package com.dogheraldry.multityperecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TextViewHolder extends RecyclerView.ViewHolder{

    TextView textView;

    public TextViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textViewtext);
    }
}
