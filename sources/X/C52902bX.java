package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* renamed from: X.2bX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52902bX extends ContextWrapper {
    public LayoutInflater A00;
    public LayoutInflater A01;
    public final C0BA A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52902bX(Context base, C0BA fragment) {
        super(base);
        if (base != null) {
            this.A00 = null;
            this.A02 = fragment;
            return;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C52902bX(android.view.LayoutInflater r3, X.C0BA r4) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L12
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L11
            r2.<init>(r0)
            r2.A00 = r3
            r2.A02 = r4
            return
        L11:
            throw r1
        L12:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52902bX.<init>(android.view.LayoutInflater, X.0BA):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        LayoutInflater layoutInflater = this.A01;
        if (layoutInflater == null) {
            LayoutInflater layoutInflater2 = this.A00;
            if (layoutInflater2 == null) {
                layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                this.A00 = layoutInflater2;
            }
            LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
            this.A01 = cloneInContext;
            return cloneInContext;
        }
        return layoutInflater;
    }
}
