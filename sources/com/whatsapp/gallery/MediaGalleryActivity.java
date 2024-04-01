package com.whatsapp.gallery;

import X.AbstractActivityC49922Nr;
import X.AbstractC005302j;
import X.AbstractC15200oF;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass088;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.C000200d;
import X.C002301c;
import X.C003101m;
import X.C00A;
import X.C012706e;
import X.C018608r;
import X.C018708s;
import X.C018808t;
import X.C01B;
import X.C02160Ac;
import X.C02980Dr;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03010Du;
import X.C03690Gr;
import X.C05W;
import X.C09F;
import X.C0BA;
import X.C0C8;
import X.C0C9;
import X.C0CA;
import X.C0D5;
import X.C0ED;
import X.C0ES;
import X.C0IU;
import X.C0LD;
import X.C0O8;
import X.C0U0;
import X.C2AR;
import X.C2AT;
import X.C2M4;
import X.C2MG;
import X.C2MK;
import X.C2MN;
import X.C40071rX;
import X.C41541u6;
import X.C41771uU;
import X.C42451vl;
import X.C42461vm;
import X.C43081wp;
import X.C43791xz;
import X.C462626b;
import X.C58712ra;
import X.C59232sQ;
import X.C658038p;
import X.C66263Aj;
import X.InterfaceC002901k;
import X.InterfaceC018908u;
import X.InterfaceC04690Ll;
import X.InterfaceC53322di;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaGalleryActivity extends AbstractActivityC49922Nr implements InterfaceC04690Ll {
    public int A00;
    public MenuItem A05;
    public C0O8 A06;
    public C0U0 A07;
    public C02L A08;
    public C03010Du A09;
    public C01B A0A;
    public C018608r A0B;
    public C41541u6 A0C;
    public C05W A0D;
    public C018708s A0E;
    public C2MK A0F;
    public C59232sQ A0G;
    public C02E A0H;
    public C462626b A0I;
    public AnonymousClass012 A0J;
    public C02F A0K;
    public C0C9 A0L;
    public C0D5 A0M;
    public C0C8 A0O;
    public C03690Gr A0P;
    public C00A A0Q;
    public C012706e A0R;
    public C43081wp A0S;
    public C0ED A0T;
    public AnonymousClass011 A0U;
    public C0ES A0V;
    public C018808t A0W;
    public AbstractC005302j A0X;
    public C41771uU A0Y;
    public C42451vl A0Z;
    public C02980Dr A0a;
    public C02O A0b;
    public C2MN A0c;
    public C2AR A0d;
    public C2M4 A0e;
    public C2AT A0f;
    public C2MG A0g;
    public C43791xz A0h;
    public C40071rX A0i;
    public C42461vm A0j;
    public InterfaceC002901k A0k;
    public ArrayList A0m;
    public String A0l = "";
    public C0IU A0N = new C0IU(((ActivityC02310Ar) this).A01);
    public int A03 = 0;
    public int A01 = 1;
    public int A02 = 2;
    public int A04 = 3;
    public final AbstractC15200oF A0n = new AbstractC15200oF() { // from class: X.3Ax
        {
            MediaGalleryActivity.this = this;
        }

        @Override // X.AbstractC15200oF
        public void A00(RecyclerView recyclerView, int i) {
            MediaGalleryActivity mediaGalleryActivity = MediaGalleryActivity.this;
            MenuItem menuItem = mediaGalleryActivity.A05;
            if (menuItem == null || !menuItem.isActionViewExpanded() || mediaGalleryActivity.getCurrentFocus() == null) {
                return;
            }
            InputMethodManager A0I = mediaGalleryActivity.A0H.A0I();
            if (A0I != null) {
                A0I.hideSoftInputFromWindow(recyclerView.getWindowToken(), 2);
                return;
            }
            throw null;
        }
    };

    @Override // X.InterfaceC04690Ll
    public void A5M(AnonymousClass094 anonymousClass094) {
    }

    @Override // X.InterfaceC04690Ll
    public void A5Q(View view, Drawable drawable) {
    }

    @Override // X.InterfaceC04690Ll
    public void A7F(AnonymousClass094 anonymousClass094) {
    }

    @Override // X.InterfaceC04690Ll
    public void A85(AnonymousClass092 anonymousClass092) {
    }

    @Override // X.InterfaceC04690Ll
    public C58712ra A8N() {
        return null;
    }

    @Override // X.InterfaceC04690Ll
    public int A95() {
        return 0;
    }

    @Override // X.InterfaceC04690Ll
    public int A9c(C09F c09f) {
        return 0;
    }

    @Override // X.InterfaceC04700Lm
    public C43791xz ADH() {
        return null;
    }

    @Override // X.InterfaceC04690Ll
    public int ADT(AnonymousClass092 anonymousClass092) {
        return 0;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AFv(AnonymousClass092 anonymousClass092) {
        return false;
    }

    @Override // X.InterfaceC04690Ll
    public void ASG(AnonymousClass092 anonymousClass092) {
    }

    @Override // X.InterfaceC04690Ll
    public void ATz(AnonymousClass092 anonymousClass092, int i) {
    }

    @Override // X.InterfaceC04690Ll
    public boolean AUN(AnonymousClass094 anonymousClass094) {
        return true;
    }

    @Override // X.InterfaceC04690Ll
    public void AVq(C09F c09f, long j) {
    }

    @Override // X.InterfaceC04690Ll
    public void AVt(AnonymousClass092 anonymousClass092) {
    }

    public static InterfaceC53322di A00(MediaGalleryActivity mediaGalleryActivity) {
        int i = mediaGalleryActivity.A00;
        for (C0BA c0ba : mediaGalleryActivity.A0t()) {
            if (i == mediaGalleryActivity.A03 && (c0ba instanceof MediaGalleryFragment)) {
                return (InterfaceC53322di) c0ba;
            }
            if (i == mediaGalleryActivity.A01 && (c0ba instanceof DocumentsGalleryFragment)) {
                return (InterfaceC53322di) c0ba;
            }
            if (i == mediaGalleryActivity.A02 && (c0ba instanceof LinksGalleryFragment)) {
                return (InterfaceC53322di) c0ba;
            }
            if (i == mediaGalleryActivity.A04 && (c0ba instanceof ProductGalleryFragment)) {
                return (GalleryFragmentBase) c0ba;
            }
        }
        return null;
    }

    public final void A1P() {
        C59232sQ c59232sQ;
        C0U0 c0u0 = this.A07;
        if (c0u0 == null || (c59232sQ = this.A0G) == null) {
            return;
        }
        if (c59232sQ.isEmpty()) {
            c0u0.A05();
            return;
        }
        AnonymousClass088.A1C(this, this.A0H, ((ActivityC02310Ar) this).A01.A0A(R.plurals.n_items_selected, c59232sQ.size(), Integer.valueOf(c59232sQ.size())));
        this.A07.A06();
    }

    @Override // X.InterfaceC04690Ll
    public C658038p A99() {
        return this.A0F.A01;
    }

    @Override // X.InterfaceC04690Ll
    public ArrayList ACy() {
        return this.A0m;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AEZ() {
        return this.A0G != null;
    }

    @Override // X.InterfaceC04690Ll
    public boolean AFX(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = this.A0G;
        return c59232sQ != null && c59232sQ.containsKey(anonymousClass092.A0n);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APM(C0U0 c0u0) {
        super.APM(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, 17170444));
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APN(C0U0 c0u0) {
        super.APN(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.InterfaceC04690Ll
    public void ATr(List list, boolean z) {
        if (this.A0G != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                C59232sQ c59232sQ = this.A0G;
                if (z) {
                    c59232sQ.put(anonymousClass092.A0n, anonymousClass092);
                } else {
                    c59232sQ.remove(anonymousClass092.A0n);
                }
            }
            A1P();
        }
    }

    @Override // X.InterfaceC04690Ll
    public void AV2(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = new C59232sQ(((ActivityC02290Ap) this).A0A, this.A0Q, this.A0G, new C66263Aj(this));
        this.A0G = c59232sQ;
        c59232sQ.put(anonymousClass092.A0n, anonymousClass092);
        this.A07 = A0e(this.A06);
        C02E c02e = this.A0H;
        C002301c c002301c = ((ActivityC02310Ar) this).A01;
        C59232sQ c59232sQ2 = this.A0G;
        AnonymousClass088.A1C(this, c02e, c002301c.A0A(R.plurals.n_items_selected, c59232sQ2.size(), Integer.valueOf(c59232sQ2.size())));
    }

    @Override // X.InterfaceC04690Ll
    public boolean AVe(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ == null) {
            return false;
        }
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        boolean containsKey = c59232sQ.containsKey(anonymousClass094);
        C59232sQ c59232sQ2 = this.A0G;
        if (containsKey) {
            c59232sQ2.remove(anonymousClass094);
            A1P();
        } else {
            c59232sQ2.put(anonymousClass094, anonymousClass092);
            A1P();
        }
        return !containsKey;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
        } else {
            if (this.A0G != null) {
                List A0F = C003101m.A0F(AbstractC005302j.class, intent.getStringArrayListExtra("jids"));
                Iterator it = C0CA.A01(this.A0G.values()).iterator();
                while (it.hasNext()) {
                    this.A0B.A0E(this.A09, (AnonymousClass092) it.next(), A0F);
                }
                AbstractList abstractList = (AbstractList) A0F;
                if (abstractList.size() == 1 && !C003101m.A0Z((Jid) abstractList.get(0))) {
                    ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, this.A0D.A0A((AbstractC005302j) abstractList.get(0))));
                } else {
                    A1L(A0F);
                }
            } else {
                Log.w("mediagallery/forward/failed");
                ((ActivityC02290Ap) this).A0A.A07(R.string.message_forward_failed, 0);
            }
            C0U0 c0u0 = this.A07;
            if (c0u0 == null) {
                return;
            }
            c0u0.A05();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0F.A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0110, code lost:
        if (java.lang.Long.parseLong(r0) == 0) goto L86;
     */
    @Override // X.AbstractActivityC49922Nr, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        this.A0F.A00(this);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 13) {
            if (i != 19) {
                return super.onCreateDialog(i);
            }
            return AnonymousClass088.A0F(this, ((ActivityC02270An) this).A00, this.A0i, ((ActivityC02290Ap) this).A0F, 19);
        }
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null && !c59232sQ.isEmpty()) {
            StringBuilder A0P = C000200d.A0P("mediagallery/dialog/delete/");
            A0P.append(c59232sQ.size());
            Log.i(A0P.toString());
            return AnonymousClass088.A0G(this, ((ActivityC02290Ap) this).A0A, this.A0J, this.A0k, ((ActivityC02290Ap) this).A0H, this.A0B, this.A0D, this.A0E, ((ActivityC02310Ar) this).A01, this.A0W, ((ActivityC02290Ap) this).A0F, new HashSet(this.A0G.values()), this.A0X, 13, new InterfaceC018908u() { // from class: X.3Al
                {
                    MediaGalleryActivity.this = this;
                }

                @Override // X.InterfaceC018908u
                public final void AJH() {
                    MediaGalleryActivity mediaGalleryActivity = MediaGalleryActivity.this;
                    C59232sQ c59232sQ2 = mediaGalleryActivity.A0G;
                    if (c59232sQ2 != null) {
                        c59232sQ2.clear();
                    }
                    C0U0 c0u0 = mediaGalleryActivity.A07;
                    if (c0u0 != null) {
                        c0u0.A05();
                    }
                }
            });
        }
        Log.e("mediagallery/dialog/delete no messages");
        return super.onCreateDialog(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r6.A0M.A04() < 5) goto L14;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onCreateOptionsMenu(android.view.Menu r7) {
        /*
            r6 = this;
            X.0D5 r1 = r6.A0M
            X.02j r0 = r6.A0X
            X.0IU r0 = r1.A09(r0)
            r6.A0N = r0
            X.0D5 r0 = r6.A0M
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L92
            androidx.appcompat.widget.SearchView r3 = new androidx.appcompat.widget.SearchView
            r3.<init>(r6)
            r0 = 2131364414(0x7f0a0a3e, float:1.8348664E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131100514(0x7f060362, float:1.7813412E38)
            int r0 = X.C02160Ac.A00(r6, r0)
            r1.setTextColor(r0)
            r0 = 2131889511(0x7f120d67, float:1.9413688E38)
            java.lang.String r0 = r6.getString(r0)
            r3.setQueryHint(r0)
            X.3Aw r0 = new X.3Aw
            r0.<init>()
            r3.A0B = r0
            r1 = 2131363568(0x7f0a06f0, float:1.8346948E38)
            r0 = 2131889496(0x7f120d58, float:1.9413657E38)
            r5 = 0
            android.view.MenuItem r2 = r7.add(r5, r1, r5, r0)
            r1 = 2131231355(0x7f08027b, float:1.8078789E38)
            r0 = 2131100652(0x7f0603ec, float:1.7813691E38)
            android.graphics.drawable.Drawable r0 = X.C02180Ae.A0O(r6, r1, r0)
            android.view.MenuItem r0 = r2.setIcon(r0)
            r6.A05 = r0
            r0.setActionView(r3)
            android.view.MenuItem r1 = r6.A05
            r0 = 10
            r1.setShowAsAction(r0)
            android.view.MenuItem r1 = r6.A05
            X.2vH r0 = new X.2vH
            r0.<init>()
            r1.setOnActionExpandListener(r0)
            X.0D5 r0 = r6.A0M
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L7f
            X.0D5 r0 = r6.A0M
            long r3 = r0.A04()
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 1
            if (r0 >= 0) goto L80
        L7f:
            r3 = 0
        L80:
            android.view.MenuItem r2 = r6.A05
            int r1 = r6.A00
            int r0 = r6.A03
            if (r1 == r0) goto L8f
            int r0 = r6.A04
            if (r1 != r0) goto L8e
            if (r3 == 0) goto L8f
        L8e:
            r5 = 1
        L8f:
            r2.setVisible(r5)
        L92:
            boolean r0 = super.onCreateOptionsMenu(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.MediaGalleryActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C43791xz c43791xz = this.A0h;
        if (c43791xz != null) {
            c43791xz.A04();
        }
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null) {
            c59232sQ.A00();
            this.A0G = null;
        }
        this.A0k.AS1(new RunnableEBaseShape2S0100000_I0_2(this.A0I, 46));
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass092 anonymousClass092 : c59232sQ.values()) {
                arrayList.add(anonymousClass092.A0n);
            }
            C0LD.A08(bundle, arrayList);
        }
    }
}
