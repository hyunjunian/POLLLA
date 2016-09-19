package com.polllabears.www.pollla.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.polllabears.www.pollla.R;

/**
 * Created by rheee on 9/18/16.
 */
public class PostViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ImageView ivPostImg, ivTouching, ivShare;
    public TextView tvUserName, tvPostText;
    public PostAdapter mPostAdapter;

    public PostViewHolder(View itemView, PostAdapter postAdapter) {
        super(itemView);
        mPostAdapter = postAdapter;

        ivPostImg = (ImageView) itemView.findViewById(R.id.iv_post_img);
        ivTouching = (ImageView) itemView.findViewById(R.id.iv_touching);
        ivShare = (ImageView) itemView.findViewById(R.id.iv_share);

        tvUserName = (TextView) itemView.findViewById(R.id.tv_user_name);
        tvPostText = (TextView) itemView.findViewById(R.id.tv_post_text);

        ivTouching.setOnClickListener(this);
        ivShare.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();

        switch (view.getId()){
            case R.id.iv_touching:
                mPostAdapter.onTouchingClicked(position);
                break;

            case R.id.iv_share:
                mPostAdapter.onShareClicked(position);
                break;
        }

    }
}
