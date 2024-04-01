package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.06k */
/* loaded from: classes.dex */
public class C013306k {
    public static final String[] A09 = {"key_remote_jid", "key_from_me", "key_id", "id", "timestamp", "init_timestamp", "status", "error_code", "sender", "receiver", "type", "currency", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id"};
    public static final String[] A0A = {"message_row_id", "remote_jid_row_id", "key_id", "interop_id", "id", "timestamp", "init_timestamp", "status", "error_code", "sender_jid_row_id", "receiver_jid_row_id", "type", "currency_code", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id"};
    public static volatile C013306k A0B;
    public InterfaceC03570Gf A00;
    public final C02L A01;
    public final AnonymousClass012 A02;
    public final C05B A03;
    public final C05E A04;
    public final C05C A05;
    public final C013606n A06;
    public final C013406l A07;
    public final C014406v A08 = C014406v.A00("PaymentTransactionStore", "database", "COMMON");

    public C013306k(AnonymousClass012 anonymousClass012, C05B c05b, C02L c02l, C013406l c013406l, C05C c05c, C05E c05e, C013606n c013606n) {
        this.A02 = anonymousClass012;
        this.A03 = c05b;
        this.A01 = c02l;
        this.A07 = c013406l;
        this.A05 = c05c;
        this.A04 = c05e;
        this.A06 = c013606n;
    }

    public static Pair A00() {
        return new Pair("(type=? AND status=?)", new String[]{Integer.toString(8), Integer.toString(608)});
    }

    public static Pair A01() {
        String num = Integer.toString(12);
        return new Pair("((type=? AND status=?) OR (type=? AND (status=? OR status=?)))", new String[]{Integer.toString(20), num, Integer.toString(10), num, Integer.toString(19)});
    }

    public static final Pair A02() {
        return Pair.create(new String[]{"19", "12", "17", "608", String.valueOf(1), String.valueOf(2), "20", "10", String.valueOf(6), String.valueOf(7), String.valueOf(8)}, "((status!=?) AND (status!=?) AND (status!=?) AND (status!=?) AND (type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=?))");
    }

    public static Pair A03(Pair pair, Pair pair2, String str) {
        if (TextUtils.isEmpty((CharSequence) pair.first)) {
            return pair2;
        }
        if (TextUtils.isEmpty((CharSequence) pair2.first)) {
            return pair;
        }
        StringBuilder A0P = C000200d.A0P("(");
        C000200d.A1U(A0P, (String) pair.first, ") ", str, " (");
        String A0L = C000200d.A0L(A0P, (String) pair2.first, ")");
        Object obj = pair.second;
        int length = ((String[]) obj).length;
        String[] strArr = new String[((String[]) pair2.second).length + length];
        System.arraycopy(obj, 0, strArr, 0, length);
        Object obj2 = pair2.second;
        System.arraycopy(obj2, 0, strArr, ((String[]) pair.second).length, ((String[]) obj2).length);
        return new Pair(A0L, strArr);
    }

    public static final Pair A04(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (isEmpty2) {
            strArr = new String[]{str};
            str3 = "key_id=?";
        } else {
            strArr = new String[]{str, str2};
            str3 = "key_id=? OR id=?";
        }
        return new Pair(str3, strArr);
    }

    public static final Pair A05(boolean z) {
        return Pair.create(new String[]{"405", "106"}, z ? "(status=? OR status=?)" : "(status!=? AND status!=?)");
    }

    public static Pair A06(int[] iArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        int length = iArr.length;
        int length2 = iArr2.length;
        String[] strArr = new String[length + length2];
        for (int i = 0; i < length; i++) {
            sb.append("status=?");
            if (i != length - 1) {
                sb.append(" OR ");
            }
            strArr[i] = String.valueOf(iArr[i]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < length2; i2++) {
            sb2.append("type=?");
            if (i2 != length2 - 1) {
                sb2.append(" OR ");
            }
            strArr[length + i2] = String.valueOf(iArr2[i2]);
        }
        StringBuilder A0P = C000200d.A0P("((");
        A0P.append(sb.toString());
        A0P.append(") AND (");
        A0P.append(sb2.toString());
        A0P.append("))");
        return Pair.create(strArr, A0P.toString());
    }

    public static C013306k A07() {
        if (A0B == null) {
            synchronized (C013306k.class) {
                if (A0B == null) {
                    A0B = new C013306k(AnonymousClass012.A00(), C05B.A00(), C02L.A00(), C013406l.A00(), C05C.A00(), C05E.A00(), C013606n.A03());
                }
            }
        }
        return A0B;
    }

    public static final void A08(AnonymousClass093 anonymousClass093, ContentValues contentValues, C0CD c0cd) {
        c0cd.A02.A00("pay_transaction", contentValues, "id=?", new String[]{anonymousClass093.A0I});
    }

    public ContentValues A09(AnonymousClass093 anonymousClass093, AnonymousClass093 anonymousClass0932) {
        AbstractC005302j abstractC005302j;
        ArrayList arrayList;
        C0K8 c0k8;
        int i;
        if (anonymousClass093 != null && !anonymousClass093.A0T(anonymousClass0932)) {
            C014406v c014406v = this.A08;
            StringBuilder A0P = C000200d.A0P("writeTransactionToCValues skipping transaction with: ");
            C000200d.A1T(A0P, anonymousClass0932.A0I, " as status is not updated ", " old ts: ");
            A0P.append(anonymousClass093.A05);
            A0P.append(" counter: ");
            C0K8 c0k82 = anonymousClass093.A09;
            if (c0k82 != null) {
                i = c0k82.A05();
            } else {
                i = 0;
            }
            A0P.append(i);
            A0P.append(" new ts: ");
            A0P.append(anonymousClass0932.A05);
            A0P.append(" counter: ");
            C0K8 c0k83 = anonymousClass0932.A09;
            A0P.append(c0k83 != null ? c0k83.A05() : 0);
            c014406v.A07(null, A0P.toString(), null);
            return null;
        }
        ContentValues contentValues = new ContentValues();
        AbstractC005302j abstractC005302j2 = anonymousClass0932.A0A;
        if (abstractC005302j2 != null) {
            contentValues.put("key_remote_jid", abstractC005302j2.getRawString());
            contentValues.put("key_from_me", Integer.valueOf(anonymousClass0932.A0O ? 1 : 0));
        } else if (anonymousClass093 != null && (abstractC005302j = anonymousClass093.A0A) != null) {
            contentValues.put("key_remote_jid", abstractC005302j.getRawString());
            contentValues.put("key_from_me", Integer.valueOf(anonymousClass093.A0O ? 1 : 0));
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0J)) {
            contentValues.put("key_id", anonymousClass0932.A0J);
        }
        int i2 = anonymousClass0932.A02;
        if (i2 != 0) {
            contentValues.put("type", Integer.valueOf(i2));
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0I)) {
            contentValues.put("id", anonymousClass0932.A0I);
        }
        UserJid userJid = anonymousClass0932.A0C;
        if (userJid != null) {
            contentValues.put("sender", userJid.getRawString());
        }
        UserJid userJid2 = anonymousClass0932.A0B;
        if (userJid2 != null) {
            contentValues.put("receiver", userJid2.getRawString());
        }
        if (anonymousClass093 == null || (!TextUtils.isEmpty(anonymousClass0932.A0G) && !anonymousClass0932.A0G.equalsIgnoreCase(C013806p.A06.A9K()))) {
            contentValues.put("currency", anonymousClass0932.A0G);
        }
        C014006r c014006r = anonymousClass0932.A07;
        if (c014006r != null && c014006r.A02()) {
            contentValues.put("amount_1000", Long.valueOf(anonymousClass0932.A07.A00.scaleByPowerOfTen(3).longValue()));
        }
        long j = anonymousClass0932.A04;
        if (j > 0) {
            contentValues.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
        }
        int i3 = anonymousClass0932.A01;
        if (i3 != 0) {
            contentValues.put("status", Integer.valueOf(i3));
        } else if (anonymousClass093 != null) {
            contentValues.put("status", Integer.valueOf(anonymousClass093.A01));
        }
        long j2 = anonymousClass0932.A05;
        if (j2 > 0) {
            contentValues.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0F)) {
            contentValues.put("credential_id", anonymousClass0932.A0F);
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0H)) {
            contentValues.put("error_code", anonymousClass0932.A0H);
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0D)) {
            contentValues.put("bank_transaction_id", anonymousClass0932.A0D);
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0K)) {
            contentValues.put("request_key_id", anonymousClass0932.A0K);
        }
        ArrayList arrayList2 = anonymousClass0932.A0L;
        if (arrayList2 != null && arrayList2.size() > 0) {
            contentValues.put("methods", AnonymousClass093.A06(arrayList2));
        } else if (anonymousClass093 != null && (arrayList = anonymousClass093.A0L) != null) {
            contentValues.put("methods", AnonymousClass093.A06(arrayList));
        }
        if (anonymousClass093 != null && (c0k8 = anonymousClass093.A09) != null) {
            C0K8 c0k84 = anonymousClass0932.A09;
            if (c0k84 != null) {
                c0k8.A0L(c0k84);
                c0k8 = anonymousClass093.A09;
                c0k8.A0G(anonymousClass093.A01);
            }
            contentValues.put("metadata", c0k8.A0C());
        } else {
            C0K8 c0k85 = anonymousClass0932.A09;
            if (c0k85 != null) {
                contentValues.put("metadata", c0k85.A0C());
            }
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0E)) {
            contentValues.put("country", anonymousClass0932.A0E);
        }
        contentValues.put("version", Integer.valueOf(anonymousClass0932.A03));
        byte[] bArr = anonymousClass0932.A0P;
        if (bArr != null) {
            contentValues.put("future_data", bArr);
        }
        contentValues.put("service_id", Integer.valueOf(anonymousClass0932.A00));
        return contentValues;
    }

    public ContentValues A0A(AnonymousClass093 anonymousClass093, AnonymousClass093 anonymousClass0932) {
        AbstractC005302j abstractC005302j;
        ArrayList arrayList;
        C0K8 c0k8;
        int i;
        if (anonymousClass093 != null && !anonymousClass093.A0T(anonymousClass0932)) {
            C014406v c014406v = this.A08;
            StringBuilder A0P = C000200d.A0P("writeTransactionToCValuesV2 skipping transaction with: ");
            C000200d.A1T(A0P, anonymousClass0932.A0I, " as status is not updated ", " old ts: ");
            A0P.append(anonymousClass093.A05);
            A0P.append(" counter: ");
            C0K8 c0k82 = anonymousClass093.A09;
            if (c0k82 != null) {
                i = c0k82.A05();
            } else {
                i = 0;
            }
            A0P.append(i);
            A0P.append(" new ts: ");
            A0P.append(anonymousClass0932.A05);
            A0P.append(" counter: ");
            C0K8 c0k83 = anonymousClass0932.A09;
            A0P.append(c0k83 != null ? c0k83.A05() : 0);
            c014406v.A07(null, A0P.toString(), null);
            return null;
        }
        ContentValues contentValues = new ContentValues();
        AbstractC005302j abstractC005302j2 = anonymousClass0932.A0A;
        if (abstractC005302j2 != null) {
            long A02 = this.A03.A02(abstractC005302j2);
            if (A02 != -1) {
                contentValues.put("remote_jid_row_id", Long.valueOf(A02));
            }
        } else if (anonymousClass093 != null && (abstractC005302j = anonymousClass093.A0A) != null) {
            long A022 = this.A03.A02(abstractC005302j);
            if (A022 != -1) {
                contentValues.put("remote_jid_row_id", Long.valueOf(A022));
            }
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0J)) {
            contentValues.put("key_id", anonymousClass0932.A0J);
        }
        int i2 = anonymousClass0932.A02;
        if (i2 != 0) {
            contentValues.put("type", Integer.valueOf(i2));
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0I)) {
            contentValues.put("id", anonymousClass0932.A0I);
        }
        UserJid userJid = anonymousClass0932.A0C;
        if (userJid != null) {
            contentValues.put("sender_jid_row_id", Long.valueOf(this.A03.A02(userJid)));
        }
        UserJid userJid2 = anonymousClass0932.A0B;
        if (userJid2 != null) {
            contentValues.put("receiver_jid_row_id", Long.valueOf(this.A03.A02(userJid2)));
        }
        if (anonymousClass093 == null || (!TextUtils.isEmpty(anonymousClass0932.A0G) && !anonymousClass0932.A0G.equalsIgnoreCase(C013806p.A06.A9K()))) {
            contentValues.put("currency_code", anonymousClass0932.A0G);
        }
        C014006r c014006r = anonymousClass0932.A07;
        if (c014006r != null && c014006r.A02()) {
            contentValues.put("amount_1000", Long.valueOf(anonymousClass0932.A07.A00.scaleByPowerOfTen(3).longValue()));
        }
        long j = anonymousClass0932.A04;
        if (j > 0) {
            contentValues.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
        }
        int i3 = anonymousClass0932.A01;
        if (i3 != 0) {
            contentValues.put("status", Integer.valueOf(i3));
        } else if (anonymousClass093 != null) {
            contentValues.put("status", Integer.valueOf(anonymousClass093.A01));
        }
        long j2 = anonymousClass0932.A05;
        if (j2 > 0) {
            contentValues.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0F)) {
            contentValues.put("credential_id", anonymousClass0932.A0F);
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0H)) {
            contentValues.put("error_code", anonymousClass0932.A0H);
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0D)) {
            contentValues.put("bank_transaction_id", anonymousClass0932.A0D);
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0K)) {
            contentValues.put("request_key_id", anonymousClass0932.A0K);
        }
        ArrayList arrayList2 = anonymousClass0932.A0L;
        if (arrayList2 != null && arrayList2.size() > 0) {
            contentValues.put("methods", AnonymousClass093.A06(arrayList2));
        } else if (anonymousClass093 != null && (arrayList = anonymousClass093.A0L) != null) {
            contentValues.put("methods", AnonymousClass093.A06(arrayList));
        }
        if (anonymousClass093 != null && (c0k8 = anonymousClass093.A09) != null) {
            C0K8 c0k84 = anonymousClass0932.A09;
            if (c0k84 != null) {
                c0k8.A0L(c0k84);
            }
            contentValues.put("metadata", anonymousClass093.A09.A0C());
        } else {
            C0K8 c0k85 = anonymousClass0932.A09;
            if (c0k85 != null) {
                contentValues.put("metadata", c0k85.A0C());
            }
        }
        if (!TextUtils.isEmpty(anonymousClass0932.A0E)) {
            contentValues.put("country", anonymousClass0932.A0E);
        }
        contentValues.put("version", Integer.valueOf(anonymousClass0932.A03));
        byte[] bArr = anonymousClass0932.A0P;
        if (bArr != null) {
            contentValues.put("future_data", bArr);
        }
        contentValues.put("service_id", Integer.valueOf(anonymousClass0932.A00));
        return contentValues;
    }

    public Pair A0B(int i) {
        String str;
        if (i != 0) {
            if (i == 1) {
                str = "( sender=? OR receiver=? )";
            } else if (i == 2) {
                str = "( sender=? )";
            } else if (i != 3) {
                throw new IllegalArgumentException("Inappropriate selection target for sender receiver selection");
            } else {
                str = "( receiver=? )";
            }
            C02L c02l = this.A01;
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 != null) {
                Jid jid = c0k1.A09;
                if (jid != null) {
                    String rawString = jid.getRawString();
                    return new Pair(i == 1 ? new String[]{rawString, rawString} : new String[]{rawString}, str);
                }
                throw null;
            }
            throw null;
        }
        return new Pair(new String[0], null);
    }

    public Pair A0C(int i) {
        Pair A0B2;
        Pair A03 = A03(new Pair("(type=? AND status=?)", new String[]{Integer.toString(8), Integer.toString(602)}), A00(), "OR");
        if (i == 2) {
            A0B2 = A0E(0);
        } else {
            A0B2 = A0B(0);
        }
        return A03(A03, new Pair(A0B2.second, A0B2.first), "AND");
    }

    public Pair A0D(int i) {
        Pair A0B2;
        Pair A01 = A01();
        if (i == 2) {
            A0B2 = A0E(0);
        } else {
            A0B2 = A0B(0);
        }
        return A03(A01, new Pair(A0B2.second, A0B2.first), "AND");
    }

    public final Pair A0E(int i) {
        String str;
        if (i != 0) {
            if (i == 1) {
                str = "( sender_jid_row_id=? OR receiver_jid_row_id=? )";
            } else if (i == 2) {
                str = "( sender_jid_row_id=? )";
            } else if (i != 3) {
                throw new IllegalArgumentException("Inappropriate selection target for sender receiver selection");
            } else {
                str = "( receiver_jid_row_id=? )";
            }
            C02L c02l = this.A01;
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 != null) {
                Jid jid = c0k1.A09;
                if (jid != null) {
                    String l = Long.toString(this.A03.A02(jid));
                    return new Pair(i == 1 ? new String[]{l, l} : new String[]{l}, str);
                }
                throw null;
            }
            throw null;
        }
        return new Pair(new String[0], null);
    }

    public final Pair A0F(int i) {
        Pair A0B2;
        Pair A0B3;
        if (i == 2) {
            A0B2 = A0E(1);
        } else {
            A0B2 = A0B(1);
        }
        StringBuilder A0P = C000200d.A0P("( type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND ");
        C000200d.A1U(A0P, (String) A0B2.second, ") OR (", "type", "=? AND ");
        C000200d.A1U(A0P, "status", "!=? AND ", "status", "!=?) OR (");
        C000200d.A1U(A0P, "type", "=? AND ", "status", "!=? AND ");
        String A0N = C000200d.A0N(A0P, "status", "!=? AND ", "status", "!=?))");
        if (i == 2) {
            A0B3 = A0E(0);
        } else {
            A0B3 = A0B(0);
        }
        String[] strArr = (String[]) A0B3.first;
        Object obj = A0B3.second;
        if (obj != null) {
            StringBuilder A0V = C000200d.A0V(A0N, " AND ");
            A0V.append((String) obj);
            A0N = A0V.toString();
        }
        int i2 = !TextUtils.isEmpty(null) ? 1 : 0;
        if (i2 != 0) {
            A0N = C000200d.A0H(A0N, " AND credential_id=?");
        }
        int length = strArr.length;
        String[] strArr2 = new String[i2 + 17 + length];
        int i3 = 0;
        strArr2[0] = Integer.toString(1);
        strArr2[1] = Integer.toString(2);
        strArr2[2] = Integer.toString(100);
        strArr2[3] = Integer.toString(200);
        strArr2[4] = Integer.toString(6);
        strArr2[5] = Integer.toString(7);
        strArr2[6] = Integer.toString(8);
        strArr2[7] = Integer.toString(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        String[] strArr3 = (String[]) A0B2.first;
        strArr2[8] = strArr3[0];
        strArr2[9] = strArr3[1];
        strArr2[10] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr2[11] = num;
        int i4 = 17;
        String num2 = Integer.toString(17);
        strArr2[12] = num2;
        strArr2[13] = Integer.toString(10);
        strArr2[14] = num;
        strArr2[15] = Integer.toString(19);
        strArr2[16] = num2;
        while (i3 < length) {
            strArr2[i4] = strArr[i3];
            i3++;
            i4++;
        }
        if (i2 != 0) {
            strArr2[i4] = null;
        }
        return new Pair(A0N, strArr2);
    }

    public final Pair A0G(int i, AbstractC005302j abstractC005302j) {
        String str;
        Pair A0F = A0F(i);
        Pair A0D = A0D(i);
        String[] strArr = new String[((String[]) A0F.second).length + 1 + ((String[]) A0D.second).length];
        if (i == 1) {
            strArr[0] = abstractC005302j.getRawString();
            str = "key_remote_jid=?";
        } else {
            long A02 = this.A03.A02(abstractC005302j);
            if (A02 != -1) {
                strArr[0] = String.valueOf(A02);
                str = "remote_jid_row_id=?";
            } else {
                C014406v c014406v = this.A08;
                StringBuilder A0P = C000200d.A0P("getPendingRequestsAndTransactionsQueryAndParams/no row id for jid/jid=");
                A0P.append(abstractC005302j.getRawString());
                c014406v.A04(A0P.toString());
                return null;
            }
        }
        StringBuilder A0W = C000200d.A0W("(", str, " AND (");
        A0W.append((String) A0F.first);
        A0W.append(" OR ");
        String A0L = C000200d.A0L(A0W, (String) A0D.first, "))");
        Object obj = A0F.second;
        System.arraycopy(obj, 0, strArr, 1, ((String[]) obj).length);
        Object obj2 = A0D.second;
        System.arraycopy(obj2, 0, strArr, ((String[]) A0F.second).length + 1, ((String[]) obj2).length);
        return new Pair(A0L, strArr);
    }

    public final Pair A0H(C28021Ps c28021Ps) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C28031Pt c28031Pt = c28021Ps.A00;
        if (c28031Pt != null) {
            Collections.addAll(arrayList, c28031Pt.A01);
            arrayList2.add(c28021Ps.A00.A00);
        } else if (c28021Ps.A03) {
            Pair A02 = A02();
            Collections.addAll(arrayList, (Object[]) A02.first);
            arrayList2.add(A02.second);
        }
        C02L c02l = this.A01;
        c02l.A05();
        C0K1 c0k1 = c02l.A01;
        if (c0k1 != null) {
            Jid jid = c0k1.A09;
            if (jid != null) {
                String rawString = jid.getRawString();
                if (c28021Ps.A06) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(1));
                    arrayList.add(Integer.toString(10));
                } else if (c28021Ps.A05) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(2));
                    arrayList.add(Integer.toString(20));
                }
                arrayList2.add("( sender=? OR receiver=?)");
                arrayList.add(rawString);
                arrayList.add(rawString);
                if (c28021Ps.A01) {
                    Pair A05 = A05(true);
                    Collections.addAll(arrayList, (Object[]) A05.first);
                    arrayList2.add(A05.second);
                } else if (c28021Ps.A02) {
                    Pair A052 = A05(false);
                    Collections.addAll(arrayList, (Object[]) A052.first);
                    arrayList2.add(A052.second);
                }
                StringBuilder A0P = C000200d.A0P("(");
                A0P.append(TextUtils.join(" AND ", arrayList2));
                A0P.append(")");
                return Pair.create(arrayList.toArray(new String[0]), A0P.toString());
            }
            throw null;
        }
        throw null;
    }

    public final Pair A0I(C28021Ps c28021Ps) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C28031Pt c28031Pt = c28021Ps.A00;
        if (c28031Pt != null) {
            Collections.addAll(arrayList, c28031Pt.A01);
            arrayList2.add(c28021Ps.A00.A00);
        } else if (c28021Ps.A03) {
            Pair A02 = A02();
            Collections.addAll(arrayList, (Object[]) A02.first);
            arrayList2.add(A02.second);
        }
        C02L c02l = this.A01;
        c02l.A05();
        C0K1 c0k1 = c02l.A01;
        if (c0k1 != null) {
            Jid jid = c0k1.A09;
            if (jid != null) {
                String l = Long.toString(this.A03.A02(jid));
                if (c28021Ps.A06) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(1));
                    arrayList.add(Integer.toString(10));
                } else if (c28021Ps.A05) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(2));
                    arrayList.add(Integer.toString(20));
                }
                arrayList2.add("( receiver_jid_row_id=? OR sender_jid_row_id=? OR (service_id=? AND (type=? OR type=? OR type=?)))");
                arrayList.add(l);
                arrayList.add(l);
                arrayList.add("3");
                arrayList.add("6");
                arrayList.add("7");
                arrayList.add("8");
                if (c28021Ps.A01) {
                    Pair A05 = A05(true);
                    Collections.addAll(arrayList, (Object[]) A05.first);
                    arrayList2.add(A05.second);
                } else if (c28021Ps.A02) {
                    Pair A052 = A05(false);
                    Collections.addAll(arrayList, (Object[]) A052.first);
                    arrayList2.add(A052.second);
                }
                StringBuilder A0P = C000200d.A0P("(");
                A0P.append(TextUtils.join(" AND ", arrayList2));
                A0P.append(")");
                return Pair.create(arrayList.toArray(new String[0]), A0P.toString());
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a7, code lost:
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ce, code lost:
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0043, code lost:
        if (r6 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass093 A0J(long r11, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013306k.A0J(long, java.lang.String, java.lang.String):X.093");
    }

    public final AnonymousClass093 A0K(Cursor cursor) {
        if (A0h()) {
            return A0M(cursor);
        }
        return A0L(cursor);
    }

    public final AnonymousClass093 A0L(Cursor cursor) {
        AnonymousClass093 A03;
        int i;
        C0DX paymentService;
        InterfaceC03570Gf interfaceC03570Gf;
        AbstractC005302j A02 = AbstractC005302j.A02(cursor.getString(cursor.getColumnIndex("key_remote_jid")));
        String string = cursor.getString(cursor.getColumnIndex("key_id"));
        boolean z = cursor.getInt(cursor.getColumnIndex("key_from_me")) == 1;
        String string2 = cursor.getString(cursor.getColumnIndex("id"));
        long j = cursor.getInt(cursor.getColumnIndex("init_timestamp")) * 1000;
        long j2 = cursor.getInt(cursor.getColumnIndex("timestamp")) * 1000;
        int i2 = cursor.getInt(cursor.getColumnIndex("status"));
        UserJid nullable = UserJid.getNullable(cursor.getString(cursor.getColumnIndex("sender")));
        UserJid nullable2 = UserJid.getNullable(cursor.getString(cursor.getColumnIndex("receiver")));
        int i3 = cursor.getInt(cursor.getColumnIndex("type"));
        String string3 = cursor.getString(cursor.getColumnIndex("currency"));
        long j3 = cursor.getLong(cursor.getColumnIndex("amount_1000"));
        String string4 = cursor.getString(cursor.getColumnIndex("credential_id"));
        String string5 = cursor.getString(cursor.getColumnIndex("error_code"));
        String string6 = cursor.getString(cursor.getColumnIndex("bank_transaction_id"));
        String string7 = cursor.getString(cursor.getColumnIndex("methods"));
        String string8 = cursor.getString(cursor.getColumnIndex("metadata"));
        String string9 = cursor.getString(cursor.getColumnIndex("request_key_id"));
        String string10 = cursor.getString(cursor.getColumnIndex("country"));
        if (TextUtils.isEmpty(string10)) {
            string10 = AnonymousClass093.A0Q;
        }
        int i4 = cursor.getInt(cursor.getColumnIndex("version"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("future_data"));
        int i5 = cursor.getInt(cursor.getColumnIndex("service_id"));
        C014406v c014406v = this.A08;
        StringBuilder sb = new StringBuilder("readTransactionInfoByTransId got from db: id: ");
        sb.append(string2);
        sb.append(" timestamp: ");
        sb.append(j2);
        sb.append(" type: ");
        sb.append(i3);
        sb.append(" status: ");
        sb.append(i2);
        sb.append(" description: ");
        sb.append(" peer: ");
        sb.append(nullable2);
        c014406v.A03(sb.toString());
        if (i3 == 5 && TextUtils.isEmpty(string3)) {
            A03 = AnonymousClass093.A04(j, string10, i4, blob);
        } else {
            BigDecimal scaleByPowerOfTen = new BigDecimal(j3).scaleByPowerOfTen(-3);
            InterfaceC013706o A01 = C013606n.A01(string3);
            if (i3 != 4) {
                A03 = new AnonymousClass093(i3, nullable, nullable2, string3, new C014006r(scaleByPowerOfTen, A01.A9i()), A01, j, string2, i2, j2, string4, string5, string6, null, string10, i4, i5);
                A03.A0P = blob;
                A03.A0M = false;
                A03.A06 = A01;
            } else {
                A03 = AnonymousClass093.A03(j);
            }
        }
        A03.A0A = A02;
        if (A02 == null) {
            A03.A0N = true;
        }
        A03.A0O = z;
        if (!TextUtils.isEmpty(string)) {
            A03.A0J = string;
        }
        if (!TextUtils.isEmpty(string9)) {
            A03.A0K = string9;
        }
        if (!TextUtils.isEmpty(string7)) {
            A03.A0H(AnonymousClass093.A07(string7, A03.A0B()));
        }
        if (!TextUtils.isEmpty(string8) && (interfaceC03570Gf = this.A00) != null) {
            C0DX paymentService2 = interfaceC03570Gf.getPaymentService(string10, string3);
            if (paymentService2 != null) {
                A03.A09 = paymentService2.AEp();
            }
            C0K8 c0k8 = A03.A09;
            if (c0k8 != null) {
                c0k8.A04(string8);
                if (A03.A0N()) {
                    long A07 = A03.A09.A07();
                    if (A07 > 0 && A07 < this.A02.A05()) {
                        A03.A01 = A03.A02 == 8 ? 607 : 16;
                    }
                }
            }
        }
        if (A03.A00 == 0) {
            InterfaceC03570Gf interfaceC03570Gf2 = this.A00;
            if (interfaceC03570Gf2 != null && (paymentService = interfaceC03570Gf2.getPaymentService(A03.A0E, A03.A0G)) != null) {
                i = paymentService.AD6();
            } else {
                i = 0;
            }
            A03.A00 = i;
        }
        StringBuilder sb2 = new StringBuilder("readTransactionFromCursor: ");
        sb2.append(A03);
        sb2.append(" countryData: ");
        sb2.append(A03.A09);
        c014406v.A05(sb2.toString());
        return A03;
    }

    public final AnonymousClass093 A0M(Cursor cursor) {
        AnonymousClass093 A03;
        int i;
        C0DX paymentService;
        InterfaceC03570Gf interfaceC03570Gf;
        C05B c05b = this.A03;
        AbstractC005302j A00 = AbstractC005302j.A00(c05b.A04(cursor.getLong(cursor.getColumnIndex("remote_jid_row_id"))));
        String string = cursor.getString(cursor.getColumnIndex("key_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("id"));
        long j = cursor.getInt(cursor.getColumnIndex("init_timestamp")) * 1000;
        long j2 = cursor.getInt(cursor.getColumnIndex("timestamp")) * 1000;
        int i2 = cursor.getInt(cursor.getColumnIndex("status"));
        UserJid of = UserJid.of(c05b.A04(cursor.getLong(cursor.getColumnIndex("sender_jid_row_id"))));
        UserJid of2 = UserJid.of(c05b.A04(cursor.getLong(cursor.getColumnIndex("receiver_jid_row_id"))));
        int i3 = cursor.getInt(cursor.getColumnIndex("type"));
        String string3 = cursor.getString(cursor.getColumnIndex("currency_code"));
        long j3 = cursor.getLong(cursor.getColumnIndex("amount_1000"));
        String string4 = cursor.getString(cursor.getColumnIndex("credential_id"));
        String string5 = cursor.getString(cursor.getColumnIndex("error_code"));
        String string6 = cursor.getString(cursor.getColumnIndex("bank_transaction_id"));
        String string7 = cursor.getString(cursor.getColumnIndex("methods"));
        String string8 = cursor.getString(cursor.getColumnIndex("metadata"));
        String string9 = cursor.getString(cursor.getColumnIndex("request_key_id"));
        String string10 = cursor.getString(cursor.getColumnIndex("country"));
        if (TextUtils.isEmpty(string10)) {
            string10 = AnonymousClass093.A0Q;
        }
        int i4 = cursor.getInt(cursor.getColumnIndex("version"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("future_data"));
        int i5 = cursor.getInt(cursor.getColumnIndex("service_id"));
        C02L c02l = this.A01;
        boolean z = (c02l.A0A(of2) && (i3 == 20 || i3 == 40 || i3 == 10 || i3 == 30)) || (c02l.A0A(of) && (i3 == 2 || i3 == 200 || i3 == 1 || i3 == 100 || i3 == 3 || i3 == 6));
        String string11 = cursor.getString(cursor.getColumnIndex("interop_id"));
        C014406v c014406v = this.A08;
        StringBuilder sb = new StringBuilder();
        sb.append("readTransactionInfoByTransId got from db: id: ");
        sb.append(string2);
        sb.append(" timestamp: ");
        sb.append(j2);
        sb.append(" service_id: ");
        sb.append(i5);
        sb.append(" type: ");
        sb.append(i3);
        sb.append(" status: ");
        sb.append(i2);
        sb.append(" description: ");
        sb.append(" peer: ");
        sb.append(of2);
        c014406v.A03(sb.toString());
        if (i3 == 5 && TextUtils.isEmpty(string3)) {
            A03 = AnonymousClass093.A04(j, string10, i4, blob);
        } else {
            BigDecimal scaleByPowerOfTen = new BigDecimal(j3).scaleByPowerOfTen(-3);
            InterfaceC013706o A01 = C013606n.A01(string3);
            if (i3 != 4) {
                A03 = new AnonymousClass093(i3, of, of2, string3, new C014006r(scaleByPowerOfTen, A01.A9i()), A01, j, string2, i2, j2, string4, string5, string6, null, string10, i4, i5);
                A03.A0P = blob;
                A03.A0M = false;
                A03.A06 = A01;
            } else {
                A03 = AnonymousClass093.A03(j);
            }
        }
        A03.A0A = A00;
        A03.A0O = z;
        if (!TextUtils.isEmpty(string)) {
            A03.A0J = string;
        } else if (!TextUtils.isEmpty(string11)) {
            A03.A0J = string11;
        }
        if (!TextUtils.isEmpty(string9)) {
            A03.A0K = string9;
        }
        if (!TextUtils.isEmpty(string7)) {
            A03.A0H(AnonymousClass093.A07(string7, A03.A0B()));
        }
        if (!TextUtils.isEmpty(string11)) {
            A03.A0N = true;
        }
        if (!TextUtils.isEmpty(string8) && (interfaceC03570Gf = this.A00) != null) {
            C0DX paymentService2 = interfaceC03570Gf.getPaymentService(string10, string3);
            if (paymentService2 != null) {
                A03.A09 = paymentService2.AEp();
            }
            C0K8 c0k8 = A03.A09;
            if (c0k8 != null) {
                c0k8.A04(string8);
                if (A03.A0N()) {
                    long A07 = A03.A09.A07();
                    if (A07 > 0 && A07 < this.A02.A05()) {
                        A03.A01 = A03.A02 == 8 ? 607 : 16;
                    }
                }
            }
        }
        if (A03.A00 == 0) {
            InterfaceC03570Gf interfaceC03570Gf2 = this.A00;
            if (interfaceC03570Gf2 != null && (paymentService = interfaceC03570Gf2.getPaymentService(A03.A0E, A03.A0G)) != null) {
                i = paymentService.AD6();
            } else {
                i = 0;
            }
            A03.A00 = i;
        }
        StringBuilder sb2 = new StringBuilder("readTransactionFromCursor: ");
        sb2.append(A03);
        sb2.append(" countryData: ");
        sb2.append(A03.A09);
        c014406v.A05(sb2.toString());
        return A03;
    }

    public AnonymousClass093 A0N(String str) {
        AnonymousClass093 A0K;
        String[] strArr = {str};
        String str2 = A0h() ? "readTransactionInfoByRequestMessageId/QUERY_PAY_TRANSACTION" : "readTransactionInfoByRequestMessageId/QUERY_PAY_TRANSACTIONS_DEPRECATED";
        C0CD A03 = this.A04.A03();
        try {
            Cursor A092 = A03.A02.A09(A0h() ? "pay_transaction" : "pay_transactions", A0h() ? A0A : A09, "request_key_id=?", strArr, null, str2);
            if (A092.moveToLast()) {
                try {
                    A0K = A0K(A092);
                } catch (C011305p e) {
                    this.A08.A08("PaymentTransactionStore/readTransactionInfoByRequestMessageId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID", e);
                    A092.close();
                    A03.close();
                    return null;
                }
            } else {
                A0K = null;
            }
            A092.close();
            A03.close();
            C014406v c014406v = this.A08;
            StringBuilder A0W = C000200d.A0W("readTransactionInfoByRequestMessageId/", str, "/");
            A0W.append(A0K != null);
            c014406v.A07(null, A0W.toString(), null);
            return A0K;
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass093 A0O(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r7 = "id=?"
            r3 = 1
            java.lang.String[] r8 = new java.lang.String[r3]
            r0 = 0
            r8[r0] = r12
            boolean r0 = r11.A0h()
            if (r0 == 0) goto L17
            java.lang.String r10 = "readTransactionInfoByTransId/QUERY_PAY_TRANSACTION"
        L10:
            X.05E r0 = r11.A04
            X.0CD r1 = r0.A03()
            goto L1a
        L17:
            java.lang.String r10 = "readTransactionInfoByTransId/QUERY_PAY_TRANSACTIONS_DEPRECATED"
            goto L10
        L1a:
            X.0CE r4 = r1.A02     // Catch: java.lang.Throwable -> L73
            boolean r0 = r11.A0h()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L35
            java.lang.String r5 = "pay_transaction"
        L24:
            boolean r0 = r11.A0h()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L32
            java.lang.String[] r6 = X.C013306k.A0A     // Catch: java.lang.Throwable -> L73
        L2c:
            r9 = 0
            android.database.Cursor r5 = r4.A09(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L73
            goto L38
        L32:
            java.lang.String[] r6 = X.C013306k.A09     // Catch: java.lang.Throwable -> L73
            goto L2c
        L35:
            java.lang.String r5 = "pay_transactions"
            goto L24
        L38:
            boolean r0 = r5.moveToLast()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L4b
            X.093 r4 = r11.A0K(r5)     // Catch: X.C011305p -> L43 java.lang.Throwable -> L6a
            goto L4c
        L43:
            r4 = move-exception
            X.06v r2 = r11.A08     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "PaymentTransactionStore/readTransactionInfoByTransId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID"
            r2.A08(r0, r4)     // Catch: java.lang.Throwable -> L6a
        L4b:
            r4 = r9
        L4c:
            r5.close()     // Catch: java.lang.Throwable -> L73
            r1.close()
            X.06v r2 = r11.A08
            java.lang.String r1 = "readTransactionInfoByTransId/"
            java.lang.String r0 = "/"
            java.lang.StringBuilder r0 = X.C000200d.A0W(r1, r12, r0)
            if (r4 != 0) goto L5f
            r3 = 0
        L5f:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.A07(r9, r0, r9)
            return r4
        L6a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            if (r5 == 0) goto L72
            r5.close()     // Catch: java.lang.Throwable -> L72
        L72:
            throw r0     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L79
        L79:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013306k.A0O(java.lang.String):X.093");
    }

    public AnonymousClass093 A0P(String str, String str2) {
        if (A0h()) {
            return A0J(-1L, str, str2);
        }
        return A0Q(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x006a, code lost:
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass093 A0Q(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            android.util.Pair r0 = A04(r10, r11)
            r7 = 0
            if (r0 != 0) goto L15
            X.06v r2 = r9.A08
            java.lang.String r1 = "getMessagePaymentInfoFromV1 got null query and params for message id: "
            java.lang.String r0 = " trans id: "
            java.lang.String r0 = X.C000200d.A0J(r1, r10, r0, r11)
            r2.A07(r7, r0, r7)
            return r7
        L15:
            java.lang.Object r5 = r0.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.second
            java.lang.String[] r6 = (java.lang.String[]) r6
            X.05E r0 = r9.A04
            X.0CD r1 = r0.A03()
            X.0CE r2 = r1.A02     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = "pay_transactions"
            java.lang.String[] r4 = X.C013306k.A09     // Catch: java.lang.Throwable -> Lad
            java.lang.String r8 = "getMessagePaymentInfoFromV1/QUERY_PAY_TRANSACTIONS_DEPRECATED"
            android.database.Cursor r4 = r2.A09(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r4.moveToLast()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L49
            X.093 r3 = r9.A0L(r4)     // Catch: X.C011305p -> L3a java.lang.Throwable -> La4
            goto L4a
        L3a:
            r3 = move-exception
            X.06v r2 = r9.A08     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "PaymentTransactionStore/getMessagePaymentInfoFromV1/InvalidJidException - Cannot get PaymentInfo from a message with invalid JID"
            r2.A08(r0, r3)     // Catch: java.lang.Throwable -> La4
            r4.close()     // Catch: java.lang.Throwable -> Lad
            r1.close()
            return r7
        L49:
            r3 = r7
        L4a:
            r4.close()     // Catch: java.lang.Throwable -> Lad
            r1.close()
            if (r3 == 0) goto L56
            X.0K8 r2 = r3.A09
            if (r2 != 0) goto L6c
        L56:
            X.0Gf r2 = r9.A00
            if (r2 == 0) goto L77
            if (r3 == 0) goto L9f
            java.lang.String r1 = r3.A0E
            java.lang.String r0 = r3.A0G
            X.0DX r0 = r2.getPaymentService(r1, r0)
        L64:
            if (r0 == 0) goto L77
            X.0K8 r2 = r0.AEp()
            if (r2 == 0) goto L77
        L6c:
            java.lang.String r1 = r2.A09()
            if (r1 == 0) goto L77
            X.06l r0 = r9.A07
            r0.A0F(r1, r2)
        L77:
            X.06v r2 = r9.A08
            java.lang.String r0 = "PaymentTransactionStore/getMessagePaymentInfoFromV1/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " country data: "
            r1.append(r0)
            if (r3 == 0) goto L94
            X.0K8 r7 = r3.A09
        L94:
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            r2.A05(r0)
            return r3
        L9f:
            X.0DX r0 = r2.getService()
            goto L64
        La4:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            if (r4 == 0) goto Lac
            r4.close()     // Catch: java.lang.Throwable -> Lac
        Lac:
            throw r0     // Catch: java.lang.Throwable -> Lad
        Lad:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013306k.A0Q(java.lang.String, java.lang.String):X.093");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x02b1: IGET  (r1 I:X.06v) = (r6 I:X.06k) X.06k.A08 X.06v, block:B:236:0x02b1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.06k] */
    public String A0R(AnonymousClass092 anonymousClass092, boolean z) {
        ?? r6;
        AnonymousClass093 anonymousClass093;
        String str;
        ContentValues A0A2;
        if (anonymousClass092.A0F != null) {
            try {
                C0CD A04 = this.A04.A04();
                C0K8 c0k8 = anonymousClass092.A0F.A09;
                if (c0k8 != null) {
                    String A092 = c0k8.A09();
                    long A08 = c0k8.A08();
                    if (A092 != null) {
                        C013406l c013406l = this.A07;
                        C0DY service = c013406l.A02.getService();
                        C0K8 AEp = service != null ? service.AEp() : null;
                        if (AEp != null) {
                            c013406l.A0F(A092, AEp);
                        }
                        C0CD A03 = c013406l.A01.A03();
                        try {
                            C03790Hb A00 = A03.A00();
                            if (!TextUtils.isEmpty(A092)) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("tmp_id", A092);
                                String A0D = c0k8.A0D();
                                if (A0D != null) {
                                    contentValues.put("tmp_metadata", A0D);
                                    contentValues.put("tmp_ts", Long.valueOf(A08 / 1000));
                                    if (AEp != null && !TextUtils.isEmpty(AEp.A09())) {
                                        A03.A02.A00("tmp_transactions", contentValues, "tmp_id=?", new String[]{A092});
                                    } else {
                                        A03.A02.A02("tmp_transactions", contentValues);
                                    }
                                }
                            }
                            A00.A00();
                            A00.close();
                        } finally {
                        }
                    }
                    C013406l c013406l2 = this.A07;
                    C0TN A05 = c013406l2.A05(UserJid.of(anonymousClass092.A0F.A0C));
                    String A0B2 = anonymousClass092.A0F.A09.A0B();
                    if (A05 != null && A05.A03 != null && !TextUtils.isEmpty(A0B2) && !A0B2.equals(A05.A09())) {
                        A05.A0C(A0B2);
                        c013406l2.A0H(A05);
                        C014406v c014406v = this.A08;
                        StringBuilder sb = new StringBuilder();
                        sb.append("updated the contact for ");
                        sb.append(A05.A03);
                        c014406v.A07(null, sb.toString(), null);
                    }
                }
                if (z) {
                    anonymousClass093 = A0P(anonymousClass092.A0n.A01, null);
                } else {
                    anonymousClass093 = null;
                }
                ContentValues A093 = A09(anonymousClass093, anonymousClass092.A0F);
                if (A093 == null) {
                    A04.close();
                    return null;
                }
                AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                if (abstractC005302j != null) {
                    String rawString = abstractC005302j.getRawString();
                    if (anonymousClass093 != null && !TextUtils.isEmpty(anonymousClass093.A0J)) {
                        C014406v c014406v2 = this.A08;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("insertMessagePaymentInfo already exists with old message id: ");
                        sb2.append(anonymousClass093.A0J);
                        sb2.append("; new message id: ");
                        sb2.append(anonymousClass092.A0F.A0J);
                        c014406v2.A03(sb2.toString());
                    } else {
                        A093.put("key_remote_jid", rawString);
                        A093.put("key_from_me", Integer.valueOf(anonymousClass094.A02 ? 1 : 0));
                        A093.put("key_id", anonymousClass094.A01);
                    }
                    if (A093.size() > 0) {
                        if (A0g() && (A0A2 = A0A(anonymousClass093, anonymousClass092.A0F)) != null) {
                            if (anonymousClass093 == null || TextUtils.isEmpty(anonymousClass093.A0J)) {
                                A0A2.put("remote_jid_row_id", Long.valueOf(this.A03.A02(abstractC005302j)));
                                A0A2.put("key_id", anonymousClass094.A01);
                            }
                            A0A2.put("message_row_id", Long.valueOf(anonymousClass092.A0p));
                            if (anonymousClass093 == null) {
                                long A042 = A04.A02.A04("pay_transaction", A0A2);
                                C014406v c014406v3 = this.A08;
                                StringBuilder A0P = C000200d.A0P("insertMessagePaymentInfoV2/");
                                A0P.append(abstractC005302j);
                                A0P.append("/");
                                A0P.append(A042);
                                c014406v3.A07(null, A0P.toString(), null);
                            } else if (anonymousClass092.A0p != -1) {
                                String[] strArr = {Long.toString(anonymousClass092.A0p), anonymousClass093.A0I};
                                C014406v c014406v4 = this.A08;
                                StringBuilder A0P2 = C000200d.A0P("insertMessagePaymentInfoV2/found old row and updating ");
                                A0P2.append(abstractC005302j);
                                A0P2.append("/");
                                A0P2.append(A04.A02.A00("pay_transaction", A0A2, "message_row_id=? OR id=?", strArr));
                                c014406v4.A07(null, A0P2.toString(), null);
                            } else {
                                String[] strArr2 = {anonymousClass093.A0I};
                                C014406v c014406v5 = this.A08;
                                StringBuilder A0P3 = C000200d.A0P("insertMessagePaymentInfoV2/found old row and updating ");
                                A0P3.append(abstractC005302j);
                                A0P3.append("/");
                                A0P3.append(A04.A02.A00("pay_transaction", A0A2, "id=?", strArr2));
                                c014406v5.A07(null, A0P3.toString(), null);
                            }
                        }
                        if (anonymousClass093 == null) {
                            long A043 = A04.A02.A04("pay_transactions", A093);
                            C014406v c014406v6 = this.A08;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("insertMessagePaymentInfo/");
                            sb3.append(abstractC005302j);
                            sb3.append("/");
                            sb3.append(A043);
                            c014406v6.A07(null, sb3.toString(), null);
                        } else {
                            String[] strArr3 = {anonymousClass094.A01};
                            C014406v c014406v7 = this.A08;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("insertMessagePaymentInfo/found old row and updating ");
                            sb4.append(abstractC005302j);
                            sb4.append("/");
                            sb4.append(A04.A02.A00("pay_transactions", A093, "key_id=?", strArr3));
                            c014406v7.A07(null, sb4.toString(), null);
                        }
                        String str2 = anonymousClass092.A0F.A0I;
                        if (str2 == null) {
                            str2 = "UNSET";
                        }
                        A04.close();
                        return str2;
                    }
                    C014406v c014406v8 = this.A08;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("insertMessagePaymentInfo/found no columns to update: ");
                    sb5.append(anonymousClass094);
                    c014406v8.A07(null, sb5.toString(), null);
                    if (anonymousClass093 == null || (str = anonymousClass093.A0I) == null) {
                        str = anonymousClass092.A0F.A0I;
                    }
                    A04.close();
                    return str;
                }
                throw null;
            } catch (SQLiteDatabaseCorruptException e) {
                r6.A08.A08("insertMessagePaymentInfo", e);
                return null;
            }
        }
        throw new NullPointerException(C014406v.A01("PaymentTransactionStore", "insertMessagePaymentInfo transaction info is null"));
    }

    public List A0S() {
        synchronized (this) {
            if (!A0h()) {
                Pair A0D = A0D(1);
                return A0W(-1, (String) A0D.first, (String[]) A0D.second);
            }
            Pair A0D2 = A0D(2);
            return A0X(-1, (String) A0D2.first, (String[]) A0D2.second);
        }
    }

    /* JADX WARN: Finally extract failed */
    public synchronized List A0T() {
        ArrayList arrayList;
        C0CD A04;
        long A05 = this.A02.A05();
        List A0Y = A0Y(-1, new Integer[]{20}, new Integer[]{40});
        arrayList = new ArrayList();
        try {
            A04 = this.A04.A04();
        } catch (SQLiteDatabaseCorruptException unused) {
            this.A08.A04("expirePendingMandateRequests failed.");
        }
        try {
            C03790Hb A00 = A04.A00();
            Iterator it = ((ArrayList) A0Y).iterator();
            while (it.hasNext()) {
                AnonymousClass093 anonymousClass093 = (AnonymousClass093) it.next();
                if (anonymousClass093.A09 == null || anonymousClass093.A09.A07() < A05) {
                    ContentValues contentValues = new ContentValues();
                    Pair A042 = A04(anonymousClass093.A0J, anonymousClass093.A0I);
                    contentValues.put("type", (Integer) 20);
                    contentValues.put("status", (Integer) 16);
                    contentValues.put("timestamp", Integer.valueOf((int) (A05 / 1000)));
                    C014406v c014406v = this.A08;
                    StringBuilder sb = new StringBuilder();
                    sb.append("expireOldPendingRequests key id:");
                    sb.append(anonymousClass093.A0J);
                    c014406v.A07(null, sb.toString(), null);
                    if (A0g()) {
                        A08(anonymousClass093, contentValues, A04);
                    }
                    A04.A02.A00("pay_transactions", contentValues, (String) A042.first, (String[]) A042.second);
                    arrayList.add(anonymousClass093);
                }
            }
            A00.A00();
            A00.close();
            A04.close();
        } finally {
        }
        return arrayList;
    }

    public synchronized List A0U(int i) {
        if (A0h()) {
            Pair A0E = A0E(0);
            Pair A03 = A03(A03(A01(), A00(), "OR"), new Pair(A0E.second, A0E.first), "AND");
            return A0X(i, (String) A03.first, (String[]) A03.second);
        }
        Pair A0B2 = A0B(0);
        Pair A032 = A03(A03(A01(), A00(), "OR"), new Pair(A0B2.second, A0B2.first), "AND");
        return A0W(i, (String) A032.first, (String[]) A032.second);
    }

    public synchronized List A0V(int i) {
        ArrayList arrayList;
        int[] iArr = AnonymousClass093.A0R;
        int length = iArr.length;
        int[] iArr2 = AnonymousClass093.A0T;
        int length2 = iArr2.length;
        int[] iArr3 = AnonymousClass093.A0S;
        arrayList = new ArrayList(length + length2 + iArr3.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        for (int i3 : iArr2) {
            arrayList.add(Integer.valueOf(i3));
        }
        for (int i4 : iArr3) {
            arrayList.add(Integer.valueOf(i4));
        }
        return A0Y(i, (Integer[]) arrayList.toArray(new Integer[0]), new Integer[]{2, 1, 200, 100, 20, 10, 6, 7, 8});
    }

    public final synchronized List A0W(int i, String str, String[] strArr) {
        ArrayList arrayList;
        try {
            try {
                Cursor A0A2 = this.A04.A03().A02.A0A("pay_transactions", A09, str, strArr, "init_timestamp DESC", i > 0 ? Integer.toString(i) : "");
                arrayList = new ArrayList(A0A2.getCount());
                while (A0A2.moveToNext()) {
                    try {
                        arrayList.add(A0K(A0A2));
                    } catch (C011305p e) {
                        this.A08.A08("PaymentTransactionStore/queryPaymentTransactionInfos/InvalidJidException - Skipped pending transaction with invalid JID", e);
                    }
                }
                C014406v c014406v = this.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("readPendingRequests returned: ");
                sb.append(arrayList.size());
                c014406v.A05(sb.toString());
                A0A2.close();
            } finally {
            }
        } catch (IllegalStateException e2) {
            this.A08.A08("PaymentTransactionStore/queryPaymentTransactionInfos/IllegalStateException ", e2);
            return new ArrayList();
        }
        return arrayList;
    }

    public final synchronized List A0X(int i, String str, String[] strArr) {
        String num;
        ArrayList arrayList;
        if (i > 0) {
            num = Integer.toString(i);
        } else {
            num = "";
        }
        A0h();
        try {
            try {
                Cursor A0A2 = this.A04.A03().A02.A0A("pay_transaction", A0A, str, strArr, "init_timestamp DESC", num);
                arrayList = new ArrayList(A0A2.getCount());
                while (A0A2.moveToNext()) {
                    try {
                        arrayList.add(A0K(A0A2));
                    } catch (C011305p e) {
                        this.A08.A08("queryPaymentTransactionInfosV2/InvalidJidException - Skipped pending transaction with invalid JID", e);
                    }
                }
                C014406v c014406v = this.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("readPendingRequests returned: ");
                sb.append(arrayList.size());
                c014406v.A05(sb.toString());
                A0A2.close();
            } finally {
            }
        } catch (IllegalStateException e2) {
            this.A08.A08("queryPaymentTransactionInfosV2/IllegalStateException ", e2);
            return new ArrayList();
        }
        return arrayList;
    }

    public synchronized List A0Y(int i, Integer[] numArr, Integer[] numArr2) {
        String str;
        String str2;
        String str3;
        if (numArr.length > 0) {
            str = String.format("(%s IN (\"%s\"))", "status", TextUtils.join("\",\"", numArr));
        } else {
            str = "";
        }
        if (numArr2.length > 0) {
            str2 = String.format("(%s IN (\"%s\"))", "type", TextUtils.join("\",\"", numArr2));
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" AND ");
            sb.append(str2);
            str = sb.toString();
        } else if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                return new ArrayList();
            }
            str = str2;
        }
        String format = String.format("(%s) AND (%s IS NOT NULL)", str, "id");
        C014406v c014406v = this.A08;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pending txns query: ");
        sb2.append(format);
        c014406v.A05(sb2.toString());
        if (i > 0) {
            str3 = Integer.toString(i);
        } else {
            str3 = null;
        }
        A0h();
        try {
            try {
                Cursor A0A2 = this.A04.A03().A02.A0A(A0h() ? "pay_transaction" : "pay_transactions", A0h() ? A0A : A09, format, null, "timestamp DESC", str3);
                ArrayList arrayList = new ArrayList(A0A2.getCount());
                while (A0A2.moveToNext()) {
                    try {
                        arrayList.add(A0K(A0A2));
                    } catch (C011305p e) {
                        c014406v.A08("readPendingTransactions/InvalidJidException - Skipped pending transaction with invalid JID", e);
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("readPendingTransactions returned: ");
                sb3.append(arrayList.size());
                c014406v.A05(sb3.toString());
                A0A2.close();
                return arrayList;
            } finally {
            }
        } catch (IllegalStateException e2) {
            c014406v.A08("readPendingTransactions/IllegalStateException ", e2);
            return new ArrayList();
        }
    }

    public final List A0Z(AbstractC005302j abstractC005302j) {
        Pair A0G;
        C0CD A03;
        Pair A0G2;
        if (A0h()) {
            if (abstractC005302j == null) {
                A0G2 = A0F(2);
            } else {
                A0G2 = A0G(2, abstractC005302j);
            }
            if (A0G2 == null) {
                this.A08.A04("readTransactionsV2/null queryPair");
                return new ArrayList();
            }
            String str = (String) A0G2.first;
            String[] strArr = (String[]) A0G2.second;
            A0h();
            A03 = this.A04.A03();
            try {
                Cursor A0A2 = A03.A02.A0A("pay_transaction", A0A, str, strArr, "init_timestamp DESC", "");
                if (A0A2 != null) {
                    ArrayList arrayList = new ArrayList(A0A2.getCount());
                    while (A0A2.moveToNext()) {
                        try {
                            arrayList.add(A0K(A0A2));
                        } catch (C011305p e) {
                            this.A08.A08("readTransactionsV2/InvalidJidException - Skipped transaction with invalid JID", e);
                        }
                    }
                    C014406v c014406v = this.A08;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readTransactionsV2 returned: ");
                    sb.append(arrayList.size());
                    c014406v.A05(sb.toString());
                    A0A2.close();
                    A03.close();
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                A03.close();
                return arrayList2;
            } finally {
            }
        } else {
            if (abstractC005302j == null) {
                A0G = A0F(1);
            } else {
                A0G = A0G(1, abstractC005302j);
            }
            if (A0G == null) {
                this.A08.A04("PaymentTransactionStore/readTransactions/null queryPair");
                return new ArrayList();
            }
            String str2 = (String) A0G.first;
            String[] strArr2 = (String[]) A0G.second;
            A03 = this.A04.A03();
            try {
                Cursor A0A3 = A03.A02.A0A("pay_transactions", A09, str2, strArr2, "init_timestamp DESC", "");
                if (A0A3 != null) {
                    ArrayList arrayList3 = new ArrayList(A0A3.getCount());
                    while (A0A3.moveToNext()) {
                        try {
                            arrayList3.add(A0K(A0A3));
                        } catch (C011305p e2) {
                            this.A08.A08("PaymentTransactionStore/readTransactions/InvalidJidException - Skipped transaction with invalid JID", e2);
                        }
                    }
                    C014406v c014406v2 = this.A08;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("readTransactions returned: ");
                    sb2.append(arrayList3.size());
                    c014406v2.A05(sb2.toString());
                    A0A3.close();
                    A03.close();
                    return arrayList3;
                }
                ArrayList arrayList4 = new ArrayList();
                A03.close();
                return arrayList4;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public List A0a(C28021Ps c28021Ps) {
        Pair A0H;
        C0CD A03;
        Cursor A0A2;
        if (A0h()) {
            A0H = A0I(c28021Ps);
        } else {
            A0H = A0H(c28021Ps);
        }
        String[] strArr = (String[]) A0H.first;
        String str = (String) A0H.second;
        try {
            A03 = this.A04.A03();
            A0A2 = A03.A02.A0A(A0h() ? "pay_transaction" : "pay_transactions", A0h() ? A0A : A09, str, strArr, "init_timestamp DESC", null);
        } catch (Exception e) {
            this.A08.A08("PaymentTransactionStore/readTransactionsWithFilters ", e);
        }
        if (A0A2 != null) {
            ArrayList arrayList = new ArrayList(A0A2.getCount());
            while (A0A2.moveToNext()) {
                try {
                    arrayList.add(A0K(A0A2));
                } catch (C011305p e2) {
                    this.A08.A08("PaymentTransactionStore/readTransactionsWithFilters/InvalidJidException - Skipped transaction with invalid JID", e2);
                }
            }
            C014406v c014406v = this.A08;
            StringBuilder sb = new StringBuilder();
            sb.append("readTransactionsWithFilters returned: ");
            sb.append(arrayList.size());
            c014406v.A05(sb.toString());
            A0A2.close();
            A03.close();
            return arrayList;
        }
        A03.close();
        return new ArrayList();
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized List A0b(boolean z) {
        List<AnonymousClass093> A0V;
        ArrayList arrayList;
        long A05 = this.A02.A05();
        if (z) {
            int[] iArr = AnonymousClass093.A0R;
            int length = iArr.length;
            int[] iArr2 = AnonymousClass093.A0S;
            ArrayList arrayList2 = new ArrayList(length + iArr2.length);
            for (int i : iArr) {
                arrayList2.add(Integer.valueOf(i));
            }
            for (int i2 : iArr2) {
                arrayList2.add(Integer.valueOf(i2));
            }
            A0V = A0Y(-1, (Integer[]) arrayList2.toArray(new Integer[0]), new Integer[]{2, 200, 20, 10});
        } else {
            A0V = A0V(-1);
        }
        arrayList = new ArrayList();
        try {
            C0CD A04 = this.A04.A04();
            try {
                C03790Hb A00 = A04.A00();
                for (AnonymousClass093 anonymousClass093 : A0V) {
                    ContentValues contentValues = new ContentValues();
                    Pair A042 = A04(anonymousClass093.A0J, anonymousClass093.A0I);
                    if (A042 != null) {
                        contentValues.put("status", (Integer) 0);
                        contentValues.put("timestamp", Integer.valueOf((int) (A05 / 1000)));
                        C014406v c014406v = this.A08;
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed transaction/key_id=");
                        sb.append(anonymousClass093.A0J);
                        sb.append(", transaction_id=");
                        sb.append(anonymousClass093.A0I);
                        c014406v.A07(null, sb.toString(), null);
                        if (A0g()) {
                            A04.A02.A00("pay_transaction", contentValues, "id=?", new String[]{anonymousClass093.A0I});
                        }
                        A04.A02.A00("pay_transactions", contentValues, (String) A042.first, (String[]) A042.second);
                        arrayList.add(new AnonymousClass094(anonymousClass093.A0A, anonymousClass093.A0O, anonymousClass093.A0J));
                    }
                }
                A00.A00();
                A00.close();
                A04.close();
            } finally {
            }
        } catch (SQLiteDatabaseCorruptException e) {
            C014406v c014406v2 = this.A08;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PaymentTransactionStore/failPendingTransactions/failed: ");
            sb2.append(e);
            c014406v2.A04(sb2.toString());
        }
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void A0c() {
        ArrayList arrayList;
        C0CD A03;
        long A05 = this.A02.A05();
        if (A0h()) {
            Pair A0C = A0C(2);
            String str = (String) A0C.first;
            String[] strArr = (String[]) A0C.second;
            if (A0h()) {
            }
            try {
                A03 = this.A04.A03();
                try {
                    Cursor A0A2 = A03.A02.A0A("pay_transaction", A0A, str, strArr, "init_timestamp DESC", "");
                    arrayList = new ArrayList(A0A2.getCount());
                    while (A0A2.moveToNext()) {
                        try {
                            arrayList.add(A0K(A0A2));
                        } catch (C011305p e) {
                            this.A08.A08("readPendingAndActiveWithdrawalsV2/InvalidJidException - Skipped pending withdrawal with invalid JID", e);
                        }
                    }
                    C014406v c014406v = this.A08;
                    StringBuilder sb = new StringBuilder();
                    sb.append("readPendingAndActiveWithdrawalsV2 returned: ");
                    sb.append(arrayList.size());
                    c014406v.A05(sb.toString());
                    A0A2.close();
                    A03.close();
                } finally {
                }
            } catch (IllegalStateException e2) {
                this.A08.A08("readPendingAndActiveWithdrawalsV2/IllegalStateException ", e2);
                arrayList = new ArrayList();
            }
        } else {
            Pair A0C2 = A0C(1);
            String str2 = (String) A0C2.first;
            String[] strArr2 = (String[]) A0C2.second;
            try {
                A03 = this.A04.A03();
                try {
                    Cursor A0A3 = A03.A02.A0A("pay_transactions", A09, str2, strArr2, "init_timestamp DESC", "");
                    arrayList = new ArrayList(A0A3.getCount());
                    while (A0A3.moveToNext()) {
                        try {
                            arrayList.add(A0K(A0A3));
                        } catch (C011305p e3) {
                            this.A08.A08("PaymentTransactionStore/readPendingAndActiveWithdrawals/InvalidJidException - Skipped pending withdrawal with invalid JID", e3);
                        }
                    }
                    C014406v c014406v2 = this.A08;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("readPendingAndActiveWithdrawals returned: ");
                    sb2.append(arrayList.size());
                    c014406v2.A05(sb2.toString());
                    A0A3.close();
                    A03.close();
                } finally {
                    try {
                        throw th;
                    } catch (Throwable th) {
                        try {
                            A03.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (IllegalStateException e4) {
                this.A08.A08("PaymentTransactionStore/readPendingAndActiveWithdrawals/IllegalStateException ", e4);
                arrayList = new ArrayList();
            }
        }
        try {
            C0CD A04 = this.A04.A04();
            try {
                C03790Hb A00 = A04.A00();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass093 anonymousClass093 = (AnonymousClass093) it.next();
                    if (anonymousClass093.A09 == null || (anonymousClass093.A09.A07() > 0 && anonymousClass093.A09.A07() < A05)) {
                        ContentValues contentValues = new ContentValues();
                        Pair A042 = A04(anonymousClass093.A0J, anonymousClass093.A0I);
                        contentValues.put("status", (Integer) 607);
                        contentValues.put("timestamp", Integer.valueOf((int) (A05 / 1000)));
                        C014406v c014406v3 = this.A08;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("expireOldWithdrawals key id:");
                        sb3.append(anonymousClass093.A0I);
                        c014406v3.A07(null, sb3.toString(), null);
                        if (A0g()) {
                            A04.A02.A00("pay_transaction", contentValues, "id=?", new String[]{anonymousClass093.A0I});
                        }
                        A04.A02.A00("pay_transactions", contentValues, (String) A042.first, (String[]) A042.second);
                    }
                }
                A00.A00();
                A00.close();
                A04.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        A04.close();
                    } catch (Throwable unused2) {
                    }
                    throw th3;
                }
            }
        } catch (SQLiteDatabaseCorruptException unused3) {
            this.A08.A04("expireOldWithdrawals failed.");
        }
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void A0d(AnonymousClass093 anonymousClass093) {
        C0CD A04;
        long A05 = this.A02.A05();
        try {
            A04 = this.A04.A04();
        } catch (SQLiteDatabaseCorruptException unused) {
            this.A08.A04("expirePendingRequest failed.");
        }
        try {
            C03790Hb A00 = A04.A00();
            ContentValues contentValues = new ContentValues();
            Pair A042 = A04(anonymousClass093.A0J, anonymousClass093.A0I);
            contentValues.put("status", (Integer) 16);
            contentValues.put("timestamp", Integer.valueOf((int) (A05 / 1000)));
            C014406v c014406v = this.A08;
            StringBuilder sb = new StringBuilder();
            sb.append("expirePendingRequest key id:");
            sb.append(anonymousClass093.A0J);
            c014406v.A07(null, sb.toString(), null);
            if (A0g()) {
                A08(anonymousClass093, contentValues, A04);
            }
            A04.A02.A00("pay_transactions", contentValues, (String) A042.first, (String[]) A042.second);
            A00.A00();
            A00.close();
            A04.close();
        } finally {
        }
    }

    public void A0e(AnonymousClass092 anonymousClass092) {
        String str;
        if (anonymousClass092.A0m == 0) {
            String str2 = "UNSET";
            if ("UNSET".equals(anonymousClass092.A0b)) {
                AnonymousClass093 A0P = A0P(anonymousClass092.A0n.A01, null);
                if (A0P == null && !AnonymousClass093.A08(anonymousClass092.A0F)) {
                    A0R(anonymousClass092, false);
                }
                anonymousClass092.A0F = A0P;
                if (A0P != null && (str = A0P.A0I) != null) {
                    str2 = str;
                }
                anonymousClass092.A0b = str2;
            }
        }
    }

    public void A0f(String str, int i, long j, long j2, int i2) {
        AnonymousClass093 A0O;
        C0DX paymentService;
        if (TextUtils.isEmpty(str) || i <= 0 || j <= 0 || j2 <= 0 || i2 <= 0 || (A0O = A0O(str)) == null) {
            return;
        }
        C0K8 c0k8 = A0O.A09;
        if (c0k8 != null || ((paymentService = this.A00.getPaymentService(A0O.A0E, A0O.A0G)) != null && (c0k8 = paymentService.AEp()) != null)) {
            c0k8.A0H(A0O.A02);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
        contentValues.put("status", Integer.valueOf(i2));
        contentValues.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
        String[] strArr = {str};
        C0CD A04 = this.A04.A04();
        try {
            if (A0g()) {
                A04.A02.A00("pay_transaction", contentValues, "id=?", strArr);
            }
            int A00 = A04.A02.A00("pay_transactions", contentValues, "id=?", strArr);
            C014406v c014406v = this.A08;
            StringBuilder sb = new StringBuilder();
            sb.append("updateTransactionTypeById/");
            sb.append(str);
            sb.append("/");
            sb.append(A00);
            c014406v.A05(sb.toString());
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

    public boolean A0g() {
        String A02;
        return this.A03.A0C() && (A02 = this.A05.A02("new_pay_transaction_ready")) != null && Long.parseLong(A02) == 1;
    }

    public boolean A0h() {
        return this.A03.A0C() && this.A05.A01("new_pay_transaction_ready", 0L) == 1;
    }

    public boolean A0i(AnonymousClass093 anonymousClass093) {
        AnonymousClass093 A0P = A0P(anonymousClass093.A0J, anonymousClass093.A0I);
        if (A0P == null) {
            return false;
        }
        anonymousClass093.A05 = this.A02.A05();
        return A0k(anonymousClass093.A0J, anonymousClass093, A0P);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00d0, code lost:
        if (r4.A02.A00("pay_transaction", r6, (java.lang.String) r0.first, (java.lang.String[]) r0.second) <= 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0j(X.AnonymousClass094 r11, X.AnonymousClass093 r12, int r13, long r14, int r16) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013306k.A0j(X.094, X.093, int, long, int):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0261: IGET  (r1 I:X.06v) = (r3 I:X.06k) X.06k.A08 X.06v, block:B:150:0x0261 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.06k] */
    public boolean A0k(String str, AnonymousClass093 anonymousClass093, AnonymousClass093 anonymousClass0932) {
        ?? r3;
        long j;
        String[] strArr;
        String str2;
        try {
            anonymousClass093.A0J = str;
            ContentValues A092 = A09(anonymousClass0932, anonymousClass093);
            if (A092 == null) {
                this.A08.A07(null, "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessage() content-values are null, nothing to update", null);
                return false;
            } else if (A092.size() > 0) {
                C05E c05e = this.A04;
                C0CD A04 = c05e.A04();
                if (A0g()) {
                    ContentValues A0A2 = A0A(anonymousClass0932, anonymousClass093);
                    j = 0;
                    if (A0A2 == null) {
                        this.A08.A07(null, "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 content values are null, nothing to update", null);
                    } else {
                        if (!anonymousClass093.A0N) {
                            A0A2.put("key_id", str);
                        } else {
                            A0A2.put("interop_id", str);
                            A0A2.remove("key_id");
                            C014406v c014406v = this.A08;
                            c014406v.A07(null, "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 interop_id is added to content values", null);
                            if (TextUtils.isEmpty(str)) {
                                c014406v.A07(null, "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is empty", null);
                            } else {
                                c014406v.A07(null, "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is not empty", null);
                            }
                        }
                        if (anonymousClass0932 == null) {
                            j = A04.A02.A04("pay_transaction", A0A2);
                            C014406v c014406v2 = this.A08;
                            StringBuilder sb = new StringBuilder("insertOrUpdatePaymentInfoWithoutMessageV2/");
                            sb.append(str);
                            sb.append("/");
                            sb.append(j);
                            c014406v2.A07(null, sb.toString(), null);
                        } else if (anonymousClass0932.A0T(anonymousClass093)) {
                            String str3 = anonymousClass093.A0I;
                            boolean isEmpty = TextUtils.isEmpty(str);
                            boolean isEmpty2 = TextUtils.isEmpty(str3);
                            if (isEmpty && isEmpty2) {
                                C014406v c014406v3 = this.A08;
                                StringBuilder A0W = C000200d.A0W("insertOrUpdatePaymentInfoWithoutMessageV2 got null query and params for interop id: ", str, " trans id: ");
                                A0W.append(anonymousClass093.A0I);
                                c014406v3.A07(null, A0W.toString(), null);
                            } else {
                                if (isEmpty) {
                                    strArr = new String[]{str3};
                                    str2 = "id=?";
                                } else if (isEmpty2) {
                                    strArr = new String[]{str, str};
                                    str2 = "key_id=? OR interop_id=?";
                                } else {
                                    strArr = new String[]{str, str, str3};
                                    str2 = "key_id=? OR interop_id=? OR id=?";
                                }
                                Pair pair = new Pair(str2, strArr);
                                String str4 = (String) pair.first;
                                String[] strArr2 = (String[]) pair.second;
                                C014406v c014406v4 = this.A08;
                                StringBuilder A0P = C000200d.A0P("insertOrUpdatePaymentInfoWithoutMessageV2 already exists with old message id: ");
                                A0P.append(anonymousClass0932.A0J);
                                A0P.append("; new key id: ");
                                A0P.append(anonymousClass093.A0J);
                                A0P.append(" old transaction id: ");
                                A0P.append(anonymousClass0932.A0I);
                                A0P.append(" new transaction id: ");
                                C000200d.A1U(A0P, anonymousClass093.A0I, " query: ", str4, " params: ");
                                A0P.append(strArr2);
                                c014406v4.A03(A0P.toString());
                                j = A04.A02.A00("pay_transaction", A0A2, str4, strArr2);
                                StringBuilder A0P2 = C000200d.A0P("insertOrUpdatePaymentInfoWithoutMessageV2/found old row and updating transaction id: ");
                                C000200d.A1U(A0P2, anonymousClass093.A0I, " message id: ", str, "/");
                                A0P2.append(j);
                                c014406v4.A07(null, A0P2.toString(), null);
                            }
                        }
                    }
                } else {
                    j = 0;
                }
                c05e.A05();
                if (!c05e.A06.A0N()) {
                    boolean z = j > 0;
                    A04.close();
                    return z;
                } else if (anonymousClass0932 == null) {
                    long A042 = A04.A02.A04("pay_transactions", A092);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("insertOrUpdatePaymentInfoWithoutMessage/");
                    sb2.append(str);
                    sb2.append("/");
                    sb2.append(A042);
                    Log.i(sb2.toString());
                    boolean z2 = A042 > 0;
                    A04.close();
                    return z2;
                } else {
                    Pair A043 = A04(str, anonymousClass093.A0I);
                    if (A043 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("insertOrUpdatePaymentInfoWithoutMessage got null query and params for message id: ");
                        sb3.append(str);
                        sb3.append(" trans id: ");
                        sb3.append(anonymousClass093.A0I);
                        Log.w(sb3.toString());
                        A04.close();
                        return false;
                    }
                    String str5 = (String) A043.first;
                    String[] strArr3 = (String[]) A043.second;
                    C014406v c014406v5 = this.A08;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("insertOrUpdatePaymentInfoWithoutMessage already exists with old message id: ");
                    sb4.append(anonymousClass0932.A0J);
                    sb4.append("; new key id: ");
                    sb4.append(anonymousClass093.A0J);
                    sb4.append(" old transaction id: ");
                    sb4.append(anonymousClass0932.A0I);
                    sb4.append(" new transaction id: ");
                    sb4.append(anonymousClass093.A0I);
                    sb4.append(" query: ");
                    sb4.append(str5);
                    sb4.append(" params: ");
                    sb4.append(strArr3);
                    c014406v5.A03(sb4.toString());
                    long A00 = A04.A02.A00("pay_transactions", A092, str5, strArr3);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("insertOrUpdatePaymentInfoWithoutMessage/found old row and updating transaction id: ");
                    sb5.append(anonymousClass093.A0I);
                    sb5.append(" message id: ");
                    sb5.append(str);
                    sb5.append("/");
                    sb5.append(A00);
                    c014406v5.A07(null, sb5.toString(), null);
                    boolean z3 = A00 > 0;
                    A04.close();
                    return z3;
                }
            } else {
                C014406v c014406v6 = this.A08;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("insertOrUpdatePaymentInfoWithoutMessage/found no columns to update: ");
                sb6.append(str);
                c014406v6.A07(null, sb6.toString(), null);
                return false;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            r3.A08.A08("insertOrUpdatePaymentInfoWithoutMessage", e);
            return false;
        }
    }

    /* JADX WARN: Finally extract failed */
    public boolean A0l(List list) {
        ContentValues A0A2;
        String str;
        int i;
        int i2;
        if (list != null && list.size() > 0) {
            C0CD A04 = this.A04.A04();
            try {
                C03790Hb A00 = A04.A00();
                Iterator it = list.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    AnonymousClass093 anonymousClass093 = (AnonymousClass093) it.next();
                    if (!TextUtils.isEmpty(anonymousClass093.A0I)) {
                        AnonymousClass093 A0O = A0O(anonymousClass093.A0I);
                        if (A0O != null && !A0O.A0T(anonymousClass093)) {
                            C014406v c014406v = this.A08;
                            StringBuilder sb = new StringBuilder();
                            sb.append("storeTransactions skipping store transaction with: ");
                            sb.append(anonymousClass093.A0I);
                            sb.append(" as status is not updated ");
                            sb.append(" old ts: ");
                            sb.append(A0O.A05);
                            sb.append(" counter: ");
                            C0K8 c0k8 = A0O.A09;
                            if (c0k8 != null) {
                                i = c0k8.A05();
                            } else {
                                i = 0;
                            }
                            sb.append(i);
                            sb.append(" new ts: ");
                            sb.append(anonymousClass093.A05);
                            sb.append(" counter: ");
                            C0K8 c0k82 = anonymousClass093.A09;
                            if (c0k82 != null) {
                                i2 = c0k82.A05();
                            } else {
                                i2 = 0;
                            }
                            sb.append(i2);
                            c014406v.A07(null, sb.toString(), null);
                            i3++;
                        } else {
                            if (A0g() && (A0A2 = A0A(A0O, anonymousClass093)) != null) {
                                boolean isEmpty = TextUtils.isEmpty(anonymousClass093.A0J);
                                String[] strArr = new String[isEmpty ? 1 : 2];
                                strArr[0] = anonymousClass093.A0I;
                                if (isEmpty) {
                                    str = "id=?";
                                } else {
                                    strArr[1] = anonymousClass093.A0J;
                                    str = "id=? OR key_id=?";
                                }
                                C0CE c0ce = A04.A02;
                                if (c0ce.A00("pay_transaction", A0A2, str, strArr) != 1) {
                                    c0ce.A02("pay_transaction", A0A2);
                                }
                            }
                            ContentValues A092 = A09(A0O, anonymousClass093);
                            if (A092 != null) {
                                String str2 = "id=?";
                                boolean isEmpty2 = TextUtils.isEmpty(anonymousClass093.A0J);
                                String[] strArr2 = new String[isEmpty2 ? 1 : 2];
                                strArr2[0] = anonymousClass093.A0I;
                                if (!isEmpty2) {
                                    str2 = "id=? OR key_id=?";
                                    strArr2[1] = anonymousClass093.A0J;
                                }
                                C0CE c0ce2 = A04.A02;
                                long A002 = c0ce2.A00("pay_transactions", A092, str2, strArr2);
                                long A02 = A002 != 1 ? c0ce2.A02("pay_transactions", A092) : -1L;
                                if (A002 == 1 || A02 >= 0) {
                                    i3++;
                                } else {
                                    C014406v c014406v2 = this.A08;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("could not update or insert transaction: ");
                                    sb2.append(anonymousClass093.A0I);
                                    sb2.append(" update returned: ");
                                    sb2.append(A002);
                                    sb2.append(" insert returned: ");
                                    sb2.append(A02);
                                    c014406v2.A07(null, sb2.toString(), null);
                                }
                            }
                        }
                    } else {
                        this.A08.A07(null, "could not update or insert transaction with empty transaction id", null);
                    }
                }
                A00.A00();
                A00.close();
                A04.close();
                if (i3 == list.size()) {
                    C014406v c014406v3 = this.A08;
                    StringBuilder sb3 = new StringBuilder("storeTransactions stored: ");
                    sb3.append(i3);
                    c014406v3.A07(null, sb3.toString(), null);
                } else {
                    C014406v c014406v4 = this.A08;
                    StringBuilder A0P = C000200d.A0P("storeTransactions got: ");
                    A0P.append(list.size());
                    A0P.append(" transactions but stored: ");
                    A0P.append(i3);
                    c014406v4.A07(null, A0P.toString(), null);
                }
                return i3 == list.size();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A04.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        this.A08.A07(null, "storeTransactions not storing transactions", null);
        return false;
    }
}
