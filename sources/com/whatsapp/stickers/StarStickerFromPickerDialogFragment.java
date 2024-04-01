package com.whatsapp.stickers;

import X.ActivityC02330At;
import X.C019208x;
import X.C0F2;
import X.C0JM;
import X.C2AS;
import X.C2IV;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import java.io.File;
import java.util.Collections;

/* loaded from: classes2.dex */
public class StarStickerFromPickerDialogFragment extends Hilt_StarStickerFromPickerDialogFragment {
    public C0F2 A00;
    public C2IV A01;
    public C0JM A02;
    public C2AS A03;
    public InterfaceC002901k A04;

    public static StarStickerFromPickerDialogFragment A00(C0JM c0jm) {
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("sticker", c0jm);
        starStickerFromPickerDialogFragment.A0P(bundle);
        return starStickerFromPickerDialogFragment;
    }

    @Override // com.whatsapp.stickers.Hilt_StarStickerFromPickerDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        try {
            this.A01 = (C2IV) context;
        } catch (ClassCastException unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        C0JM c0jm = (C0JM) A02().getParcelable("sticker");
        if (c0jm != null) {
            this.A02 = c0jm;
            C019208x c019208x = new C019208x(A0A);
            c019208x.A02(R.string.sticker_save_to_picker_title);
            final String A0F = A0F(R.string.sticker_save_to_picker);
            c019208x.A08(A0F, new DialogInterface.OnClickListener() { // from class: X.3Xn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = StarStickerFromPickerDialogFragment.this;
                    C0JM c0jm2 = starStickerFromPickerDialogFragment.A02;
                    if (c0jm2.A0D == null) {
                        C2AS c2as = starStickerFromPickerDialogFragment.A03;
                        c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, Collections.singleton(c0jm2), 26));
                        return;
                    }
                    starStickerFromPickerDialogFragment.A04.ARy(new C0HS(starStickerFromPickerDialogFragment.A03, starStickerFromPickerDialogFragment.A00, starStickerFromPickerDialogFragment.A01) { // from class: X.3qi
                        public final C0F2 A00;
                        public final C2IV A01;
                        public final C2AS A02;

                        {
                            this.A02 = r1;
                            this.A00 = r2;
                            this.A01 = r3;
                        }

                        @Override // X.C0HS
                        public void A03(Object[] objArr) {
                            C0JM[] c0jmArr = (C0JM[]) objArr;
                            C000700j.A06(c0jmArr.length == 1);
                            C0JM c0jm3 = c0jmArr[0];
                            if (c0jm3 != null) {
                                C2IV c2iv = this.A01;
                                if (c2iv != null) {
                                    c2iv.AOo(c0jm3);
                                    return;
                                }
                                return;
                            }
                            throw null;
                        }

                        @Override // X.C0HS
                        public Object A07(Object[] objArr) {
                            C0JM[] c0jmArr = (C0JM[]) objArr;
                            if (c0jmArr != null) {
                                boolean z = false;
                                C000700j.A06(c0jmArr.length == 1);
                                C0JM c0jm3 = c0jmArr[0];
                                if (c0jm3 != null) {
                                    if (c0jm3.A0D != null) {
                                        if (c0jm3.A0B != null) {
                                            super.A02.A00(c0jm3);
                                            C0F2 c0f2 = this.A00;
                                            File A05 = c0f2.A05(c0jm3.A0B);
                                            if (!c0jm3.A02() && !A05.exists()) {
                                                if (this.A02.A06(c0jm3, c0f2.A05(c0jm3.A0B)) == null) {
                                                    return new Pair(c0jm3, Boolean.FALSE);
                                                }
                                            } else {
                                                z = true;
                                            }
                                            this.A02.A0K(Collections.singleton(c0jm3), z);
                                            return new Pair(c0jm3, Boolean.TRUE);
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            Pair pair = (Pair) obj;
                            C2IV c2iv = this.A01;
                            if (c2iv != null) {
                                C0JM c0jm3 = (C0JM) pair.first;
                                if (((Boolean) pair.second).booleanValue()) {
                                    c2iv.AP8(c0jm3);
                                } else {
                                    c2iv.AP3(c0jm3);
                                }
                            }
                        }
                    }, c0jm2);
                }
            });
            c019208x.A04(R.string.cancel, null);
            final DialogInterfaceC019408z A00 = c019208x.A00();
            A00.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.3Xm
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    DialogInterfaceC019408z dialogInterfaceC019408z = DialogInterfaceC019408z.this;
                    dialogInterfaceC019408z.A02(-1).setContentDescription(A0F);
                }
            });
            return A00;
        }
        throw null;
    }
}
