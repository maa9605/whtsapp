package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.2a9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52152a9 extends OrientationEventListener {
    public int A00;

    public C52152a9(Context context) {
        super(context);
        this.A00 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
        if (r3 >= 300) goto L22;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onOrientationChanged(int r3) {
        /*
            r2 = this;
            r0 = 330(0x14a, float:4.62E-43)
            if (r3 >= r0) goto L29
            r0 = 30
            if (r3 < r0) goto L29
            r0 = 60
            if (r3 < r0) goto L14
            r0 = 120(0x78, float:1.68E-43)
            if (r3 >= r0) goto L14
            r1 = 1
        L11:
            r2.A00 = r1
            return
        L14:
            r0 = 150(0x96, float:2.1E-43)
            if (r3 < r0) goto L1e
            r0 = 210(0xd2, float:2.94E-43)
            if (r3 >= r0) goto L1e
            r1 = 2
            goto L11
        L1e:
            r0 = 240(0xf0, float:3.36E-43)
            if (r3 < r0) goto L27
            r0 = 300(0x12c, float:4.2E-43)
            r1 = 3
            if (r3 < r0) goto L11
        L27:
            r1 = -1
            goto L11
        L29:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52152a9.onOrientationChanged(int):void");
    }
}
