package com.whatsapp.conversation.conversationrow;

import X.C002301c;
import X.C002701i;
import X.C018308n;
import X.C018708s;
import X.C02L;
import X.C05W;
import X.C06C;
import X.C40071rX;
import X.C40081rY;

/* loaded from: classes2.dex */
public abstract class SecurityNotificationDialogFragment extends Hilt_SecurityNotificationDialogFragment {
    public C018308n A00;
    public C02L A01;
    public C05W A02;
    public C018708s A03;
    public C002301c A04;
    public C40081rY A05;
    public C40071rX A06;

    public CharSequence A18(int i, C06C c06c) {
        Object[] objArr = new Object[1];
        C002301c c002301c = this.A04;
        String A08 = this.A03.A08(c06c, false);
        objArr[0] = A08 == null ? null : c002301c.A0E(A08);
        return C002701i.A0g(A01().getString(i, objArr), A0a(), this.A05);
    }
}
