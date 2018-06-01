package com.example.ios_razrab.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class PodParcelable implements Parcelable {
    /**
     * Нужные нам поля
     * */
    int age;
    String name;

    /**
     * Кастомный конструктор
     * */
    public PodParcelable(int age, String name){
        this .age = age;
        this .name = name;
    }

    public static final Parcelable .Creator <PodParcelable>CREATOR =
            new Parcelable.Creator<PodParcelable>(){
        // распаковываем объект из Parcel

                @Override
                public PodParcelable createFromParcel(Parcel source) {

                    return new PodParcelable(source);
                }

                @Override
                public PodParcelable[] newArray(int size) {
                    return new PodParcelable[size];
                }
            };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    /**
     * Упаковываем объект для передачи
     * */
    public void writeToParcel(Parcel dest, int flags) {
        dest .writeInt(age);
        dest .writeString(name);
    }


    private PodParcelable(Parcel parcel){
        age = parcel .readInt();
        name = parcel .readString();
    }
}
