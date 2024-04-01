package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.20R */
/* loaded from: classes2.dex */
public abstract class C20R extends C20S {
    public ProgressDialog A00;
    public C41541u6 A01;
    public C0E7 A02;
    public C41711uO A03;
    public C0F4 A04;
    public C00Y A05;
    public C41521u3 A06;
    public InterfaceC002901k A07;
    public C41981up A08;
    public C41991uq A09;
    public boolean A0A;
    public final C75143eQ A0E = new Comparator() { // from class: X.3eQ
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return (((C42881wU) obj2).A04 > ((C42881wU) obj).A04 ? 1 : (((C42881wU) obj2).A04 == ((C42881wU) obj).A04 ? 0 : -1));
        }
    };
    public final InterfaceC43021wi A0D = new C2J0(this);
    public final C44501zB A0C = new C20Q(this);
    public final C2J1 A0B = new C2J1(this);

    public static Intent A00(Context context, C01B c01b, C0EE c0ee, boolean z) {
        if (C46W.A08(c01b, c0ee)) {
            return new Intent(context, LinkedDevicesActivity.class);
        }
        return z ? new Intent(context, DevicePairQrScannerActivity.class) : new Intent(context, PairedDevicesActivity.class);
    }

    public static void A01(C20R c20r) {
        if (c20r.A00 == null) {
            ProgressDialog progressDialog = new ProgressDialog(c20r);
            c20r.A00 = progressDialog;
            progressDialog.setMessage(c20r.getString(R.string.logging_out_device));
            c20r.A00.setCancelable(false);
        }
        c20r.A00.show();
    }

    public void A1P() {
        if (!(this instanceof PairedDevicesActivity)) {
            LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this;
            linkedDevicesActivity.A1S(Collections.emptyList());
            linkedDevicesActivity.A1T(Collections.emptyList());
            List emptyList = Collections.emptyList();
            C2IT c2it = linkedDevicesActivity.A04;
            c2it.A01 = emptyList;
            c2it.A0G();
            ((AbstractC04890Mh) c2it).A01.A00();
            return;
        }
        if (!A1E()) {
            startActivity(new Intent(this, DevicePairQrScannerActivity.class));
        }
        finish();
    }

    public void A1Q() {
        if (AnonymousClass024.A0c()) {
            A1R();
            return;
        }
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        c018508q.A02.post(new RunnableEBaseShape1S0100000_I0_1(this, 25));
    }

    public final void A1R() {
        this.A07.ARy(new C52852bS(this.A09, this.A03, this.A05, new InterfaceC52742bF() { // from class: X.35n
            {
                C20R.this = this;
            }

            @Override // X.InterfaceC52742bF
            public final void AMj(List list, List list2, List list3) {
                C20R c20r = C20R.this;
                if (!c20r.isFinishing()) {
                    if (list.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
                        c20r.A1P();
                        return;
                    }
                    c20r.A1T(list);
                    c20r.A1S(list2);
                    if (c20r instanceof PairedDevicesActivity) {
                        return;
                    }
                    C2IT c2it = ((LinkedDevicesActivity) c20r).A04;
                    c2it.A01 = list3;
                    c2it.A0G();
                    ((AbstractC04890Mh) c2it).A01.A00();
                }
            }
        }), new Void[0]);
    }

    public void A1S(List list) {
        if (!(this instanceof PairedDevicesActivity)) {
            LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this;
            linkedDevicesActivity.A0F = list;
            C2IT c2it = linkedDevicesActivity.A04;
            c2it.A00.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c2it.A00.add(new C650135o((C0JV) it.next()));
            }
            c2it.A0G();
            ((AbstractC04890Mh) c2it).A01.A00();
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = linkedDevicesActivity.A05;
            if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A04 != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C0JV c0jv = (C0JV) it2.next();
                    if (c0jv.A05.equals(linkedDevicesActivity.A05.A04.A05)) {
                        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = linkedDevicesActivity.A05;
                        linkedDevicesDetailDialogFragment2.A04 = c0jv;
                        linkedDevicesDetailDialogFragment2.A09 = null;
                        linkedDevicesDetailDialogFragment2.A07 = null;
                        if (linkedDevicesDetailDialogFragment2.A01 != null) {
                            linkedDevicesDetailDialogFragment2.A18();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        PairedDevicesActivity pairedDevicesActivity = (PairedDevicesActivity) this;
        C2J5 c2j5 = pairedDevicesActivity.A02;
        c2j5.A00 = list;
        c2j5.notifyDataSetChanged();
        int i = pairedDevicesActivity.A02.getCount() > 0 ? 0 : 8;
        pairedDevicesActivity.A01.setVisibility(i);
        pairedDevicesActivity.A00.setVisibility(i);
    }

    public void A1T(List list) {
        if (!(this instanceof PairedDevicesActivity)) {
            LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this;
            Collections.sort(list, linkedDevicesActivity.A0J);
            C2IT c2it = linkedDevicesActivity.A04;
            c2it.A03 = list;
            c2it.A0G();
            ((AbstractC04890Mh) c2it).A01.A00();
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = linkedDevicesActivity.A05;
            if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A09 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C42881wU c42881wU = (C42881wU) it.next();
                    String str = c42881wU.A0F;
                    LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = linkedDevicesActivity.A05;
                    if (str.equals(linkedDevicesDetailDialogFragment2.A09.A0F)) {
                        linkedDevicesDetailDialogFragment2.A09 = c42881wU;
                        linkedDevicesDetailDialogFragment2.A04 = null;
                        linkedDevicesDetailDialogFragment2.A07 = null;
                        if (linkedDevicesDetailDialogFragment2.A01 != null) {
                            linkedDevicesDetailDialogFragment2.A18();
                        }
                    }
                }
            }
            if (list.isEmpty()) {
                C0EE c0ee = linkedDevicesActivity.A0D;
                if (c0ee.A04() && c0ee.A02.A07(C01C.A3K) == 2 && !c0ee.A03.A00.getBoolean("md_automatic_opt_in_used", false)) {
                    if (!((ActivityC02290Ap) linkedDevicesActivity).A0F.A0k()) {
                        C000200d.A0j(((ActivityC02290Ap) linkedDevicesActivity).A0F, "companion_reg_opt_in_enabled", true);
                        ((AbstractC04890Mh) linkedDevicesActivity.A04).A01.A00();
                        linkedDevicesActivity.A06.A02();
                        ((C20R) linkedDevicesActivity).A07.AS1(new RunnableEBaseShape1S0100000_I0_1(linkedDevicesActivity.A07, 14));
                    }
                    C000200d.A0j(((ActivityC02290Ap) linkedDevicesActivity).A0F, "md_automatic_opt_in_used", true);
                    return;
                }
                return;
            }
            return;
        }
        PairedDevicesActivity pairedDevicesActivity = (PairedDevicesActivity) this;
        C2J5 c2j5 = pairedDevicesActivity.A02;
        Collections.sort(list, ((C20R) c2j5.A02).A0E);
        c2j5.A01 = list;
        c2j5.notifyDataSetChanged();
        int i = pairedDevicesActivity.A02.getCount() > 0 ? 0 : 8;
        pairedDevicesActivity.A01.setVisibility(i);
        pairedDevicesActivity.A00.setVisibility(i);
    }

    @Override // X.C20S, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C41991uq c41991uq = this.A09;
        InterfaceC43021wi interfaceC43021wi = this.A0D;
        if (!c41991uq.A0R.contains(interfaceC43021wi)) {
            c41991uq.A0R.add(interfaceC43021wi);
        }
        this.A03.A00(this.A0C);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C41991uq c41991uq = this.A09;
        c41991uq.A0R.remove(this.A0D);
        this.A03.A01(this.A0C);
    }
}
