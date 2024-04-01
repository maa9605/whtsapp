package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2FB */
/* loaded from: classes2.dex */
public class C2FB {
    public Integer A00;
    public final int A01;
    public final C0RH A02;
    public final AnonymousClass011 A03;
    public final C2FD A04;
    public final Map A05 = new HashMap();

    public C2FB(AnonymousClass011 anonymousClass011, C2FD c2fd, Context context, int i) {
        this.A03 = anonymousClass011;
        this.A04 = c2fd;
        this.A01 = i;
        this.A02 = new C0RH(new C2FE(this), context);
    }
}
