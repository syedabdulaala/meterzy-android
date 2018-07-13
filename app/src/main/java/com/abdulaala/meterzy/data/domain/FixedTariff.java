package com.abdulaala.meterzy.data.domain;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Tariff.class, parentColumns = "id",
        childColumns = "tariffId", onDelete = ForeignKey.CASCADE),
        indices = {@Index(value = {"tariffId"})})
public class FixedTariff {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTariffId() {
        return tariffId;
    }

    public void setTariffId(int tariffId) {
        this.tariffId = tariffId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int tariffId;
    private float amount;
    private String name;
}