package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.0Xn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07260Xn implements C0O8 {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final ArrayList A03 = new ArrayList();
    public final C006802z A02 = new C006802z();

    public C07260Xn(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }

    public ActionMode A00(C0U0 c0u0) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C10720gX c10720gX = (C10720gX) arrayList.get(i);
            if (c10720gX != null && c10720gX.A01 == c0u0) {
                return c10720gX;
            }
        }
        C10720gX c10720gX2 = new C10720gX(this.A00, c0u0);
        arrayList.add(c10720gX2);
        return c10720gX2;
    }

    @Override // X.C0O8
    public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
        return this.A01.onActionItemClicked(A00(c0u0), new C1Rw(this.A00, (InterfaceMenuItemC07810a4) menuItem));
    }

    @Override // X.C0O8
    public boolean AJ5(C0U0 c0u0, Menu menu) {
        ActionMode.Callback callback = this.A01;
        ActionMode A00 = A00(c0u0);
        C006802z c006802z = this.A02;
        Menu menu2 = (Menu) c006802z.getOrDefault(menu, null);
        if (menu2 == null) {
            menu2 = new C1Ry(this.A00, (InterfaceMenuC06660Ul) menu);
            c006802z.put(menu, menu2);
        }
        return callback.onCreateActionMode(A00, menu2);
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        this.A01.onDestroyActionMode(A00(c0u0));
    }

    @Override // X.C0O8
    public boolean ANE(C0U0 c0u0, Menu menu) {
        ActionMode.Callback callback = this.A01;
        ActionMode A00 = A00(c0u0);
        C006802z c006802z = this.A02;
        Menu menu2 = (Menu) c006802z.getOrDefault(menu, null);
        if (menu2 == null) {
            menu2 = new C1Ry(this.A00, (InterfaceMenuC06660Ul) menu);
            c006802z.put(menu, menu2);
        }
        return callback.onPrepareActionMode(A00, menu2);
    }
}
