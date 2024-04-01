package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.0U1  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0U1 {
    public float A00() {
        return 0.0f;
    }

    public abstract int A01();

    public Context A02() {
        return null;
    }

    public C0U0 A03(C0O8 c0o8) {
        return null;
    }

    public void A04() {
    }

    public abstract void A05();

    public abstract void A07(int i);

    public abstract void A08(int i);

    public void A09(Configuration configuration) {
    }

    public void A0A(Drawable drawable) {
    }

    public abstract void A0B(Drawable drawable);

    public abstract void A0C(Drawable drawable);

    public abstract void A0D(View view);

    public abstract void A0E(View view, C0U2 c0u2);

    public void A0F(CharSequence charSequence) {
    }

    public abstract void A0G(CharSequence charSequence);

    public abstract void A0H(CharSequence charSequence);

    public void A0I(boolean z) {
    }

    public void A0J(boolean z) {
    }

    public void A0K(boolean z) {
    }

    public abstract void A0L(boolean z);

    public abstract void A0M(boolean z);

    public abstract void A0N(boolean z);

    public abstract void A0O(boolean z);

    public boolean A0P() {
        return false;
    }

    public boolean A0Q() {
        return false;
    }

    public boolean A0R() {
        return false;
    }

    public boolean A0S() {
        return false;
    }

    public boolean A0T(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean A0U(KeyEvent keyEvent) {
        return false;
    }

    public void A06(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}
