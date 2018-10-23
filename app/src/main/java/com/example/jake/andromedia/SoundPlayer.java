package com.example.jake.andromedia;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

/**
 * Created by Jake on 27/04/2017.
 */

public class SoundPlayer {

    private AudioAttributes audioAttributes;
    final int SOUND_POOL_MAX = 10;

    private static SoundPool soundPool;
    private static int BackClick;
    private static int HomeClick;
    private static int BtnClick;

    public SoundPlayer(Context context){

        //SoundPool is deprecates in API level 21
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

            audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(audioAttributes)
                    .setMaxStreams(SOUND_POOL_MAX)
                    .build();
        } else {

            //SoundPlool (int maxStreams, int streamType, int srcQuality)
            soundPool = new SoundPool(SOUND_POOL_MAX, AudioManager.STREAM_MUSIC, 0);
        }

        BackClick = soundPool.load(context, R.raw.back_click, 1);
        //HomeClick = soundPool.load(context, R.raw.home, 1);
        //BtnClick = soundPool.load(context, R.raw.btn, 1);

    }

    public void playBackClick() {

        //play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate)
        soundPool.play(BackClick, 1.0f, 1.0f, 1, 0, 1.f);
    }

   /* public void playHomeClick() {

        //play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate)
        soundPool.play(BackClick, 1.0f, 1.0f, 1, 0, 10.f);
    }*/
}
