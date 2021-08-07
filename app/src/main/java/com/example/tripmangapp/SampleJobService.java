package com.example.tripmangapp;

import android.app.job.JobParameters;
import android.app.job.JobService;

/**
 * Created by vishwa on 07,August,2021
 */
public class SampleJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
