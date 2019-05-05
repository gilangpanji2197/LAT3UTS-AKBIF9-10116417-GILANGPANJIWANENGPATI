package com.example.gilang.myselfapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendHolder> {
    private List<FriendItem> FriendItemList;

    public FriendAdapter(List<FriendItem> FriendItemList) {
        this.FriendItemList = FriendItemList;
    }


    @Override
    public FriendHolder onCreateViewHolder(ViewGroup parent, int viewType){
        // Get LayoutInflater object.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the RecyclerView item layout xml.
        View FriendItemView = layoutInflater.inflate(R.layout.friend_list, parent, false);

        // Get car title text view object.
        final TextView FriendTitleView = (TextView)FriendItemView.findViewById(R.id.card_view_image_title);
        // Get car image view object.
        final ImageView FriendImageView = (ImageView)FriendItemView.findViewById(R.id.card_view_image);
        // When click the image.


        // Create and return our custom Car Recycler View Item Holder object.
        FriendHolder ret = new FriendHolder(FriendItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull FriendHolder holder, int position) {
        if (FriendItemList != null) {
            // Get car item dto in list.
            FriendItem FriendItem = FriendItemList.get(position);

            if (FriendItem != null) {
                // Set car item title.
                holder.getFriendTitleText().setText(FriendItem.getFriendName());
                // Set car image resource id.
                holder.getFriendImageView().setImageResource(FriendItem.getFriendImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if(FriendItemList!=null)
        {
            ret = FriendItemList.size();
        }
        return ret;
    }
}
