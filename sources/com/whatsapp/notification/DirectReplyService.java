package com.whatsapp.notification;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.C000200d;
import X.C00A;
import X.C00T;
import X.C018508q;
import X.C018608r;
import X.C02E;
import X.C02O;
import X.C03070Ea;
import X.C03080Ec;
import X.C05W;
import X.C06C;
import X.C07940aL;
import X.C12760k1;
import X.C12830k9;
import X.C1MM;
import X.C3N1;
import X.C3N2;
import X.C40301ry;
import X.C41221tZ;
import X.C50512Sb;
import X.C76783h9;
import X.RunnableC460224q;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class DirectReplyService extends C1MM {
    public static final String A0A = C000200d.A0H("com.whatsapp", ".intent.action.DIRECT_REPLY_FROM_MESSAGE");
    public static final String A0B = C000200d.A0H("com.whatsapp", ".intent.action.DIRECT_REPLY_FROM_MISSED_CALL");
    public C018508q A00;
    public C018608r A01;
    public C05W A02;
    public C41221tZ A03;
    public C02E A04;
    public C00A A05;
    public C40301ry A06;
    public C03080Ec A07;
    public C02O A08;
    public C03070Ea A09;

    public static C07940aL A00(Context context, C06C c06c, String str, int i) {
        String string;
        if (A0B.equals(str)) {
            string = context.getString(R.string.voip_missed_call_notification_message);
        } else {
            string = context.getString(R.string.notification_quick_reply);
        }
        C12830k9 c12830k9 = new C12830k9("direct_reply_input", string, null, new Bundle(), new HashSet());
        C12760k1 c12760k1 = new C12760k1(R.drawable.ic_action_reply, c12830k9.A01, PendingIntent.getService(context, 0, new Intent(str, ContentUris.withAppendedId(C50512Sb.A00, c06c.A01()), context, DirectReplyService.class).putExtra("direct_reply_num_messages", i), 134217728));
        ArrayList arrayList = c12760k1.A01;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c12760k1.A01 = arrayList;
        }
        arrayList.add(c12830k9);
        c12760k1.A00 = 1;
        c12760k1.A03 = false;
        return c12760k1.A00();
    }

    public static boolean A01() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public /* synthetic */ void A03(C76783h9 c76783h9, C06C c06c, String str, String str2) {
        this.A05.A01(c76783h9);
        this.A01.A0d(Collections.singletonList(c06c.A03(AbstractC005302j.class)), str, null, null, null, false, false);
        if (A0B.equals(str2)) {
            this.A07.A03();
        } else if (Build.VERSION.SDK_INT < 28) {
            this.A03.A03((AbstractC005302j) c06c.A03(AbstractC005302j.class), true, true);
            this.A06.A04();
        } else {
            this.A03.A03((AbstractC005302j) c06c.A03(AbstractC005302j.class), true, false);
        }
    }

    public void A04(C76783h9 c76783h9, String str, C06C c06c, Intent intent) {
        this.A05.A00(c76783h9);
        if (Build.VERSION.SDK_INT >= 28 && !A0B.equals(str)) {
            C40301ry c40301ry = this.A06;
            AbstractC005302j abstractC005302j = (AbstractC005302j) c06c.A03(AbstractC005302j.class);
            int intExtra = intent.getIntExtra("direct_reply_num_messages", 0);
            if (c40301ry != null) {
                StringBuilder sb = new StringBuilder("messagenotification/posting reply update runnable for jid:");
                sb.append(abstractC005302j);
                Log.i(sb.toString());
                c40301ry.A02().post(new RunnableC460224q(c40301ry.A0M.A00, c40301ry.A07, c40301ry.A08, c40301ry.A0g, c40301ry.A05, c40301ry.A0Q, c40301ry.A06, c40301ry.A0V, c40301ry.A0A, c40301ry.A0I, c40301ry.A0j, c40301ry.A0D, c40301ry.A0E, c40301ry.A0F, c40301ry.A0G, c40301ry.A0K, c40301ry.A0H, c40301ry.A0P, c40301ry.A0c, c40301ry.A0f, c40301ry.A0h, c40301ry.A0S, c40301ry.A0e, c40301ry.A0Z, c40301ry.A0B, c40301ry.A0X, c40301ry, c40301ry.A0W, c40301ry.A0O, c40301ry.A0R, c40301ry.A0N, c40301ry.A09, c40301ry.A0T, c40301ry.A0b, c40301ry.A0d, c40301ry.A04, c40301ry.A0C, c40301ry.A0J, c40301ry.A0i, null, true, true, false, abstractC005302j, intExtra, true));
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.3h9] */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        C06C A05;
        StringBuilder sb = new StringBuilder("directreplyservice/intent: ");
        sb.append(intent);
        sb.append(" num_message:");
        sb.append(intent.getIntExtra("direct_reply_num_messages", 0));
        Log.i(sb.toString());
        if (!this.A09.A05()) {
            Log.i("directreplyservice/tos update does not allow messaging");
            return;
        }
        Bundle A00 = C12830k9.A00(intent);
        if (A00 == null) {
            Log.i("directreplyservice/could not find remote input");
            return;
        }
        if (C50512Sb.A01(intent.getData()) && (A05 = this.A02.A05(C50512Sb.A00(intent.getData()))) != null) {
            CharSequence charSequence = A00.getCharSequence("direct_reply_input");
            String trim = charSequence != null ? charSequence.toString().trim() : null;
            if (!AnonymousClass029.A1R(this.A04, this.A08, trim)) {
                Log.i("directreplyservice/message is empty");
                this.A00.A02.post(new RunnableEBaseShape8S0100000_I1_0(this, 44));
                return;
            }
            String action = intent.getAction();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ?? r5 = new C00T((AbstractC005302j) A05.A03(AbstractC005302j.class), countDownLatch) { // from class: X.3h9
                public final AbstractC005302j A00;
                public final CountDownLatch A01;

                {
                    this.A00 = r1;
                    this.A01 = countDownLatch;
                }

                @Override // X.C00T
                public void A0C(AnonymousClass092 anonymousClass092, int i) {
                    if (this.A00.equals(anonymousClass092.A0n.A00)) {
                        this.A01.countDown();
                    }
                }
            };
            this.A00.A02.post(new C3N1(this, r5, A05, trim, action));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                Log.e("Interrupted while waiting to add message", e);
            }
            this.A00.A02.post(new C3N2(this, r5, action, A05, intent));
            return;
        }
        Log.i("directreplyservice/contact could not be found");
    }
}
