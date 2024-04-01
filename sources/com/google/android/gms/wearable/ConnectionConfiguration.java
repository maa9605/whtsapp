package com.google.android.gms.wearable;

import X.AnonymousClass088;
import X.C000200d;
import X.C07K;
import X.C08G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ConnectionConfiguration extends C08G implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.1A8
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 2:
                        str = C07K.A0u(parcel, readInt);
                        break;
                    case 3:
                        str2 = C07K.A0u(parcel, readInt);
                        break;
                    case 4:
                        i = C07K.A0A(parcel, readInt);
                        break;
                    case 5:
                        i2 = C07K.A0A(parcel, readInt);
                        break;
                    case 6:
                        z = C07K.A1i(parcel, readInt);
                        break;
                    case 7:
                        z2 = C07K.A1i(parcel, readInt);
                        break;
                    case 8:
                        str3 = C07K.A0u(parcel, readInt);
                        break;
                    case 9:
                        z3 = C07K.A1i(parcel, readInt);
                        break;
                    case 10:
                        str4 = C07K.A0u(parcel, readInt);
                        break;
                    default:
                        C07K.A1H(parcel, readInt);
                        break;
                }
            }
            C07K.A1G(parcel, A09);
            return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ConnectionConfiguration[i];
        }
    };
    public String A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public volatile String A07;
    public volatile boolean A08;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A03 = i2;
        this.A06 = z;
        this.A08 = z2;
        this.A07 = str3;
        this.A01 = z3;
        this.A00 = str4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ConnectionConfiguration) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            return C07K.A1k(this.A04, connectionConfiguration.A04) && C07K.A1k(this.A05, connectionConfiguration.A05) && C07K.A1k(Integer.valueOf(this.A02), Integer.valueOf(connectionConfiguration.A02)) && C07K.A1k(Integer.valueOf(this.A03), Integer.valueOf(connectionConfiguration.A03)) && C07K.A1k(Boolean.valueOf(this.A06), Boolean.valueOf(connectionConfiguration.A06)) && C07K.A1k(Boolean.valueOf(this.A01), Boolean.valueOf(connectionConfiguration.A01));
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, Integer.valueOf(this.A02), Integer.valueOf(this.A03), Boolean.valueOf(this.A06), Boolean.valueOf(this.A01)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.A04);
        sb.append(valueOf.length() != 0 ? "mName=".concat(valueOf) : new String("mName="));
        String valueOf2 = String.valueOf(this.A05);
        sb.append(valueOf2.length() != 0 ? ", mAddress=".concat(valueOf2) : new String(", mAddress="));
        int i = this.A02;
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append(", mType=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.A03;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append(", mRole=");
        sb3.append(i2);
        sb.append(sb3.toString());
        boolean z = this.A06;
        StringBuilder sb4 = new StringBuilder(16);
        sb4.append(", mEnabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.A08;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append(", mIsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String valueOf3 = String.valueOf(this.A07);
        sb.append(valueOf3.length() != 0 ? ", mPeerNodeId=".concat(valueOf3) : new String(", mPeerNodeId="));
        boolean z3 = this.A01;
        StringBuilder sb6 = new StringBuilder(21);
        sb6.append(", mBtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String valueOf4 = String.valueOf(this.A00);
        return C000200d.A0L(sb, valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new String(", mNodeId="), "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A04, false);
        AnonymousClass088.A1M(parcel, 3, this.A05, false);
        AnonymousClass088.A1G(parcel, 4, this.A02);
        AnonymousClass088.A1G(parcel, 5, this.A03);
        AnonymousClass088.A1P(parcel, 6, this.A06);
        AnonymousClass088.A1P(parcel, 7, this.A08);
        AnonymousClass088.A1M(parcel, 8, this.A07, false);
        AnonymousClass088.A1P(parcel, 9, this.A01);
        AnonymousClass088.A1M(parcel, 10, this.A00, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
