package androidx.core.graphics.drawable;

import X.AbstractC16340qF;
import X.C1VA;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC16340qF abstractC16340qF) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.A02 = abstractC16340qF.A00(iconCompat.A02, 1);
        byte[] bArr = iconCompat.A08;
        if (abstractC16340qF.A09(2)) {
            Parcel parcel = ((C1VA) abstractC16340qF).A05;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                bArr = new byte[readInt];
                parcel.readByteArray(bArr);
            }
        }
        iconCompat.A08 = bArr;
        iconCompat.A05 = abstractC16340qF.A01(iconCompat.A05, 3);
        iconCompat.A00 = abstractC16340qF.A00(iconCompat.A00, 4);
        iconCompat.A01 = abstractC16340qF.A00(iconCompat.A01, 5);
        iconCompat.A03 = (ColorStateList) abstractC16340qF.A01(iconCompat.A03, 6);
        String str = iconCompat.A07;
        if (abstractC16340qF.A09(7)) {
            str = ((C1VA) abstractC16340qF).A05.readString();
        }
        iconCompat.A07 = str;
        iconCompat.A04 = PorterDuff.Mode.valueOf(str);
        int i = iconCompat.A02;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        iconCompat.A06 = iconCompat.A08;
                        return iconCompat;
                    } else if (i != 4) {
                        if (i != 5) {
                            return iconCompat;
                        }
                    }
                }
                iconCompat.A06 = new String(iconCompat.A08, Charset.forName("UTF-16"));
                return iconCompat;
            }
            Parcelable parcelable = iconCompat.A05;
            if (parcelable != null) {
                iconCompat.A06 = parcelable;
                return iconCompat;
            }
            byte[] bArr2 = iconCompat.A08;
            iconCompat.A06 = bArr2;
            iconCompat.A02 = 3;
            iconCompat.A00 = 0;
            iconCompat.A01 = bArr2.length;
            return iconCompat;
        }
        Parcelable parcelable2 = iconCompat.A05;
        if (parcelable2 != null) {
            iconCompat.A06 = parcelable2;
            return iconCompat;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x001e, code lost:
        if (r0 != 5) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void write(androidx.core.graphics.drawable.IconCompat r9, X.AbstractC16340qF r10) {
        /*
            if (r10 == 0) goto Lb0
            android.graphics.PorterDuff$Mode r0 = r9.A04
            java.lang.String r0 = r0.name()
            r9.A07 = r0
            int r0 = r9.A02
            r7 = 5
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            r2 = -1
            if (r0 == r2) goto La8
            if (r0 == r3) goto La0
            java.lang.String r8 = "UTF-16"
            if (r0 == r4) goto L91
            if (r0 == r5) goto L8a
            if (r0 == r6) goto L79
            if (r0 == r7) goto La0
        L20:
            int r0 = r9.A02
            if (r2 == r0) goto L27
            r10.A07(r0, r3)
        L27:
            byte[] r2 = r9.A08
            if (r2 == 0) goto L3a
            r10.A06(r4)
            r0 = r10
            X.1VA r0 = (X.C1VA) r0
            android.os.Parcel r1 = r0.A05
            int r0 = r2.length
            r1.writeInt(r0)
            r1.writeByteArray(r2)
        L3a:
            android.os.Parcelable r2 = r9.A05
            if (r2 == 0) goto L4a
            r10.A06(r5)
            r0 = r10
            X.1VA r0 = (X.C1VA) r0
            android.os.Parcel r1 = r0.A05
            r0 = 0
            r1.writeParcelable(r2, r0)
        L4a:
            int r0 = r9.A00
            if (r0 == 0) goto L51
            r10.A07(r0, r6)
        L51:
            int r0 = r9.A01
            if (r0 == 0) goto L58
            r10.A07(r0, r7)
        L58:
            android.content.res.ColorStateList r2 = r9.A03
            if (r2 == 0) goto L69
            r0 = 6
            r10.A06(r0)
            r0 = r10
            X.1VA r0 = (X.C1VA) r0
            android.os.Parcel r1 = r0.A05
            r0 = 0
            r1.writeParcelable(r2, r0)
        L69:
            java.lang.String r1 = r9.A07
            if (r1 == 0) goto L78
            r0 = 7
            r10.A06(r0)
            X.1VA r10 = (X.C1VA) r10
            android.os.Parcel r0 = r10.A05
            r0.writeString(r1)
        L78:
            return
        L79:
            java.lang.Object r0 = r9.A06
            java.lang.String r1 = r0.toString()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r8)
            byte[] r0 = r1.getBytes(r0)
            r9.A08 = r0
            goto L20
        L8a:
            java.lang.Object r0 = r9.A06
            byte[] r0 = (byte[]) r0
            r9.A08 = r0
            goto L20
        L91:
            java.lang.Object r1 = r9.A06
            java.lang.String r1 = (java.lang.String) r1
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r8)
            byte[] r0 = r1.getBytes(r0)
            r9.A08 = r0
            goto L20
        La0:
            java.lang.Object r0 = r9.A06
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r9.A05 = r0
            goto L20
        La8:
            java.lang.Object r0 = r9.A06
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r9.A05 = r0
            goto L20
        Lb0:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(androidx.core.graphics.drawable.IconCompat, X.0qF):void");
    }
}
