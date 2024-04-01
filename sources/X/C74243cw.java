package X;

import android.widget.BaseAdapter;
import com.whatsapp.voipcalling.CallLogActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3cw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74243cw extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ CallLogActivity A01;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    public C74243cw(CallLogActivity callLogActivity) {
        this.A01 = callLogActivity;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
        if (r2 == 6) goto L43;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r14, android.view.View r15, android.view.ViewGroup r16) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74243cw.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
