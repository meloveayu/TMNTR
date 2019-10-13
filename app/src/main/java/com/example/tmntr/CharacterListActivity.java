package com.example.tmntr;

import androidx.fragment.app.Fragment;

public class CharacterListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return  new  CharacterListFragment();
    }
}
