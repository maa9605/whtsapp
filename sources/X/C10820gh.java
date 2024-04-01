package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.0gh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10820gh extends BaseAdapter {
    public int A00 = -1;
    public C06650Uk A01;
    public boolean A02;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C10820gh(C06650Uk c06650Uk, LayoutInflater layoutInflater, boolean z, int i) {
        this.A05 = z;
        this.A04 = layoutInflater;
        this.A01 = c06650Uk;
        this.A03 = i;
        A01();
    }

    @Override // android.widget.Adapter
    /* renamed from: A00 */
    public C28421Rt getItem(int i) {
        ArrayList A04;
        if (this.A05) {
            C06650Uk c06650Uk = this.A01;
            c06650Uk.A05();
            A04 = c06650Uk.A08;
        } else {
            A04 = this.A01.A04();
        }
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C28421Rt) A04.get(i);
    }

    public void A01() {
        C06650Uk c06650Uk = this.A01;
        C28421Rt c28421Rt = c06650Uk.A04;
        if (c28421Rt != null) {
            c06650Uk.A05();
            ArrayList arrayList = c06650Uk.A08;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == c28421Rt) {
                    this.A00 = i;
                    return;
                }
            }
        }
        this.A00 = -1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList A04;
        if (this.A05) {
            C06650Uk c06650Uk = this.A01;
            c06650Uk.A05();
            A04 = c06650Uk.A08;
        } else {
            A04 = this.A01.A04();
        }
        int i = this.A00;
        int size = A04.size();
        if (i < 0) {
            return size;
        }
        return size - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r5 == r1) goto L17;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r4 = 0
            if (r8 != 0) goto Lb
            android.view.LayoutInflater r1 = r6.A04
            int r0 = r6.A03
            android.view.View r8 = r1.inflate(r0, r9, r4)
        Lb:
            X.1Rt r0 = r6.getItem(r7)
            int r5 = r0.A0Q
            int r0 = r7 + (-1)
            if (r0 < 0) goto L40
            X.1Rt r0 = r6.getItem(r0)
            int r1 = r0.A0Q
        L1b:
            r3 = r8
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.0Uk r0 = r6.A01
            boolean r0 = r0.A0G()
            r2 = 1
            if (r0 == 0) goto L2a
            r0 = 1
            if (r5 != r1) goto L2b
        L2a:
            r0 = 0
        L2b:
            r3.setGroupDividerEnabled(r0)
            r1 = r8
            X.0gm r1 = (X.InterfaceC10870gm) r1
            boolean r0 = r6.A02
            if (r0 == 0) goto L38
            r3.setForceShowIcon(r2)
        L38:
            X.1Rt r0 = r6.getItem(r7)
            r1.AEz(r0, r4)
            return r8
        L40:
            r1 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10820gh.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
