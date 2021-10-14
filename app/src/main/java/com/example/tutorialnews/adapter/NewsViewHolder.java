package com.example.tutorialnews.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tutorialnews.R;
import com.example.tutorialnews.model.Article;

public class NewsViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivNewsThumbnail;
    private TextView tvNewsTitle;
    private TextView tvNewsDes, tvNewsPublishedAt;

    public NewsViewHolder(View itemView){
        super(itemView);
        ivNewsThumbnail = itemView.findViewById(R.id.ivNewsThumbnail);
        tvNewsTitle = itemView.findViewById(R.id.tvNewsTitle);
        tvNewsDes = itemView.findViewById(R.id.tvNewsDes);
        tvNewsPublishedAt = itemView.findViewById(R.id.tvNewsPublishedAt);
    }
    public void onBindView(Context context, Article article){
        Glide.with(ivNewsThumbnail.getContext())
                .load(article.getUrlToImage())
                .error(R.color.app_color)
                .placeholder(R.color.app_color)
                .into(ivNewsThumbnail);
        tvNewsTitle.setText(article.getTitle());
        tvNewsDes.setText(article.getDescription());
        tvNewsPublishedAt.setText(article.getPublishedAt());
    }
}
