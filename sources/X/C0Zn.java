package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.0Zn */
/* loaded from: classes.dex */
public class C0Zn {
    public C52342aZ A00;
    public final float A01;
    public final int A02;
    public final C52332aY A03 = new C52332aY();
    public final /* synthetic */ C0L5 A04;

    public C0Zn(C0L5 c0l5, int i, float f) {
        this.A04 = c0l5;
        this.A02 = i;
        this.A01 = f;
    }

    public void A00() {
        C52342aZ c52342aZ = this.A00;
        if (c52342aZ != null) {
            c52342aZ.A04 = true;
            c52342aZ.interrupt();
            this.A00 = null;
        }
    }

    public void A01(C2LC c2lc, ImageView imageView) {
        imageView.setContentDescription(c2lc.A06);
        String obj = Long.valueOf(c2lc.A04).toString();
        imageView.setTag(obj);
        Bitmap bitmap = c2lc.A00;
        if (bitmap != null) {
            new C52352aa(this.A04.A02).AUd(imageView, bitmap, true);
            return;
        }
        C06C c06c = c2lc.A01;
        if (c06c != null) {
            A02(c06c, imageView);
        } else {
            A06(c2lc, imageView, obj, new C52352aa(this.A04.A02), this.A02, this.A01);
        }
    }

    public void A02(C06C c06c, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        A04(c06c, imageView, true, new C52352aa(this.A04.A02, c06c));
    }

    public void A03(C06C c06c, ImageView imageView) {
        A04(c06c, imageView, false, new C52352aa(this.A04.A02, c06c));
    }

    public void A04(C06C c06c, ImageView imageView, boolean z, InterfaceC52362ab interfaceC52362ab) {
        A05(c06c, imageView, z, interfaceC52362ab, this.A02, this.A01);
    }

    public final void A05(C06C c06c, ImageView imageView, boolean z, InterfaceC52362ab interfaceC52362ab, int i, float f) {
        String A08;
        if (z) {
            C0L5 c0l5 = this.A04;
            if (c0l5.A01.A0A(c06c.A02())) {
                A08 = imageView.getContext().getString(R.string.you);
            } else {
                A08 = c0l5.A04.A08(c06c, false);
            }
            imageView.setContentDescription(A08);
        }
        String A06 = c06c.A06(i, f);
        if (A06 == null) {
            interfaceC52362ab.AUp(imageView);
            return;
        }
        boolean equals = A06.equals(imageView.getTag());
        imageView.setTag(A06);
        Bitmap bitmap = (Bitmap) this.A04.A05.A02.A02().A01(A06);
        if (bitmap != null) {
            interfaceC52362ab.AUd(imageView, bitmap, true);
            return;
        }
        if (!equals || !c06c.A0R) {
            interfaceC52362ab.AUp(imageView);
        }
        if (c06c.A0R) {
            A06(c06c, imageView, A06, interfaceC52362ab, i, f);
        }
    }

    public final void A06(Object obj, ImageView imageView, Object obj2, InterfaceC52362ab interfaceC52362ab, int i, float f) {
        C52332aY c52332aY = this.A03;
        Stack stack = c52332aY.A00;
        synchronized (stack) {
            int i2 = 0;
            while (i2 < stack.size()) {
                if (((C52372ac) stack.get(i2)).A04 == imageView) {
                    stack.remove(i2);
                } else {
                    i2++;
                }
            }
        }
        C52372ac c52372ac = new C52372ac(obj, imageView, obj2, interfaceC52362ab, i, f);
        synchronized (stack) {
            stack.add(0, c52372ac);
            stack.notifyAll();
        }
        if (this.A00 == null) {
            C0L5 c0l5 = this.A04;
            C52342aZ c52342aZ = new C52342aZ(c52332aY, c0l5.A00, c0l5.A03, c0l5.A06);
            this.A00 = c52342aZ;
            c52342aZ.start();
        }
    }

    public void A07(C04110Ip c04110Ip, ImageView imageView) {
        A08(c04110Ip, imageView, new C52352aa(this.A04.A02), this.A02, this.A01);
    }

    public void A08(C04110Ip c04110Ip, ImageView imageView, InterfaceC52362ab interfaceC52362ab, int i, float f) {
        int length;
        imageView.setContentDescription(c04110Ip.A08());
        ArrayList arrayList = new ArrayList();
        List<C09010cT> list = c04110Ip.A05;
        if (list != null) {
            for (C09010cT c09010cT : list) {
                UserJid userJid = c09010cT.A01;
                if (userJid != null) {
                    arrayList.add(userJid);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            if (C003101m.A0b(abstractC005302j)) {
                C0L5 c0l5 = this.A04;
                C06C A09 = c0l5.A03.A09(abstractC005302j);
                if (A09 != null) {
                    A05(A09, imageView, true, new C52352aa(c0l5.A02), i, f);
                    return;
                }
            }
        }
        byte[] bArr = c04110Ip.A09;
        if (bArr == null || (length = bArr.length) <= 0) {
            ((C52352aa) interfaceC52362ab).AUp(imageView);
        } else {
            ((C52352aa) interfaceC52362ab).AUd(imageView, BitmapFactory.decodeByteArray(bArr, 0, length), true);
        }
    }
}
