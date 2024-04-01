package X;

import android.content.Context;

/* renamed from: X.07n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C016107n {
    public C20430xW A00;
    public final int A01;
    public final Context A02;
    public final Object A03;

    public C016107n(Context context, Object obj, int i, C20430xW c20430xW) {
        this.A02 = context;
        this.A01 = i;
        this.A00 = c20430xW;
        this.A03 = obj;
    }

    public C20430xW A00() {
        C20430xW c20430xW = this.A00;
        if (c20430xW != null) {
            return c20430xW;
        }
        throw new IllegalStateException("Trying to access the LayoutCache from outside a layout call");
    }
}
