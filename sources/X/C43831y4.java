package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.1y4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43831y4 implements InterfaceC43821y3 {
    public Context A00;
    public final /* synthetic */ C42471vn A01;

    @Override // X.InterfaceC43821y3
    public void AKM() {
    }

    public C43831y4(C42471vn c42471vn, Context context) {
        this.A01 = c42471vn;
        this.A00 = context;
    }

    @Override // X.InterfaceC43821y3
    public int ADA() {
        return this.A01.A03(this.A00);
    }

    @Override // X.InterfaceC43821y3
    public void AUc(View view, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
        if (bitmap == null || !(view instanceof ImageView)) {
            return;
        }
        ((ImageView) view).setImageBitmap(bitmap);
    }

    @Override // X.InterfaceC43821y3
    public void AUo(View view) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(new ColorDrawable(-7829368));
        }
    }
}
