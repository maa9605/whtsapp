package com.whatsapp.settings;

import X.AbstractC005302j;
import X.ActivityC06980Vx;
import X.C000400f;
import X.C000700j;
import X.C002701i;
import X.C018508q;
import X.C018608r;
import X.C019208x;
import X.C01B;
import X.C05W;
import X.C06C;
import X.C0CA;
import X.C28811Tx;
import X.C2MW;
import X.C2MZ;
import X.C53632hG;
import X.C81313oh;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import X.InterfaceC53642hH;
import android.app.Dialog;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SettingsChatHistoryFragment extends Hilt_SettingsChatHistoryFragment {
    public C018508q A00;
    public C01B A01;
    public C018608r A02;
    public C05W A03;
    public C2MW A04;
    public C000400f A05;
    public C0CA A06;
    public AbstractC005302j A07;
    public C2MZ A08;
    public InterfaceC002901k A09;

    @Override // X.C0BA
    public void A0h(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1) {
            AbstractC005302j A02 = AbstractC005302j.A02(intent.getStringExtra("contact"));
            C000700j.A04(A02, intent.getStringExtra("contact"));
            this.A07 = A02;
            ActivityC06980Vx activityC06980Vx = ((WaPreferenceFragment) this).A00;
            if (activityC06980Vx != null) {
                C2MW c2mw = this.A04;
                C06C A09 = this.A03.A09(A02);
                if (c2mw.A04.A0B(A02, 1, null, 2).size() > 0) {
                    C002701i.A19(activityC06980Vx, 10);
                } else {
                    c2mw.A01(activityC06980Vx, activityC06980Vx, A09, false);
                }
            }
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        A0x(new ColorDrawable(0));
        C28811Tx c28811Tx = ((PreferenceFragmentCompat) this).A06;
        c28811Tx.A00 = 0;
        c28811Tx.A03.A03.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        if (r0 == 0) goto L17;
     */
    @Override // androidx.preference.PreferenceFragmentCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0y(android.os.Bundle r5, java.lang.String r6) {
        /*
            r4 = this;
            X.0Vx r0 = r4.A00
            if (r0 != 0) goto L5
            return
        L5:
            X.0At r1 = r4.A0A()
            r0 = 2131889641(0x7f120de9, float:1.9413951E38)
            java.lang.String r1 = r1.getString(r0)
            X.0Vx r0 = r4.A00
            if (r0 == 0) goto L17
            r0.setTitle(r1)
        L17:
            r0 = 2132082697(0x7f150009, float:1.9805515E38)
            r4.A12(r0)
            X.01B r1 = r4.A01
            X.03B r0 = X.C01C.A0q
            boolean r0 = r1.A0E(r0)
            java.lang.String r2 = "email_chat_history"
            if (r0 == 0) goto L7f
            androidx.preference.Preference r1 = r4.A7p(r2)
            X.3oP r0 = new X.3oP
            r0.<init>()
            r1.A0B = r0
        L34:
            java.lang.String r0 = "msgstore_delete_all_chats"
            androidx.preference.Preference r1 = r4.A7p(r0)
            X.3oO r0 = new X.3oO
            r0.<init>()
            r1.A0B = r0
            java.lang.String r0 = "msgstore_clear_all_chats"
            androidx.preference.Preference r1 = r4.A7p(r0)
            X.3oS r0 = new X.3oS
            r0.<init>()
            r1.A0B = r0
            java.lang.String r3 = "msgstore_archive_all_chats"
            androidx.preference.Preference r2 = r4.A7p(r3)
            X.0CA r0 = r4.A06
            int r1 = r0.A04()
            X.0CA r0 = r4.A06
            int r0 = r0.A03()
            if (r1 > 0) goto L67
            r1 = 2131890284(0x7f12106c, float:1.9415255E38)
            if (r0 != 0) goto L6a
        L67:
            r1 = 2131886233(0x7f120099, float:1.940704E38)
        L6a:
            android.content.Context r0 = r2.A05
            java.lang.String r0 = r0.getString(r1)
            r2.A0J(r0)
            androidx.preference.Preference r1 = r4.A7p(r3)
            X.3oQ r0 = new X.3oQ
            r0.<init>()
            r1.A0B = r0
            return
        L7f:
            X.0PA r0 = r4.A02
            androidx.preference.PreferenceScreen r1 = r0.A07
            if (r1 == 0) goto L34
            androidx.preference.Preference r0 = r4.A7p(r2)
            if (r0 == 0) goto L34
            r1.A0W(r0)
            r1.A06()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsChatHistoryFragment.A0y(android.os.Bundle, java.lang.String):void");
    }

    @Override // com.whatsapp.WaPreferenceFragment
    public Dialog A10(int i) {
        C019208x A05;
        C019208x A03;
        AbstractC005302j abstractC005302j;
        ActivityC06980Vx activityC06980Vx = ((WaPreferenceFragment) this).A00;
        if (activityC06980Vx == null) {
            return null;
        }
        if (i == 3) {
            InterfaceC53642hH interfaceC53642hH = new InterfaceC53642hH() { // from class: X.3og
                {
                    SettingsChatHistoryFragment.this = this;
                }

                @Override // X.InterfaceC53642hH
                public void AMJ() {
                    ActivityC06980Vx activityC06980Vx2 = ((WaPreferenceFragment) SettingsChatHistoryFragment.this).A00;
                    if (activityC06980Vx2 != null) {
                        C002701i.A18(activityC06980Vx2, 3);
                    }
                }

                @Override // X.InterfaceC53642hH
                public void AN7(boolean z, boolean z2) {
                    SettingsChatHistoryFragment settingsChatHistoryFragment = SettingsChatHistoryFragment.this;
                    ActivityC06980Vx activityC06980Vx2 = ((WaPreferenceFragment) settingsChatHistoryFragment).A00;
                    if (activityC06980Vx2 != null) {
                        C002701i.A18(activityC06980Vx2, 3);
                        if (((WaPreferenceFragment) settingsChatHistoryFragment).A00 != null) {
                            settingsChatHistoryFragment.A11();
                            settingsChatHistoryFragment.A09.ARy(new C0HS(((WaPreferenceFragment) settingsChatHistoryFragment).A00, settingsChatHistoryFragment.A02, z, z2) { // from class: X.3oi
                                public final long A00 = SystemClock.elapsedRealtime();
                                public final C018608r A01;
                                public final WeakReference A02;
                                public final boolean A03;
                                public final boolean A04;

                                {
                                    this.A02 = new WeakReference(r3);
                                    this.A01 = r4;
                                    this.A04 = z;
                                    this.A03 = z2;
                                }

                                /* JADX WARN: Finally extract failed */
                                @Override // X.C0HS
                                public Object A07(Object[] objArr) {
                                    Set<Map.Entry> entrySet;
                                    final C018608r c018608r = this.A01;
                                    boolean z3 = this.A04;
                                    boolean z4 = this.A03;
                                    List A0B = c018608r.A0T.A0B();
                                    HashSet hashSet = new HashSet();
                                    Iterator it = ((AbstractCollection) A0B).iterator();
                                    while (it.hasNext()) {
                                        final AbstractC005302j abstractC005302j2 = (AbstractC005302j) it.next();
                                        if (c018608r.A0Q.A01(abstractC005302j2) > 0) {
                                            C40301ry c40301ry = c018608r.A0z;
                                            c40301ry.A02().post(new RunnableEBaseShape0S0300000_I0_0(c40301ry, null, abstractC005302j2, 30));
                                            C018508q c018508q = c018608r.A04;
                                            c018508q.A02.post(new Runnable() { // from class: X.1J8
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C018608r c018608r2 = c018608r;
                                                    c018608r2.A0S.A05(abstractC005302j2);
                                                }
                                            });
                                            c018608r.A0y.A07(abstractC005302j2, true);
                                        }
                                        hashSet.addAll(c018608r.A0C.A0J(abstractC005302j2, !z3, z4));
                                    }
                                    C0C9 c0c9 = c018608r.A0U;
                                    if (z3) {
                                        if (c0c9 != null) {
                                            ArrayList A0Y = C000200d.A0Y("msgstore/clearallmsgs_excludestarred");
                                            C0CD A032 = c0c9.A0n.A03();
                                            try {
                                                Cursor A07 = A032.A02.A07("SELECT DISTINCT chat_row_id FROM message_view", null);
                                                if (A07 != null) {
                                                    while (A07.moveToNext()) {
                                                        AbstractC005302j A09 = c0c9.A0K.A09(A07);
                                                        if (A09 != null && !C003101m.A0Z(A09)) {
                                                            A0Y.add(A09);
                                                        }
                                                    }
                                                    A07.close();
                                                }
                                                A032.close();
                                                Iterator it2 = A0Y.iterator();
                                                while (it2.hasNext()) {
                                                    c0c9.A0M((AbstractC005302j) it2.next(), null, true, z4);
                                                }
                                                Message.obtain(c0c9.A0Z.A01, 8).sendToTarget();
                                            } finally {
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } else if (c0c9 != null) {
                                        Log.i("msgstore/clearallmsgs");
                                        C0HC c0hc = new C0HC("msgstore/clearallmsgs");
                                        c0c9.A1T.clear();
                                        C0CD A04 = c0c9.A0n.A04();
                                        try {
                                            C03790Hb A00 = A04.A00();
                                            c0c9.A0b(c0hc);
                                            C05M c05m = c0c9.A0L;
                                            synchronized (c05m) {
                                                entrySet = c05m.A0C().entrySet();
                                            }
                                            for (Map.Entry entry : entrySet) {
                                                C0IT c0it = (C0IT) entry.getValue();
                                                c0it.A0I();
                                                AbstractC005302j abstractC005302j3 = (AbstractC005302j) entry.getKey();
                                                if (abstractC005302j3 != null && c0it.A01 == 1) {
                                                    c0c9.A0g(abstractC005302j3, null);
                                                }
                                            }
                                            A00.A00();
                                            A00.close();
                                            A04.close();
                                            AnonymousClass024.A0g(c0c9.A02.A04().A0O);
                                            if (z4) {
                                                c0c9.A0H();
                                            }
                                            Message.obtain(c0c9.A0Z.A01, 8).sendToTarget();
                                            C000200d.A0m(c0hc, new StringBuilder("msgstore/clearallmsgs time spent:"));
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                try {
                                                    A04.close();
                                                } catch (Throwable unused) {
                                                }
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        throw null;
                                    }
                                    c018608r.A0C.A0V(hashSet);
                                    C018508q c018508q2 = c018608r.A04;
                                    c018508q2.A02.post(new RunnableC26531Jp(c018608r.A0z));
                                    c018608r.A0y.A0D(new C48152Ea(null, !z3), 0);
                                    c018608r.A0A.A02();
                                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
                                    if (elapsedRealtime < 300) {
                                        SystemClock.sleep(300 - elapsedRealtime);
                                    }
                                    return null;
                                }

                                @Override // X.C0HS
                                public void A09(Object obj) {
                                    C0B5 c0b5 = (C0B5) this.A02.get();
                                    if (c0b5 != null) {
                                        c0b5.ARS();
                                    }
                                }
                            }, new Void[0]);
                        }
                    }
                }
            };
            C2MZ c2mz = this.A08;
            if (c2mz.A08()) {
                A05 = c2mz.A04(activityC06980Vx, interfaceC53642hH, -1, 3, 1, true);
            } else {
                A05 = c2mz.A05(activityC06980Vx, interfaceC53642hH, activityC06980Vx.getString(R.string.clear_all_chats_dialog_message), false, -1);
            }
            DialogInterfaceC019408z A00 = A05.A00();
            A00.show();
            return A00;
        } else if (i == 4) {
            C81313oh c81313oh = new C81313oh(this);
            C2MZ c2mz2 = this.A08;
            ContextWrapper contextWrapper = ((Hilt_SettingsChatHistoryFragment) this).A00;
            if (c2mz2.A08()) {
                A03 = c2mz2.A04(contextWrapper, new C53632hG(c81313oh), -1, 0, 0, false);
            } else {
                A03 = c2mz2.A03(contextWrapper, c81313oh, contextWrapper.getString(R.string.delete_all_chats_ask), false, R.string.delete, -1);
            }
            return A03.A00();
        } else if (i != 5) {
            if (i == 10 && (abstractC005302j = this.A07) != null) {
                C06C A0A = this.A03.A0A(abstractC005302j);
                C2MW c2mw = this.A04;
                ActivityC06980Vx activityC06980Vx2 = ((WaPreferenceFragment) this).A00;
                return c2mw.A00(activityC06980Vx2, activityC06980Vx2, A0A);
            }
            return null;
        } else {
            final boolean z = this.A06.A04() > 0;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3W8
                {
                    SettingsChatHistoryFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SettingsChatHistoryFragment settingsChatHistoryFragment = SettingsChatHistoryFragment.this;
                    boolean z2 = z;
                    ActivityC06980Vx activityC06980Vx3 = ((WaPreferenceFragment) settingsChatHistoryFragment).A00;
                    if (activityC06980Vx3 != null) {
                        C002701i.A18(activityC06980Vx3, 5);
                        settingsChatHistoryFragment.A11();
                        settingsChatHistoryFragment.A09.AS1(new RunnableEBaseShape0S0110000_I0(settingsChatHistoryFragment, z2, 14));
                    }
                }
            };
            C019208x c019208x = new C019208x(((Hilt_SettingsChatHistoryFragment) this).A00);
            int i2 = R.string.unarchive_all_chats_ask;
            if (z) {
                i2 = R.string.archive_all_chats_ask;
            }
            c019208x.A02(i2);
            c019208x.A06(R.string.ok, onClickListener);
            c019208x.A04(R.string.cancel, null);
            return c019208x.A00();
        }
    }
}
