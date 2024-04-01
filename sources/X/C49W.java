package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.49W  reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C49W extends ArrayAdapter {
    public List A00;
    public final C002301c A01;
    public final C0DV A02;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    public C49W(Context context, C002301c c002301c, C0DV c0dv) {
        super(context, (int) R.layout.payment_method_row, new ArrayList());
        this.A01 = c002301c;
        this.A02 = c0dv;
        this.A00 = new ArrayList();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }
}
