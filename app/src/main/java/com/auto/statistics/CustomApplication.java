package com.auto.statistics;

import android.app.Application;

import com.auto.statistics.proxy.AutoStatisticsConfig;
import com.auto.statistics.proxy.util.DebugLogger;

/**
 * @author shhe
 * @Date 2020-03-12 20:02
 * @Description:
 */
public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AutoStatisticsConfig.sharedInstance().switchAutoTrack(true);
        DebugLogger.config(true);
    }
}
