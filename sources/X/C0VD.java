package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.0VD  reason: invalid class name */
/* loaded from: classes.dex */
public class C0VD extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ C0VB A01;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C0VD(C0VB c0vb) {
        this.A01 = c0vb;
        A01();
    }

    @Override // android.widget.Adapter
    /* renamed from: A00 */
    public C28421Rt getItem(int i) {
        C06650Uk c06650Uk = this.A01.A05;
        c06650Uk.A05();
        ArrayList arrayList = c06650Uk.A08;
        int i2 = i + 0;
        int i3 = this.A00;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C28421Rt) arrayList.get(i2);
    }

    public void A01() {
        C06650Uk c06650Uk = this.A01.A05;
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
        C06650Uk c06650Uk = this.A01.A05;
        c06650Uk.A05();
        int size = c06650Uk.A08.size() - 0;
        return this.A00 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C0VB c0vb = this.A01;
            view = c0vb.A02.inflate(c0vb.A00, viewGroup, false);
        }
        ((InterfaceC10870gm) view).AEz(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
