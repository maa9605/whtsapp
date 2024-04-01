package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.CallLogActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3tl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84453tl extends C0HS {
    public final WeakReference A00;
    public final /* synthetic */ CallLogActivity A01;

    public C84453tl(CallLogActivity callLogActivity, CallLogActivity callLogActivity2) {
        this.A01 = callLogActivity;
        this.A00 = new WeakReference(callLogActivity2);
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Bitmap bitmap;
        CallLogActivity callLogActivity = this.A01;
        int dimensionPixelSize = callLogActivity.getResources().getDimensionPixelSize(R.dimen.mid_avatar_size);
        float dimension = callLogActivity.getResources().getDimension(R.dimen.mid_avatar_radius);
        Context context = (Context) this.A00.get();
        if (context != null) {
            bitmap = callLogActivity.A0A.A02(context, callLogActivity.A0G, dimensionPixelSize, dimension, false);
        } else {
            bitmap = null;
        }
        if (!A04()) {
            ((ActivityC02290Ap) callLogActivity).A0A.A02.post(new RunnableEBaseShape6S0200000_I1(this, bitmap, 19));
        }
        return null;
    }
}
