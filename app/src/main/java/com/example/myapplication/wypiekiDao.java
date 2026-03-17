package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface wypiekiDao {
    @Insert
    public void wstawWypiekDoBazy(wypieki wypieki);

    @Insert
    public void wstawKilkaWypiekDoBazy(wypieki ...wypieki);

    @Delete
    public void usunZBazy(wypieki wypieki);

    @Update
    public void zaktualizuj(wypieki wypieki);
    @Query("Select * from wypieki_tabela")
    List<wypieki> zwrocWszystkieWypiekiZBazy();

    @Query("Select nazwa from wypieki_tabela where `czas pieczenia` < :czas")
    List<String> zwrocNazwyWypiekow(int czas);
}
