package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.05Q */
/* loaded from: classes.dex */
public class C05Q {
    public static volatile C05Q A0Z;
    public AnonymousClass012 A00;
    public final AbstractC000600i A01;
    public final C014806z A02;
    public final C05R A03;
    public final C06Z A04;
    public final C05A A05;
    public final C05M A06;
    public final C05D A07;
    public final AnonymousClass070 A08;
    public final AnonymousClass079 A09;
    public final AnonymousClass078 A0A;
    public final AnonymousClass073 A0B;
    public final C06W A0C;
    public final C013206j A0D;
    public final C012806f A0E;
    public final C05S A0F;
    public final C06J A0G;
    public final C012306a A0H;
    public final C012506c A0I;
    public final C05E A0J;
    public final C013106i A0K;
    public final C06X A0L;
    public final C07B A0M;
    public final C06R A0N;
    public final C014606x A0O;
    public final C013306k A0P;
    public final AnonymousClass074 A0Q;
    public final C012706e A0R;
    public final C06Y A0S;
    public final C014706y A0T;
    public final C012906g A0U;
    public final C06Q A0V;
    public final C06S A0W;
    public final C013006h A0X;
    public final Map A0Y;

    public C05Q(AnonymousClass012 anonymousClass012, C05A c05a, AbstractC000600i abstractC000600i, C05M c05m, C05R c05r, C05S c05s, C06Q c06q, C06R c06r, C06S c06s, C06W c06w, C06X c06x, C06Y c06y, C06Z c06z, C05D c05d, C012306a c012306a, C012406b c012406b, C05E c05e, C012706e c012706e, C014706y c014706y, C012906g c012906g, C012806f c012806f, C013006h c013006h, C014806z c014806z, AnonymousClass070 anonymousClass070, AnonymousClass073 anonymousClass073, C06J c06j, C013106i c013106i, C013206j c013206j, C013306k c013306k, AnonymousClass074 anonymousClass074, C014606x c014606x, AnonymousClass078 anonymousClass078, AnonymousClass079 anonymousClass079, C07B c07b) {
        this.A00 = anonymousClass012;
        this.A05 = c05a;
        this.A01 = abstractC000600i;
        this.A06 = c05m;
        this.A03 = c05r;
        this.A0F = c05s;
        this.A0V = c06q;
        this.A0N = c06r;
        this.A0W = c06s;
        this.A0C = c06w;
        this.A0L = c06x;
        this.A0S = c06y;
        this.A04 = c06z;
        this.A07 = c05d;
        this.A0H = c012306a;
        this.A0J = c05e;
        this.A0R = c012706e;
        this.A0T = c014706y;
        this.A0U = c012906g;
        this.A0E = c012806f;
        this.A0X = c013006h;
        this.A02 = c014806z;
        this.A08 = anonymousClass070;
        this.A0B = anonymousClass073;
        this.A0G = c06j;
        this.A0K = c013106i;
        this.A0D = c013206j;
        this.A0P = c013306k;
        this.A0Q = anonymousClass074;
        this.A0O = c014606x;
        this.A0A = anonymousClass078;
        this.A09 = anonymousClass079;
        this.A0M = c07b;
        this.A0I = c012406b.A01;
        this.A0Y = c012406b.A02;
    }

    public static C05Q A00() {
        if (A0Z == null) {
            synchronized (C05Q.class) {
                if (A0Z == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C05A A002 = C05A.A00();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    C05M A004 = C05M.A00();
                    C05R A005 = C05R.A00();
                    C05S A006 = C05S.A00();
                    C06Q A007 = C06Q.A00();
                    C06R A008 = C06R.A00();
                    C06S A009 = C06S.A00();
                    C06W A0010 = C06W.A00();
                    C06X A0011 = C06X.A00();
                    C06Y A0012 = C06Y.A00();
                    C06Z A0013 = C06Z.A00();
                    C05D A0014 = C05D.A00();
                    C012306a A0015 = C012306a.A00();
                    C012406b A0016 = C012406b.A00();
                    C05E A0017 = C05E.A00();
                    C012706e A0018 = C012706e.A00();
                    C014706y A0019 = C014706y.A00();
                    C012906g A01 = C012906g.A01();
                    C012806f A0020 = C012806f.A00();
                    C013006h A0021 = C013006h.A00();
                    C014806z A0022 = C014806z.A00();
                    AnonymousClass070 A012 = AnonymousClass070.A01();
                    AnonymousClass073 A0023 = AnonymousClass073.A00();
                    C06J A013 = C06J.A01();
                    C013106i A014 = C013106i.A01();
                    C013206j A0024 = C013206j.A00();
                    C013306k A07 = C013306k.A07();
                    AnonymousClass074 A0025 = AnonymousClass074.A00();
                    C014606x A0026 = C014606x.A00();
                    AnonymousClass078 A0027 = AnonymousClass078.A00();
                    AnonymousClass079 A0028 = AnonymousClass079.A00();
                    C06P.A00();
                    A0Z = new C05Q(A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A01, A0020, A0021, A0022, A012, A0023, A013, A014, A0024, A07, A0025, A0026, A0027, A0028, C07B.A00());
                }
            }
        }
        return A0Z;
    }

