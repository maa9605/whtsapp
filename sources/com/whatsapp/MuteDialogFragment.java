package com.whatsapp;

import X.AbstractC005302j;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.C000500h;
import X.C002301c;
import X.C003101m;
import X.C018508q;
import X.C018608r;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C01C;
import X.C03320Ff;
import X.C03340Fh;
import X.C03B;
import X.C05W;
import X.C0BA;
import X.C0CB;
import X.C2EU;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.search.verification.client.R;
import com.whatsapp.MuteDialogFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MuteDialogFragment extends Hilt_MuteDialogFragment {
    public C018508q A00;
    public C01B A01;
    public C018608r A02;
    public C03320Ff A03;
    public C05W A04;
    public AnonymousClass012 A05;
    public C000500h A06;
    public C002301c A07;
    public C03340Fh A08;
    public C0CB A09;
    public InterfaceC002901k A0A;

    public static MuteDialogFragment A00(AbstractC005302j abstractC005302j) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", abstractC005302j.getRawString());
        muteDialogFragment.A0P(bundle);
        return muteDialogFragment;
    }

    public static MuteDialogFragment A01(Collection collection) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("jids", C003101m.A0E(collection));
        bundle.putBoolean("mute_in_conversation_fragment", true);
        muteDialogFragment.A0P(bundle);
        return muteDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final AbstractC005302j A02 = AbstractC005302j.A02(A02().getString("jid"));
        ArrayList<String> stringArrayList = A02().getStringArrayList("jids");
        final List A0F = stringArrayList == null ? null : C003101m.A0F(AbstractC005302j.class, stringArrayList);
        final boolean z = A02().getBoolean("mute_in_conversation_fragment");
        final int[] iArr = {this.A06.A00.getInt("last_mute_selection", 0)};
        C01B c01b = this.A01;
        C03B c03b = C01C.A1f;
        int[] iArr2 = c01b.A0E(c03b) ? C2EU.A00 : C2EU.A02;
        int[] iArr3 = this.A01.A0E(c03b) ? C2EU.A01 : C2EU.A03;
        int length = iArr2.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = AnonymousClass029.A0c(this.A07, iArr2[i], iArr3[i]);
        }
        if (iArr[0] >= length) {
            iArr[0] = 0;
        }
        View inflate = A0A().getLayoutInflater().inflate(R.layout.mute_notifications, (ViewGroup) null, false);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.mute_show_notifications);
        if (A02 != null && this.A09.A07(A02).A09()) {
            checkBox.setChecked(this.A09.A07(A02).A0F);
        } else {
            checkBox.setChecked(this.A06.A00.getBoolean("last_mute_show_notifications", false));
        }
        C019208x c019208x = new C019208x(A09());
        c019208x.A03(R.string.mute_dialog_title);
        int i2 = iArr[0];
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.1Hq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                iArr[0] = i3;
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0M = strArr;
        c019308y.A05 = onClickListener;
        c019308y.A00 = i2;
        c019308y.A0L = true;
        final List list = A0F;
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1Hs
            {
                MuteDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                MuteDialogFragment.this.A18(checkBox, iArr, z, list, A02);
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.1Hu
            {
                MuteDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                Bundle bundle2;
                AbstractC005302j A022;
                MuteDialogFragment muteDialogFragment = MuteDialogFragment.this;
                if (A0F == null && (bundle2 = ((C0BA) muteDialogFragment).A06) != null && (A022 = AbstractC005302j.A02(bundle2.getString("jid"))) != null) {
                    muteDialogFragment.A08.A05(A022);
                }
            }
        });
        c019308y.A0C = inflate;
        c019308y.A01 = 0;
        return c019208x.A00();
    }

    public void A18(CheckBox checkBox, int[] iArr, final boolean z, final List list, final AbstractC005302j abstractC005302j) {
        final boolean isChecked = checkBox.isChecked();
        int i = (this.A01.A0E(C01C.A1f) ? C2EU.A05 : C2EU.A04)[iArr[0]];
        final long A01 = i == -1 ? -1L : (i * 60000) + this.A05.A01();
        this.A06.A0D().putInt("last_mute_selection", iArr[0]).putBoolean("last_mute_show_notifications", isChecked).apply();
        this.A0A.AS1(new Runnable() { // from class: X.1Hv
            {
                MuteDialogFragment.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final MuteDialogFragment muteDialogFragment = MuteDialogFragment.this;
                boolean z2 = z;
                List<AbstractC005302j> list2 = list;
                long j = A01;
                boolean z3 = isChecked;
                final AbstractC005302j abstractC005302j2 = abstractC005302j;
                if (!z2) {
                    if (abstractC005302j2 != null && !C003101m.A0P(abstractC005302j2) && !C003101m.A0a(abstractC005302j2)) {
                        muteDialogFragment.A02.A0K(abstractC005302j2, j, z3, true);
                    }
                    C018508q c018508q = muteDialogFragment.A00;
                    c018508q.A02.post(new Runnable() { // from class: X.1Ht
                        @Override // java.lang.Runnable
                        public final void run() {
                            MuteDialogFragment muteDialogFragment2 = muteDialogFragment;
                            AbstractC005302j abstractC005302j3 = abstractC005302j2;
                            if (C003101m.A0U(abstractC005302j3) && muteDialogFragment2.A04.A0A(abstractC005302j3).A0Q) {
                                C03320Ff c03320Ff = muteDialogFragment2.A03;
                                C000700j.A01();
                                Iterator it = c03320Ff.A00.iterator();
                                while (true) {
                                    C0G5 c0g5 = (C0G5) it;
                                    if (c0g5.hasNext()) {
                                        ((C0GC) c0g5.next()).A00(abstractC005302j3);
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    });
                } else if (list2 != null) {
                    for (AbstractC005302j abstractC005302j3 : list2) {
                        if (abstractC005302j3 != null && !C003101m.A0P(abstractC005302j3) && !C003101m.A0a(abstractC005302j3)) {
                            muteDialogFragment.A02.A0K(abstractC005302j3, j, z3, true);
                        }
                    }
                    C018508q c018508q2 = muteDialogFragment.A00;
                    c018508q2.A02.post(new Runnable() { // from class: X.1Hr
                        @Override // java.lang.Runnable
                        public final void run() {
                            muteDialogFragment.A08.A03(1);
                        }
                    });
                }
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Bundle bundle;
        AbstractC005302j A02;
        if (A02().getString("jids") == null && (bundle = ((C0BA) this).A06) != null && (A02 = AbstractC005302j.A02(bundle.getString("jid"))) != null) {
            this.A08.A05(A02);
        }
    }
}
