package com.example.aprendeaingls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aprendeaingls.animais.AnimaisFragment;
import com.example.aprendeaingls.numeros.NumerosFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {
    public SmartTabLayout smartTabLayout;
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout=findViewById(R.id.smartTab);
        viewPager=findViewById(R.id.viewpager);

        FragmentPagerItemAdapter adapter=new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Animais", AnimaisFragment.class)
                .add("Números", NumerosFragment.class)
                .create() );

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);



    }
}