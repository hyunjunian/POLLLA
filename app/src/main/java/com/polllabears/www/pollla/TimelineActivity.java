package com.polllabears.www.pollla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.polllabears.www.pollla.model.Card;
import com.polllabears.www.pollla.recyclerview.PostAdapter;

import java.util.ArrayList;

public class TimelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        ArrayList<Card> cardList = new ArrayList<>();
        RecyclerView rvView = (RecyclerView) findViewById(R.id.rv_list);

        for (int i = 0 ; i < 10 ; i++ ){
            Card card = new Card(i+"'s User", "Have a good day :)");
            cardList.add(i, card);
        }

        PostAdapter adapter = new PostAdapter(this, cardList);
        rvView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));
        rvView.setAdapter(adapter);
    }
}
