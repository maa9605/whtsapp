package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.ContactPicker;
import com.whatsapp.http.GoogleSearchDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Lh */
/* loaded from: classes.dex */
public abstract class AbstractActivityC04650Lh extends AbstractActivityC04660Li implements InterfaceC04690Ll {
    public C0U0 A00;
    public C02L A01;
    public C01B A02;
    public C018608r A03;
    public C06K A04;
    public C41541u6 A05;
    public C05W A06;
    public C2J8 A07;
    public C018708s A08;
    public C011505r A09;
    public C0L5 A0A;
    public C58712ra A0B;
    public C2MK A0C;
    public C58832rm A0D;
    public C42381ve A0E;
    public C03120Eg A0F;
    public C59232sQ A0G;
    public AnonymousClass012 A0H;
    public C001200o A0I;
    public C02F A0J;
    public C000500h A0K;
    public C0C9 A0L;
    public C0GU A0M;
    public C0H4 A0N;
    public C00A A0O;
    public C43081wp A0P;
    public C2MI A0Q;
    public C003701t A0R;
    public AnonymousClass011 A0S;
    public C018808t A0T;
    public C41771uU A0U;
    public C42451vl A0V;
    public C0DW A0W;
    public C0DV A0X;
    public AnonymousClass092 A0Y;
    public C2AR A0Z;
    public C43791xz A0a;
    public C40071rX A0b;
    public C52762bH A0c;
    public C2MH A0d;
    public InterfaceC002901k A0e;
    public C40951t8 A0f;
    public C2ML A0g;
    public HashMap A0h;
    public HashSet A0i = new HashSet();
    public Map A0j;
    public C04110Ip A0k;

    @Override // X.AbstractActivityC04670Lj
    public int A1R() {
        return -1;
    }

    public abstract boolean A1X();

    @Override // X.InterfaceC04690Ll
    public void A5Q(View view, Drawable drawable) {
    }

