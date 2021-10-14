package com.example.tutorialnews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tutorialnews.Constant;
import com.example.tutorialnews.R;
import com.example.tutorialnews.model.Article;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int NORMAL = 0;
    private static final int FEATURE = 1;
    private static final int EMPTY = 2;
    private static final int LOADING = 3;
    private Context context;
    private ArrayList<Article> articles;

    public NewsAdapter(Context context, ArrayList<Article> articles) {
        this.context = context;
        this.articles = articles;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (articles.get(position).getType() == null) {
            return NORMAL;
        } else {
            switch (articles.get(position).getType()) {
                case Constant.FEATURE:
                    return FEATURE;
                case Constant.EMPTY:
                    return EMPTY;
                case Constant.LOADING:
                    return LOADING;
                default:
                    return NORMAL;
            }
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case FEATURE:
                return new NewFeaturesViewHolder(LayoutInflater.from(context).inflate(R.layout.feature_news_layout, parent, false));
            case EMPTY:
                return new NewsEmptyViewHolder(LayoutInflater.from(context).inflate(R.layout.feature_news_layout, parent, false));
            case LOADING:
                return new NewsLoadingViewHolder(LayoutInflater.from(context).inflate(R.layout.feature_news_layout, parent, false));
            default:
                return new NewsViewHolder(LayoutInflater.from(context).inflate(R.layout.normal_news_layout, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof NewFeaturesViewHolder) {
            ((NewFeaturesViewHolder) holder).onBindView(context, articles.get(position));
        } else if (holder instanceof NewsEmptyViewHolder) {
            ((NewsEmptyViewHolder) holder).onBindView();
        } else if (holder instanceof NewsLoadingViewHolder) {
            ((NewsLoadingViewHolder) holder).onBindView();
        } else {
            ((NewsViewHolder) holder).onBindView(context, articles.get(position));
        }
    }


}
