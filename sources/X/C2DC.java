package X;

import android.app.Activity;
import com.whatsapp.RequestPermissionActivity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2DC  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2DC {
    public static volatile C2DC A06;
    public final C02F A00;
    public final C000500h A01;
    public final C2DG A02;
    public final C2DI A03;
    public final C461825l A04 = new C461825l();
    public final InterfaceC002901k A05;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2DI] */
    public C2DC(final C001200o c001200o, InterfaceC002901k interfaceC002901k, C012005w c012005w, C02F c02f, C000500h c000500h) {
        final C2DF c2df = new C2DF(c001200o, c012005w);
        this.A05 = interfaceC002901k;
        this.A00 = c02f;
        this.A02 = new C2DG(c001200o, c2df);
        this.A03 = new C2DH(c001200o, c2df) { // from class: X.2DI
            public static final Set A02 = new HashSet(Arrays.asList("com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareDefaultAlias", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasActionClarify", "com.facebook.inspiration.shortcut.shareintent.InpirationCameraShareTestAliasFamilyConsistency"));
            public final C001200o A00;
            public final C2DF A01;

            {
                this.A00 = c001200o;
                this.A01 = c2df;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
            @Override // X.C2DH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public X.C2DM AD8(java.util.List r16, android.content.Context r17) {
                /*
                    Method dump skipped, instructions count: 333
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2DI.AD8(java.util.List, android.content.Context):X.2DM");
            }
        };
        this.A01 = c000500h;
    }

    public static C2DC A00() {
        if (A06 == null) {
            synchronized (C2DC.class) {
                if (A06 == null) {
                    A06 = new C2DC(C001200o.A01, C002801j.A00(), C012005w.A00(), C02F.A00(), C000500h.A00());
                }
            }
        }
        return A06;
    }

    public boolean A01() {
        C2DG c2dg = this.A02;
        int i = 0;
        while (true) {
            C2DJ[] c2djArr = c2dg.A00;
            if (i < c2djArr.length) {
                if (c2djArr[i].AFx()) {
                    if (!this.A01.A00.getBoolean("is_status_sharing_with_fb_disabled", false)) {
                        return true;
                    }
                    return false;
                }
                i++;
            } else {
                return false;
            }
        }
    }

    public final boolean A02(List list, Activity activity, C0BA c0ba, C2DH c2dh) {
        boolean A0M;
        C02F c02f = this.A00;
        if (!c02f.A06()) {
            if (c0ba != null) {
                A0M = RequestPermissionActivity.A0R(c0ba, c02f);
            } else {
                A0M = RequestPermissionActivity.A0M(activity, c02f);
            }
            if (!A0M) {
                return false;
            }
        }
        this.A05.AS1(new RunnableEBaseShape0S0400000_I0(this, c2dh, list, activity, 13));
        return true;
    }
}
