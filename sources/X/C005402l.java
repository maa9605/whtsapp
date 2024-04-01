package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.02l */
/* loaded from: classes.dex */
public class C005402l {
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Notification A07;
    public Notification A08;
    public PendingIntent A09;
    public PendingIntent A0A;
    public Context A0B;
    public Bitmap A0C;
    public Bundle A0D;
    public RemoteViews A0E;
    public AbstractC05180Nq A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public ArrayList A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0T;
    public boolean A0V;
    public ArrayList A0N = new ArrayList();
    public ArrayList A0O = new ArrayList();
    public boolean A0U = true;
    public boolean A0S = false;
    public int A00 = 0;
    public int A06 = 0;
    public int A01 = 0;

    public C005402l(Context context, String str) {
        Notification notification = new Notification();
        this.A07 = notification;
        this.A0B = context;
        this.A0J = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A03 = 0;
        this.A0P = new ArrayList();
        this.A0Q = true;
    }

    public static CharSequence A00(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0048, code lost:
        if (r8 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Notification A01() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005402l.A01():android.app.Notification");
    }

    public Bundle A02() {
        Bundle bundle = this.A0D;
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            this.A0D = bundle2;
            return bundle2;
        }
        return bundle;
    }

    public void A03(int i) {
        Notification notification = this.A07;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public void A04(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.A0N.add(new C07940aL(i, charSequence, pendingIntent));
    }

    public final void A05(int i, boolean z) {
        if (z) {
            Notification notification = this.A07;
            notification.flags = i | notification.flags;
            return;
        }
        Notification notification2 = this.A07;
        notification2.flags = (i ^ (-1)) & notification2.flags;
    }

    public void A06(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.A0B.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        this.A0C = bitmap;
    }

    public void A07(Uri uri) {
        Notification notification = this.A07;
        notification.sound = uri;
        notification.audioStreamType = -1;
        if (Build.VERSION.SDK_INT >= 21) {
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
    }

    public void A08(AbstractC05180Nq abstractC05180Nq) {
        if (this.A0F != abstractC05180Nq) {
            this.A0F = abstractC05180Nq;
            if (abstractC05180Nq.A00 != this) {
                abstractC05180Nq.A00 = this;
                A08(abstractC05180Nq);
            }
        }
    }

    public void A09(CharSequence charSequence) {
        this.A0G = A00(charSequence);
    }

    public void A0A(CharSequence charSequence) {
        this.A0H = A00(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A07.tickerText = A00(charSequence);
    }
}
