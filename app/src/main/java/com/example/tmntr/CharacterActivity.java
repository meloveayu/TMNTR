package com.example.tmntr;

import androidx.fragment.app.Fragment;

public class CharacterActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CharacterFragment();
    }
}
