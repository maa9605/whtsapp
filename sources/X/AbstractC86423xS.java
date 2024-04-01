package X;

import android.app.Activity;
import android.os.Build;
import android.os.Environment;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1;

/* renamed from: X.3xS */
/* loaded from: classes2.dex */
public abstract class AbstractC86423xS extends AbstractC53812hY {
    public C3XV A00;
    public final C018608r A01;
    public final C003701t A02;
    public final C41771uU A03;
    public final AnonymousClass092 A04;
    public final C53132bw A05;
    public final C53362fl A06;
    public final AbstractView$OnClickListenerC49532Ky A07;
    public final AbstractView$OnClickListenerC49532Ky A08;
    public final AbstractView$OnClickListenerC49532Ky A09;

    public AbstractC86423xS(C003701t c003701t, C42461vm c42461vm, C018508q c018508q, C03010Du c03010Du, InterfaceC002901k interfaceC002901k, C0EB c0eb, C018608r c018608r, C018308n c018308n, C41471ty c41471ty, C42761wH c42761wH, C002301c c002301c, C42441vk c42441vk, C0C9 c0c9, C0CB c0cb, C2MV c2mv, C2EQ c2eq, C53132bw c53132bw, C41771uU c41771uU, C53362fl c53362fl, AnonymousClass092 anonymousClass092, AbstractC53832ha abstractC53832ha) {
        super(c42461vm, c018508q, c03010Du, interfaceC002901k, c0eb, c42761wH, c42441vk, c0c9, c2mv, c2eq, abstractC53832ha);
        this.A07 = new ViewOnClickCListenerShape12S0100000_I1(this, 20);
        this.A09 = new ViewOnClickCListenerShape12S0100000_I1(this, 21);
        this.A08 = new ViewOnClickCListenerShape12S0100000_I1(this, 22);
        this.A02 = c003701t;
        this.A04 = anonymousClass092;
        this.A01 = c018608r;
        this.A05 = c53132bw;
        this.A03 = c41771uU;
        this.A06 = c53362fl;
    }

