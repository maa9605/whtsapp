package com.google.android.gms.common.data;

import X.AnonymousClass088;
import X.C07K;
import X.C08G;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.Closeable;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends C08G implements Closeable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.14n
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String[] strArr = null;
            CursorWindow[] cursorWindowArr = null;
            Bundle bundle = null;
            int i = 0;
            int i2 = 0;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i3 = 65535 & readInt;
                if (i3 == 1) {
                    strArr = C07K.A1s(parcel, readInt);
                } else if (i3 == 2) {
                    cursorWindowArr = (CursorWindow[]) C07K.A1r(parcel, readInt, CursorWindow.CREATOR);
                } else if (i3 == 3) {
                    i2 = C07K.A0A(parcel, readInt);
                } else if (i3 == 4) {
                    bundle = C07K.A0T(parcel, readInt);
                } else if (i3 != 1000) {
                    C07K.A1H(parcel, readInt);
                } else {
                    i = C07K.A0A(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
            dataHolder.A01 = new Bundle();
            int i4 = 0;
            while (true) {
                String[] strArr2 = dataHolder.A09;
                if (i4 >= strArr2.length) {
                    break;
                }
                dataHolder.A01.putInt(strArr2[i4], i4);
                i4++;
            }
            CursorWindow[] cursorWindowArr2 = dataHolder.A08;
            int length = cursorWindowArr2.length;
            dataHolder.A04 = new int[length];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                dataHolder.A04[i6] = i5;
                i5 += cursorWindowArr2[i6].getNumRows() - (i5 - cursorWindowArr2[i6].getStartPosition());
            }
            dataHolder.A00 = i5;
            return dataHolder;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new DataHolder[i];
        }
    };
    public int A00;
    public Bundle A01;
    public boolean A02 = false;
    public boolean A03 = true;
    public int[] A04;
    public final int A05;
    public final int A06;
    public final Bundle A07;
    public final CursorWindow[] A08;
    public final String[] A09;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.A05 = i;
        this.A09 = strArr;
        this.A08 = cursorWindowArr;
        this.A06 = i2;
        this.A07 = bundle;
    }

    static {
        C07K.A1P(new String[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A08;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.A08.length > 0) {
                synchronized (this) {
                    z = this.A02;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        String[] strArr = this.A09;
        if (strArr != null) {
            int A032 = AnonymousClass088.A03(parcel, 1);
            parcel.writeStringArray(strArr);
            AnonymousClass088.A1D(parcel, A032);
        }
        AnonymousClass088.A1R(parcel, 2, this.A08, i);
        AnonymousClass088.A1G(parcel, 3, this.A06);
        AnonymousClass088.A1J(parcel, 4, this.A07);
        AnonymousClass088.A1G(parcel, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A05);
        AnonymousClass088.A1D(parcel, A03);
        if ((i & 1) != 0) {
            close();
        }
    }
}
