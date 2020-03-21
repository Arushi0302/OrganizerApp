package com.example.projectmad.ui.slideshow;

import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Calender");

    }

    public LiveData<String> getText() {
        return mText;
    }
}