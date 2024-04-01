package java.lang;

import X.AbstractC005302j;
import X.ActivityC02320As;
import X.C000200d;
import X.C000500h;
import X.C018608r;
import X.C05260Ny;
import X.C05E;
import X.C05M;
import X.C07430Ye;
import X.C0CB;
import X.C0CC;
import X.C0E5;
import X.C0IT;
import X.C1u5;
import X.C22K;
import X.C2IJ;
import X.C2IP;
import X.C2Il;
import X.C2J6;
import X.C40301ry;
import X.C41181tV;
import X.C41521u3;
import X.C451120l;
import X.C471429u;
import X.C52242aI;
import X.C52812bO;
import X.RunnableC26531Jp;
import X.RunnableC51182Uw;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.Hilt_IdentityChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0110000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public RunnableEBaseShape0S0110000_I0(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection<C0IT> values;
        switch (this.A02) {
            case 0:
                boolean z = this.A01;
                C52242aI c52242aI = ((C2Il) this.A00).A01.A0M;
                c52242aI.A02 = Boolean.valueOf(z);
                c52242aI.invalidate();
                c52242aI.postDelayed(c52242aI.A04, 1000L);
                return;
            case 1:
                C2IJ c2ij = (C2IJ) this.A00;
                boolean z2 = this.A01;
                ActivityC02320As activityC02320As = (ActivityC02320As) c2ij.A09.get();
                if (activityC02320As == null || c2ij.A04()) {
                    return;
                }
                View findViewById = activityC02320As.findViewById(R.id.media_card_view);
                if (z2) {
                    findViewById.setVisibility(0);
                    return;
                } else {
                    findViewById.setVisibility(8);
                    return;
                }
            case 2:
                boolean z3 = this.A01;
                C451120l c451120l = ((C2J6) this.A00).A05;
                if (z3) {
                    c451120l.A01();
                    return;
                } else {
                    c451120l.A02(null);
                    return;
                }
            case 3:
                C2J6 c2j6 = (C2J6) this.A00;
                boolean z4 = this.A01;
                c2j6.A02.A0B(null);
                c2j6.A03.A0B(Boolean.valueOf(z4));
                return;
            case 4:
                C41521u3 c41521u3 = (C41521u3) this.A00;
                boolean z5 = this.A01;
                if (c41521u3.A0F.A04()) {
                    c41521u3.A0C.A09(Message.obtain(null, 0, 259, 0, new C07430Ye(z5)));
                    return;
                }
                return;
            case 5:
                Hilt_IdentityChangeDialogFragment hilt_IdentityChangeDialogFragment = (Hilt_IdentityChangeDialogFragment) this.A00;
                ((SecurityNotificationDialogFragment) hilt_IdentityChangeDialogFragment).A00.A06(hilt_IdentityChangeDialogFragment.A00, new Intent("android.intent.action.VIEW", ((SecurityNotificationDialogFragment) hilt_IdentityChangeDialogFragment).A06.A01(this.A01 ? "26000361" : "28030014")));
                return;
            case 6:
                boolean z6 = this.A01;
                Animation animation = ((C471429u) this.A00).A04.A05.getAnimation();
                if (!(animation instanceof C52812bO)) {
                    StringBuilder A0P = C000200d.A0P("conversations-gdrive-observer/set-message/unexpected-animation-class: ");
                    A0P.append(animation == null ? "null" : animation.getClass());
                    Log.e(A0P.toString());
                    return;
                }
                C52812bO c52812bO = (C52812bO) animation;
                if (z6) {
                    c52812bO.A01 = false;
                    return;
                }
                c52812bO.A00 = 0L;
                c52812bO.A01 = true;
                return;
            case 7:
                C0CC c0cc = (C0CC) this.A00;
                boolean z7 = this.A01;
                Log.i("msgstore/backupdb/sb unlocker");
                try {
                    C05E c05e = c0cc.A0M;
                    c05e.A05();
                    c05e.A06.AE6();
                    c0cc.A0O.A02();
                    c0cc.A0J(z7);
                    return;
                } catch (SQLiteException e) {
                    Log.e("msgstore/backupdb/failed-to-get-database/cannot-generate-fts-or-links", e);
                    return;
                }
            case 8:
                ((View) this.A00).setVisibility(this.A01 ? 0 : 8);
                return;
            case 9:
                ((C2IP) this.A00).A0A(this.A01);
                return;
            case 10:
                StringBuilder A0P2 = C000200d.A0P("completion callback for onGetPreKeySuccess; sendUnsentMessages=");
                boolean z8 = this.A01;
                C000200d.A1V(A0P2, z8);
                RunnableC51182Uw runnableC51182Uw = (RunnableC51182Uw) this.A00;
                C22K c22k = runnableC51182Uw.A02;
                C0E5 c0e5 = c22k.A02;
                DeviceJid deviceJid = runnableC51182Uw.A01;
                synchronized (c0e5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("prekeysmanager/onGetPreKeySuccess:");
                    sb.append(deviceJid);
                    Log.i(sb.toString());
                    c0e5.A06.remove(deviceJid);
                    c0e5.A01();
                }
                c22k.A04.A02.A01(new C05260Ny(deviceJid));
                c22k.A00.post(new RunnableEBaseShape6S0200000_I1(this, deviceJid, 6));
                if (z8) {
                    c22k.A03.A01();
                    return;
                }
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C40301ry c40301ry = (C40301ry) this.A00;
                if (this.A01) {
                    Log.i("updating dismissed notification hash");
                    C000500h c000500h = c40301ry.A0O;
                    C000200d.A0i(c000500h, "notification_hash", c000500h.A00.getString("last_notification_hash", null));
                }
                c40301ry.A0N.A05(null, 1);
                return;
            case 12:
                C1u5 c1u5 = (C1u5) this.A00;
                boolean z9 = this.A01;
                c1u5.A0Q.A01(new RunnableEBaseShape5S0100000_I0_5(c1u5, 12), 14);
                if (z9) {
                    c1u5.A02.A02.postDelayed(new RunnableEBaseShape5S0100000_I0_5(c1u5, 11), 2000L);
                    return;
                }
                return;
            case 13:
                ActivityC02320As activityC02320As2 = (ActivityC02320As) this.A00;
                boolean z10 = this.A01;
                TextView textView = (TextView) activityC02320As2.findViewById(R.id.change_number_overview_body_one);
                if (z10) {
                    textView.setText(R.string.change_number_overview_payments_one);
                    ((TextView) activityC02320As2.findViewById(R.id.change_number_overview_body_two)).setText(R.string.change_number_overview_payments_two);
                    ((TextView) activityC02320As2.findViewById(R.id.change_number_overview_body_three)).setText(R.string.change_number_overview_payments_three);
                    return;
                }
                textView.setText(R.string.change_number_overview_one);
                ((TextView) activityC02320As2.findViewById(R.id.change_number_overview_body_two)).setText(R.string.change_number_overview_two);
                ((TextView) activityC02320As2.findViewById(R.id.change_number_overview_body_three)).setText(R.string.change_number_overview_three);
                return;
            case 14:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                boolean z11 = this.A01;
                C018608r c018608r = settingsChatHistoryFragment.A02;
                C41181tV c41181tV = c018608r.A0P;
                if (c41181tV != null) {
                    StringBuilder sb2 = new StringBuilder("msgstore/archiveall ");
                    sb2.append(z11);
                    Log.i(sb2.toString());
                    c41181tV.A06(z11);
                    C05M c05m = c41181tV.A07;
                    synchronized (c05m) {
                        values = c05m.A0C().values();
                    }
                    for (C0IT c0it : values) {
                        c0it.A0S = z11;
                    }
                    c41181tV.A09.A02.post(new RunnableEBaseShape2S0100000_I0_2(c41181tV.A03, 33));
                    c41181tV.A05.A01(new RunnableEBaseShape0S0210000_I0(c41181tV, values, z11, 4), 4);
                    c018608r.A04.A02.post(new RunnableC26531Jp(c018608r.A0z));
                    C0CB c0cb = c018608r.A14;
                    Set A0F = c0cb.A0F();
                    HashSet hashSet = new HashSet();
                    Iterator it = ((AbstractCollection) A0F).iterator();
                    while (it.hasNext()) {
                        AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
                        hashSet.addAll(c018608r.A0C.A0F(abstractC005302j, false));
                        c0cb.A0B(abstractC005302j, false, 0L);
                    }
                    c018608r.A0C.A0V(hashSet);
                    c018608r.A0y.A01(z11 ? 3 : 4, null, 0L, 0);
                    SystemClock.sleep(300L);
                    settingsChatHistoryFragment.A00.A02.post(new RunnableEBaseShape6S0100000_I0_6(settingsChatHistoryFragment, 18));
                    return;
                }
                throw null;
            case 15:
                boolean z12 = this.A01;
                DeviceJid deviceJid2 = (DeviceJid) this.A00;
                if (z12) {
                    Voip.notifyDeviceIdentityDeleted(deviceJid2);
                    return;
                } else {
                    Voip.notifyDeviceIdentityChanged(deviceJid2);
                    return;
                }
            default:
                return;
        }
    }
}
