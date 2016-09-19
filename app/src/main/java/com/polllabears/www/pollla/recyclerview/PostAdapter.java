package com.polllabears.www.pollla.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.polllabears.www.pollla.R;
import com.polllabears.www.pollla.model.Card;

import java.util.ArrayList;

/**
 * Created by rheee on 9/18/16.
 */
public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {
    private Context mContext;
    private ArrayList<Card> cards;

    public PostAdapter(Context mContext, ArrayList<Card> cards) {
        this.mContext = mContext;
        this.cards = cards;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View baseView = View.inflate(mContext, R.layout.card_item, null);
        PostViewHolder postViewHolder = new PostViewHolder(baseView, this);

        return postViewHolder;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {

        Card card = cards.get(position);
        holder.tvUserName.setText(card.getName());
        holder.tvPostText.setText(card.getText());

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public void onTouchingClicked(int position){
        Card card = cards.get(position);
        Toast.makeText(mContext, "Clicked Touching of " + card.getName(), Toast.LENGTH_SHORT).show();
    }

    public void onShareClicked(int position){
        Card card = cards.get(position);
        Toast.makeText(mContext, "Clicked share of " + card.getName(), Toast.LENGTH_SHORT).show();
    }
}
