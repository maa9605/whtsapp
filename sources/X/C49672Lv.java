package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2Lv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49672Lv {
    public static volatile C49672Lv A04;
    public final AbstractC000600i A00;
    public final C05W A01;
    public final C000500h A02;
    public final C05Y A03;

    public C49672Lv(AbstractC000600i abstractC000600i, C05Y c05y, C05W c05w, C000500h c000500h) {
        this.A00 = abstractC000600i;
        this.A03 = c05y;
        this.A01 = c05w;
        this.A02 = c000500h;
    }

    /* JADX WARN: Finally extract failed */
    public static void A00(C49672Lv c49672Lv, Set set, String str) {
        AnonymousClass060 anonymousClass060 = c49672Lv.A01.A05;
        if (anonymousClass060 != null) {
            C0HC A06 = AnonymousClass061.A06();
            C0CD A0B = anonymousClass060.A0B();
            try {
                C03790Hb A00 = A0B.A00();
                AnonymousClass061.A09(A0B, "wa_group_add_black_list", null, null);
                ContentValues contentValues = new ContentValues(1);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    contentValues.put("jid", ((UserJid) it.next()).getRawString());
                    AnonymousClass061.A03(A0B, "wa_group_add_black_list", contentValues);
                }
                A00.A00();
                A00.close();
                A0B.close();
                A06.A00();
                c49672Lv.A02.A00.edit().putString("group_add_blacklist_hash", str).apply();
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A0B.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        throw null;
    }

    public C461825l A01() {
        C05Y c05y = this.A03;
        String A02 = c05y.A02();
        final C461825l c461825l = new C461825l();
        String string = this.A02.A00.getString("group_add_blacklist_hash", null);
        C04P[] c04pArr = new C04P[string != null ? 3 : 2];
        c04pArr[0] = new C04P("name", "groupadd", null, (byte) 0);
        c04pArr[1] = new C04P("value", "contact_blacklist", null, (byte) 0);
        if (string != null) {
            c04pArr[2] = new C04P("dhash", string, null, (byte) 0);
        }
        c05y.A07(227, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("to", C04260Jm.A00), new C04P("xmlns", "privacy", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("privacy", (C04P[]) null, new C02590Ca("list", c04pArr, null, null))), new InterfaceC010405f() { // from class: X.3DH
            @Override // X.InterfaceC010405f
            public void AJI(String str) {
                c461825l.A0A(Boolean.FALSE);
            }

            @Override // X.InterfaceC010405f
            public void AJx(String str, C02590Ca c02590Ca) {
                c461825l.A0A(Boolean.FALSE);
            }

            @Override // X.InterfaceC010405f
            public void APJ(String str, C02590Ca c02590Ca) {
                C49672Lv c49672Lv = C49672Lv.this;
                AbstractC000600i abstractC000600i = c49672Lv.A00;
                C02590Ca A0D = c02590Ca.A0E("privacy").A0D("list");
                if (A0D != null) {
                    HashSet hashSet = new HashSet();
                    C04P A0A = A0D.A0A("dhash");
                    String str2 = A0A != null ? A0A.A03 : null;
                    for (C02590Ca c02590Ca2 : A0D.A0H("user")) {
                        hashSet.add(c02590Ca2.A09(UserJid.class, "jid", abstractC000600i));
                    }
                    Pair pair = new Pair(hashSet, str2);
                    C49672Lv.A00(c49672Lv, (Set) pair.first, (String) pair.second);
                }
                c461825l.A0A(Boolean.TRUE);
            }
        }, 32000L);
        return c461825l;
    }

    public Set A02() {
        AnonymousClass060 anonymousClass060 = this.A01.A05;
        if (anonymousClass060 != null) {
            HashSet hashSet = new HashSet();
            C0CD A0A = anonymousClass060.A0A();
            try {
                Cursor A05 = AnonymousClass061.A05(A0A, "wa_group_add_black_list", new String[]{"jid"}, null, null, null, "CONTACT_GROUP_ADD_BLACK_LIST");
                if (A05 == null) {
                    C000700j.A08(false, "contact-mgr-db/unable to get block list");
                } else {
                    while (A05.moveToNext()) {
                        UserJid nullable = UserJid.getNullable(A05.getString(0));
                        if (nullable != null) {
                            hashSet.add(nullable);
                        }
                    }
                    A05.close();
                }
                A0A.close();
                return hashSet;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A0A.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        throw null;
    }
}
