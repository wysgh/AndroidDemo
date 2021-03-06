package com.meevii.viewmodel.model;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

public class ChronometerViewModel extends ViewModel {

    @Nullable
    private Long mStartTime;

    @Nullable
    public Long getStartTime() {
        return mStartTime;
    }

    public void setStartTime(final long startTime) {
        this.mStartTime = startTime;
    }
}
