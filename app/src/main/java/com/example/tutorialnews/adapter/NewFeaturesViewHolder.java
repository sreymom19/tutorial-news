package com.example.tutorialnews.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tutorialnews.R;
import com.example.tutorialnews.model.Article;

public class NewFeaturesViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivFeatureThumbnail;
    private TextView tvFeatureTitle, tvFeaturePublishedAt;

    public NewFeaturesViewHolder(View itemView){
        super(itemView);
        ivFeatureThumbnail = itemView.findViewById(R.id.ivFeatureThumbnail);
        tvFeatureTitle = itemView.findViewById(R.id.tvFeatureTitle);
        tvFeaturePublishedAt = itemView.findViewById(R.id.tvFeaturePublishedAt);
    }
    public void onBindView(Context context, Article article){
        Glide.with(ivFeatureThumbnail.getContext())
                .load(article.getUrlToImage())
                .error(R.color.app_color)
                .placeholder(R.color.app_color)
                .into(ivFeatureThumbnail);
        tvFeatureTitle.setText(article.getTitle());
        tvFeaturePublishedAt.setText(article.getPublishedAt());
    }
}
