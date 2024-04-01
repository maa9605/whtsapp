package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.0wx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20170wx implements Parcelable {
    public static final C20170wx A03 = new C20170wx();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0ww
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C20170wx(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C20170wx[i];
        }
    };
    public final TreeMap A00;
    public final TreeMap A01;
    public final TreeMap A02;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C20170wx() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public C20170wx(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(C20170wx.class.getClassLoader());
        Set<String> keySet = readBundle.keySet();
        if (!keySet.isEmpty()) {
            this.A02 = new TreeMap();
            for (String str : keySet) {
                this.A02.put(str, Integer.valueOf(readBundle.getInt(str)));
            }
        } else {
            this.A02 = null;
        }
        Bundle readBundle2 = parcel.readBundle(C20170wx.class.getClassLoader());
        Set<String> keySet2 = readBundle2.keySet();
        if (!keySet2.isEmpty()) {
            this.A00 = new TreeMap();
            for (String str2 : keySet2) {
                this.A00.put(str2, Boolean.valueOf(readBundle2.getBoolean(str2)));
            }
        } else {
            this.A00 = null;
        }
        Bundle readBundle3 = parcel.readBundle(C20170wx.class.getClassLoader());
        Set<String> keySet3 = readBundle3.keySet();
        if (!keySet3.isEmpty()) {
            this.A01 = new TreeMap();
            for (String str3 : keySet3) {
                this.A01.put(str3, readBundle3.getIntArray(str3));
            }
            return;
        }
        this.A01 = null;
    }

    public int A00(String str, int i) {
        Number number;
        TreeMap treeMap = this.A02;
        return (treeMap == null || (number = (Number) treeMap.get(str)) == null) ? i : number.intValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        TreeMap treeMap = this.A02;
        if (treeMap != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                bundle.putInt((String) entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        TreeMap treeMap2 = this.A00;
        if (treeMap2 != null) {
            for (Map.Entry entry2 : treeMap2.entrySet()) {
                bundle2.putBoolean((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
        }
        parcel.writeBundle(bundle2);
        Bundle bundle3 = new Bundle();
        TreeMap treeMap3 = this.A01;
        if (treeMap3 != null) {
            for (Map.Entry entry3 : treeMap3.entrySet()) {
                bundle3.putIntArray((String) entry3.getKey(), (int[]) entry3.getValue());
            }
        }
        parcel.writeBundle(bundle3);
    }
}
