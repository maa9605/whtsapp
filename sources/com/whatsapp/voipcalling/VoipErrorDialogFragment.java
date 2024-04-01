package com.whatsapp.voipcalling;

import X.AbstractC005302j;
import X.AnonymousClass029;
import X.C000200d;
import X.C000700j;
import X.C002301c;
import X.C018708s;
import X.C01B;
import X.C01C;
import X.C05W;
import X.C0BA;
import X.C84943ub;
import X.InterfaceC74713di;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class VoipErrorDialogFragment extends Hilt_VoipErrorDialogFragment {
    public int A00;
    public int A01;
    public C01B A02;
    public C05W A03;
    public C018708s A04;
    public C002301c A05;
    public InterfaceC74713di A06;
    public ArrayList A07 = new ArrayList();

    public static InterfaceC74713di A00() {
        return new C84943ub();
    }

    public static VoipErrorDialogFragment A01(int i, InterfaceC74713di interfaceC74713di) {
        Bundle A01 = C000200d.A01("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0P(A01);
        voipErrorDialogFragment.A06 = interfaceC74713di;
        return voipErrorDialogFragment;
    }

    public static VoipErrorDialogFragment A02(int i, InterfaceC74713di interfaceC74713di, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0P(bundle2);
        voipErrorDialogFragment.A06 = interfaceC74713di;
        return voipErrorDialogFragment;
    }

    public static VoipErrorDialogFragment A03(List list, int i, boolean z) {
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("error", z ? 2 : 1);
        bundle.putParcelableArrayList("user_jids", new ArrayList<>(list));
        bundle.putInt("call_size", i);
        voipErrorDialogFragment.A0P(bundle);
        voipErrorDialogFragment.A06 = new C84943ub();
        return voipErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        Bundle bundle2 = ((C0BA) this).A06;
        if (bundle2 != null) {
            this.A01 = bundle2.getInt("error");
            this.A07 = bundle2.getParcelableArrayList("user_jids");
            this.A00 = bundle2.getInt("call_size");
        }
        if (this.A07 == null) {
            this.A07 = new ArrayList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L22;
     */
    @Override // androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0z(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.A19()
            java.lang.String r1 = r6.A18()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            r4 = 0
            if (r0 != 0) goto L17
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r0 = 1
            if (r1 == 0) goto L18
        L17:
            r0 = 0
        L18:
            X.C000700j.A06(r0)
            X.0At r0 = r6.A0A()
            X.08x r5 = new X.08x
            r5.<init>(r0)
            java.lang.String r0 = r6.A19()
            X.08y r3 = r5.A01
            r3.A0I = r0
            java.lang.String r0 = r6.A18()
            r3.A0E = r0
            r3.A0J = r2
            int r0 = r6.A01
            java.lang.String r2 = "Unknown error"
            switch(r0) {
                case 1: goto L3e;
                case 2: goto L3e;
                case 3: goto L3e;
                case 4: goto L3e;
                case 5: goto L7c;
                case 6: goto L3e;
                case 7: goto L3e;
                case 8: goto L3e;
                case 9: goto L3e;
                default: goto L3b;
            }
        L3b:
            X.C000700j.A08(r4, r2)
        L3e:
            int r0 = r6.A01
            switch(r0) {
                case 1: goto L70;
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L70;
                case 5: goto L64;
                case 6: goto L70;
                case 7: goto L70;
                case 8: goto L70;
                case 9: goto L70;
                default: goto L43;
            }
        L43:
            X.C000700j.A08(r4, r2)
        L46:
            android.os.Bundle r1 = r6.A06
            if (r1 == 0) goto L5a
            java.lang.String r0 = "finish"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L5a
            r4 = 1
            X.3cp r0 = new X.3cp
            r0.<init>()
            r3.A08 = r0
        L5a:
            X.08z r1 = r5.A00()
            r0 = r4 ^ 1
            r1.setCanceledOnTouchOutside(r0)
            return r1
        L64:
            r1 = 2131886560(0x7f1201e0, float:1.9407702E38)
            X.3cq r0 = new X.3cq
            r0.<init>()
            r5.A04(r1, r0)
            goto L46
        L70:
            r1 = 2131888523(0x7f12098b, float:1.9411684E38)
            X.3co r0 = new X.3co
            r0.<init>()
            r5.A04(r1, r0)
            goto L46
        L7c:
            r1 = 2131890626(0x7f1211c2, float:1.941595E38)
            X.3cn r0 = new X.3cn
            r0.<init>()
            r5.A06(r1, r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A0z(android.os.Bundle):android.app.Dialog");
    }

    public final String A18() {
        switch (this.A01) {
            case 1:
                C002301c c002301c = this.A05;
                int i = this.A00;
                return c002301c.A0A(R.plurals.voip_error_group_call_size_not_supported, i, Integer.valueOf(i));
            case 2:
                ArrayList arrayList = this.A07;
                if (arrayList.size() == 1) {
                    return this.A05.A0A(R.plurals.voip_error_one_participant_group_call_size_not_supported, this.A00, A1A(arrayList), Integer.valueOf(this.A00));
                }
                C002301c c002301c2 = this.A05;
                int i2 = this.A00;
                return c002301c2.A0A(R.plurals.voip_error_multiple_participant_group_call_size_not_supported, i2, Integer.valueOf(i2));
            case 3:
                return A0F(R.string.voip_joinable_no_internet_connection_body);
            case 4:
                return A0G(R.string.voip_joinable_max_participants_invited_body, Integer.valueOf(this.A02.A07(C01C.A34)));
            case 5:
                return A0F(R.string.voip_joinable_call_full_add_participant_body);
            case 6:
                return A0F(R.string.voip_joinable_call_full_rering_body);
            case 7:
                return A0F(R.string.voip_joinable_call_full_join_body);
            case 8:
                return A0F(R.string.voip_joinable_call_ended_while_joining_body);
            case 9:
                return A0F(R.string.voip_joinable_call_full_info_body);
            default:
                C000700j.A08(false, "Unknown error");
                return "";
        }
    }

    public final String A19() {
        switch (this.A01) {
            case 1:
                ArrayList arrayList = this.A07;
                if (arrayList.size() <= 3) {
                    return this.A05.A0A(R.plurals.voip_error_add_participant_failed_dialog_title, arrayList.size(), A1A(arrayList));
                }
                return this.A05.A0A(R.plurals.voip_error_add_four_or_more_participant_failed_dialog_title, arrayList.size() - 1, A1A(arrayList.subList(0, 1)), Integer.valueOf(this.A07.size() - 1));
            case 2:
                return A0F(R.string.voip_error_select_fewer_participants);
            case 3:
                return A0F(R.string.voip_joinable_no_internet_connection_title);
            case 4:
                return A0F(R.string.voip_joinable_max_participants_invited_title);
            case 5:
            case 6:
            case 7:
            case 9:
                return A0F(R.string.voip_joinable_call_full_title);
            case 8:
                return A0F(R.string.voip_joinable_call_ended_while_joining_title);
            default:
                C000700j.A08(false, "Unknown error");
                return "";
        }
    }

    public final String A1A(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A04.A04(this.A03.A0A((AbstractC005302j) it.next())));
        }
        if (arrayList.size() > 3) {
            int size = arrayList.size() - 1;
            return this.A05.A0A(R.plurals.group_voip_call_participants_label, size, arrayList.get(0), Integer.valueOf(size));
        }
        return AnonymousClass029.A0o(this.A04.A04, true, arrayList);
    }
}
