package com.whatsapp.stickers;

import X.ActivityC02330At;
import X.C000700j;
import X.C003301p;
import X.C018308n;
import X.C019208x;
import X.C019308y;
import X.C0HS;
import X.C0JM;
import X.C2AS;
import X.C2ER;
import X.C3Y3;
import X.C43791xz;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import X.InterfaceC04700Lm;
import X.InterfaceC44171yd;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.stickers.Hilt_StickerInfoDialogFragment;
import com.whatsapp.stickers.StickerInfoDialogFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* loaded from: classes2.dex */
public class StickerInfoDialogFragment extends Hilt_StickerInfoDialogFragment {
    public int A00;
    public View A01;
    public View A02;
    public Button A03;
    public Button A04;
    public Button A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C018308n A09;
    public C0JM A0A;
    public C43791xz A0B;
    public C3Y3 A0C;
    public C2AS A0D;
    public StickerView A0E;
    public C2ER A0F;
    public InterfaceC002901k A0G;
    public final DialogInterface.OnClickListener A0H = new DialogInterface.OnClickListener() { // from class: X.3Xp
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C0JM c0jm;
            String str;
            StickerInfoDialogFragment stickerInfoDialogFragment = StickerInfoDialogFragment.this;
            C3Y3 c3y3 = stickerInfoDialogFragment.A0C;
            if (c3y3 != null && (c0jm = stickerInfoDialogFragment.A0A) != null) {
                if (c3y3.A06 && (str = c3y3.A00) != null) {
                    if (stickerInfoDialogFragment.A09() instanceof Conversation) {
                        stickerInfoDialogFragment.A0F.A02(str);
                        return;
                    }
                    Intent intent = new Intent(((Hilt_StickerInfoDialogFragment) stickerInfoDialogFragment).A00, StickerStorePackPreviewActivity.class);
                    intent.putExtra("sticker_pack_id", str);
                    stickerInfoDialogFragment.A0i(intent);
                    return;
                }
                String str2 = c3y3.A03;
                if (str2 != null) {
                    try {
                        stickerInfoDialogFragment.A09.A06(((Hilt_StickerInfoDialogFragment) stickerInfoDialogFragment).A00, new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                    } catch (ActivityNotFoundException unused) {
                        Log.e("StickerInfoDialogFragment/onClickListener failed to open playstore link");
                    }
                } else if (c3y3.A04) {
                    String str3 = c3y3.A00;
                    Intent intent2 = new Intent(((Hilt_StickerInfoDialogFragment) stickerInfoDialogFragment).A00, StickerStorePackPreviewActivity.class);
                    intent2.putExtra("sticker_pack_id", str3);
                    stickerInfoDialogFragment.A0i(intent2);
                } else {
                    stickerInfoDialogFragment.A18(c3y3, c0jm);
                }
            }
        }
    };
    public final DialogInterface.OnClickListener A0I = new DialogInterface.OnClickListener() { // from class: X.3Xq
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C0JM c0jm;
            StickerInfoDialogFragment stickerInfoDialogFragment = StickerInfoDialogFragment.this;
            C3Y3 c3y3 = stickerInfoDialogFragment.A0C;
            if (c3y3 != null && (c0jm = stickerInfoDialogFragment.A0A) != null) {
                stickerInfoDialogFragment.A18(c3y3, c0jm);
            }
        }
    };

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A0B = null;
    }

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        super.A0g();
        DialogInterfaceC019408z dialogInterfaceC019408z = (DialogInterfaceC019408z) ((DialogFragment) this).A03;
        Button A02 = dialogInterfaceC019408z.A02(-1);
        this.A03 = A02;
        this.A04 = dialogInterfaceC019408z.A02(-2);
        this.A05 = dialogInterfaceC019408z.A02(-3);
        if (this.A0B == null || this.A0A == null || this.A0E == null || this.A0C != null) {
            return;
        }
        A02.setVisibility(8);
        this.A04.setVisibility(8);
        this.A05.setVisibility(8);
        C43791xz c43791xz = this.A0B;
        C0JM c0jm = this.A0A;
        StickerView stickerView = this.A0E;
        int i = this.A00;
        c43791xz.A06(c0jm, 1, stickerView, i, i, true, false, new InterfaceC44171yd() { // from class: X.3qY
            @Override // X.InterfaceC44171yd
            public final void AP5(boolean z) {
                StickerInfoDialogFragment.this.A0E.A00();
            }
        });
        final C2AS c2as = this.A0D;
        final C0JM c0jm2 = this.A0A;
        this.A0G.ARy(new C0HS(c2as, c0jm2, this) { // from class: X.3qk
            public final C0JM A00;
            public final C2AS A01;
            public final WeakReference A02;

            {
                this.A01 = c2as;
                this.A00 = c0jm2;
                this.A02 = new WeakReference(this);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
                if (r3.A0N != false) goto L21;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A07(java.lang.Object[] r8) {
                /*
                    r7 = this;
                    X.0JM r5 = r7.A00
                    java.lang.String r0 = r5.A08
                    r6 = 0
                    if (r0 == 0) goto L71
                    X.3Y3 r4 = new X.3Y3
                    r4.<init>(r6)
                    byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)
                    X.0If r3 = X.C04050If.A00(r0)
                    if (r3 == 0) goto L64
                    java.lang.String r0 = r3.A04
                    r4.A02 = r0
                    java.lang.String r0 = r3.A02
                    r4.A01 = r0
                    java.lang.String r2 = r3.A01
                    r4.A00 = r2
                    java.lang.String r0 = r3.A03
                    r4.A03 = r0
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L36
                    java.lang.String r1 = r4.A03
                    java.lang.String r0 = "play.google.com"
                    boolean r0 = X.C40731sm.A0q(r1, r0)
                    if (r0 != 0) goto L38
                L36:
                    r4.A03 = r6
                L38:
                    java.lang.String r0 = r4.A00
                    if (r0 == 0) goto L64
                    X.2AS r1 = r7.A01
                    boolean r0 = r3.A05
                    X.1vt r3 = r1.A03(r2, r0, r6)
                    if (r3 == 0) goto L64
                    java.lang.String r1 = r3.A02
                    r0 = 0
                    if (r1 == 0) goto L4c
                    r0 = 1
                L4c:
                    r2 = 1
                    if (r0 != 0) goto L54
                    boolean r1 = r3.A0N
                    r0 = 0
                    if (r1 == 0) goto L55
                L54:
                    r0 = 1
                L55:
                    r4.A06 = r0
                    java.lang.String r0 = r3.A0F
                    r4.A01 = r0
                    java.lang.String r0 = r3.A0H
                    r4.A02 = r0
                    boolean r0 = r3.A0N
                    r0 = r0 ^ r2
                    r4.A04 = r0
                L64:
                    X.2AS r0 = r7.A01
                    X.2AP r1 = r0.A0O
                    java.lang.String r0 = r5.A0B
                    boolean r0 = r1.A02(r0)
                    r4.A05 = r0
                    return r4
                L71:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C82583qk.A07(java.lang.Object[]):java.lang.Object");
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
                if (android.text.TextUtils.isEmpty(r7.A01) != false) goto L11;
             */
            @Override // X.C0HS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A09(java.lang.Object r7) {
                /*
                    r6 = this;
                    X.3Y3 r7 = (X.C3Y3) r7
                    java.lang.ref.WeakReference r0 = r6.A02
                    java.lang.Object r4 = r0.get()
                    com.whatsapp.stickers.StickerInfoDialogFragment r4 = (com.whatsapp.stickers.StickerInfoDialogFragment) r4
                    if (r4 == 0) goto L70
                    if (r7 == 0) goto L70
                    boolean r0 = r4.A0W
                    if (r0 != 0) goto L70
                    r4.A0C = r7
                    android.widget.Button r0 = r4.A03
                    r3 = 0
                    r0.setVisibility(r3)
                    android.widget.Button r0 = r4.A04
                    r0.setVisibility(r3)
                    android.view.View r0 = r4.A01
                    r2 = 8
                    r0.setVisibility(r2)
                    com.whatsapp.stickers.StickerView r0 = r4.A0E
                    r0.setVisibility(r3)
                    java.lang.String r0 = r7.A02
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L92
                    java.lang.String r0 = r7.A01
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L92
                    android.view.View r0 = r4.A02
                    r0.setVisibility(r2)
                L40:
                    r5 = 0
                L41:
                    boolean r0 = r7.A06
                    if (r0 != 0) goto L79
                    java.lang.String r0 = r7.A03
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L79
                    boolean r0 = r7.A04
                    if (r0 != 0) goto L79
                    android.widget.Button r0 = r4.A05
                    r0.setVisibility(r2)
                    android.widget.Button r1 = r4.A03
                L58:
                    boolean r0 = r7.A05
                    if (r0 == 0) goto L71
                    r0 = 2131889971(0x7f120f33, float:1.941462E38)
                    java.lang.String r0 = r4.A0F(r0)
                L63:
                    r1.setText(r0)
                    r1.setContentDescription(r0)
                    android.widget.TextView r0 = r4.A06
                    if (r5 == 0) goto Lb7
                    r0.setVisibility(r3)
                L70:
                    return
                L71:
                    r0 = 2131889975(0x7f120f37, float:1.9414629E38)
                    java.lang.String r0 = r4.A0F(r0)
                    goto L63
                L79:
                    r0 = 2131889935(0x7f120f0f, float:1.9414548E38)
                    java.lang.String r1 = r4.A0F(r0)
                    android.widget.Button r0 = r4.A03
                    r0.setText(r1)
                    android.widget.Button r0 = r4.A03
                    r0.setContentDescription(r1)
                    android.widget.Button r0 = r4.A05
                    r0.setVisibility(r3)
                    android.widget.Button r1 = r4.A05
                    goto L58
                L92:
                    android.view.View r0 = r4.A02
                    r0.setVisibility(r3)
                    android.widget.TextView r1 = r4.A08
                    java.lang.String r0 = r7.A02
                    r1.setText(r0)
                    android.widget.TextView r1 = r4.A07
                    java.lang.String r0 = r7.A01
                    r1.setText(r0)
                    java.lang.String r0 = r7.A02
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L40
                    java.lang.String r0 = r7.A01
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    r5 = 1
                    if (r0 == 0) goto L41
                    goto L40
                Lb7:
                    r0.setVisibility(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C82583qk.A09(java.lang.Object):void");
            }
        }, new Void[0]);
    }

    @Override // com.whatsapp.stickers.Hilt_StickerInfoDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        C000700j.A08(context instanceof InterfaceC04700Lm, "StickerInfoDialogFragment requires host context implement StickerImageFileLoaderProvider");
        this.A0B = ((InterfaceC04700Lm) context).ADH();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        this.A0A = (C0JM) A02().getParcelable("sticker");
        C019208x c019208x = new C019208x(A0A);
        LayoutInflater layoutInflater = A0A.getLayoutInflater();
        this.A00 = A01().getDimensionPixelSize(R.dimen.conversation_row_sticker_size);
        View inflate = layoutInflater.inflate(R.layout.sticker_detail_dialog, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.sticker_view);
        if (findViewById != null) {
            StickerView stickerView = (StickerView) findViewById;
            this.A0E = stickerView;
            stickerView.A02 = true;
            View findViewById2 = inflate.findViewById(R.id.progress_view);
            if (findViewById2 != null) {
                this.A01 = findViewById2;
                View findViewById3 = inflate.findViewById(R.id.sticker_info_container);
                if (findViewById3 != null) {
                    this.A02 = findViewById3;
                    View findViewById4 = inflate.findViewById(R.id.sticker_pack_name);
                    if (findViewById4 != null) {
                        this.A07 = (TextView) findViewById4;
                        View findViewById5 = inflate.findViewById(R.id.sticker_pack_publisher);
                        if (findViewById5 != null) {
                            this.A08 = (TextView) findViewById5;
                            View findViewById6 = inflate.findViewById(R.id.bullet_sticker_info);
                            if (findViewById6 != null) {
                                this.A06 = (TextView) findViewById6;
                                C003301p.A06(this.A07);
                                c019208x.A06(R.string.sticker_remove_from_favorites, this.A0H);
                                c019208x.A04(R.string.cancel, null);
                                c019208x.A05(R.string.sticker_remove_from_favorites, this.A0I);
                                C019308y c019308y = c019208x.A01;
                                c019308y.A0C = inflate;
                                c019308y.A01 = 0;
                                return c019208x.A00();
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A18(C3Y3 c3y3, C0JM c0jm) {
        if (c3y3.A05) {
            C2AS c2as = this.A0D;
            c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, Collections.singleton(c0jm), 27));
            return;
        }
        C2AS c2as2 = this.A0D;
        c2as2.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as2, Collections.singleton(c0jm), 26));
        this.A0F.A02("starred");
    }
}
