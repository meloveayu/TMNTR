package com.example.tmntr;

import java.util.UUID;

public class Character {

    private UUID mUUID;
    private int mCharacterPicId;
    private String mName;
    private String mNickName;
    private int mProgramPicId;
    private String mProgramName;

    public UUID getUUID() {
        return mUUID;
    }

    public int getCharacterPicId() {
        return mCharacterPicId;
    }

    public void setCharacterPicId(int characterPicId) {
        mCharacterPicId = characterPicId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNickName() {
        return mNickName;
    }

    public void setNickName(String nickName) {
        mNickName = nickName;
    }

    public int getProgramPicId() {
        return mProgramPicId;
    }

    public void setProgramPicId(int programPicId) {
        mProgramPicId = programPicId;
    }

    public String getProgramName() {
        return mProgramName;
    }

    public void setProgramName(String programName) {
        mProgramName = programName;
    }

    public  Character(){
        mUUID = UUID.randomUUID();
    }
}
