package com.example.tutorialnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tutorialnews.adapter.NewsAdapter;
import com.example.tutorialnews.databinding.ActivityMainBinding;
import com.example.tutorialnews.fragment.CategoryFragment;
import com.example.tutorialnews.fragment.FavoriteFragment;
import com.example.tutorialnews.fragment.HomeFragment;
import com.example.tutorialnews.model.Article;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private HomeFragment homeFragment;
    private CategoryFragment categoryFragment;
    private FavoriteFragment favoriteFragment;
    private final FragmentManager fm = getSupportFragmentManager();
    private Fragment activeFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);


    }
}