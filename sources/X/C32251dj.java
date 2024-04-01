package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1dj */
/* loaded from: classes.dex */
public final class C32251dj extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.19c
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            Uri uri = null;
            Bundle bundle = null;
            byte[] bArr = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                int i = 65535 & readInt;
                if (i == 2) {
                    uri = (Uri) C07K.A0W(parcel, readInt, Uri.CREATOR);
                } else if (i == 4) {
                    bundle = C07K.A0T(parcel, readInt);
                } else if (i != 5) {
                    C07K.A1H(parcel, readInt);
                } else {
                    bArr = C07K.A1o(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C32251dj(uri, bundle, bArr);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C32251dj[i];
        }
    };
    public byte[] A00;
    public final Uri A01;
    public final Map A02;

    public C32251dj(Uri uri, Bundle bundle, byte[] bArr) {
        this.A01 = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getParcelable(str));
        }
        this.A02 = hashMap;
        this.A00 = bArr;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.A00;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
        sb2.append(",dataSz=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        Map map = this.A02;
        int size = map.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String valueOf2 = String.valueOf(this.A01);
        StringBuilder sb4 = new StringBuilder(valueOf2.length() + 6);
        sb4.append(", uri=");
        sb4.append(valueOf2);
        sb.append(sb4.toString());
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : map.keySet()) {
            String valueOf3 = String.valueOf(map.get(str));
            sb.append(C000200d.A08(valueOf3.length() + C000200d.A00(str, 7), "\n    ", str, ": ", valueOf3));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1L(parcel, 2, this.A01, i, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry entry : this.A02.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((C19S) entry.getValue()));
        }
        AnonymousClass088.A1J(parcel, 4, bundle);
        AnonymousClass088.A1Q(parcel, 5, this.A00, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
