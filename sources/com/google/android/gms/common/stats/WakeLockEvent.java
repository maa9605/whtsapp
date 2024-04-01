package com.google.android.gms.common.stats;

import X.AnonymousClass088;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.15q
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 2:
                        j = C07K.A0N(parcel, readInt);
                        break;
                    case 3:
                    case 7:
                    case 9:
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                    case 4:
                        str = C07K.A0u(parcel, readInt);
                        break;
                    case 5:
                        i3 = C07K.A0A(parcel, readInt);
                        break;
                    case 6:
                        arrayList = C07K.A0y(parcel, readInt);
                        break;
                    case 8:
                        j2 = C07K.A0N(parcel, readInt);
                        break;
                    case 10:
                        str3 = C07K.A0u(parcel, readInt);
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        i2 = C07K.A0A(parcel, readInt);
                        break;
                    case 12:
                        str2 = C07K.A0u(parcel, readInt);
                        break;
                    case 13:
                        str4 = C07K.A0u(parcel, readInt);
                        break;
                    case 14:
                        i4 = C07K.A0A(parcel, readInt);
                        break;
                    case 15:
                        f = C07K.A03(parcel, readInt);
                        break;
                    case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        j3 = C07K.A0N(parcel, readInt);
                        break;
                    case 17:
                        str5 = C07K.A0u(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new WakeLockEvent[i];
        }
    };
    public int A00;
    public int A01;
    public long A02 = -1;
    public final float A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.A05 = i;
        this.A07 = j;
        this.A00 = i2;
        this.A09 = str;
        this.A0A = str3;
        this.A0B = str5;
        this.A04 = i3;
        this.A0E = list;
        this.A0C = str2;
        this.A08 = j2;
        this.A01 = i4;
        this.A0D = str4;
        this.A03 = f;
        this.A06 = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1G(parcel, 1, this.A05);
        AnonymousClass088.A1I(parcel, 2, this.A07);
        AnonymousClass088.A1M(parcel, 4, this.A09, false);
        AnonymousClass088.A1G(parcel, 5, this.A04);
        AnonymousClass088.A1N(parcel, 6, this.A0E);
        AnonymousClass088.A1I(parcel, 8, this.A08);
        AnonymousClass088.A1M(parcel, 10, this.A0A, false);
        AnonymousClass088.A1G(parcel, 11, this.A00);
        AnonymousClass088.A1M(parcel, 12, this.A0C, false);
        AnonymousClass088.A1M(parcel, 13, this.A0D, false);
        AnonymousClass088.A1G(parcel, 14, this.A01);
        AnonymousClass088.A1F(parcel, 15, this.A03);
        AnonymousClass088.A1I(parcel, 16, this.A06);
        AnonymousClass088.A1M(parcel, 17, this.A0B, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
