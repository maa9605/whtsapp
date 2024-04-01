package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.2S0 */
/* loaded from: classes2.dex */
public abstract class C2S0 extends AbstractC04890Mh implements C2S1 {
    public final C02L A01;
    public final C2N3 A02;
    public final C2L3 A03;
    public final AnonymousClass272 A04;
    public final AbstractActivityC49862Mw A05;
    public final C003701t A06;
    public final C018808t A07;
    public final UserJid A08;
    public long A00 = 1;
    public final Map A0A = new HashMap();
    public final List A09 = new ArrayList();

    public C2S0(C003701t c003701t, C02L c02l, C2L3 c2l3, C018808t c018808t, AnonymousClass272 anonymousClass272, UserJid userJid, C2N3 c2n3, AbstractActivityC49862Mw abstractActivityC49862Mw) {
        A0B(true);
        this.A06 = c003701t;
        this.A01 = c02l;
        this.A03 = c2l3;
        this.A07 = c018808t;
        this.A04 = anonymousClass272;
        this.A08 = userJid;
        this.A02 = c2n3;
        this.A05 = abstractActivityC49862Mw;
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        List list = this.A09;
        switch (((AbstractC56252mx) list.get(i)).A00) {
            case 1:
                return -2L;
            case 2:
                return -3L;
            case 3:
                return -4L;
            case 4:
                return -5L;
            case 5:
                C468628o c468628o = ((C644733m) list.get(i)).A00;
                StringBuilder A0P = C000200d.A0P("product_");
                A0P.append(c468628o.A09);
                String obj = A0P.toString();
                Map map = this.A0A;
                if (!map.containsKey(obj)) {
                    long j = this.A00;
                    this.A00 = 1 + j;
                    map.put(obj, Long.valueOf(j));
                }
                return ((Number) map.get(obj)).longValue();
            case 6:
                return -6L;
            case 7:
                StringBuilder A0P2 = C000200d.A0P("collection_");
                A0P2.append(((C644433j) list.get(i)).A04);
                String obj2 = A0P2.toString();
                Map map2 = this.A0A;
                if (!map2.containsKey(obj2)) {
                    long j2 = this.A00;
                    this.A00 = 1 + j2;
                    map2.put(obj2, Long.valueOf(j2));
                }
                return ((Number) map2.get(obj2)).longValue();
            default:
                return 0L;
        }
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A09.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return ((AbstractC56252mx) this.A09.get(i)).A00;
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        AnonymousClass337 anonymousClass337 = (AnonymousClass337) c0ts;
        List list = this.A09;
        if (((AbstractC56252mx) list.get(i)).A00 == 2) {
            ((C3LF) anonymousClass337).A00 = ((C644533k) list.get(i)).A00;
        }
        anonymousClass337.A0C(this.A08, i);
    }

    public int A0G() {
        List list = this.A09;
        return (list.size() <= 0 || !(list.get(0) instanceof C644633l)) ? -1 : 0;
    }

    public void A0H() {
        if (A0G() == -1) {
            this.A09.add(0, new AbstractC56252mx() { // from class: X.33l
            });
            A03(0);
        }
    }

    public void A0I() {
        int size;
        List list = this.A09;
        if (list.size() > 0 && (list.get(list.size() - 1) instanceof C644533k) && list.size() - 1 != -1) {
            C644533k c644533k = (C644533k) list.get(size);
            C2L3 c2l3 = this.A03;
            if (!c2l3.A01 && !c2l3.A00) {
                AnonymousClass272 anonymousClass272 = this.A04;
                UserJid userJid = this.A08;
                if (!anonymousClass272.A0B(userJid) && !anonymousClass272.A0A(userJid)) {
                    c644533k.A00 = 3;
                    return;
                } else {
                    c644533k.A00 = 1;
                    return;
                }
            }
            c644533k.A00 = 0;
        }
    }

    public void A0J(int i) {
        int size;
        List list = this.A09;
        if (list.size() > 0 && (list.get(list.size() - 1) instanceof C644533k) && list.size() - 1 != -1) {
            C644533k c644533k = (C644533k) list.get(size);
            if (i == 404) {
                c644533k.A00 = 1;
            } else if (i != 406) {
                if (i == -1) {
                    c644533k.A00 = 4;
                } else {
                    C000200d.A0r("business-catalog-list-adapter/request-catalog/fetch-catalog-error/error: ", i);
                    c644533k.A00 = 2;
                }
            } else {
                final AbstractActivityC49862Mw abstractActivityC49862Mw = this.A05;
                C02L c02l = this.A01;
                final C018808t c018808t = this.A07;
                WeakReference weakReference = C56132ml.A00;
                if (weakReference == null || weakReference.get() == null || !((Dialog) weakReference.get()).isShowing()) {
                    c02l.A05();
                    final Me me = c02l.A00;
                    C019208x c019208x = new C019208x(abstractActivityC49862Mw);
                    c019208x.A02(R.string.catalog_hidden);
                    c019208x.A01.A0J = true;
                    c019208x.A06(R.string.cancel, null);
                    c019208x.A05(R.string.register_user_support_button, new DialogInterface.OnClickListener() { // from class: X.2md
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            Activity activity = abstractActivityC49862Mw;
                            C018808t c018808t2 = c018808t;
                            Me me2 = me;
                            StringBuilder A0P = C000200d.A0P("catalog not available");
                            A0P.append(me2 == null ? "" : String.format(Locale.US, " +%s%s", me2.cc, me2.number));
                            activity.startActivity(C002701i.A09(activity, c018808t2, A0P.toString(), null, null, null, null, null));
                        }
                    });
                    DialogInterfaceC019408z A00 = c019208x.A00();
                    C56132ml.A00 = new WeakReference(A00);
                    A00.show();
                }
            }
            A02(size);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0103, code lost:
        if (r0.A01 != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0K(com.whatsapp.jid.UserJid r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2S0.A0K(com.whatsapp.jid.UserJid):void");
    }

    public void A0L(String str) {
        List list;
        C468628o A06 = this.A04.A06(str);
        if (A06 == null || !A06.A00()) {
            return;
        }
        int i = 0;
        while (true) {
            list = this.A09;
            if (i >= list.size()) {
                break;
            }
            AbstractC56252mx abstractC56252mx = (AbstractC56252mx) list.get(i);
            if (abstractC56252mx instanceof C644733m) {
                C644733m c644733m = (C644733m) abstractC56252mx;
                if (c644733m.A00.A09.equals(A06.A09)) {
                    c644733m.A00 = A06;
                    if (i != -1) {
                        A02(i);
                        return;
                    }
                }
            }
            i++;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < list.size() && (list.get(i3) instanceof C644633l); i3++) {
            i2++;
        }
        list.add(i2, new C644733m(A06));
        A03(i2);
    }

    @Override // X.C2S1
    public C468628o ACa(int i) {
        return ((C644733m) this.A09.get(i)).A00;
    }
}
