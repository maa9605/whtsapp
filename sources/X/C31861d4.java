package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1d4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31861d4 extends C08G {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.18h
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int A09 = C07K.A09(parcel);
            String str = null;
            while (parcel.dataPosition() < A09) {
                int readInt = parcel.readInt();
                if ((65535 & readInt) != 2) {
                    C07K.A1H(parcel, readInt);
                } else {
                    str = C07K.A0u(parcel, readInt);
                }
            }
            C07K.A1G(parcel, A09);
            return new C31861d4(str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new C31861d4[i];
        }
    };
    public String A00;

    public C31861d4(String str) {
        this.A00 = str;
    }

    public static C31861d4 A00(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            openRawResource.close();
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
            return new C31861d4(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
            sb.append("Failed to read resource ");
            sb.append(i);
            sb.append(": ");
            sb.append(valueOf);
            throw new Resources.NotFoundException(sb.toString());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = AnonymousClass088.A03(parcel, 20293);
        AnonymousClass088.A1M(parcel, 2, this.A00, false);
        AnonymousClass088.A1D(parcel, A03);
    }
}
