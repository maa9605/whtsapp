package X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.1Rh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28311Rh extends C0U0 implements C0CO {
    public C0O8 A00;
    public WeakReference A01;
    public final Context A02;
    public final C06650Uk A03;
    public final /* synthetic */ C06730Ut A04;

    public C28311Rh(C06730Ut c06730Ut, Context context, C0O8 c0o8) {
        this.A04 = c06730Ut;
        this.A02 = context;
        this.A00 = c0o8;
        C06650Uk c06650Uk = new C06650Uk(context);
        c06650Uk.A00 = 1;
        this.A03 = c06650Uk;
        c06650Uk.A03 = this;
    }

    @Override // X.C0U0
    public Menu A00() {
        return this.A03;
    }

    @Override // X.C0U0
    public MenuInflater A01() {
        return new C0UW(this.A02);
    }

    @Override // X.C0U0
    public View A02() {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // X.C0U0
    public CharSequence A03() {
        return this.A04.A09.A08;
    }

    @Override // X.C0U0
    public CharSequence A04() {
        return this.A04.A09.A09;
    }

    @Override // X.C0U0
    public void A05() {
        C06730Ut c06730Ut = this.A04;
        if (c06730Ut.A04 != this) {
            return;
        }
        boolean z = c06730Ut.A0G;
        boolean z2 = c06730Ut.A0H;
        if (!z && !z2) {
            this.A00.AJK(this);
        } else {
            c06730Ut.A06 = this;
            c06730Ut.A05 = this.A00;
        }
        this.A00 = null;
        c06730Ut.A0X(false);
        ActionBarContextView actionBarContextView = c06730Ut.A09;
        if (actionBarContextView.A03 == null) {
            actionBarContextView.removeAllViews();
            actionBarContextView.A04 = null;
            ((C0Ud) actionBarContextView).A02 = null;
        }
        c06730Ut.A0B.ADu().sendAccessibilityEvent(32);
        c06730Ut.A0A.setHideOnContentScrollEnabled(c06730Ut.A0I);
        c06730Ut.A04 = null;
    }

    @Override // X.C0U0
    public void A06() {
        if (this.A04.A04 != this) {
            return;
        }
        C06650Uk c06650Uk = this.A03;
        c06650Uk.A07();
        try {
            this.A00.ANE(this, c06650Uk);
        } finally {
            c06650Uk.A06();
        }
    }

    @Override // X.C0U0
    public void A07(int i) {
        A0A(this.A04.A01.getResources().getString(i));
    }

    @Override // X.C0U0
    public void A08(int i) {
        A0B(this.A04.A01.getResources().getString(i));
    }

    @Override // X.C0U0
    public void A09(View view) {
        this.A04.A09.setCustomView(view);
        this.A01 = new WeakReference(view);
    }

    @Override // X.C0U0
    public void A0A(CharSequence charSequence) {
        this.A04.A09.setSubtitle(charSequence);
    }

    @Override // X.C0U0
    public void A0B(CharSequence charSequence) {
        this.A04.A09.setTitle(charSequence);
    }

    @Override // X.C0U0
    public void A0C(boolean z) {
        super.A01 = z;
        this.A04.A09.setTitleOptional(z);
    }

    @Override // X.C0U0
    public boolean A0D() {
        return this.A04.A09.A0A;
    }

    @Override // X.C0CO
    public boolean AM1(C06650Uk c06650Uk, MenuItem menuItem) {
        C0O8 c0o8 = this.A00;
        if (c0o8 != null) {
            return c0o8.AGv(this, menuItem);
        }
        return false;
    }

    @Override // X.C0CO
    public void AM2(C06650Uk c06650Uk) {
        if (this.A00 == null) {
            return;
        }
        A06();
        C38311nu c38311nu = ((C0Ud) this.A04.A09).A01;
        if (c38311nu != null) {
            c38311nu.A03();
        }
    }
}
