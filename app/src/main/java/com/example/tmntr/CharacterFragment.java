package com.example.tmntr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CharacterFragment extends Fragment {

    private Character mCharacter;
    private ImageButton mImageButton;
    private TextView mTextView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCharacter = new Character();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_character,container,false);
        mImageButton = v.findViewById(R.id.turtles_image);
        mTextView = v.findViewById(R.id.textview_nameshow);
        mImageButton.setOnClickListener((view) ->{onClickTurtleImage();});
        return v;
    }

    private void onClickTurtleImage(){

    }
}
