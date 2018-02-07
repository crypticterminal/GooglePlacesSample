package com.webonise.places.storage;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.webonise.places.Place;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface PlacesLocalRepo {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDetails(Place stepDetails);

    @Query("SELECT * from place")
    Single<List<Place>> getCachePlaceList();
}