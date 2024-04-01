package X;

import android.widget.BaseAdapter;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2J5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2J5 extends BaseAdapter {
    public final /* synthetic */ PairedDevicesActivity A02;
    public List A01 = new ArrayList();
    public List A00 = new ArrayList();

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    public C2J5(PairedDevicesActivity pairedDevicesActivity) {
        this.A02 = pairedDevicesActivity;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A00.size() + this.A01.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List list;
        if (i < this.A01.size()) {
            list = this.A01;
        } else {
            list = this.A00;
            i -= this.A01.size();
        }
        return list.get(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
        if (r1.equals("chrome") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
        if (r0 == false) goto L17;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2J5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
