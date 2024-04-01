package com.whatsapp.voipcalling;

import X.AbstractActivityC40681sh;
import X.AbstractActivityC40691si;
import X.AbstractC005302j;
import X.C003101m;
import X.C06950Vu;
import X.C2IY;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class GroupCallParticipantPicker extends AbstractActivityC40681sh {
    public View A00;
    public C06950Vu A01;
    public C2IY A02;

    public static Intent A01(Activity activity, GroupJid groupJid, List list, List list2, int i, int i2) {
        Intent intent = new Intent(activity, GroupCallParticipantPicker.class);
        if (list != null) {
            intent.putStringArrayListExtra("jids", C003101m.A0E(list));
        }
        if (groupJid != null) {
            intent.putExtra("source_group_jid", groupJid);
        }
        intent.putExtra("hidden_jids", i);
        if (list2 != null && !list2.isEmpty()) {
            intent.putStringArrayListExtra("selected", C003101m.A0E(list2));
        }
        intent.putExtra("call_from_ui", i2);
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
        if (r1 != null) goto L17;
     */
    @Override // X.ActivityC02250Al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1Q(android.widget.ListAdapter r12) {
        /*
            r11 = this;
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "hidden_jids"
            r4 = 0
            int r2 = r1.getIntExtra(r0, r4)
            r5 = 1
            r3 = 0
            if (r2 <= 0) goto L42
            android.widget.ListView r6 = r11.A1P()
            android.view.LayoutInflater r1 = r11.getLayoutInflater()
            r0 = 2131558851(0x7f0d01c3, float:1.874303E38)
            android.view.View r10 = r1.inflate(r0, r6, r4)
            r6.addFooterView(r10, r3, r4)
            r0 = 2131363179(0x7f0a056b, float:1.834616E38)
            android.view.View r9 = r10.findViewById(r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            X.01c r8 = r11.A0S
            r7 = 2131755097(0x7f100059, float:1.9141064E38)
            long r0 = (long) r2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r4] = r2
            java.lang.String r0 = r8.A0A(r7, r0, r6)
            r9.setText(r0)
            X.AnonymousClass088.A1T(r10)
        L42:
            android.view.View r1 = r11.A00
            if (r1 != 0) goto Lde
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "call_from_ui"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Le5
            int r1 = r0.intValue()
            r0 = 24
            if (r1 != r0) goto Le5
            X.0Vu r0 = r11.A01
            boolean r0 = r0.A05()
            if (r0 == 0) goto Le5
            android.widget.ListView r2 = r11.A1P()
            android.view.LayoutInflater r1 = r11.getLayoutInflater()
            r0 = 2131558576(0x7f0d00b0, float:1.8742472E38)
            android.view.View r1 = r1.inflate(r0, r2, r4)
            r11.A00 = r1
            r0 = 2131232082(0x7f080552, float:1.8080263E38)
            r1.setBackgroundResource(r0)
            android.view.View r0 = r11.A00
            X.AnonymousClass088.A1T(r0)
            android.view.View r1 = r11.A00
            r0 = 2131362519(0x7f0a02d7, float:1.834482E38)
            android.view.View r2 = X.C0AT.A0D(r1, r0)
            com.whatsapp.components.button.ThumbnailButton r2 = (com.whatsapp.components.button.ThumbnailButton) r2
            r0 = 2131231653(0x7f0803a5, float:1.8079393E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131100806(0x7f060486, float:1.7814004E38)
            android.content.res.ColorStateList r0 = X.C02160Ac.A02(r1, r0)
            X.C07O.A0h(r2, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r2.setScaleType(r0)
            r0 = 2131231305(0x7f080249, float:1.8078687E38)
            r2.setBackgroundResource(r0)
            r2.A06 = r5
            android.view.View r1 = r11.A00
            r0 = 2131362517(0x7f0a02d5, float:1.8344817E38)
            android.view.View r1 = X.C0AT.A0D(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.C003301p.A06(r1)
            r0 = 2131889471(0x7f120d3f, float:1.9413607E38)
            r1.setText(r0)
            android.view.View r1 = r11.A00
            r0 = 2131362520(0x7f0a02d8, float:1.8344823E38)
            android.view.View r1 = X.C0AT.A0D(r1, r0)
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r2 = r11.A00
            r1 = 14
            com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6 r0 = new com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            android.view.View r1 = r11.A00
            if (r1 == 0) goto Le5
        Lde:
            android.widget.ListView r0 = r11.A1P()
            r0.addHeaderView(r1, r3, r4)
        Le5:
            super.A1Q(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.GroupCallParticipantPicker.A1Q(android.widget.ListAdapter):void");
    }

    @Override // X.AbstractActivityC40691si
    public void A1i(int i) {
        if (i > 0 || A0c() == null) {
            super.A1i(i);
        } else {
            A0c().A07(R.string.add_paticipants);
        }
    }

    public final void A1n(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractActivityC40691si) this).A0J.A0A((AbstractC005302j) it.next()));
        }
    }

    public /* synthetic */ void lambda$createRoomView$2689$GroupCallParticipantPicker(View view) {
        C06950Vu c06950Vu = this.A01;
        AbstractC005302j abstractC005302j = (AbstractC005302j) getIntent().getParcelableExtra("source_group_jid");
        DialogFragment A03 = c06950Vu.A03(abstractC005302j, 1);
        if (A03 != null) {
            AUh(A03);
        } else {
            c06950Vu.A04(abstractC005302j, 1);
        }
    }

    @Override // X.AbstractActivityC40691si, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }
}
