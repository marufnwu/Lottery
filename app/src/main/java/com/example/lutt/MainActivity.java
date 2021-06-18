package com.example.lutt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.lutt.ui.OldResultActivity;
import com.example.lutt.ui.SPL_Or_BumperActivity;
import com.example.lutt.ui.TodayResultActivity;
import com.example.lutt.ui.Winning_NumbersActivity;
import com.example.lutt.ui.YesVsPreActivity;
import com.example.lutt.ui.YesterdayResultActivity;
import com.example.lutt.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private ActionBarDrawerToggle tog;
    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        binding.todayNumberCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Today_Number_CheckActivity.class));
            }
        });
       binding.PrizeWinners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Fst_Prize_WinnersActivity.class));
            }
        });
        binding.LuckeyNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Your_Lucky_NumbersActivity.class));
            }
        });


        tog = new ActionBarDrawerToggle(this, binding.drawerLayout, toolbar, R.string.open, R.string.close);
        //drawer ke lichen korar jonno .// drawer tog ke lichen korbe..
        binding.drawerLayout.addDrawerListener(tog);
        //sink korte hobe
        tog.syncState();
        binding.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.night_Mood:
                        Toast.makeText(MainActivity.this, "Night Mode", Toast.LENGTH_SHORT).show();
                        binding.drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.Setings:
                        Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                        binding.drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.Share:
                        Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                        binding.drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.appPrivacy:
                        Toast.makeText(MainActivity.this, "App Privacy", Toast.LENGTH_SHORT).show();
                        binding.drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.contactUs:
                        Toast.makeText(MainActivity.this, "Contact Us", Toast.LENGTH_SHORT).show();
                        binding.drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.MoreApps:
                        Toast.makeText(MainActivity.this, "More Apps", Toast.LENGTH_SHORT).show();
                        binding.drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        binding.drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });

        //gridLayout work part
        clickEvenr(binding.gradLayout);



    }

    private void clickEvenr(GridLayout gridLayout) {

        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int position = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position == 0) {
                        startActivity(new Intent(MainActivity.this, TodayResultActivity.class));
                    } else if (position == 1) {
                        startActivity(new Intent(MainActivity.this, YesterdayResultActivity.class));
                    } else if (position == 2) {
                        startActivity(new Intent(MainActivity.this, YesVsPreActivity.class));
                    } else if (position == 3) {
                        startActivity(new Intent(MainActivity.this, OldResultActivity.class));
                    } else if (position == 4) {
                        startActivity(new Intent(MainActivity.this, SPL_Or_BumperActivity.class));
                    } else {
                        startActivity(new Intent(MainActivity.this, Winning_NumbersActivity.class));
                    }
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Press Back again to leave!", Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }
}