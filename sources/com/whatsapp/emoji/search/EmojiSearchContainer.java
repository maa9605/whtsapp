package com.whatsapp.emoji.search;

import X.AbstractC04890Mh;
import X.AbstractC49352Jt;
import X.C002301c;
import X.C02O;
import X.C2MI;
import X.C3AZ;
import X.C40081rY;
import X.C47682Ce;
import X.C61512wH;
import X.InterfaceC54632j6;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;

/* loaded from: classes2.dex */
public class EmojiSearchContainer extends AbstractC49352Jt {
    public Activity A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public InterceptingEditText A04;
    public C002301c A05;
    public C40081rY A06;
    public C47682Ce A07;
    public C3AZ A08;
    public C2MI A09;
    public InterfaceC54632j6 A0A;
    public C02O A0B;
    public String A0C;
    public boolean A0D;

    public EmojiSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A00(String str) {
        C2MI c2mi = this.A09;
        if (c2mi == null || !c2mi.A02) {
            return;
        }
        this.A02.setVisibility(8);
        this.A01.setVisibility(0);
        C3AZ c3az = this.A08;
        C61512wH A00 = this.A09.A00(str, true, false);
        synchronized (c3az) {
            C61512wH c61512wH = c3az.A00;
            if (c61512wH != null) {
                c61512wH.A00(null);
            }
            c3az.A00 = A00;
            A00.A00(c3az);
            ((AbstractC04890Mh) c3az).A01.A00();
        }
        this.A0C = str;
    }

    public void A01(boolean z) {
        setVisibility(8);
        if (z) {
            this.A04.A01();
            this.A09 = null;
        }
    }
}
