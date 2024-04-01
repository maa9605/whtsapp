package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.WaImageView;
import java.io.File;

/* renamed from: X.3sz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83973sz extends AbstractC48662Ge {
    public Bitmap A00;
    public final C19230v5 A01;
    public final WaImageView A02;
    public final C40851sy A03;

    public C83973sz(Context context, File file) {
        C40851sy A01 = C40851sy.A01(file, false);
        this.A03 = A01;
        this.A01 = A01.A0A(context);
        WaImageView waImageView = new WaImageView(context);
        this.A02 = waImageView;
        waImageView.setImageDrawable(this.A01);
    }
}
