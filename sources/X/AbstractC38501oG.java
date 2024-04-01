package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1oG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38501oG extends C1TS {
    public int A00;
    public int A01;
    public LayoutInflater A02;

    public AbstractC38501oG(Context context, int i) {
        super(context, null, true);
        this.A00 = i;
        this.A01 = i;
        this.A02 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // X.C1TS
    public View A01(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.A02.inflate(this.A00, viewGroup, false);
    }
}
