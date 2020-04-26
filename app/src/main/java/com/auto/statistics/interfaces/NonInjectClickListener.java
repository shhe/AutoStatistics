package com.auto.statistics.interfaces;

import android.view.View;

import com.auto.statistics.annotation.NonInjection;

/**
 * @author shhe
 * @Date 2020-04-26 10:44
 * @Description:
 */
public class NonInjectClickListener implements View.OnClickListener {
    @NonInjection
    @Override
    public void onClick(View v) {

    }
}
