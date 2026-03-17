package com.example.myapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {wypieki.class}, version = 1)
public abstract class przepisyDB extends RoomDatabase {
    public abstract wypiekiDao zwrocWypiekiDao();

    private static przepisyDB instancja;

    public static przepisyDB zwrocInstancjeBazyDanych(Context context) {
        if (instancja == null) {
            instancja = Room.databaseBuilder(
                    context,
                    przepisyDB.class,
                    "przepisy_db"
            ).allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return instancja;
    }
}