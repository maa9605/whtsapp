package X;

import android.widget.BaseAdapter;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2hn */
/* loaded from: classes2.dex */
public class C53952hn extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ MyStatusesActivity A01;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public C53952hn(MyStatusesActivity myStatusesActivity) {
        this.A01 = myStatusesActivity;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0203, code lost:
        if (r9 == 37) goto L87;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53952hn.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
