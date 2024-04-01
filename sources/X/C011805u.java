package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.google.android.search.verification.client.R;

/* renamed from: X.05u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C011805u {
    public static final C011805u A02 = new C011805u();
    public boolean A00;
    public final SparseArray A01 = new SparseArray();

    public synchronized Bitmap A00(Context context, int i) {
        if (AnonymousClass029.A1K(context) != this.A00) {
            this.A01.clear();
            this.A00 = this.A00 ? false : true;
        }
        SparseArray sparseArray = this.A01;
        Bitmap bitmap = (Bitmap) sparseArray.get(i);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap A01 = C0L7.A01(context, i, context.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), context.getResources().getDimension(R.dimen.small_avatar_radius));
        sparseArray.put(i, A01);
        return A01;
    }
}