    @Override // X.AbstractC53812hY
    public void A0H() {
        super.A0H();
        AnonymousClass092 anonymousClass092 = this.A04;
        if (anonymousClass092 instanceof AnonymousClass097) {
            C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
            if (c09h != null) {
                if (c09h.A0F != null && !c09h.A03()) {
                    C42461vm c42461vm = this.A0I;
                    Activity A00 = C018308n.A00(A0A());
                    if (c42461vm != null) {
                        String externalStorageState = Environment.getExternalStorageState();
                        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
                            C018508q c018508q = c42461vm.A00;
                            boolean A01 = C000400f.A01();
                            int i = R.string.need_sd_card_shared_storage;
                            if (A01) {
                                i = R.string.need_sd_card;
                            }
                            c018508q.A07(i, 1);
                        }
                        if (Build.VERSION.SDK_INT >= 23 && c42461vm.A03.A02("android.permission.READ_EXTERNAL_STORAGE") == -1) {
                            int i2 = Build.VERSION.SDK_INT;
                            int i3 = R.string.permission_storage_need_write_access_v30;
                            if (i2 < 30) {
                                i3 = R.string.permission_storage_need_write_access;
                            }
                            RequestPermissionActivity.A05(A00, R.string.permission_storage_need_write_access_request, i3);
                            return;
                        }
                        c42461vm.A00.A07(c42461vm.A01(), 1);
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC53812hY
    public void A0J() {
        AbstractC71693Xc A0C = A0C();
        C42441vk c42441vk = this.A0E;
        AnonymousClass092 anonymousClass092 = this.A04;
        if (!C40731sm.A0m(c42441vk, anonymousClass092) && !anonymousClass092.A0r) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) anonymousClass092;
            C09H c09h = anonymousClass097.A02;
            if (c09h != null) {
                boolean z = true;
                if (c09h.A0a) {
                    A0C.A04.setVisibility(0);
                    A0C.A04.setBackground(null);
                    CircularProgressBar circularProgressBar = A0C.A0E;
                    long j = c09h.A0C;
                    if (j != 0 && j != 100) {
                        z = false;
                    }
                    circularProgressBar.setIndeterminate(z);
                    A0C.A0E.setProgress((int) c09h.A0C);
                    A0C.A0E.setVisibility(0);
                    A0C.A0E.setOnClickListener(null);
                    A0C.A0B.setVisibility(8);
                    A0C.A00.setVisibility(8);
                    return;
                } else if (c09h.A07 == 1) {
                    A0C.A04.setVisibility(8);
                    if (anonymousClass097.A0m == 2) {
                        A0C.A0C.setText(R.string.gallery_unsafe_audio_removed);
                    } else {
                        A0C.A0C.setText(R.string.gallery_unsafe_video_removed);
                    }
                    A0C.A0C.setVisibility(0);
                    return;
                } else if (c09h.A0P) {
                    A0C.A04.setVisibility(8);
                    return;
                } else {
                    A0C.A04.setBackgroundResource(R.drawable.download_background);
                    A0C.A04.setVisibility(0);
                    A0C.A0E.setVisibility(8);
                    A0C.A0E.setOnClickListener(null);
                    A0C.A0B.setVisibility(0);
                    A0C.A0B.setText(R.string.button_download);
                    A0C.A0B.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                    A0C.A0B.setOnClickListener(this.A07);
                    A0C.A00.setVisibility(8);
                    return;
                }
            }
            throw null;
        }
        A0C.A04.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0084, code lost:
        if (r0.A0a == false) goto L31;
     */
    @Override // X.AbstractC53812hY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0L(int r13) {
        /*
            r12 = this;
            super.A0L(r13)
            X.092 r7 = r12.A04
            X.094 r2 = r7.A0n
            boolean r6 = r2.A02
            if (r6 != 0) goto L19
            X.3XV r0 = r12.A0B()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L76
            boolean r0 = r12.A03
            if (r0 == 0) goto L76
        L19:
            r5 = 1
        L1a:
            X.0HC r9 = r12.A0J
            r9.A00()
            X.0HC r8 = r12.A0L
            r8.A00()
            X.0HC r0 = r12.A0K
            r0.A00()
            X.3XV r0 = r12.A0B()
            r0.A00()
            X.2EQ r1 = r12.A0F
            X.3XV r0 = r12.A0B()
            long r3 = r0.A00()
            long r10 = r9.A00()
            long r8 = r8.A00()
            X.2En r0 = r1.A01
            if (r0 == 0) goto L6c
            java.util.Map r1 = r0.A0A
            if (r6 == 0) goto L6d
            X.05q r0 = X.C011405q.A00
        L4c:
            java.lang.Object r0 = r1.get(r0)
            X.2Eo r0 = (X.C48262Eo) r0
            if (r0 == 0) goto L6c
            java.util.Map r0 = r0.A07
            java.lang.Object r2 = r0.get(r2)
            X.2Ep r2 = (X.C48272Ep) r2
            if (r2 == 0) goto L6c
            r2.A04 = r5
            r2.A06 = r3
            long r0 = r2.A07
            long r0 = r0 + r10
            r2.A07 = r0
            long r0 = r2.A08
            long r0 = r0 + r8
            r2.A08 = r0
        L6c:
            return
        L6d:
            X.02j r0 = r7.A0A()
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            goto L4c
        L76:
            boolean r0 = r7 instanceof X.AnonymousClass097
            if (r0 == 0) goto L86
            r0 = r7
            X.097 r0 = (X.AnonymousClass097) r0
            X.09H r0 = r0.A02
            if (r0 == 0) goto L88
            boolean r0 = r0.A0a
            r5 = 2
            if (r0 != 0) goto L1a
        L86:
            r5 = 3
            goto L1a
        L88:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86423xS.A0L(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x001f, code lost:
        if (r19 == 6) goto L95;
     */
    @Override // X.AbstractC53812hY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0M(int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86423xS.A0M(int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0030, code lost:
        if (r5 == 100) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Q() {
        /*
            r11 = this;
            X.3Xc r3 = r11.A0C()
            X.092 r1 = r11.A04
            boolean r0 = r1 instanceof X.AnonymousClass097
            r5 = 0
            if (r0 == 0) goto L6d
            X.097 r1 = (X.AnonymousClass097) r1
            X.09H r10 = r1.A02
        Lf:
            r2 = 8
            r4 = 0
            if (r10 == 0) goto L5a
            boolean r0 = r10.A0P
            if (r0 != 0) goto L5a
            boolean r0 = r10.A0a
            if (r0 == 0) goto L6f
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r9 = r3.A0E
            long r5 = r10.A0C
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L32
            r7 = 100
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L33
        L32:
            r0 = 1
        L33:
            r9.setIndeterminate(r0)
            com.whatsapp.CircularProgressBar r1 = r3.A0E
            long r5 = r10.A0C
            int r0 = (int) r5
            r1.setProgress(r0)
            com.whatsapp.CircularProgressBar r0 = r3.A0E
            r0.setVisibility(r4)
            android.widget.TextView r0 = r3.A0B
            r0.setVisibility(r2)
            android.view.View r0 = r3.A00
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r1 = r3.A0E
            X.2Ky r0 = r11.A08
            r1.setOnClickListener(r0)
            android.view.ViewGroup r0 = r3.A08
            r0.setVisibility(r2)
        L59:
            return
        L5a:
            android.view.View r0 = r3.A04
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r3.A08
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L59
            android.view.ViewGroup r0 = r3.A08
            r0.setVisibility(r4)
            return
        L6d:
            r10 = r5
            goto Lf
        L6f:
            android.view.View r1 = r3.A04
            r0 = 2131231180(0x7f0801cc, float:1.8078434E38)
            r1.setBackgroundResource(r0)
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r3.A0E
            r0.setVisibility(r2)
            com.whatsapp.CircularProgressBar r0 = r3.A0E
            r0.setOnClickListener(r5)
            android.widget.TextView r0 = r3.A0B
            r0.setVisibility(r4)
            android.widget.TextView r1 = r3.A0B
            r0 = 2131889454(0x7f120d2e, float:1.9413572E38)
            r1.setText(r0)
            android.widget.TextView r1 = r3.A0B
            r0 = 2131231069(0x7f08015d, float:1.8078209E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            android.widget.TextView r1 = r3.A0B
            X.2Ky r0 = r11.A09
            r1.setOnClickListener(r0)
            android.view.View r0 = r3.A00
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r3.A08
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86423xS.A0Q():void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" for ");
        AnonymousClass092 anonymousClass092 = this.A04;
        sb.append(anonymousClass092.A0n);
        sb.append(" ");
        sb.append(anonymousClass092.A0A());
        sb.append(" ");
        sb.append((int) anonymousClass092.A0m);
        return sb.toString();
    }
}
