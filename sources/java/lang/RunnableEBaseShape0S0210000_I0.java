package java.lang;

import X.AbstractC005302j;
import X.ActivityC02330At;
import X.AnonymousClass097;
import X.C000200d;
import X.C03790Hb;
import X.C03890Hn;
import X.C05A;
import X.C07D;
import X.C0CD;
import X.C0CE;
import X.C0IT;
import X.C0J5;
import X.C0JM;
import X.C22K;
import X.C2AM;
import X.C2H2;
import X.C2KO;
import X.C2L3;
import X.C2N9;
import X.C41181tV;
import X.C41541u6;
import X.C41561u9;
import X.C41711uO;
import X.C43911yC;
import X.C44001yM;
import X.C49562Lc;
import X.C52732bE;
import X.C59832tU;
import X.C60042tp;
import android.content.ContentValues;
import android.location.Location;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0210000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public RunnableEBaseShape0S0210000_I0(Object obj, Object obj2, boolean z, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        ActivityC02330At A09;
        switch (this.A03) {
            case 0:
                C60042tp c60042tp = (C60042tp) this.A01;
                boolean z = this.A02;
                for (C2N9 c2n9 : ((C2L3) this.A00).A0F) {
                    c2n9.ANM(c60042tp, z);
                }
                return;
            case 1:
                AbstractC005302j abstractC005302j = (AbstractC005302j) this.A01;
                boolean z2 = this.A02;
                C000200d.A0v("conversations/group/toggleGroupProgressbar/:", abstractC005302j);
                ConversationsFragment conversationsFragment = ((C52732bE) this.A00).A00;
                View A11 = conversationsFragment.A11(abstractC005302j);
                if (A11 != null) {
                    View findViewById = A11.findViewById(R.id.progressbar_small);
                    if (z2) {
                        findViewById.setVisibility(0);
                        return;
                    } else {
                        findViewById.setVisibility(8);
                        return;
                    }
                }
                StringBuilder A0T = C000200d.A0T("conversations/refresh: no view for ", abstractC005302j, " ");
                A0T.append(conversationsFragment.A06.getFirstVisiblePosition());
                A0T.append("-");
                A0T.append(conversationsFragment.A06.getLastVisiblePosition());
                A0T.append(" (");
                A0T.append(conversationsFragment.A06.getCount());
                A0T.append(")");
                Log.w(A0T.toString());
                return;
            case 2:
                ((C2KO) this.A00).A05((C59832tU) this.A01, this.A02);
                return;
            case 3:
                C41181tV c41181tV = (C41181tV) this.A00;
                C0IT c0it = (C0IT) this.A01;
                boolean z3 = this.A02;
                C41541u6 c41541u6 = c41181tV.A02;
                Set A0E = c41541u6.A0E(c0it.A0U, z3);
                c41181tV.A06.A0C(c0it);
                c41541u6.A0V(A0E);
                return;
            case 4:
                C41181tV c41181tV2 = (C41181tV) this.A00;
                boolean z4 = this.A02;
                HashSet hashSet = new HashSet();
                for (C0IT c0it2 : (Collection) this.A01) {
                    hashSet.addAll(c41181tV2.A02.A0E(c0it2.A0U, z4));
                }
                C05A c05a = c41181tV2.A06;
                C0CD A04 = c05a.A04.A04();
                try {
                    C03790Hb A00 = A04.A00();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("archived", Boolean.valueOf(z4));
                    if (!c05a.A0G()) {
                        A04.A02.A00("chat_list", contentValues, null, null);
                    } else {
                        C0CE c0ce = A04.A02;
                        if (c0ce.A00("chat", contentValues, null, null) != 0) {
                            c0ce.A00("chat_list", contentValues, null, null);
                        }
                    }
                    A00.A00();
                    A00.close();
                    A04.close();
                    c41181tV2.A02.A0V(hashSet);
                    return;
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
            case 5:
                ((C41561u9) this.A00).A04((C03890Hn) this.A01, this.A02);
                return;
            case 6:
                C41711uO c41711uO = (C41711uO) this.A00;
                C07D c07d = (C07D) this.A01;
                c41711uO.A0F.A05(c07d, this.A02);
                c41711uO.A0L.removeAll(c07d.A02());
                c41711uO.A09(c07d);
                return;
            case 7:
                ((C49562Lc) this.A00).A03((Set) this.A01, this.A02);
                return;
            case 8:
                ((C43911yC) this.A00).A05((C44001yM) this.A01, this.A02, new C0J5(1L, 987L));
                return;
            case 9:
                C2H2 c2h2 = (C2H2) this.A00;
                boolean z5 = this.A02;
                Location location = (Location) this.A01;
                if (c2h2.A0g == null || z5) {
                    c2h2.A0J(location, Math.max((int) location.getAccuracy(), 100), null, true);
                    return;
                }
                return;
            case 10:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                boolean z6 = this.A02;
                AnonymousClass097 anonymousClass097 = (AnonymousClass097) this.A01;
                if (!z6 || (A09 = mediaViewFragment.A09()) == null || A09.isFinishing()) {
                    return;
                }
                mediaViewFragment.A1L(anonymousClass097, 0, true);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C22K c22k = (C22K) this.A00;
                DeviceJid[] deviceJidArr = (DeviceJid[]) this.A01;
                boolean z7 = this.A02;
                for (DeviceJid deviceJid : deviceJidArr) {
                    if (!deviceJid.isPrimary()) {
                        c22k.A09.A07(deviceJid, z7);
                    }
                }
                return;
            case 12:
                ((C2AM) this.A00).A0E((C0JM) this.A01, this.A02);
                return;
            default:
                return;
        }
    }
}
