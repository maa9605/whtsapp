package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.241 */
/* loaded from: classes2.dex */
public class AnonymousClass241 {
    public final int A00;
    public final C83483sC A01;
    public final boolean A02;

    public AnonymousClass241(C018508q c018508q, C41451tw c41451tw, AnonymousClass242 anonymousClass242, int i) {
        this.A01 = new C83483sC(c018508q, c41451tw, anonymousClass242.A08, new InterfaceC55972mU(anonymousClass242.A04, anonymousClass242.A03) { // from class: X.3sA
            public final Drawable A00;
            public final Drawable A01;

            {
                this.A00 = r2;
                this.A01 = r1;
            }

            public static final boolean A00(C83473sB c83473sB) {
                ImageView A00 = c83473sB.A00();
                return (A00 == null || A00.getTag(R.id.loaded_image_id) == null || !A00.getTag(R.id.loaded_image_id).equals(c83473sB.A06)) ? false : true;
            }

            @Override // X.InterfaceC55972mU
            public void AHL(InterfaceC40241rp interfaceC40241rp) {
                C83473sB c83473sB = (C83473sB) interfaceC40241rp;
                ImageView A00 = c83473sB.A00();
                if (A00 == null || !A00(c83473sB)) {
                    return;
                }
                Drawable drawable = c83473sB.A03;
                if (drawable == null) {
                    drawable = this.A01;
                }
                A00.setImageDrawable(drawable);
            }

            @Override // X.InterfaceC55972mU
            public void ALO(InterfaceC40241rp interfaceC40241rp) {
                C83473sB c83473sB = (C83473sB) interfaceC40241rp;
                ImageView A00 = c83473sB.A00();
                if (A00 != null && A00(c83473sB)) {
                    Drawable drawable = c83473sB.A02;
                    if (drawable == null) {
                        drawable = this.A00;
                    }
                    A00.setImageDrawable(drawable);
                }
                C3ZK c3zk = c83473sB.A04;
                if (c3zk != null) {
                    c3zk.ALN();
                }
            }

            @Override // X.InterfaceC55972mU
            public void ALU(InterfaceC40241rp interfaceC40241rp) {
                C83473sB c83473sB = (C83473sB) interfaceC40241rp;
                ImageView A00 = c83473sB.A00();
                if (A00 != null) {
                    A00.setTag(R.id.loaded_image_id, c83473sB.A06);
                }
            }

            @Override // X.InterfaceC55972mU
            public void ALX(InterfaceC40241rp interfaceC40241rp, Bitmap bitmap, boolean z) {
                C83473sB c83473sB = (C83473sB) interfaceC40241rp;
                ImageView A00 = c83473sB.A00();
                if (A00 == null || !A00(c83473sB)) {
                    return;
                }
                if ((A00.getDrawable() == null || (A00.getDrawable() instanceof ColorDrawable)) && !z) {
                    Drawable[] drawableArr = new Drawable[2];
                    drawableArr[0] = A00.getDrawable() == null ? new ColorDrawable(0) : A00.getDrawable();
                    drawableArr[1] = new BitmapDrawable(A00.getResources(), bitmap);
                    TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                    transitionDrawable.setCrossFadeEnabled(true);
                    transitionDrawable.startTransition(200);
                    A00.setImageDrawable(transitionDrawable);
                } else {
                    A00.setImageBitmap(bitmap);
                }
                C3ZK c3zk = c83473sB.A04;
                if (c3zk != null) {
                    c3zk.APb();
                }
            }
        }, anonymousClass242.A02);
        this.A02 = anonymousClass242.A05;
        this.A00 = i;
    }

    public void A00() {
        this.A01.A01(false);
    }

    public void A01(String str, ImageView imageView) {
        A03(str, imageView, null, null, null);
    }

    public void A02(String str, ImageView imageView, Drawable drawable) {
        A03(str, imageView, drawable, null, null);
    }

    public void A03(String str, ImageView imageView, Drawable drawable, Drawable drawable2, C3ZK c3zk) {
        int i = this.A00;
        this.A01.A00(new C83473sB(str, str, imageView, drawable, drawable2, i, i, c3zk), this.A02);
    }
}
