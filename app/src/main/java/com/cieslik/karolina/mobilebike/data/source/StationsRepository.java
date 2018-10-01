package com.cieslik.karolina.mobilebike.data.source;

import android.support.annotation.NonNull;

public class StationsRepository implements StationsDataSource
{
    private static StationsRepository INSTANCE = null;

    private final StationsDataSource mStationsLocalDataSource;

    private final StationsDataSource mStationsRemoteDataSource;

    private StationsRepository(
            @NonNull StationsDataSource stationsLocalDataSource,
            @NonNull StationsDataSource stationsRemoteDataSource)
    {
        mStationsLocalDataSource = stationsLocalDataSource;
        mStationsRemoteDataSource = stationsRemoteDataSource;
    }

    public static StationsRepository getInstance(StationsDataSource stationsLocalDataSource,
            StationsDataSource stationsRemoteDataSource)
    {
        if (INSTANCE == null)
        {
            return new StationsRepository(stationsLocalDataSource, stationsRemoteDataSource);
        }

        return INSTANCE;
    }
}
