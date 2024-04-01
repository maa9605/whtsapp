package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.090 */
/* loaded from: classes.dex */
public class AnonymousClass090 extends Dialog implements AnonymousClass091 {
    public AbstractC004101x A00;
    public final InterfaceC02370Ax A01;

    @Override // X.AnonymousClass091
    public void APM(C0U0 c0u0) {
    }

    @Override // X.AnonymousClass091
    public void APN(C0U0 c0u0) {
    }

    @Override // X.AnonymousClass091
    public C0U0 AQW(C0O8 c0o8) {
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnonymousClass090(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r4 = 1
            if (r7 != 0) goto L3f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2130968853(0x7f040115, float:1.7546371E38)
            r1.resolveAttribute(r0, r2, r4)
            int r0 = r2.resourceId
        L14:
            r5.<init>(r6, r0)
            X.1Rd r0 = new X.1Rd
            r0.<init>()
            r5.A01 = r0
            X.01x r3 = r5.A00()
            if (r7 != 0) goto L35
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r0 = 2130968853(0x7f040115, float:1.7546371E38)
            r1.resolveAttribute(r0, r2, r4)
            int r7 = r2.resourceId
        L35:
            r0 = r3
            X.0CN r0 = (X.C0CN) r0
            r0.A02 = r7
            r0 = 0
            r3.A0I(r0)
            return
        L3f:
            r0 = r7
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass090.<init>(android.content.Context, int):void");
    }

    public AbstractC004101x A00() {
        AbstractC004101x abstractC004101x = this.A00;
        if (abstractC004101x == null) {
            C0CN c0cn = new C0CN(getContext(), getWindow(), this, this);
            this.A00 = c0cn;
            return c0cn;
        }
        return abstractC004101x;
    }

    public boolean A01(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0M(view, layoutParams);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C13100kb.A00(this.A01, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        C0CN c0cn = (C0CN) A00();
        c0cn.A0V();
        return c0cn.A08.findViewById(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        A00().A09();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        A00().A08();
        super.onCreate(bundle);
        A00().A0I(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        A00().A0D();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        A00().A0F(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        A00().A0L(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0N(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        A00().A0P(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A00().A0P(charSequence);
    }
}
