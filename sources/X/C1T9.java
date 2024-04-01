package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1T9  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T9 {
    public int A01;
    public int A03;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C = new ArrayList();
    public int A05 = 1;
    public ArrayList A0D = new ArrayList();
    public int A02 = 8388613;
    public int A00 = -1;
    public int A04 = 0;
    public int A06 = 80;

    public void A00(C005402l c005402l) {
        Notification.Action.Builder builder;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C07940aL c07940aL = (C07940aL) it.next();
                int i = Build.VERSION.SDK_INT;
                if (i >= 20) {
                    if (i >= 23) {
                        IconCompat A00 = c07940aL.A00();
                        builder = new Notification.Action.Builder(A00 == null ? null : A00.A07(), c07940aL.A03, c07940aL.A01);
                    } else {
                        builder = new Notification.Action.Builder(c07940aL.A00, c07940aL.A03, c07940aL.A01);
                    }
                    Bundle bundle3 = c07940aL.A07;
                    if (bundle3 != null) {
                        bundle = new Bundle(bundle3);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", c07940aL.A04);
                    if (Build.VERSION.SDK_INT >= 24) {
                        builder.setAllowGeneratedReplies(c07940aL.A04);
                    }
                    builder.addExtras(bundle);
                    C12830k9[] c12830k9Arr = c07940aL.A09;
                    if (c12830k9Arr != null) {
                        for (RemoteInput remoteInput : C12830k9.A01(c12830k9Arr)) {
                            builder.addRemoteInput(remoteInput);
                        }
                    }
                    arrayList2.add(builder.build());
                } else {
                    arrayList2.add(C0XI.A00(c07940aL));
                }
            }
            bundle2.putParcelableArrayList("actions", arrayList2);
        }
        int i2 = this.A05;
        if (i2 != 1) {
            bundle2.putInt("flags", i2);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            bundle2.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList arrayList3 = this.A0D;
        if (!arrayList3.isEmpty()) {
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            bundle2.putParcelable("background", bitmap);
        }
        int i3 = this.A01;
        if (i3 != 0) {
            bundle2.putInt("contentIcon", i3);
        }
        int i4 = this.A02;
        if (i4 != 8388613) {
            bundle2.putInt("contentIconGravity", i4);
        }
        int i5 = this.A00;
        if (i5 != -1) {
            bundle2.putInt("contentActionIndex", i5);
        }
        int i6 = this.A04;
        if (i6 != 0) {
            bundle2.putInt("customSizePreset", i6);
        }
        int i7 = this.A03;
        if (i7 != 0) {
            bundle2.putInt("customContentHeight", i7);
        }
        int i8 = this.A06;
        if (i8 != 80) {
            bundle2.putInt("gravity", i8);
        }
        int i9 = this.A07;
        if (i9 != 0) {
            bundle2.putInt("hintScreenTimeout", i9);
        }
        String str = this.A0B;
        if (str != null) {
            bundle2.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            bundle2.putString("bridgeTag", str2);
        }
        c005402l.A02().putBundle("android.wearable.EXTENSIONS", bundle2);
    }

    public Object clone() {
        C1T9 c1t9 = new C1T9();
        c1t9.A0C = new ArrayList(this.A0C);
        c1t9.A05 = this.A05;
        c1t9.A08 = this.A08;
        c1t9.A0D = new ArrayList(this.A0D);
        c1t9.A09 = this.A09;
        c1t9.A01 = this.A01;
        c1t9.A02 = this.A02;
        c1t9.A00 = this.A00;
        c1t9.A04 = this.A04;
        c1t9.A03 = this.A03;
        c1t9.A06 = this.A06;
        c1t9.A07 = this.A07;
        c1t9.A0B = this.A0B;
        c1t9.A0A = this.A0A;
        return c1t9;
    }
}
