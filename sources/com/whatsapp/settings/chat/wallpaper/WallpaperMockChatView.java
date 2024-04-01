package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC48182Ef;
import X.AnonymousClass012;
import X.C02L;
import X.C05U;
import X.C05V;
import X.C0AT;
import X.C0JJ;
import X.C2XC;
import X.C2Z3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class WallpaperMockChatView extends C2Z3 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C02L A05;
    public AbstractC48182Ef A06;
    public AbstractC48182Ef A07;
    public AnonymousClass012 A08;
    public C05U A09;

    public WallpaperMockChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC48182Ef getOutgoingRow() {
        return this.A07;
    }

    public void setMessages(String str, String str2) {
        Context context = getContext();
        C0JJ c0jj = (C0JJ) this.A09.A02(C05V.A00(this.A08, this.A05, null, false), this.A08.A05(), (byte) 0);
        c0jj.A0l(str);
        C05U c05u = this.A09;
        AnonymousClass012 anonymousClass012 = this.A08;
        C02L c02l = this.A05;
        c02l.A05();
        C0JJ c0jj2 = (C0JJ) c05u.A02(C05V.A00(anonymousClass012, c02l, c02l.A03, true), this.A08.A05(), (byte) 0);
        c0jj2.A0E = this.A08.A05();
        c0jj2.A0Y(5);
        c0jj2.A0l(str2);
        setBackgroundResource(0);
        setOrientation(1);
        C2XC c2xc = new C2XC(context, c0jj);
        this.A06 = c2xc;
        c2xc.A0d(true);
        this.A06.setEnabled(false);
        this.A00 = C0AT.A0D(this.A06, R.id.date_wrapper);
        this.A03 = (TextView) C0AT.A0D(this.A06, R.id.message_text);
        this.A02 = (TextView) C0AT.A0D(this.A06, R.id.conversation_row_date_divider);
        C2XC c2xc2 = new C2XC(context, c0jj2);
        this.A07 = c2xc2;
        c2xc2.A0d(false);
        this.A07.setEnabled(false);
        this.A01 = C0AT.A0D(this.A07, R.id.date_wrapper);
        this.A04 = (TextView) C0AT.A0D(this.A07, R.id.message_text);
        addView(this.A06);
        addView(this.A07);
    }
}
