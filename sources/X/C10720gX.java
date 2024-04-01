package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: X.0gX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10720gX extends ActionMode {
    public final Context A00;
    public final C0U0 A01;

    public C10720gX(Context context, C0U0 c0u0) {
        this.A00 = context;
        this.A01 = c0u0;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.A01.A05();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.A01.A02();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new C1Ry(this.A00, (InterfaceMenuC06660Ul) this.A01.A00());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.A01.A01();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.A01.A03();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.A01.A00;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.A01.A04();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.A01.A01;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.A01.A06();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.A01.A0D();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.A01.A09(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.A01.A07(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.A01.A0A(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.A01.A00 = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.A01.A08(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.A01.A0B(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.A01.A0C(z);
    }
}
