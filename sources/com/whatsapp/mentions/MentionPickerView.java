package com.whatsapp.mentions;

import X.AbstractC04890Mh;
import X.C002301c;
import X.C011005l;
import X.C018708s;
import X.C02980Dr;
import X.C02L;
import X.C04250Jl;
import X.C05W;
import X.C0C8;
import X.C0C9;
import X.C0D7;
import X.C0L5;
import X.C2AR;
import X.C2LT;
import X.C2Y7;
import X.C68143If;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MentionPickerView extends C2Y7 {
    public RecyclerView A00;
    public C02L A01;
    public C05W A02;
    public C018708s A03;
    public C0L5 A04;
    public C002301c A05;
    public C0C9 A06;
    public C0C8 A07;
    public C011005l A08;
    public UserJid A09;
    public C2LT A0A;
    public C02980Dr A0B;
    public C68143If A0C;
    public C2AR A0D;
    public boolean A0E;

    public MentionPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A05() {
        ArrayList arrayList = new ArrayList();
        C011005l c011005l = this.A08;
        if (c011005l != null) {
            Iterator it = this.A07.A01(c011005l).A05().iterator();
            while (true) {
                C04250Jl c04250Jl = (C04250Jl) it;
                if (!c04250Jl.hasNext()) {
                    break;
                }
                C02L c02l = this.A01;
                UserJid userJid = ((C0D7) c04250Jl.next()).A03;
                if (!c02l.A0A(userJid)) {
                    arrayList.add(this.A02.A0A(userJid));
                }
            }
        }
        C68143If c68143If = this.A0C;
        c68143If.A06 = arrayList;
        ((AbstractC04890Mh) c68143If).A01.A00();
    }

    @Override // X.C2Y8
    public View getContentView() {
        return this.A00;
    }

    public void setVisibilityChangeListener(C2LT c2lt) {
        this.A0A = c2lt;
    }
}
