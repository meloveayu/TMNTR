package com.example.tmntr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends FragmentActivity {

        protected abstract Fragment createFragment();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fragment);
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragment = fm.findFragmentById(R.id.fragment_container);
            if (fragment == null){
                fragment = new CharacterFragment();
                fm.beginTransaction()
                        .add(R.id.fragment_container,fragment)
                        .commit();
            }
        }
}