    public AnonymousClass092 A01(long j) {
        AbstractC005302j A08;
        long A04 = this.A00.A04();
        C0CD A03 = this.A0J.A03();
        Cursor A07 = A03.A02.A07(C0HD.A0j, new String[]{String.valueOf(j)});
        AnonymousClass092 A032 = (!A07.moveToLast() || (A08 = this.A05.A08(A07.getLong(A07.getColumnIndexOrThrow("chat_row_id")))) == null) ? null : A03(A07, A08);
        A07.close();
        A03.close();
        C000200d.A0e(this.A00, A04, this.A07, "CachedMessageStore/getMessage/rowId");
        return A032;
    }

    public AnonymousClass092 A02(Cursor cursor) {
        AbstractC005302j A09 = this.A05.A09(cursor);
        if (A09 == null) {
            return null;
        }
        return A04(cursor, A09, false, true);
    }

    public AnonymousClass092 A03(Cursor cursor, AbstractC005302j abstractC005302j) {
        return A04(cursor, abstractC005302j, false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1045:0x0754, code lost:
        if (r9 == null) goto L399;
     */
    /* JADX WARN: Removed duplicated region for block: B:995:0x0617 A[Catch: all -> 0x09dc, TryCatch #64 {all -> 0x09dc, blocks: (B:952:0x04e2, B:954:0x04e8, B:961:0x051d, B:992:0x0605, B:993:0x0608, B:995:0x0617, B:996:0x0625, B:998:0x062b, B:999:0x0632, B:1162:0x09a0, B:969:0x05be, B:981:0x05d3, B:983:0x05d9, B:989:0x05ff, B:1171:0x09c3, B:1000:0x063a, B:1002:0x063e, B:1003:0x0646, B:1005:0x064c, B:1007:0x0650, B:1163:0x09a4, B:1008:0x0657, B:1010:0x0660, B:1029:0x06b2, B:1030:0x06b8, B:1032:0x06bc, B:1033:0x06c6, B:1035:0x06ca, B:1036:0x06d4, B:1038:0x06d8, B:1063:0x0784, B:1064:0x0789, B:1066:0x078d, B:1067:0x0797, B:1069:0x079b, B:1070:0x07a5, B:1072:0x07a9, B:1073:0x07b3, B:1075:0x07b7, B:1076:0x07c1, B:1078:0x07c5, B:1081:0x07d5, B:1098:0x0815, B:1099:0x0818, B:1101:0x081c, B:1104:0x082c, B:1121:0x08e1, B:1122:0x08e4, B:1124:0x08e8, B:1126:0x08f9, B:1127:0x0903, B:1129:0x0907, B:1138:0x0932, B:1155:0x097c, B:1156:0x097f, B:1158:0x0983, B:1159:0x0993, B:1161:0x0997, B:1132:0x0917, B:1134:0x091b, B:1136:0x092d, B:1139:0x094d, B:1143:0x0968, B:1140:0x0955, B:1142:0x095b, B:1039:0x06f3, B:1051:0x076e, B:1040:0x06fd, B:1042:0x0703, B:1047:0x0757, B:1050:0x075e, B:1011:0x066d, B:1017:0x069e, B:1023:0x06aa, B:1105:0x0847, B:1109:0x08cd, B:1115:0x08d9, B:1082:0x07f0, B:1086:0x0801, B:1092:0x080d, B:955:0x04f0, B:960:0x051a, B:966:0x05a3, B:968:0x05bb, B:956:0x0502, B:958:0x0508, B:962:0x0522, B:965:0x052f, B:967:0x05a7, B:984:0x05df, B:988:0x05fc, B:1170:0x09c0, B:985:0x05f0, B:987:0x05f6, B:1169:0x09ac), top: B:1376:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:998:0x062b A[Catch: all -> 0x09dc, TryCatch #64 {all -> 0x09dc, blocks: (B:952:0x04e2, B:954:0x04e8, B:961:0x051d, B:992:0x0605, B:993:0x0608, B:995:0x0617, B:996:0x0625, B:998:0x062b, B:999:0x0632, B:1162:0x09a0, B:969:0x05be, B:981:0x05d3, B:983:0x05d9, B:989:0x05ff, B:1171:0x09c3, B:1000:0x063a, B:1002:0x063e, B:1003:0x0646, B:1005:0x064c, B:1007:0x0650, B:1163:0x09a4, B:1008:0x0657, B:1010:0x0660, B:1029:0x06b2, B:1030:0x06b8, B:1032:0x06bc, B:1033:0x06c6, B:1035:0x06ca, B:1036:0x06d4, B:1038:0x06d8, B:1063:0x0784, B:1064:0x0789, B:1066:0x078d, B:1067:0x0797, B:1069:0x079b, B:1070:0x07a5, B:1072:0x07a9, B:1073:0x07b3, B:1075:0x07b7, B:1076:0x07c1, B:1078:0x07c5, B:1081:0x07d5, B:1098:0x0815, B:1099:0x0818, B:1101:0x081c, B:1104:0x082c, B:1121:0x08e1, B:1122:0x08e4, B:1124:0x08e8, B:1126:0x08f9, B:1127:0x0903, B:1129:0x0907, B:1138:0x0932, B:1155:0x097c, B:1156:0x097f, B:1158:0x0983, B:1159:0x0993, B:1161:0x0997, B:1132:0x0917, B:1134:0x091b, B:1136:0x092d, B:1139:0x094d, B:1143:0x0968, B:1140:0x0955, B:1142:0x095b, B:1039:0x06f3, B:1051:0x076e, B:1040:0x06fd, B:1042:0x0703, B:1047:0x0757, B:1050:0x075e, B:1011:0x066d, B:1017:0x069e, B:1023:0x06aa, B:1105:0x0847, B:1109:0x08cd, B:1115:0x08d9, B:1082:0x07f0, B:1086:0x0801, B:1092:0x080d, B:955:0x04f0, B:960:0x051a, B:966:0x05a3, B:968:0x05bb, B:956:0x0502, B:958:0x0508, B:962:0x0522, B:965:0x052f, B:967:0x05a7, B:984:0x05df, B:988:0x05fc, B:1170:0x09c0, B:985:0x05f0, B:987:0x05f6, B:1169:0x09ac), top: B:1376:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:999:0x0632 A[Catch: all -> 0x09dc, TRY_LEAVE, TryCatch #64 {all -> 0x09dc, blocks: (B:952:0x04e2, B:954:0x04e8, B:961:0x051d, B:992:0x0605, B:993:0x0608, B:995:0x0617, B:996:0x0625, B:998:0x062b, B:999:0x0632, B:1162:0x09a0, B:969:0x05be, B:981:0x05d3, B:983:0x05d9, B:989:0x05ff, B:1171:0x09c3, B:1000:0x063a, B:1002:0x063e, B:1003:0x0646, B:1005:0x064c, B:1007:0x0650, B:1163:0x09a4, B:1008:0x0657, B:1010:0x0660, B:1029:0x06b2, B:1030:0x06b8, B:1032:0x06bc, B:1033:0x06c6, B:1035:0x06ca, B:1036:0x06d4, B:1038:0x06d8, B:1063:0x0784, B:1064:0x0789, B:1066:0x078d, B:1067:0x0797, B:1069:0x079b, B:1070:0x07a5, B:1072:0x07a9, B:1073:0x07b3, B:1075:0x07b7, B:1076:0x07c1, B:1078:0x07c5, B:1081:0x07d5, B:1098:0x0815, B:1099:0x0818, B:1101:0x081c, B:1104:0x082c, B:1121:0x08e1, B:1122:0x08e4, B:1124:0x08e8, B:1126:0x08f9, B:1127:0x0903, B:1129:0x0907, B:1138:0x0932, B:1155:0x097c, B:1156:0x097f, B:1158:0x0983, B:1159:0x0993, B:1161:0x0997, B:1132:0x0917, B:1134:0x091b, B:1136:0x092d, B:1139:0x094d, B:1143:0x0968, B:1140:0x0955, B:1142:0x095b, B:1039:0x06f3, B:1051:0x076e, B:1040:0x06fd, B:1042:0x0703, B:1047:0x0757, B:1050:0x075e, B:1011:0x066d, B:1017:0x069e, B:1023:0x06aa, B:1105:0x0847, B:1109:0x08cd, B:1115:0x08d9, B:1082:0x07f0, B:1086:0x0801, B:1092:0x080d, B:955:0x04f0, B:960:0x051a, B:966:0x05a3, B:968:0x05bb, B:956:0x0502, B:958:0x0508, B:962:0x0522, B:965:0x052f, B:967:0x05a7, B:984:0x05df, B:988:0x05fc, B:1170:0x09c0, B:985:0x05f0, B:987:0x05f6, B:1169:0x09ac), top: B:1376:0x04e2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.AnonymousClass092 A04(android.database.Cursor r29, X.AbstractC005302j r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 3090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05Q.A04(android.database.Cursor, X.02j, boolean, boolean):X.092");
    }

    public AnonymousClass092 A05(AnonymousClass094 anonymousClass094) {
        if (anonymousClass094 == null) {
            return null;
        }
        C0CD A03 = this.A0J.A03();
        try {
            AnonymousClass092 A06 = A06(anonymousClass094);
            if (A06 != null) {
                return A06;
            }
            long A04 = this.A00.A04();
            C0CE c0ce = A03.A02;
            String str = C0HD.A0i;
            String[] strArr = new String[3];
            C05A c05a = this.A05;
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (abstractC005302j != null) {
                strArr[0] = Long.toString(c05a.A05(abstractC005302j));
                strArr[1] = String.valueOf(anonymousClass094.A02 ? 1 : 0);
                strArr[2] = anonymousClass094.A01;
                Cursor A07 = c0ce.A07(str, strArr);
                if (A07 == null) {
                    Log.e("CachedMessageStore/getmessage no cursor!");
                } else {
                    if (A07.moveToLast()) {
                        A06 = A03(A07, abstractC005302j);
                    }
                    A07.close();
                }
                this.A07.A01("CachedMessageStore/getMessage/key", this.A00.A04() - A04);
                A03.close();
                return A06;
            }
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A03.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final AnonymousClass092 A06(AnonymousClass094 anonymousClass094) {
        AnonymousClass092 anonymousClass092;
        AnonymousClass092 anonymousClass0922;
        AnonymousClass092 anonymousClass0923;
        C012506c c012506c = this.A0I;
        synchronized (c012506c) {
            C06F c06f = c012506c.A01;
            anonymousClass092 = (AnonymousClass092) c06f.A04(anonymousClass094);
            if (anonymousClass092 == null) {
                Map map = c012506c.A02;
                WeakReference weakReference = (WeakReference) map.get(anonymousClass094);
                if (weakReference != null) {
                    anonymousClass092 = (AnonymousClass092) weakReference.get();
                    map.remove(anonymousClass094);
                    if (anonymousClass092 != null) {
                        c06f.A08(anonymousClass094, anonymousClass092);
                    }
                }
            }
        }
        if (anonymousClass092 == null) {
            C0IT A07 = this.A06.A07(anonymousClass094.A00);
            return (A07 == null || (anonymousClass0922 = A07.A0P) == null || !anonymousClass094.equals(anonymousClass0922.A0n) || (anonymousClass0923 = A07.A0P) == null) ? (AnonymousClass092) this.A0Y.get(anonymousClass094) : anonymousClass0923;
        }
        return anonymousClass092;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0021, code lost:
        if (r2 > (r0 == null ? -1 : r0.A0C)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
        if (r2 > (r0 == null ? -1 : r0.A0D)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0049, code lost:
        if (r2 > (r0 == null ? -1 : r0.A0A)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07(X.AnonymousClass092 r12) {
        /*
            r11 = this;
            X.094 r0 = r12.A0n
            X.02j r6 = r0.A00
            if (r6 == 0) goto L8b
            byte r7 = r12.A0m
            r10 = 0
            r0 = 8
            r4 = -1
            if (r7 == r0) goto L37
            boolean r0 = r12.A0j
            if (r0 != 0) goto L23
            long r2 = r12.A0p
            X.05M r0 = r11.A06
            X.0IT r0 = r0.A07(r6)
            if (r0 != 0) goto L88
            r0 = -1
        L1f:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L80
        L23:
            boolean r0 = r12.A0j
            if (r0 == 0) goto L37
            long r2 = r12.A0p
            X.05M r0 = r11.A06
            X.0IT r0 = r0.A07(r6)
            if (r0 != 0) goto L85
            r0 = -1
        L33:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L80
        L37:
            boolean r0 = r12.A0j
            if (r0 != 0) goto L4b
            long r2 = r12.A0p
            X.05M r9 = r11.A06
            X.0IT r0 = r9.A07(r6)
            if (r0 != 0) goto L82
            r0 = -1
        L47:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L5f
        L4b:
            boolean r0 = r12.A0j
            if (r0 == 0) goto L81
            long r1 = r12.A0p
            X.05M r9 = r11.A06
            X.0IT r0 = r9.A07(r6)
            if (r0 == 0) goto L5b
            long r4 = r0.A0B
        L5b:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L81
        L5f:
            X.0IT r0 = r9.A07(r6)
            if (r0 == 0) goto L80
            java.lang.String r2 = r0.A0Q
            if (r2 == 0) goto L80
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L81
        L80:
            r10 = 1
        L81:
            return r10
        L82:
            long r0 = r0.A0A
            goto L47
        L85:
            long r0 = r0.A0D
            goto L33
        L88:
            long r0 = r0.A0C
            goto L1f
        L8b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05Q.A07(X.092):boolean");
    }
}
