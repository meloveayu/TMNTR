package com.example.tmntr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CharacterListFragment extends Fragment {

    private RecyclerView mCharacterRecyclerView;
    private CharacterAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_character_list,container,false);
        mCharacterRecyclerView = v.findViewById(R.id.character_recycler_view);
        mCharacterRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return v;
    }

    private void updateUI(){
        CharacterLab characterLab = CharacterLab.get(getActivity());
        List<Character> characters = characterLab.getCharacters();
        mAdapter = new CharacterAdapter(characters);
        mCharacterRecyclerView.setAdapter(mAdapter);
    }

    private class  CharacterHolder extends RecyclerView.ViewHolder{
        public TextView mTitleTextView;
        public CharacterHolder(View itemView){
            super(itemView);
            mTitleTextView = (TextView) itemView;
        }
    }

    private class  CharacterAdapter extends RecyclerView.Adapter<CharacterHolder>{

        private List<Character> mCharacters;
        public CharacterAdapter(List<Character> characters){
            mCharacters = characters;
        }

        @NonNull
        @Override
        public CharacterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1,parent,false);
            return  new CharacterHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CharacterHolder holder, int position) {
            Character character = mCharacters.get(position);
            holder.mTitleTextView.setText(character.getName());
        }

        @Override
        public int getItemCount() {
            return mCharacters.size();
        }
    }
}
