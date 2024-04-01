package com.whatsapp.conversation.conversationrow.message;

import X.AbstractC005302j;
import X.AbstractC40441sG;
import X.AbstractC48182Ef;
import X.ActivityC02270An;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.C001200o;
import X.C003101m;
import X.C003701t;
import X.C00A;
import X.C00T;
import X.C011505r;
import X.C018608r;
import X.C018708s;
import X.C01B;
import X.C02620Cd;
import X.C03010Du;
import X.C03120Eg;
import X.C03320Ff;
import X.C03360Fk;
import X.C05W;
import X.C06K;
import X.C0C9;
import X.C0DB;
import X.C0GA;
import X.C0GC;
import X.C0GE;
import X.C0L5;
import X.C0Zn;
import X.C23K;
import X.C2AR;
import X.C2JC;
import X.C2ML;
import X.C2Na;
import X.C39D;
import X.C40951t8;
import X.C42381ve;
import X.C42761wH;
import X.C42801wL;
import X.C42811wM;
import X.C43791xz;
import X.C58832rm;
import X.C59202sN;
import X.InterfaceC04700Lm;
import X.InterfaceC04800Lw;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.whatsapp.Conversation;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class MessageDetailsActivity extends C2Na implements InterfaceC04800Lw, InterfaceC04700Lm {
    public long A00;
    public BaseAdapter A01;
    public ListView A02;
    public C03010Du A03;
    public C01B A04;
    public C018608r A05;
    public C06K A06;
    public C03320Ff A07;
    public C05W A08;
    public AnonymousClass008 A09;
    public C018708s A0A;
    public C011505r A0B;
    public C0Zn A0C;
    public C0L5 A0D;
    public AbstractC48182Ef A0E;
    public C58832rm A0F;
    public C42381ve A0G;
    public C03120Eg A0H;
    public AnonymousClass012 A0I;
    public C001200o A0J;
    public C0C9 A0K;
    public C00A A0L;
    public C42761wH A0M;
    public C003701t A0N;
    public C03360Fk A0O;
    public AnonymousClass092 A0P;
    public AbstractC40441sG A0Q;
    public C2AR A0R;
    public C43791xz A0S;
    public C40951t8 A0T;
    public C2ML A0U;
    public boolean A0V;
    public final ArrayList A0b = new ArrayList();
    public final C00T A0Y = new C00T() { // from class: X.399
        {
            MessageDetailsActivity.this = this;
        }

        @Override // X.C00T
        public void A01(AnonymousClass092 anonymousClass092) {
            A0D(anonymousClass092);
        }

        @Override // X.C00T
        public void A05(AbstractC005302j abstractC005302j) {
            MessageDetailsActivity messageDetailsActivity = MessageDetailsActivity.this;
            if (abstractC005302j.equals(messageDetailsActivity.A0P.A0n.A00) && messageDetailsActivity.A0K.A0F(messageDetailsActivity.A0P.A0n) == null) {
                messageDetailsActivity.finish();
            }
        }

        @Override // X.C00T
        public void A08(AnonymousClass092 anonymousClass092, int i) {
            A0D(anonymousClass092);
        }

        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A0D((AnonymousClass092) it.next());
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass094 anonymousClass094 = ((AnonymousClass092) it.next()).A0n;
                MessageDetailsActivity messageDetailsActivity = MessageDetailsActivity.this;
                if (anonymousClass094.equals(messageDetailsActivity.A0P.A0n)) {
                    messageDetailsActivity.finish();
                    return;
                }
            }
        }

        public final void A0D(AnonymousClass092 anonymousClass092) {
            if (anonymousClass092 != null) {
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                String str = anonymousClass094.A01;
                MessageDetailsActivity messageDetailsActivity = MessageDetailsActivity.this;
                if (str.equals(messageDetailsActivity.A0P.A0n.A01) && anonymousClass094.A02) {
                    messageDetailsActivity.A1P();
                    messageDetailsActivity.A0E.A0I();
                }
            }
        }
    };
    public final C0GA A0X = new C0GA() { // from class: X.39A
        {
            MessageDetailsActivity.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            MessageDetailsActivity.this.A01.notifyDataSetChanged();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            MessageDetailsActivity messageDetailsActivity = MessageDetailsActivity.this;
            Iterator it = messageDetailsActivity.A0b.iterator();
            while (it.hasNext()) {
                if (abstractC005302j.equals(((C59202sN) it.next()).A01)) {
                    messageDetailsActivity.A01.notifyDataSetChanged();
                    return;
                }
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            MessageDetailsActivity messageDetailsActivity = MessageDetailsActivity.this;
            Iterator it = messageDetailsActivity.A0b.iterator();
            while (it.hasNext()) {
                if (userJid.equals(((C59202sN) it.next()).A01)) {
                    messageDetailsActivity.A01.notifyDataSetChanged();
                    return;
                }
            }
        }
    };
    public final C0GC A0W = new C0GC() { // from class: X.39B
        {
            MessageDetailsActivity.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            MessageDetailsActivity.this.A01.notifyDataSetChanged();
        }
    };
    public final C0GE A0Z = new C0GE() { // from class: X.39C
        {
            MessageDetailsActivity.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            MessageDetailsActivity.this.A01.notifyDataSetChanged();
        }
    };
    public final Runnable A0a = new RunnableEBaseShape2S0100000_I0_2(this, 6);

    public static CharSequence A00(MessageDetailsActivity messageDetailsActivity, long j) {
        return AnonymousClass029.A0U(((ActivityC02310Ar) messageDetailsActivity).A01, messageDetailsActivity.A0I.A06(j));
    }

    public final void A1P() {
        ArrayList arrayList = this.A0b;
        arrayList.clear();
        this.A00 = Long.MAX_VALUE;
        C42801wL A02 = this.A0M.A02(this.A0P);
        if (A02.A00() == 0) {
            AbstractC005302j abstractC005302j = this.A0P.A0n.A00;
            if (C003101m.A0b(abstractC005302j)) {
                A02.A00.put(abstractC005302j, new C42811wM(0L, 0L, 0L));
            }
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry entry : A02.A00.entrySet()) {
            C42811wM c42811wM = (C42811wM) entry.getValue();
            arrayList.add(new C59202sN((UserJid) entry.getKey(), c42811wM));
            long A01 = c42811wM.A01(5);
            long A012 = c42811wM.A01(13);
            long A013 = c42811wM.A01(8);
            if (A01 != 0) {
                this.A00 = Math.min(this.A00, A01);
                i++;
            }
            if (A012 != 0) {
                this.A00 = Math.min(this.A00, A012);
                i3++;
            }
            if (A013 != 0) {
                this.A00 = Math.min(this.A00, A013);
                i2++;
            }
        }
        AnonymousClass092 anonymousClass092 = this.A0P;
        AbstractC005302j abstractC005302j2 = anonymousClass092.A0n.A00;
        if (C003101m.A0U(abstractC005302j2) || C003101m.A0P(abstractC005302j2)) {
            int i4 = anonymousClass092.A06;
            if (i2 < i4 && C0DB.A0R(anonymousClass092)) {
                arrayList.add(new C39D(i4 - i2, 8));
            }
            if (i3 < i4) {
                arrayList.add(new C39D(i4 - i3, 13));
            }
            if (i < i4) {
                arrayList.add(new C39D(i4 - i, 5));
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: X.2sJ
            public Map A00;
            public final C57722pt A01;

            {
                MessageDetailsActivity.this = this;
                this.A01 = new C57722pt(this.A0A, ((ActivityC02310Ar) this).A01);
                this.A00 = new HashMap(MessageDetailsActivity.this.A0b.size());
            }

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                C59202sN c59202sN = (C59202sN) obj;
                C59202sN c59202sN2 = (C59202sN) obj2;
                int A00 = C0D6.A00(c59202sN2.A00(), c59202sN.A00());
                if (A00 == 0) {
                    UserJid userJid = c59202sN.A01;
                    if (userJid == null) {
                        return c59202sN2.A01 == null ? 0 : 1;
                    }
                    UserJid userJid2 = c59202sN2.A01;
                    if (userJid2 != null) {
                        C06C c06c = (C06C) this.A00.get(userJid);
                        if (c06c == null) {
                            c06c = MessageDetailsActivity.this.A08.A0A(userJid);
                            this.A00.put(userJid, c06c);
                        }
                        C06C c06c2 = (C06C) this.A00.get(userJid2);
                        if (c06c2 == null) {
                            c06c2 = MessageDetailsActivity.this.A08.A0A(userJid2);
                            this.A00.put(userJid2, c06c2);
                        }
                        boolean z = !TextUtils.isEmpty(c06c.A0F);
                        if (z == (!TextUtils.isEmpty(c06c2.A0F))) {
                            return this.A01.compare(c06c, c06c2);
                        }
                        return z ? -1 : 1;
                    }
                    return -1;
                }
                return A00;
            }
        });
        BaseAdapter baseAdapter = this.A01;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
        A1Q();
    }

    public final void A1Q() {
        ListView listView = this.A02;
        Runnable runnable = this.A0a;
        listView.removeCallbacks(runnable);
        long j = this.A00;
        if (j != Long.MAX_VALUE) {
            this.A02.postDelayed(runnable, (C02620Cd.A01(j) - System.currentTimeMillis()) + 1000);
        }
    }

    @Override // X.InterfaceC04800Lw
    public C0Zn A94() {
        return this.A0F.A01(this);
    }

    @Override // X.InterfaceC04700Lm
    public C43791xz ADH() {
        return this.A0S;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1 || intent == null) {
        } else {
            List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
            this.A05.A0E(this.A03, this.A0P, A0F);
            AbstractList abstractList = (AbstractList) A0F;
            if (abstractList.size() == 1 && !C003101m.A0Z((Jid) abstractList.get(0))) {
                ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, this.A08.A0A((AbstractC005302j) abstractList.get(0))));
            } else {
                A1L(A0F);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        if (r20.A0P.A03 >= 127) goto L34;
     */
    @Override // X.C2Na, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A0C.A00();
        C58832rm c58832rm = this.A0F;
        C0Zn c0Zn = c58832rm.A00;
        if (c0Zn != null) {
            c0Zn.A00();
        }
        C43791xz c43791xz = c58832rm.A01;
        if (c43791xz != null) {
            c43791xz.A04();
        }
        C23K c23k = c58832rm.A02;
        if (c23k != null) {
            c23k.A07();
        }
        this.A0H.A05();
        this.A02.removeCallbacks(this.A0a);
        this.A09.A00(this.A0X);
        this.A0L.A00(this.A0Y);
        this.A07.A00(this.A0W);
        this.A0O.A00(this.A0Z);
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A0U.A00();
        if (this.A0H.A08()) {
            this.A0H.A02();
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A0H.A08()) {
            this.A0H.A04();
        }
        AbstractC48182Ef abstractC48182Ef = this.A0E;
        if (abstractC48182Ef instanceof C2JC) {
            ((C2JC) abstractC48182Ef).A0p();
        }
    }
}
