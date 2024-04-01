package com.facebook.redex;

import X.AnonymousClass011;
import X.C09520eE;
import X.C0HL;
import X.C25P;
import X.C27791Ou;
import X.C40731sm;
import X.C83213rl;
import X.C83223rm;
import android.view.View;
import com.whatsapp.storage.StorageUsageGalleryActivity;

/* loaded from: classes2.dex */
public class ViewOnClickEBaseShape0S1301000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public ViewOnClickEBaseShape0S1301000_I0(Object obj, String str, int i, Object obj2, Object obj3, int i2) {
        this.A05 = i2;
        this.A01 = obj;
        this.A04 = str;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.A05) {
            case 0:
                C83213rl c83213rl = (C83213rl) this.A01;
                String str = this.A04;
                int i = this.A00;
                C27791Ou c27791Ou = (C27791Ou) this.A02;
                AnonymousClass011 anonymousClass011 = c83213rl.A07;
                C09520eE c09520eE = new C09520eE();
                C40731sm.A0e(c09520eE, 3, str, i);
                anonymousClass011.A0B(c09520eE, null, false);
                ((C0HL) this.A03).A0B(StorageUsageGalleryActivity.A00(c83213rl.A0H.getContext(), 0, c27791Ou.A01(), c27791Ou.A00.A0G, str, i));
                return;
            case 1:
                C83223rm c83223rm = (C83223rm) this.A01;
                String str2 = this.A04;
                int i2 = this.A00;
                AnonymousClass011 anonymousClass0112 = c83223rm.A06;
                C09520eE c09520eE2 = new C09520eE();
                C40731sm.A0e(c09520eE2, 4, str2, i2);
                anonymousClass0112.A0B(c09520eE2, null, false);
                ((C0HL) this.A03).A0B(StorageUsageGalleryActivity.A00(c83223rm.A0H.getContext(), 2, null, ((C25P) this.A02).A01, str2, i2));
                return;
            case 2:
                C83223rm c83223rm2 = (C83223rm) this.A01;
                String str3 = this.A04;
                int i3 = this.A00;
                AnonymousClass011 anonymousClass0113 = c83223rm2.A06;
                C09520eE c09520eE3 = new C09520eE();
                C40731sm.A0e(c09520eE3, 5, str3, i3);
                anonymousClass0113.A0B(c09520eE3, null, false);
                ((C0HL) this.A03).A0B(StorageUsageGalleryActivity.A00(c83223rm2.A0H.getContext(), 1, null, ((C25P) this.A02).A01, str3, i3));
                return;
            default:
                return;
        }
    }
}
