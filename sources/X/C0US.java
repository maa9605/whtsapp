package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: X.0US */
/* loaded from: classes.dex */
public class C0US extends ContextWrapper {
    public LayoutInflater A00;
    public final C0E2 A01;
    public final C002201b A02;
    public final C002301c A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0US(android.content.Context r3, X.C002301c r4, X.C0E2 r5) {
        /*
            r2 = this;
            if (r4 == 0) goto L68
            boolean r0 = X.C002301c.A0B
            if (r0 != 0) goto L28
            if (r3 == 0) goto L28
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r1 = r0.locale
            java.util.Locale r0 = r4.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            java.util.Locale r0 = r4.A04
            r1.setLocale(r0)
            android.content.Context r3 = r3.createConfigurationContext(r1)
        L28:
            r2.<init>(r3)
            r2.A03 = r4
            r2.A01 = r5
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources r0 = r0.getResources()
            boolean r0 = r0 instanceof X.C002201b
            if (r0 == 0) goto L48
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources r1 = r0.getResources()
            X.01b r1 = (X.C002201b) r1
        L45:
            r2.A02 = r1
            return
        L48:
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L60
            boolean r0 = r1 instanceof X.C002201b
            if (r0 == 0) goto L59
            X.01b r1 = (X.C002201b) r1
            goto L45
        L59:
            X.01b r0 = new X.01b
            r0.<init>(r1, r4)
            r1 = r0
            goto L45
        L60:
            java.lang.String r1 = "Resources and/or WhatsAppLocale can't be null"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L68:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0US.<init>(android.content.Context, X.01c, X.0E2):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createConfigurationContext(Configuration configuration) {
        return new C0US(super.createConfigurationContext(configuration), this.A03, this.A01);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.A02;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            LayoutInflater layoutInflater = this.A00;
            if (layoutInflater == null) {
                C05370Ol c05370Ol = this.A01.A00;
                C000700j.A04(c05370Ol, "setFactory() not called");
                C0VR c0vr = new C0VR(c05370Ol.A00, LayoutInflater.from(getBaseContext()), this);
                this.A00 = c0vr;
                return c0vr;
            }
            return layoutInflater;
        }
        return super.getSystemService(str);
    }
}
