package com.example.cocktails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends AppCompatActivity implements CocktailListFragment.Listener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            // tu pojawi się kod związany z dodaniem fragmentu do układu
            CocktailDetailFragment details = new CocktailDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setCocktail(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_COCKTAIL_ID, (int) id);
            startActivity(intent);
        }
    }

}