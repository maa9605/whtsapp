package com.whatsapp.stickers;

import X.ActivityC02330At;
import X.C019208x;
import X.C2AS;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.Hilt_ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.stickers.StickerStoreTabFragment;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ConfirmPackDeleteDialogFragment extends Hilt_ConfirmPackDeleteDialogFragment {
    public C2AS A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A09 = A09();
        final String string = A02().getString("pack_id");
        if (string != null) {
            String string2 = A02().getString("pack_name");
            if (string2 != null) {
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3Xj
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C2IW c2iw;
                        ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = ConfirmPackDeleteDialogFragment.this;
                        String str = string;
                        if (i == -1) {
                            try {
                                c2iw = (C2IW) ((Hilt_ConfirmPackDeleteDialogFragment) confirmPackDeleteDialogFragment).A00;
                                if (c2iw != null) {
                                    c2iw.AQ4();
                                }
                            } catch (ClassCastException unused) {
                                c2iw = null;
                            }
                            WeakReference weakReference = new WeakReference(c2iw);
                            C2AS c2as = confirmPackDeleteDialogFragment.A00;
                            c2as.A0S.ARy(new C0HS(c2as.A0I, c2as, new C82453qX(weakReference)) { // from class: X.3qu
                                public final C82453qX A00;
                                public final C2Bk A01;
                                public final C2AS A02;

                                {
                                    this.A02 = c2as;
                                    this.A01 = r1;
                                    this.A00 = r3;
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
                                    if (X.AnonymousClass024.A0f(r0) != false) goto L27;
                                 */
                                @Override // X.C0HS
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public java.lang.Object A07(java.lang.Object[] r10) {
                                    /*
                                        r9 = this;
                                        java.lang.String[] r10 = (java.lang.String[]) r10
                                        r8 = 0
                                        r6 = r10[r8]
                                        if (r6 == 0) goto L82
                                        X.2AS r7 = r9.A02
                                        r5 = 0
                                        if (r7 == 0) goto L81
                                        java.lang.String r0 = " "
                                        boolean r0 = r6.contains(r0)
                                        if (r0 == 0) goto L29
                                        android.util.Pair r0 = X.C47582Bu.A00(r6)
                                        if (r0 == 0) goto L7f
                                        java.lang.Object r1 = r0.first
                                        java.lang.String r1 = (java.lang.String) r1
                                        java.lang.Object r0 = r0.second
                                        java.lang.String r0 = (java.lang.String) r0
                                        boolean r0 = r7.A0M(r1, r0)
                                        if (r0 == 0) goto L7f
                                        return r6
                                    L29:
                                        X.05s r0 = r7.A07
                                        r0.A0B(r5)
                                        X.1vt r3 = r7.A03(r6, r8, r5)
                                        if (r3 == 0) goto L37
                                        r7.A0H(r3)
                                    L37:
                                        java.lang.String r0 = "StickerRepository/uninstallStickerPackSync/sticker pack id: "
                                        X.C000200d.A14(r0, r6)
                                        X.1sF r2 = r7.A0P
                                        if (r2 == 0) goto L80
                                        X.C000700j.A00()
                                        X.1vu r0 = r2.A03()
                                        java.lang.String r4 = r3.A0D
                                        java.util.List r1 = r0.A00(r4)
                                        X.2AW r0 = r7.A0D
                                        X.C2AS.A01(r0, r3)
                                        r0 = r1
                                        java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
                                        r0.size()
                                        r7.A0L(r1)
                                        boolean r3 = r2.A0B(r3, r8)
                                        java.io.File r0 = r7.A08(r4)
                                        if (r0 == 0) goto L6c
                                        boolean r0 = X.AnonymousClass024.A0f(r0)
                                        r2 = 0
                                        if (r0 == 0) goto L6d
                                    L6c:
                                        r2 = 1
                                    L6d:
                                        X.1u3 r1 = r7.A0F
                                        java.util.List r0 = r7.A0D()
                                        java.lang.String r0 = r7.A0A(r0)
                                        r1.A0G(r0, r4)
                                        if (r3 == 0) goto L7f
                                        if (r2 == 0) goto L7f
                                        return r6
                                    L7f:
                                        return r5
                                    L80:
                                        throw r5
                                    L81:
                                        throw r5
                                    L82:
                                        r0 = 0
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C82683qu.A07(java.lang.Object[]):java.lang.Object");
                                }

                                @Override // X.C0HS
                                public void A09(Object obj) {
                                    String str2 = (String) obj;
                                    C82453qX c82453qX = this.A00;
                                    if (c82453qX != null) {
                                        boolean z = str2 != null;
                                        C2IW c2iw2 = (C2IW) c82453qX.A00.get();
                                        if (c2iw2 != null) {
                                            c2iw2.AQ3(z);
                                        }
                                    }
                                    if (str2 == null) {
                                        return;
                                    }
                                    C2Bk c2Bk = this.A01;
                                    if (c2Bk != null) {
                                        C000700j.A01();
                                        Iterator it = ((AnonymousClass009) c2Bk).A00.iterator();
                                        while (true) {
                                            C0G5 c0g5 = (C0G5) it;
                                            if (!c0g5.hasNext()) {
                                                return;
                                            }
                                            C25R c25r = (C25R) c0g5.next();
                                            if (c25r instanceof C25S) {
                                                C461225a c461225a = ((C25S) c25r).A00;
                                                if (c461225a.A04 != null) {
                                                    boolean z2 = false;
                                                    for (int i2 = 0; i2 < c461225a.A04.size(); i2++) {
                                                        if (((C42531vt) c461225a.A04.get(i2)).A0D.equals(str2)) {
                                                            c461225a.A04.remove(i2);
                                                            z2 = true;
                                                        }
                                                    }
                                                    if (z2) {
                                                        c461225a.A04(c461225a.A04, null);
                                                    }
                                                }
                                                if (c461225a.A00 != null) {
                                                    c461225a.A02();
                                                }
                                            } else if (c25r instanceof C25T) {
                                                StickerStoreTabFragment stickerStoreTabFragment = ((C25T) c25r).A00;
                                                if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                                                    if ((stickerStoreTabFragment instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment.A0B != null) {
                                                        int i3 = 0;
                                                        while (true) {
                                                            if (i3 < stickerStoreTabFragment.A0B.size()) {
                                                                C42531vt c42531vt = (C42531vt) stickerStoreTabFragment.A0B.get(i3);
                                                                if (c42531vt.A0D.equals(str2)) {
                                                                    c42531vt.A05 = false;
                                                                    c42531vt.A01 = 0L;
                                                                    c42531vt.A02 = null;
                                                                    C2C7 c2c7 = stickerStoreTabFragment.A0A;
                                                                    if (c2c7 != null) {
                                                                        c2c7.A02(i3);
                                                                    }
                                                                } else {
                                                                    i3++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) stickerStoreTabFragment;
                                                    C2C7 c2c72 = ((StickerStoreTabFragment) stickerStoreMyTabFragment).A0A;
                                                    if (c2c72 != null) {
                                                        int i4 = 0;
                                                        while (true) {
                                                            if (i4 >= c2c72.A00.size()) {
                                                                break;
                                                            }
                                                            C42531vt c42531vt2 = (C42531vt) c2c72.A00.get(i4);
                                                            if (c42531vt2.A0D.equals(str2)) {
                                                                c2c72.A00.remove(c42531vt2);
                                                                if (c2c72.A00.size() == 0) {
                                                                    ((AbstractC04890Mh) c2c72).A01.A00();
                                                                } else {
                                                                    c2c72.A04(i4);
                                                                }
                                                                c2c72.A01.A0y();
                                                            } else {
                                                                i4++;
                                                            }
                                                        }
                                                        stickerStoreMyTabFragment.A04 = true;
                                                    }
                                                }
                                            } else if (!(c25r instanceof C2IN)) {
                                                if (c25r instanceof C2IO) {
                                                    C2IP c2ip = ((C2IO) c25r).A00;
                                                    c2ip.A0i.remove(str2);
                                                    Map map = c2ip.A0j;
                                                    Collection<C2K1> collection = (Collection) map.get(str2);
                                                    if (collection != null) {
                                                        C2OK c2ok = c2ip.A0W;
                                                        synchronized (c2ok) {
                                                            for (C2K1 c2k1 : collection) {
                                                                for (C2CI c2ci : c2k1.A9v()) {
                                                                    Collection collection2 = (Collection) c2ok.A05.get(c2ci);
                                                                    if (collection2 != null) {
                                                                        collection2.remove(c2k1);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    map.remove(str2);
                                                    c2ip.A0Z.A0L(str2);
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = ((C2IN) c25r).A00;
                                                C42531vt c42531vt3 = stickerStorePackPreviewActivity.A0J.A02;
                                                if (c42531vt3 != null && c42531vt3.A0D.equals(str2)) {
                                                    stickerStorePackPreviewActivity.A1P();
                                                }
                                            }
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                            }, str);
                            confirmPackDeleteDialogFragment.A10();
                        }
                    }
                };
                C019208x c019208x = new C019208x(A09);
                c019208x.A01.A0E = A0G(R.string.sticker_pack_removal_confirmation, string2);
                c019208x.A06(R.string.delete, onClickListener);
                c019208x.A04(R.string.cancel, null);
                DialogInterfaceC019408z A00 = c019208x.A00();
                A00.setCanceledOnTouchOutside(true);
                return A00;
            }
            throw null;
        }
        throw null;
    }
}
