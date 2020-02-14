package com.dogheraldry.multityperecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Model> modelList;
    private Adapter adapter;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        loadList();
        adapter = new Adapter(modelList, this);
        recyclerView.setAdapter(adapter);


    }

    private void loadList() {

        modelList.add(new Model("https://i.picsum.photos/id/500/200/300.jpg?blur=5", "User1"));
        modelList.add(new Model("", "User2"));
        modelList.add(new Model("", "User3"));
        modelList.add(new Model("https://i.picsum.photos/id/500/200/300.jpg?blur=5", "User5"));
        modelList.add(new Model("https://i.picsum.photos/id/500/200/300.jpg?blur=5", "User6"));
        modelList.add(new Model("https://i.picsum.photos/id/500/200/300.jpg?blur=5", "User7"));
        modelList.add(new Model("", "User8"));
        modelList.add(new Model("", "User4"));


    }
}
