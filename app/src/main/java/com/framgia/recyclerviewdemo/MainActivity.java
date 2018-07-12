package com.framgia.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HeroAdapter mAdapter;
    private RecyclerView mRecyclerHero;
    private List<Hero> mListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupData();

        mRecyclerHero = findViewById(R.id.recycler_view_hero);
        mAdapter = new HeroAdapter(this,mListData);
        mRecyclerHero.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerHero.setItemAnimator(new DefaultItemAnimator());
        mRecyclerHero.setAdapter(mAdapter);

    }

    private void setupData() {
        mListData = new ArrayList<>();
        mListData.add(new Hero(R.drawable.ic_captain,"Captain America"));
        mListData.add(new Hero(R.drawable.ic_drstrange,"Dr Strange"));
        mListData.add(new Hero(R.drawable.ic_groot,"Groot"));
        mListData.add(new Hero(R.drawable.ic_ironman,"Iron Man"));
        mListData.add(new Hero(R.drawable.ic_spider,"Spider Man"));
        mListData.add(new Hero(R.drawable.ic_venom,"Venom"));
    }
}

