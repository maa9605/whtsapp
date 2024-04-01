package X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.0Uj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06640Uj extends C0U0 implements C0CO {
    public Context A00;
    public C0O8 A01;
    public C06650Uk A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    public C06640Uj(Context context, ActionBarContextView actionBarContextView, C0O8 c0o8) {
        this.A00 = context;
        this.A03 = actionBarContextView;
        this.A01 = c0o8;
        C06650Uk c06650Uk = new C06650Uk(actionBarContextView.getContext());
        c06650Uk.A00 = 1;
        this.A02 = c06650Uk;
        c06650Uk.A03 = this;
    }

    @Override // X.C0U0
    public Menu A00() {
        return this.A02;
    }

    @Override // X.C0U0
    public MenuInflater A01() {
        return new C0UW(this.A03.getContext());
    }

    @Override // X.C0U0
    public View A02() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // X.C0U0
    public CharSequence A03() {
        return this.A03.A08;
    }

    @Override // X.C0U0
    public CharSequence A04() {
        return this.A03.A09;
    }

    @Override // X.C0U0
    public void A05() {
        if (this.A05) {
            return;
        }
        this.A05 = true;
        this.A03.sendAccessibilityEvent(32);
        this.A01.AJK(this);
    }

    @Override // X.C0U0
    public void A06() {
        this.A01.ANE(this, this.A02);
    }

    @Override // X.C0U0
    public void A07(int i) {
        this.A03.setSubtitle(this.A00.getString(i));
    }

    @Override // X.C0U0
    public void A08(int i) {
        this.A03.setTitle(this.A00.getString(i));
    }

    @Override // X.C0U0
    public void A09(View view) {
        this.A03.setCustomView(view);
        this.A04 = view != null ? new WeakReference(view) : null;
    }

    @Override // X.C0U0
    public void A0A(CharSequence charSequence) {
        this.A03.setSubtitle(charSequence);
    }

    @Override // X.C0U0
    public void A0B(CharSequence charSequence) {
        this.A03.setTitle(charSequence);
    }

    @Override // X.C0U0
    public void A0C(boolean z) {
        super.A01 = z;
        this.A03.setTitleOptional(z);
    }

    @Override // X.C0U0
    public boolean A0D() {
        return this.A03.A0A;
    }

    @Override // X.C0CO
    public boolean AM1(C06650Uk c06650Uk, MenuItem menuItem) {
        return this.A01.AGv(this, menuItem);
    }

    @Override // X.C0CO
    public void AM2(C06650Uk c06650Uk) {
        A06();
        C38311nu c38311nu = ((C0Ud) this.A03).A01;
        if (c38311nu != null) {
            c38311nu.A03();
        }
    }
}
