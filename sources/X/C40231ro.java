package X;

import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1ro */
/* loaded from: classes2.dex */
public final class C40231ro implements InterfaceC40241rp {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public final int A04;
    public final InterfaceC56142mm A05;
    public final InterfaceC56152mn A06;
    public final InterfaceC49482Kq A07;
    public final C2A2 A08;
    public final WeakReference A09;

    @Override // X.InterfaceC40241rp
    public int A8P() {
        return 1;
    }

    public C40231ro(C2A2 c2a2, int i, InterfaceC49482Kq interfaceC49482Kq, InterfaceC56142mm interfaceC56142mm, InterfaceC56152mn interfaceC56152mn, int i2, int i3, ImageView imageView) {
        this.A08 = c2a2;
        this.A04 = i;
        this.A07 = interfaceC49482Kq;
        this.A05 = interfaceC56142mm;
        this.A06 = interfaceC56152mn;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = new WeakReference(imageView);
    }

    public ImageView A00() {
        return (ImageView) this.A09.get();
    }

    public boolean A01() {
        ImageView A00 = A00();
        if (A00 != null) {
            String str = (String) A00.getTag(R.id.image_id);
            int intValue = ((Number) A00.getTag(R.id.image_quality)).intValue();
            if (this.A03 || !str.equals(this.A08.A02)) {
                return false;
            }
            return intValue == this.A04 || intValue == 1;
        }
        return !this.A03;
    }

    @Override // X.InterfaceC40241rp
    public boolean A7k() {
        return this.A04 == 1;
    }

    @Override // X.InterfaceC40241rp
    public int AB5() {
        return this.A00;
    }

    @Override // X.InterfaceC40241rp
    public int AB7() {
        return this.A01;
    }

    @Override // X.InterfaceC40241rp
    public Integer ABf() {
        return 5;
    }

    @Override // X.InterfaceC40241rp
    public String ADk() {
        String str;
        return (this.A04 != 2 || (str = this.A08.A04) == null) ? this.A08.A03 : str;
    }

    @Override // X.InterfaceC40241rp
    public String getId() {
        String str = this.A08.A02;
        int i = this.A04;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        if (i == 1) {
            i = 3;
        }
        sb.append(i);
        return sb.toString();
    }
}
