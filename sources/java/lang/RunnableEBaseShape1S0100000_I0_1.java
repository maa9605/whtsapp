package java.lang;

import X.AbstractActivityC40691si;
import X.AbstractC44571zI;
import X.AbstractC44611zM;
import X.ActivityC02290Ap;
import X.ActivityC02320As;
import X.AnonymousClass009;
import X.AnonymousClass064;
import X.AnonymousClass203;
import X.AnonymousClass290;
import X.C000700j;
import X.C011505r;
import X.C0CI;
import X.C0G5;
import X.C0JV;
import X.C0KQ;
import X.C0M6;
import X.C0O4;
import X.C1u7;
import X.C20M;
import X.C20Q;
import X.C20R;
import X.C29X;
import X.C2IG;
import X.C2Ib;
import X.C2Il;
import X.C2J0;
import X.C2J1;
import X.C2J6;
import X.C2J8;
import X.C2JA;
import X.C2JB;
import X.C2JC;
import X.C36B;
import X.C41321tj;
import X.C41541u6;
import X.C41711uO;
import X.C44321ys;
import X.C44351yv;
import X.C44441z5;
import X.C44511zC;
import X.C44531zE;
import X.C451020k;
import X.C468528n;
import X.C468928r;
import X.C469628y;
import X.C469728z;
import X.C471729x;
import X.C49042Ie;
import X.C49072Ii;
import X.C49172Iw;
import X.C49182Ix;
import X.InterfaceC04240Jk;
import X.SurfaceHolder$CallbackC49122Io;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoLayout;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0100000_I0_1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape1S0100000_I0_1(C29X c29x, int i) {
        this.A01 = i;
        switch (i) {
            case 1:
            case 4:
                this.A00 = c29x;
                return;
            case 2:
            case 3:
            default:
                this.A00 = c29x;
                return;
        }
    }

    public RunnableEBaseShape1S0100000_I0_1(ContactInfoActivity contactInfoActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 10:
            case 12:
                this.A00 = contactInfoActivity;
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
            default:
                this.A00 = contactInfoActivity;
                return;
        }
    }

    public RunnableEBaseShape1S0100000_I0_1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<C468528n> set;
        Runnable runnable;
        ArrayList<C468528n> arrayList;
        switch (this.A01) {
            case 0:
                ((C2Il) this.A00).A01.A0s.A07(R.string.contact_qr_scan_toast_no_valid_code, 1);
                return;
            case 1:
                C29X c29x = (C29X) this.A00;
                if (c29x.A0T()) {
                    c29x.A0Q(System.currentTimeMillis() - c29x.A02 > 1000);
                    return;
                }
                return;
            case 2:
                View view = (View) this.A00;
                view.requestLayout();
                view.forceLayout();
                view.getRootView().requestLayout();
                return;
            case 3:
                ((SurfaceHolder$CallbackC49122Io) this.A00).A05();
                return;
            case 4:
                C29X c29x2 = (C29X) this.A00;
                c29x2.A0N.AVO(new C471729x(c29x2), c29x2.A1P.size() > 0);
                return;
            case 5:
                C49072Ii c49072Ii = (C49072Ii) this.A00;
                c49072Ii.A00 = false;
                c49072Ii.invalidate();
                return;
            case 6:
                ((View) this.A00).setVisibility(8);
                return;
            case 7:
                ((SurfaceHolder$CallbackC49122Io) this.A00).A07();
                return;
            case 8:
                C29X c29x3 = (C29X) this.A00;
                c29x3.A07.setVisibility(4);
                c29x3.A05.setVisibility(4);
                c29x3.A06.setVisibility(0);
                return;
            case 9:
                ((ChatInfoLayout) this.A00).A0D.setSelectionFromTop(0, 0);
                return;
            case 10:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                UserJid userJid = (UserJid) contactInfoActivity.A0t.A03(UserJid.class);
                if (userJid != null) {
                    contactInfoActivity.A0v.A02(userJid);
                    return;
                }
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C2IG c2ig = (C2IG) this.A00;
                ContactInfoActivity contactInfoActivity2 = (ContactInfoActivity) c2ig.A09.get();
                if (contactInfoActivity2 == null || c2ig.A04()) {
                    return;
                }
                ContactInfoActivity.A02(contactInfoActivity2, null);
                return;
            case 12:
                ContactInfoActivity contactInfoActivity3 = (ContactInfoActivity) this.A00;
                contactInfoActivity3.A0H.A0M(contactInfoActivity3.A1e(), true);
                return;
            case 13:
                ContactInfoActivity contactInfoActivity4 = (ContactInfoActivity) this.A00;
                contactInfoActivity4.A1m();
                contactInfoActivity4.A1K.postDelayed(this, contactInfoActivity4.A1d());
                return;
            case 14:
                ((C41541u6) this.A00).A0P();
                return;
            case 15:
                ((C451020k) this.A00).A04.A0D(true);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C49182Ix c49182Ix = ((C49172Iw) this.A00).A00;
                C41711uO c41711uO = c49182Ix.A0C;
                C20M c20m = c49182Ix.A00;
                synchronized (c41711uO.A0K) {
                    c41711uO.A00 = c20m;
                    c41711uO.A02 = true;
                }
                return;
            case 17:
                ((C49182Ix) this.A00).A0E.A01();
                return;
            case 18:
                LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this.A00;
                C41711uO c41711uO2 = ((C20R) linkedDevicesActivity).A03;
                c41711uO2.A0L.clear();
                Iterator it = ((AbstractCollection) c41711uO2.A04()).iterator();
                while (it.hasNext()) {
                    c41711uO2.A0G.A0C(Message.obtain(null, 0, 240, 0, ((C0JV) it.next()).A05));
                }
                linkedDevicesActivity.A0E = ((C20R) linkedDevicesActivity).A07.ASB(new RunnableEBaseShape1S0100000_I0_1(linkedDevicesActivity, 18), 30000L);
                return;
            case 19:
                LinkedDevicesActivity linkedDevicesActivity2 = (LinkedDevicesActivity) this.A00;
                if (linkedDevicesActivity2.isFinishing()) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) linkedDevicesActivity2.A00.A0S;
                linkedDevicesActivity2.A00.setOverScrollMode((linearLayoutManager.A1H() - linearLayoutManager.A1F()) + 1 == linkedDevicesActivity2.A04.A0C() ? 2 : 0);
                return;
            case C0M6.A01 /* 20 */:
                C20R c20r = ((C2J0) this.A00).A00;
                c20r.A1T(c20r.A09.A04());
                return;
            case 21:
                C20R c20r2 = ((C20Q) this.A00).A00;
                c20r2.A0A = false;
                ProgressDialog progressDialog = c20r2.A00;
                if (progressDialog != null && progressDialog.isShowing()) {
                    c20r2.A00.dismiss();
                }
                c20r2.A1Q();
                return;
            case 22:
                C2J1 c2j1 = (C2J1) this.A00;
                Log.i("websessions/clear all accounts");
                C20R c20r3 = c2j1.A00;
                c20r3.A06.A0J(true);
                c20r3.A09.A07();
                c20r3.A05.A00();
                if (!c20r3.A03.A04().isEmpty()) {
                    c20r3.runOnUiThread(new RunnableEBaseShape1S0100000_I0_1(c2j1, 23));
                    c20r3.A03.A0D(false);
                    return;
                }
                c20r3.runOnUiThread(new RunnableEBaseShape1S0100000_I0_1(c2j1, 24));
                return;
            case 23:
                C20R c20r4 = ((C2J1) this.A00).A00;
                c20r4.A0A = true;
                C20R.A01(c20r4);
                return;
            case 24:
                ((C2J1) this.A00).A00.A1P();
                return;
            case 25:
                ((C20R) this.A00).A1R();
                return;
            case 26:
                PairedDevicesActivity pairedDevicesActivity = (PairedDevicesActivity) this.A00;
                pairedDevicesActivity.A02.notifyDataSetChanged();
                ((ActivityC02290Ap) pairedDevicesActivity).A0A.A02.postDelayed(pairedDevicesActivity.A04, 30000L);
                return;
            case 27:
                ((C44441z5) this.A00).A01();
                return;
            case 28:
                Set<C1u7> set2 = ((AnonymousClass064) this.A00).A00;
                synchronized (set2) {
                    for (C1u7 c1u7 : set2) {
                        c1u7.APU();
                    }
                }
                return;
            case 29:
                C44531zE c44531zE = (C44531zE) this.A00;
                c44531zE.A00();
                C44511zC c44511zC = c44531zE.A01;
                Log.e("sync-response-handler/onDeliveryFailure request failed to be delivered, retrying.");
                c44511zC.A06(false, true, c44511zC.A0E.A01());
                return;
            case 30:
                C44441z5 c44441z5 = (C44441z5) this.A00;
                Set<C1u7> set3 = c44441z5.A03.A00;
                synchronized (set3) {
                    for (C1u7 c1u72 : set3) {
                        c1u72.APT();
                    }
                }
                c44441z5.A05.A05(-1);
                return;
            case 31:
                final C2J6 c2j6 = (C2J6) this.A00;
                c2j6.A05.A02(new InterfaceC04240Jk() { // from class: X.2J7
                    @Override // X.InterfaceC04240Jk
                    public final Object A5S(Object obj) {
                        C2J6 c2j62 = c2j6;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        c2j62.A02.A0A(null);
                        if (booleanValue) {
                            c2j62.A00 = false;
                            c2j62.A01 = false;
                            c2j62.A03.A0A(Boolean.FALSE);
                            return null;
                        }
                        c2j62.A09.A0A(new C2pX(0, R.string.linked_device_logout_error_message));
                        return null;
                    }
                });
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                C44321ys c44321ys = (C44321ys) this.A00;
                synchronized (c44321ys) {
                    C44351yv c44351yv = c44321ys.A02;
                    C36B c36b = new AnonymousClass203() { // from class: X.36B
                        @Override // X.AnonymousClass203
                        public final boolean A7O(String str) {
                            return true;
                        }
                    };
                    if (c44351yv != null) {
                        for (AbstractC44611zM abstractC44611zM : c44351yv.A0A("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch FROM syncd_mutations WHERE are_dependencies_missing = 1 AND mutation_version <= ? ORDER BY _id ASC", new String[]{String.valueOf(3)}, c36b)) {
                            AbstractC44571zI A01 = c44321ys.A01(abstractC44611zM);
                            if (A01 != null) {
                                A01.A02(abstractC44611zM);
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                return;
            case 33:
                Log.i("sync-manager/doPreCompanionLogoutTask timeout");
                ((C0CI) this.A00).A00(Boolean.FALSE);
                return;
            case 34:
                C41541u6 c41541u6 = (C41541u6) this.A00;
                if (c41541u6.A09.A05()) {
                    c41541u6.A0P();
                    return;
                } else if (c41541u6.A0W()) {
                    c41541u6.A0R();
                    return;
                } else {
                    return;
                }
            case 35:
                ((C41541u6) this.A00).A0N();
                return;
            case 36:
                C2J8 c2j8 = (C2J8) this.A00;
                c2j8.A03.A03.A01.clear();
                c2j8.A05.A07.clear();
                c2j8.A04.A02();
                return;
            case 37:
                ((ScrollView) ((ActivityC02320As) this.A00).findViewById(R.id.scroll_view)).fullScroll(130);
                return;
            case 38:
                AbstractActivityC40691si abstractActivityC40691si = (AbstractActivityC40691si) this.A00;
                abstractActivityC40691si.A09.A0Z(abstractActivityC40691si.A0e.A0C());
                abstractActivityC40691si.A1Y();
                return;
            case 39:
                ((Set) this.A00).clear();
                return;
            case 40:
                C000700j.A01();
                Iterator it2 = ((AnonymousClass009) this.A00).A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it2;
                    if (!c0g5.hasNext()) {
                        return;
                    }
                    ((C0O4) c0g5.next()).A00();
                }
            case 41:
                C41321tj c41321tj = (C41321tj) this.A00;
                try {
                    c41321tj.A05();
                    return;
                } catch (RuntimeException e) {
                    Log.e("contactsyncmethods/forceSyncIfNeeded", e);
                    c41321tj.A00.A09("contactsyncmethods/forceSyncIfNeeded", e.getMessage(), true);
                    return;
                }
            case 42:
                C468928r c468928r = (C468928r) this.A00;
                synchronized (c468928r.A0R) {
                    C469628y c469628y = c468928r.A0E;
                    synchronized (c469628y) {
                        set = c469628y.A02;
                    }
                    for (C468528n c468528n : set) {
                        Handler A03 = c468928r.A03();
                        synchronized (c469628y) {
                            runnable = ((AnonymousClass290) c469628y.A01.get(c468528n)).A01;
                        }
                        A03.removeCallbacks(runnable);
                    }
                    c469628y.A01();
                    C469728z c469728z = c468928r.A0D;
                    synchronized (c469728z) {
                        c469728z.A00 = new LinkedList();
                    }
                    for (C468528n c468528n2 : set) {
                        c468928r.A04(c468528n2);
                    }
                }
                return;
            case 43:
                ((C011505r) this.A00).A02.A02().A00.A07(0);
                return;
            case 44:
                C468928r c468928r2 = (C468928r) this.A00;
                C469628y c469628y2 = c468928r2.A0E;
                synchronized (c469628y2) {
                    arrayList = new ArrayList();
                    C0KQ c0kq = c469628y2.A03;
                    String string = c0kq.A02().getString("current_running_sync", null);
                    if (string != null) {
                        try {
                            arrayList.add(C468528n.A00(string));
                        } catch (ClassCastException | JSONException e2) {
                            Log.w("SyncRequestStorage/restore/current_failed", e2);
                        }
                    }
                    try {
                        Set<String> stringSet = c0kq.A02().getStringSet("queued_running_sync_set", null);
                        if (stringSet != null) {
                            for (String str : stringSet) {
                                if (str != null) {
                                    arrayList.add(C468528n.A00(str));
                                }
                            }
                        }
                    } catch (ClassCastException | JSONException e3) {
                        Log.w("SyncRequestStorage/restore/queue_failed", e3);
                    }
                }
                for (C468528n c468528n3 : arrayList) {
                    c468928r2.A04(c468528n3);
                }
                return;
            case 45:
                C49042Ie c49042Ie = ((C2Ib) this.A00).A00;
                Activity activity = (Activity) c49042Ie.A0F.get();
                if (activity != null) {
                    C49042Ie.A01(c49042Ie);
                    c49042Ie.A0D.A06();
                    c49042Ie.A07(activity, c49042Ie.A03, 0, c49042Ie.A02(activity));
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                ((C49042Ie) this.A00).A06();
                return;
            case 47:
                C2JA c2ja = (C2JA) this.A00;
                c2ja.A07.A0M(c2ja.A0P, true);
                return;
            case 48:
                ((C2JB) this.A00).A02.A02();
                return;
            case 49:
                ((C2JC) this.A00).A0n();
                return;
            default:
                return;
        }
    }
}
