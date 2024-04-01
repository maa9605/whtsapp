package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Nq */
/* loaded from: classes.dex */
public abstract class AbstractC05180Nq {
    public C005402l A00;
    public CharSequence A01;
    public boolean A02 = false;

    public RemoteViews A02(InterfaceC12750k0 interfaceC12750k0) {
        return null;
    }

    public RemoteViews A03(InterfaceC12750k0 interfaceC12750k0) {
        return null;
    }

    public RemoteViews A04(InterfaceC12750k0 interfaceC12750k0) {
        return null;
    }

    public void A05(Bundle bundle) {
    }

    public abstract void A06(InterfaceC12750k0 interfaceC12750k0);

    public final Bitmap A00(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap A01 = A01(IconCompat.A02(this.A00.A0B, R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(A01);
        Drawable mutate = this.A00.A0B.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) >> 1;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap A01(androidx.core.graphics.drawable.IconCompat r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05180Nq.A01(androidx.core.graphics.drawable.IconCompat, int, int):android.graphics.Bitmap");
    }
}
