package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0QA  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0QA extends AbstractC05100Nh {
    public final String A00;
    public final String A01;

    public abstract String A0c();

    public abstract List A0d();

    public abstract List A0e();

    public abstract List A0f();

    public abstract List A0g();

    public abstract List A0h();

    public C0QA(String str, String str2, C05670Pr c05670Pr) {
        super(C000200d.A0J("alter_", str, "_to_", str2), EditorInfoCompat.IME_FLAG_FORCE_ASCII, c05670Pr);
        this.A00 = str;
        this.A01 = str2;
    }

    public static boolean A02(C05E c05e, String str, Map map) {
        boolean z;
        C0CD A03 = c05e.A03();
        try {
            c05e.A05();
            C05J c05j = c05e.A06;
            synchronized (c05j) {
                C0CE c0ce = c05j.A00;
                if (c0ce != null && c0ce.A00.isOpen()) {
                    C0CE c0ce2 = c05j.A00;
                    if (c0ce2 != null) {
                        String A06 = C05J.A06(c0ce2.A00, "table", str);
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (C002501g.A0P(A06, (String) entry.getKey(), (String) entry.getValue())) {
                                z = true;
                                break;
                            }
                        }
                        boolean z2 = !z;
                        A03.close();
                        return z2;
                    }
                }
                throw new IllegalStateException("databasehelper/doesAnyColumnExist/database is not initialized");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    @Override // X.AbstractC05100Nh
    public final String A0V() {
        return C000200d.A0L(new StringBuilder(), C000200d.A0J("alter_", this.A00, "_to_", this.A01), "_retry");
    }

    @Override // X.AbstractC05100Nh
    public final String A0W() {
        return C000200d.A0L(new StringBuilder(), C000200d.A0J("alter_", this.A00, "_to_", this.A01), "_index");
    }

    @Override // X.AbstractC05100Nh
    public void A0Z() {
        C05E c05e = this.A05;
        C0CD A04 = c05e.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            String str = this.A00;
            sb.append(str);
            sb.append(" RENAME TO ");
            sb.append(C000200d.A0L(new StringBuilder(), str, "_backup"));
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("RENAME_ORIGINAL_TABLE_NAME_TO_SWAP_TABLE_NAME_");
            String str2 = this.A0B;
            sb2.append(str2);
            sb2.toString();
            c0ce.A0C(obj);
            for (String str3 : A0h()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("EXEC_DROP_TRIGGER_STATEMENT_");
                sb3.append(str2);
                sb3.toString();
                c0ce.A0C(str3);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ALTER TABLE ");
            sb4.append(this.A01);
            sb4.append(" RENAME TO ");
            sb4.append(str);
            String obj2 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("RENAME_TEMP_TABLE_NAME_TO_ORIGINAL_TABLE_NAME_");
            sb5.append(str2);
            sb5.toString();
            c0ce.A0C(obj2);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("DROP TABLE ");
            sb6.append(C000200d.A0L(new StringBuilder(), str, "_backup"));
            String obj3 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("DROP_TABLE_WITH_SWAP_NAME_");
            sb7.append(str2);
            sb7.toString();
            c0ce.A0C(obj3);
            for (String str4 : A0d()) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("EXEC_AFTER_MIGRATION_STATEMENT_");
                sb8.append(str2);
                sb8.toString();
                c0ce.A0C(str4);
            }
            for (String str5 : A0g()) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("EXEC_DROP_INDEX_STATEMENT_");
                sb9.append(str2);
                sb9.toString();
                c0ce.A0C(str5);
            }
            c05e.A05();
            c05e.A05();
            C05J.A0D(c0ce, c05e.A06.A0P(A04));
            A00.A00();
            A00.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A04.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.AbstractC05100Nh
    public void A0a() {
        C05E c05e = this.A05;
        c05e.A05();
        if (!c05e.A06.A0R(this.A01)) {
            C0CD A04 = c05e.A04();
            try {
                C03790Hb A00 = A04.A00();
                C0CE c0ce = A04.A02;
                String A0c = A0c();
                StringBuilder sb = new StringBuilder();
                sb.append("CREATE_TEMPORARY_TABLE_FOR_");
                String str = this.A0B;
                sb.append(str);
                sb.toString();
                c0ce.A0C(A0c);
                for (String str2 : A0f()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CREATE_INDEX_STATEMENT_FOR_");
                    sb2.append(str);
                    sb2.toString();
                    c0ce.A0C(str2);
                }
                for (String str3 : A0e()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CREATE_TRIGGER_STATEMENT_FOR_");
                    sb3.append(str);
                    sb3.toString();
                    c0ce.A0C(str3);
                }
                A00.A00();
                A00.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                    try {
                        A04.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