    public Collection A1U() {
        ArrayList arrayList = new ArrayList();
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null) {
            arrayList.addAll(c59232sQ.values());
        } else {
            AnonymousClass092 anonymousClass092 = this.A0Y;
            if (anonymousClass092 != null && this.A0L.A0F(anonymousClass092.A0n) != null) {
                arrayList.add(this.A0Y);
                return arrayList;
            }
        }
        return arrayList;
    }

    public void A1V() {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            c0u0.A05();
        }
    }

    public void A1W() {
        C0U0 c0u0 = this.A00;
        if (c0u0 != null) {
            C59232sQ c59232sQ = this.A0G;
            if (c59232sQ == null || c59232sQ.size() == 0) {
                A1V();
            } else {
                c0u0.A06();
            }
        }
    }

    @Override // X.InterfaceC04690Ll
    public synchronized void A5M(AnonymousClass094 anonymousClass094) {
        Map map = this.A0j;
        if (map == null) {
            map = new HashMap();
            this.A0j = map;
        }
        map.put(anonymousClass094, new C0FK(0L, 0));
    }

    @Override // X.InterfaceC04690Ll
    public void A7F(AnonymousClass094 anonymousClass094) {
        Map map = this.A0j;
        if (map != null) {
            map.remove(anonymousClass094);
        }
    }

    @Override // X.InterfaceC04690Ll
    public void A85(AnonymousClass092 anonymousClass092) {
        long j;
        int i;
        A1V();
        this.A0Y = anonymousClass092;
        Intent intent = new Intent(this, ContactPicker.class);
        intent.putExtra("forward", true);
        intent.putExtra("forward_jid", C003101m.A07(anonymousClass092.A0n.A00));
        byte b = anonymousClass092.A0m;
        intent.putIntegerArrayListExtra("message_types", new ArrayList<>(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue()))));
        if (anonymousClass092 instanceof C0JP) {
            j = ((AnonymousClass097) anonymousClass092).A00 * 1000;
        } else {
            j = 0;
        }
        intent.putExtra("forward_video_duration", j);
        if (b == 0) {
            String A0G = anonymousClass092.A0G();
            if (A0G == null) {
                throw null;
            }
            i = A0G.length();
        } else {
            i = 0;
        }
        intent.putExtra("forward_text_length", i);
        intent.putExtra("forward_messages_becoming_frequently_forwarded", C0DB.A0j(anonymousClass092, this.A02) ? 1 : 0);
        intent.putExtra("forward_ctwa", anonymousClass092.A14(1024));
        intent.putExtra("forward_highly_forwarded", anonymousClass092.A03 >= 127);
        startActivityForResult(intent, 2);
    }

    @Override // X.InterfaceC04690Ll
    public C58712ra A8N() {
        return this.A0B;
    }

    @Override // X.InterfaceC04690Ll
    public C658038p A99() {
        return this.A0C.A01;
    }

    @Override // X.InterfaceC04690Ll
    public synchronized int A9c(C09F c09f) {
        int i;
        double d = ((AnonymousClass097) c09f).A00 <= 1 ? 600L : i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        Double.isNaN(d);
        Double.isNaN(d);
        int max = Math.max(3, (int) Math.ceil(6000.0d / d));
        if (this.A0j == null) {
            return max;
        }
        C0FK c0fk = (C0FK) this.A0j.get(c09f.A0n);
        if (c0fk == null) {
            return max;
        }
        return max - ((Integer) c0fk.A01).intValue();
    }

    @Override // X.InterfaceC04700Lm
    public C43791xz ADH() {
        return this.A0a;
    }

    @Override // X.InterfaceC04690Ll
    public int ADT(AnonymousClass092 anonymousClass092) {
        Number number;
        HashMap hashMap = this.A0h;
        if (hashMap == null || (number = (Number) hashMap.get(anonymousClass092.A0n)) == null) {
            return 0;
        }
        return number.intValue();
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
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
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
    public void ASG(AnonymousClass092 anonymousClass092) {
        GoogleSearchDialogFragment.A00(this, ((ActivityC02290Ap) this).A0A, this.A02, anonymousClass092);
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
            A1W();
        }
    }

    @Override // X.InterfaceC04690Ll
    public void ATz(AnonymousClass092 anonymousClass092, int i) {
        HashMap hashMap = this.A0h;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.A0h = hashMap;
        }
        hashMap.put(anonymousClass092.A0n, Integer.valueOf(i));
    }

    @Override // X.InterfaceC04690Ll
    public synchronized boolean AUN(AnonymousClass094 anonymousClass094) {
        Map map = this.A0j;
        boolean z = false;
        if (map == null) {
            return false;
        }
        C0FK c0fk = (C0FK) map.get(anonymousClass094);
        if (c0fk != null) {
            long longValue = ((Long) c0fk.A00).longValue();
            int intValue = ((Integer) c0fk.A01).intValue();
            if (longValue < 6000 || intValue < 3) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC04690Ll
    public void AV2(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = new C59232sQ(((ActivityC02290Ap) this).A0A, this.A0O, this.A0G, new C38C(this));
        this.A0G = c59232sQ;
        c59232sQ.put(anonymousClass092.A0n, anonymousClass092);
        A1X();
        A1W();
    }

    @Override // X.InterfaceC04690Ll
    public boolean AVe(AnonymousClass092 anonymousClass092) {
        C59232sQ c59232sQ = this.A0G;
        boolean z = false;
        if (c59232sQ != null) {
            AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
            if (c59232sQ.containsKey(anonymousClass094)) {
                this.A0G.remove(anonymousClass094);
            } else {
                this.A0G.put(anonymousClass094, anonymousClass092);
                z = true;
            }
            A1W();
        }
        return z;
    }

    @Override // X.InterfaceC04690Ll
    public void AVq(C09F c09f, long j) {
        AnonymousClass094 anonymousClass094 = c09f.A0n;
        int i = ((AnonymousClass097) c09f).A00;
        int i2 = (int) (j / (i <= 1 ? 600L : i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        synchronized (this) {
            Map map = this.A0j;
            if (map == null) {
                return;
            }
            C0FK c0fk = (C0FK) map.get(anonymousClass094);
            if (c0fk == null) {
                return;
            }
            long longValue = ((Long) c0fk.A00).longValue() + j;
            int intValue = ((Integer) c0fk.A01).intValue();
            if (i2 > 0) {
                intValue += i2;
            }
            this.A0j.put(anonymousClass094, new C0FK(Long.valueOf(longValue), Integer.valueOf(intValue)));
        }
    }

    @Override // X.InterfaceC04690Ll
    public void AVt(AnonymousClass092 anonymousClass092) {
        this.A0i.add(anonymousClass092.A0n);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        List<C09010cT> list;
        super.onActivityResult(i, i2, intent);
        if (i == 41) {
            if (i2 == -1) {
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null) {
                        throw null;
                    }
                    str = data.getLastPathSegment();
                } else {
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C04110Ip c04110Ip = this.A0k;
                if (c04110Ip != null && (list = c04110Ip.A05) != null) {
                    for (C09010cT c09010cT : list) {
                        arrayList2.add(c09010cT.A02);
                        UserJid userJid = c09010cT.A01;
                        if (userJid != null) {
                            arrayList.add(userJid);
                        } else {
                            arrayList.add(null);
                        }
                    }
                    this.A07.A02(arrayList2, arrayList, this.A0k.A08(), str);
                }
            }
            this.A0c.A00();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0C.A00(this);
    }

    @Override // X.AbstractActivityC04660Li, X.AbstractActivityC04670Lj, X.AbstractActivityC04680Lk, X.AbstractActivityC02260Am, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0B = new C58712ra(((ActivityC02290Ap) this).A0A, this.A0K, this.A0X, this.A0W);
        AnonymousClass011 anonymousClass011 = this.A0S;
        C01B c01b = this.A02;
        this.A0c = new C52762bH(anonymousClass011, c01b, ((ActivityC02290Ap) this).A0E, this.A0J);
        this.A0D = new C58832rm(this.A0R, this.A0I, c01b, this.A0f, this.A0A, this.A06, ((ActivityC02310Ar) this).A01, this.A09, this.A04, this.A0a, this.A0E, this.A0F);
        this.A0C.A00(this);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 13) {
            if (i != 19) {
                return super.onCreateDialog(i);
            }
            return AnonymousClass088.A0F(this, ((ActivityC02270An) this).A00, this.A0b, this.A0K, 19);
        }
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null && !c59232sQ.isEmpty()) {
            StringBuilder A0P = C000200d.A0P("conversation/dialog/delete/");
            A0P.append(c59232sQ.size());
            Log.i(A0P.toString());
            return AnonymousClass088.A0G(this, ((ActivityC02290Ap) this).A0A, this.A0H, this.A0e, ((ActivityC02290Ap) this).A0H, this.A03, this.A06, this.A08, ((ActivityC02310Ar) this).A01, this.A0T, this.A0K, new HashSet(this.A0G.values()), null, 13, new InterfaceC018908u() { // from class: X.38A
                {
                    AbstractActivityC04650Lh.this = this;
                }

                @Override // X.InterfaceC018908u
                public final void AJH() {
                    AbstractActivityC04650Lh.this.A1V();
                }
            });
        }
        Log.e("conversation/dialog/delete no messages");
        return super.onCreateDialog(i);
    }

    @Override // X.ActivityC02250Al, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        C59232sQ c59232sQ = this.A0G;
        if (c59232sQ != null) {
            c59232sQ.A00();
            this.A0G = null;
        }
        C58832rm c58832rm = this.A0D;
        C0Zn c0Zn = c58832rm.A00;
        if (c0Zn != null) {
            c0Zn.A00();
        }
        C43791xz c43791xz = c58832rm.A01;
        if (c43791xz != null) {
            c43791xz.A04();
        }
        C23K c23k = c58832rm.A02;
        if (c23k != null) {
            c23k.A07();
        }
        C58712ra c58712ra = this.A0B;
        C58692rY c58692rY = c58712ra.A00;
        if (c58692rY != null) {
            c58692rY.A04 = true;
            c58692rY.interrupt();
            c58712ra.A00 = null;
        }
        super.onDestroy();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        synchronized (this) {
            Map map = this.A0j;
            if (map != null) {
                map.clear();
            }
        }
        this.A0g.A00();
    }

    @Override // X.ActivityC02250Al, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            List<AnonymousClass094> A04 = C0LD.A04(bundle);
            if (A04 != null) {
                this.A0G = new C59232sQ(((ActivityC02290Ap) this).A0A, this.A0O, this.A0G, new C38C(this));
                for (AnonymousClass094 anonymousClass094 : A04) {
                    AnonymousClass092 A0F = this.A0L.A0F(anonymousClass094);
                    if (A0F != null) {
                        this.A0G.put(anonymousClass094, A0F);
                    }
                }
                A1X();
                A1W();
            }
            AnonymousClass094 A03 = C0LD.A03(bundle, "");
            if (A03 != null) {
                this.A0Y = this.A0L.A0H.A05(A03);
            }
        }
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
        AnonymousClass092 anonymousClass0922 = this.A0Y;
        if (anonymousClass0922 != null) {
            C0LD.A07(bundle, anonymousClass0922.A0n, "");
        }
    }
}
