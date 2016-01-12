package com.ssl.myredditclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        LinkAdapter linkAdapter = new LinkAdapter(createList(30));
        recyclerView.setAdapter(linkAdapter);
    }

    private List<LinkViewModel> createList(int size) {

        List<LinkViewModel> result = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            String textTitle = "Link Title " + i;
            String submittedTitle = "Submitted " + i + " days ago by me" + i;
            String commentsText = i + " comments";
            LinkViewModel linkViewModel = new LinkViewModel(textTitle, submittedTitle, commentsText);
            result.add(linkViewModel);
        }

        return result;
    }
}
