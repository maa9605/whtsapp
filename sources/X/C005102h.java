package X;

import android.app.Notification;
import android.os.DeadObjectException;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.02h */
/* loaded from: classes.dex */
public class C005102h {
    public static volatile C005102h A01;
    public final C005202i A00;

    public C005102h(C001200o c001200o) {
        this.A00 = new C005202i(c001200o.A00);
    }

    public static C005102h A00() {
        if (A01 == null) {
            synchronized (C005102h.class) {
                if (A01 == null) {
                    A01 = new C005102h(C001200o.A01);
                }
            }
        }
        return A01;
    }

    public static String A01(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            return null;
        }
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(abstractC005302j.getRawString().getBytes()), 0);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public void A02(AbstractC005302j abstractC005302j) {
        A05(A01(abstractC005302j), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x000f, code lost:
        if (android.text.TextUtils.isEmpty(r6.getChannelId()) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(X.AbstractC005302j r4, int r5, android.app.Notification r6) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L11
            java.lang.String r0 = r6.getChannelId()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            X.C000700j.A07(r0)
            java.lang.String r1 = A01(r4)
            X.02i r0 = r3.A00     // Catch: java.lang.RuntimeException -> L1f
            r0.A02(r1, r5, r6)     // Catch: java.lang.RuntimeException -> L1f
            return
        L1f:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L3a
            java.lang.String r1 = "wanotificationmanager/notifyfailed/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
            return
        L3a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005102h.A03(X.02j, int, android.app.Notification):void");
    }

    public void A04(String str) {
        A05(str, 27);
    }

    public final void A05(String str, int i) {
        AnonymousClass024.A0c();
        try {
            this.A00.A01(str, i);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                StringBuilder sb = new StringBuilder("wanotificationmanager/cancelfailed/");
                sb.append(e);
                Log.e(sb.toString());
                return;
            }
            throw e;
        }
    }

    public void A06(String str, Notification notification) {
        try {
            this.A00.A02(str, 27, notification);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                StringBuilder sb = new StringBuilder("wanotificationmanager/notifyForJoinableCalls/notifyfailed");
                sb.append(e);
                Log.e(sb.toString());
                return;
            }
            throw e;
        }
    }
}
