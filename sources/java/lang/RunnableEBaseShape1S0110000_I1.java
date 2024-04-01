package java.lang;

import X.AbstractC005302j;
import X.AnonymousClass024;
import X.C000200d;
import X.C003101m;
import X.C018508q;
import X.C018608r;
import X.C03790Hb;
import X.C05M;
import X.C06C;
import X.C0C9;
import X.C0CD;
import X.C0CE;
import X.C0HC;
import X.C0IT;
import X.C40061rW;
import X.C40301ry;
import X.C68183Ij;
import X.C74393dC;
import X.C81313oh;
import X.RunnableC26531Jp;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0110000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public RunnableEBaseShape1S0110000_I1(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        Set<Map.Entry> entrySet;
        switch (this.A02) {
            case 0:
                boolean z = this.A01;
                RestoreFromBackupActivity restoreFromBackupActivity = ((C68183Ij) this.A00).A01;
                if (!C40061rW.A0G(restoreFromBackupActivity)) {
                    restoreFromBackupActivity.A05.setProgress(100);
                    restoreFromBackupActivity.A05.setIndeterminate(true);
                    restoreFromBackupActivity.A07.setText(R.string.settings_gdrive_backup_msgstore_restore_message);
                    restoreFromBackupActivity.A1k(z);
                    return;
                }
                Log.i("gdrive-activity-observer/msgstore-download-finished/activity-already-exited");
                return;
            case 1:
                boolean z2 = this.A01;
                SettingsChatHistoryFragment settingsChatHistoryFragment = ((C81313oh) this.A00).A00;
                final C018608r c018608r = settingsChatHistoryFragment.A02;
                List A0B = c018608r.A0T.A0B();
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                Iterator it = ((AbstractCollection) A0B).iterator();
                while (it.hasNext()) {
                    final AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                    if (c018608r.A0Q.A01(abstractC005302j) > 0) {
                        C40301ry c40301ry = c018608r.A0z;
                        c40301ry.A02().post(new RunnableEBaseShape0S0300000_I0_0(c40301ry, null, abstractC005302j, 30));
                        C018508q c018508q = c018608r.A04;
                        c018508q.A02.post(new Runnable() { // from class: X.1JB
                            @Override // java.lang.Runnable
                            public final void run() {
                                C018608r c018608r2 = c018608r;
                                c018608r2.A0S.A05(abstractC005302j);
                            }
                        });
                        c018608r.A0y.A07(abstractC005302j, true);
                    }
                    C06C A02 = c018608r.A0R.A02(abstractC005302j);
                    if (!A02.A0C() && A02.A08 == null) {
                        arrayList.add(A02);
                    }
                    if (!A02.A0C()) {
                        c018608r.A0H(abstractC005302j);
                    }
                    hashSet.addAll(c018608r.A0C.A0G(abstractC005302j, z2));
                }
                c018608r.A0D.A0P(arrayList);
                C0C9 c0c9 = c018608r.A0U;
                if (c0c9 != null) {
                    Log.i("msgstore/deleteallmsgs");
                    C0HC c0hc = new C0HC("msgstore/deleteallmsgs");
                    c0c9.A1T.clear();
                    C0CD A04 = c0c9.A0n.A04();
                    try {
                        C03790Hb A00 = A04.A00();
                        C0CE c0ce = A04.A02;
                        c0ce.A0C("DELETE FROM chat_list WHERE key_remote_jid NOT LIKE'%@g.us' AND key_remote_jid NOT LIKE'%@temp'");
                        c0ce.A0C("DELETE FROM chat WHERE _id IN  (SELECT c._id FROM chat AS c LEFT JOIN jid AS j ON c.jid_row_id=j._id WHERE j.type != 1)");
                        c0c9.A0b(c0hc);
                        C05M c05m = c0c9.A0L;
                        synchronized (c05m) {
                            entrySet = c05m.A0C().entrySet();
                        }
                        for (Map.Entry entry : entrySet) {
                            AbstractC005302j abstractC005302j2 = (AbstractC005302j) entry.getKey();
                            C0IT c0it = (C0IT) entry.getValue();
                            c0it.A0I();
                            if (C003101m.A0V(abstractC005302j2) && c0it.A01 == 1) {
                                c0c9.A0g(abstractC005302j2, null);
                            }
                        }
                        A00.A00();
                        A00.close();
                        A04.close();
                        C000200d.A0m(c0hc, new StringBuilder("msgstore/deleteallmsgs time spent:"));
                        AnonymousClass024.A0g(c0c9.A02.A04().A0O);
                        if (z2) {
                            c0c9.A0H();
                        }
                        Message.obtain(c0c9.A0Z.A01, 9).sendToTarget();
                        c018608r.A0C.A0V(hashSet);
                        c018608r.A0m.A0F();
                        C018508q c018508q2 = c018608r.A04;
                        c018508q2.A02.post(new RunnableC26531Jp(c018608r.A0z));
                        c018608r.A0y.A01(2, null, 0L, 0);
                        c018608r.A0A.A02();
                        C018508q c018508q3 = settingsChatHistoryFragment.A00;
                        c018508q3.A02.post(new RunnableEBaseShape9S0100000_I1_1(settingsChatHistoryFragment, 17));
                        return;
                    } finally {
                    }
                } else {
                    throw null;
                }
            case 2:
                ((C74393dC) this.A00).A04(this.A01);
                return;
            default:
                return;
        }
    }
}
