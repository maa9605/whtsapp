package androidx.core.app;

import X.AbstractC16340qF;
import X.C0M5;
import X.C1VA;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC16340qF abstractC16340qF) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        C0M5 c0m5 = remoteActionCompat.A01;
        if (abstractC16340qF.A09(1)) {
            c0m5 = abstractC16340qF.A03();
        }
        remoteActionCompat.A01 = (IconCompat) c0m5;
        CharSequence charSequence = remoteActionCompat.A03;
        if (abstractC16340qF.A09(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1VA) abstractC16340qF).A05);
        }
        remoteActionCompat.A03 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.A02;
        if (abstractC16340qF.A09(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1VA) abstractC16340qF).A05);
        }
        remoteActionCompat.A02 = charSequence2;
        remoteActionCompat.A00 = (PendingIntent) abstractC16340qF.A01(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        if (abstractC16340qF.A09(5)) {
            z = false;
            if (((C1VA) abstractC16340qF).A05.readInt() != 0) {
                z = true;
            }
        }
        remoteActionCompat.A04 = z;
        boolean z2 = remoteActionCompat.A05;
        if (abstractC16340qF.A09(6)) {
            z2 = false;
            if (((C1VA) abstractC16340qF).A05.readInt() != 0) {
                z2 = true;
            }
        }
        remoteActionCompat.A05 = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC16340qF abstractC16340qF) {
        if (abstractC16340qF != null) {
            IconCompat iconCompat = remoteActionCompat.A01;
            abstractC16340qF.A06(1);
            abstractC16340qF.A08(iconCompat);
            CharSequence charSequence = remoteActionCompat.A03;
            abstractC16340qF.A06(2);
            Parcel parcel = ((C1VA) abstractC16340qF).A05;
            TextUtils.writeToParcel(charSequence, parcel, 0);
            CharSequence charSequence2 = remoteActionCompat.A02;
            abstractC16340qF.A06(3);
            TextUtils.writeToParcel(charSequence2, parcel, 0);
            PendingIntent pendingIntent = remoteActionCompat.A00;
            abstractC16340qF.A06(4);
            parcel.writeParcelable(pendingIntent, 0);
            boolean z = remoteActionCompat.A04;
            abstractC16340qF.A06(5);
            parcel.writeInt(z ? 1 : 0);
            boolean z2 = remoteActionCompat.A05;
            abstractC16340qF.A06(6);
            parcel.writeInt(z2 ? 1 : 0);
            return;
        }
        throw null;
    }
}
