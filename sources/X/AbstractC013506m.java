package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.math.BigDecimal;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.06m */
/* loaded from: classes.dex */
public abstract class AbstractC013506m {
    public C04l A00;
    public C03610Gj A01;
    public InterfaceC03580Gg A02;
    public final AbstractC000600i A03;
    public final AnonymousClass012 A04;
    public final C001200o A05;
    public final C04Z A06;
    public volatile boolean A07;

    public AbstractC013506m(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C001200o c001200o, C04Z c04z) {
        this.A03 = abstractC000600i;
        this.A05 = c001200o;
        if (anonymousClass012 != null) {
            this.A04 = anonymousClass012;
            this.A06 = c04z;
            this.A00 = new C04l();
            return;
        }
        throw null;
    }

    public static C0N2 A01(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0N2 c0n2 = (C0N2) it.next();
            if (str.equals(c0n2.A07)) {
                return c0n2;
            }
        }
        return null;
    }

    public static String A02(UserJid userJid) {
        return C03650Gn.A01(C002701i.A0s(C04630Le.A02(userJid))).A02;
    }

    public static final void A03(C0TN c0tn, UserJid userJid, Cursor cursor) {
        c0tn.A03 = userJid;
        c0tn.A0D(cursor.getInt(cursor.getColumnIndex("merchant")) == 1);
        c0tn.A0B(cursor.getLong(cursor.getColumnIndex("consumer_status")));
        c0tn.A0A(cursor.getInt(cursor.getColumnIndex("default_payment_type")));
        c0tn.A04(cursor.getString(cursor.getColumnIndex("country_data")));
    }

    public static boolean A04(List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0N2 c0n2 = (C0N2) it.next();
            if (c0n2 != null) {
                if (!TextUtils.isEmpty(c0n2.A07) && c0n2.A08() != 0) {
                    if (TextUtils.isEmpty(c0n2.A0A)) {
                        c0n2.A0A = C0N2.A02(c0n2.A08());
                    }
                } else {
                    Log.w("PAY: PaymentsHelper sanitizePaymentMethods got empty credential id or account type");
                }
            }
            return false;
        }
        return true;
    }

    public synchronized C0TN A05(UserJid userJid) {
        C0TN AEn;
        String[] strArr = {userJid.getRawString()};
        C0DY serviceBy = this.A02.getServiceBy(A02(userJid), null);
        AEn = serviceBy != null ? serviceBy.AEn() : null;
        if (AEn != null) {
            C0CD A02 = A02();
            Cursor A09 = A02.A02.A09("contacts", AbstractC03620Gk.A06, "jid=?", strArr, null, "readContactInfo/QUERY_SCHEMA_PAY_CONTACTS");
            while (A09.moveToNext()) {
                A03(AEn, userJid, A09);
            }
            A09.close();
            A02.close();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: PaymentStore readContactInfo returned: ");
        sb.append(AEn);
        Log.i(sb.toString());
        return AEn;
    }

    public C0N2 A06() {
        Iterator it = ((AbstractCollection) A0B()).iterator();
        while (it.hasNext()) {
            C0N2 c0n2 = (C0N2) it.next();
            if (c0n2.A01 == 2) {
                return c0n2;
            }
        }
        return null;
    }

    public final C0N2 A07(Cursor cursor) {
        C0N3 c0n3;
        LinkedHashSet linkedHashSet;
        C0N5 c0n5;
        C0N8 c0n8;
        String str;
        String string = cursor.getString(cursor.getColumnIndex("country"));
        int i = cursor.getInt(cursor.getColumnIndex("type"));
        String string2 = cursor.getString(cursor.getColumnIndex("credential_id"));
        C03650Gn A00 = C03650Gn.A00(string);
        String string3 = cursor.getString(cursor.getColumnIndex("country_data"));
        String string4 = cursor.getString(cursor.getColumnIndex("readable_name"));
        String string5 = cursor.getString(cursor.getColumnIndex("issuer_name"));
        int i2 = cursor.getInt(cursor.getColumnIndex("subtype"));
        long j = cursor.getInt(cursor.getColumnIndex("creation_ts")) * 1000;
        long j2 = cursor.getInt(cursor.getColumnIndex("updated_ts")) * 1000;
        int i3 = cursor.getInt(cursor.getColumnIndex("debit_mode"));
        int i4 = cursor.getInt(cursor.getColumnIndex("credit_mode"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("icon"));
        switch (i) {
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                C0DY serviceBy = this.A02.getServiceBy(string, null);
                if (serviceBy != null) {
                    c0n8 = serviceBy.AEm();
                    if (c0n8 != null) {
                        c0n8.A04(string3);
                    }
                    if (c0n8 != null) {
                        str = c0n8.A0A;
                        C0N7 c0n7 = new C0N7(A00, string2, str, i, i3, i4, string4, i2);
                        c0n7.A03 = j;
                        c0n7.A06 = c0n8;
                        c0n7.A0B = blob;
                        return c0n7;
                    }
                } else {
                    c0n8 = null;
                }
                str = null;
                C0N7 c0n72 = new C0N7(A00, string2, str, i, i3, i4, string4, i2);
                c0n72.A03 = j;
                c0n72.A06 = c0n8;
                c0n72.A0B = blob;
                return c0n72;
            case 2:
                C0DY serviceBy2 = this.A02.getServiceBy(string, null);
                if (serviceBy2 != null) {
                    c0n5 = serviceBy2.AEl();
                    if (c0n5 != null) {
                        c0n5.A04(string3);
                    }
                } else {
                    c0n5 = null;
                }
                return new C0N6(A00, string2, j, j2, i3, i4, string4, string5, blob, c0n5);
            case 3:
                BigDecimal scaleByPowerOfTen = new BigDecimal(cursor.getLong(cursor.getColumnIndex("balance_1000"))).scaleByPowerOfTen(-3);
                int i5 = cursor.getInt(cursor.getColumnIndex("balance_ts"));
                C0DY serviceBy3 = this.A02.getServiceBy(string, null);
                if (serviceBy3 != null) {
                    c0n3 = serviceBy3.AEq();
                    if (c0n3 != null) {
                        c0n3.A04(string3);
                    }
                    if (c0n3 != null) {
                        linkedHashSet = c0n3.A08();
                        C0N4 c0n4 = new C0N4(A00, string2, i3, i4, string4, scaleByPowerOfTen, linkedHashSet);
                        c0n4.A06 = c0n3;
                        c0n4.A08 = string5;
                        c0n4.A00 = i5 * 1000;
                        c0n4.A0B = blob;
                        return c0n4;
                    }
                } else {
                    c0n3 = null;
                }
                linkedHashSet = null;
                C0N4 c0n42 = new C0N4(A00, string2, i3, i4, string4, scaleByPowerOfTen, linkedHashSet);
                c0n42.A06 = c0n3;
                c0n42.A08 = string5;
                c0n42.A00 = i5 * 1000;
                c0n42.A0B = blob;
                return c0n42;
            case 5:
            default:
                return null;
        }
    }

    public C0N2 A08(String str) {
        String[] strArr = {str};
        C0CD A02 = A02();
        try {
            Cursor A09 = A02.A02.A09("methods", AbstractC03620Gk.A07, "credential_id=?", strArr, null, "readPaymentMethodByCredId/QUERY_SCHEMA_PAY_METHODS");
            C0N2 A07 = A09.moveToLast() ? A07(A09) : null;
            A09.close();
            return A07;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public List A09() {
        ArrayList arrayList = new ArrayList();
        C0CD A02 = A02();
        try {
            Cursor A09 = A02.A02.A09("methods", AbstractC03620Gk.A07, "type = ?", new String[]{String.valueOf(5)}, null, "readMerchantMethods/QUERY_SCHEMA_PAY_METHODS");
            while (A09.moveToNext()) {
                C0N2 A07 = A07(A09);
                if (A07 != null) {
                    arrayList.add((C0N1) A07);
                }
            }
            A09.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public List A0A() {
        ArrayList arrayList = new ArrayList();
        C0CD A02 = A02();
        try {
            Cursor A09 = A02.A02.A09("methods", AbstractC03620Gk.A07, null, null, "debit_mode DESC", "readPaymentAndMerchantMethods/QUERY_SCHEMA_PAY_METHODS");
            while (A09.moveToNext()) {
                C0N2 A07 = A07(A09);
                if (A07 != null) {
                    arrayList.add(A07);
                }
            }
            A09.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public List A0B() {
        ArrayList arrayList = new ArrayList();
        C0CD A02 = A02();
        try {
            Cursor A09 = A02.A02.A09("methods", AbstractC03620Gk.A07, "type != ?", new String[]{String.valueOf(5)}, "debit_mode DESC", "readPaymentMethods/QUERY_SCHEMA_PAY_METHODS");
            while (A09.moveToNext()) {
                C0N2 A07 = A07(A09);
                if (A07 != null) {
                    arrayList.add(A07);
                }
            }
            A09.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized List A0C() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        C0CD A02 = A02();
        Cursor A09 = A02.A02.A09("contacts", AbstractC03620Gk.A06, null, null, null, "readAllContactInfos/QUERY_SCHEMA_PAY_CONTACTS");
        while (A09.moveToNext()) {
            try {
                UserJid nullable = UserJid.getNullable(A09.getString(A09.getColumnIndex("jid")));
                if (nullable == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PAY: PaymentTransactionStore/readContactInfos: Skipping Jid because it is not valid: ");
                    sb.append(A09.getString(A09.getColumnIndex("jid")));
                    Log.i(sb.toString());
                } else {
                    C0DY serviceBy = this.A02.getServiceBy(A02(nullable), null);
                    C0TN AEn = serviceBy != null ? serviceBy.AEn() : null;
                    if (AEn != null) {
                        A03(AEn, nullable, A09);
                        arrayList.add(AEn);
                    }
                }
            } finally {
            }
        }
        A09.close();
        A02.close();
        return arrayList;
    }

    public synchronized void A0D() {
        C03610Gj c03610Gj = this.A01;
        if (c03610Gj != null) {
            c03610Gj.close();
        }
        File databasePath = this.A05.A00.getDatabasePath("payments.db");
        C002501g.A0O(databasePath, "PAY");
        if (databasePath.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentStore deleteStore deleted ");
            sb.append(databasePath);
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PAY: PaymentStore failed to delete ");
            sb2.append(databasePath);
            Log.e(sb2.toString());
        }
        this.A07 = false;
    }

    public synchronized void A0E(UserJid userJid) {
        if (this.A02 == null) {
            return;
        }
        String A02 = A02(userJid);
        if (TextUtils.isEmpty(A02) || A02.equals(C03650Gn.A0F.A02)) {
            return;
        }
        C0TN A05 = A05(userJid);
        if (A05 != null && A05.A03 != null) {
            A05.A01 = this.A04.A05() + TimeUnit.DAYS.toMillis(1L);
            A0H(A05);
        }
    }

    public void A0F(String str, C0K8 c0k8) {
        String[] strArr = {str};
        C0CD A02 = A02();
        try {
            Cursor A09 = A02.A02.A09("tmp_transactions", AbstractC03620Gk.A08, "tmp_id=?", strArr, null, "readPaymentTransactionTmpInfo/QUERY_SCHEMA_PAY_TRANSACTIONS_TMP");
            while (A09.moveToNext()) {
                String string = A09.getString(A09.getColumnIndex("tmp_metadata"));
                long j = A09.getInt(A09.getColumnIndex("tmp_ts")) * 1000;
                c0k8.A0M(str);
                c0k8.A04(string);
                if (j > -1) {
                    c0k8.A0J(j);
                }
            }
            A09.close();
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    A02.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean A0G() {
        boolean z;
        C0CD A03 = A03();
        try {
            int A01 = A03.A02.A01("methods", null, null);
            if (A01 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore removeAllPaymentMethods deleted num rows: ");
                sb.append(A01);
                Log.i(sb.toString());
                z = true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PAY: PaymentStore removeAllPaymentMethods could not delete all rows: ");
                sb2.append(A01);
                Log.w(sb2.toString());
                z = false;
            }
            A03.close();
            return z;
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

    public synchronized boolean A0H(C0TN c0tn) {
        ArrayList arrayList;
        long j;
        arrayList = new ArrayList();
        arrayList.add(c0tn);
        C0CD A03 = A03();
        C03790Hb A00 = A03.A00();
        Iterator it = arrayList.iterator();
        j = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0TN c0tn2 = (C0TN) it.next();
            UserJid userJid = c0tn2.A03;
            if (userJid != null) {
                C0TN A05 = A05(userJid);
                ContentValues contentValues = new ContentValues();
                contentValues.put("jid", userJid.getRawString());
                contentValues.put("country_data", c0tn2.A01());
                contentValues.put("merchant", Integer.valueOf(c0tn2.A0E() ? 1 : 0));
                contentValues.put("consumer_status", Long.valueOf(c0tn2.A07()));
                contentValues.put("default_payment_type", Integer.valueOf(c0tn2.A05()));
                if (A05 == null || A05.A03 == null) {
                    j += A03.A02.A02("contacts", contentValues) < 0 ? 0 : 1;
                } else {
                    j += ((long) A03.A02.A00("contacts", contentValues, "jid=?", new String[]{userJid.getRawString()})) < 0 ? 0 : 1;
                }
            }
        }
        A00.A00();
        A00.close();
        A03.close();
        StringBuilder sb = new StringBuilder("PAY: PaymentStore storeContacts stored: ");
        sb.append(j);
        sb.append(" rows with contacts size: ");
        sb.append(arrayList.size());
        Log.i(sb.toString());
        return j == ((long) arrayList.size());
    }

    public synchronized boolean A0I(UserJid userJid, boolean z, String str) {
        if (this.A02 != null && (z || !TextUtils.isEmpty(str))) {
            String A02 = A02(userJid);
            if (TextUtils.isEmpty(A02) || A02.equals(C03650Gn.A0F.A02)) {
                return false;
            }
            C0TN A05 = A05(userJid);
            if (A05 == null || A05.A03 == null) {
                C0DY serviceBy = this.A02.getServiceBy(A02(userJid), null);
                if (serviceBy != null) {
                    A05 = serviceBy.AEn();
                    if (A05 != null) {
                        A05.A03 = userJid;
                    }
                    return false;
                }
                if (A05 != null) {
                }
                return false;
            }
            if (A05.A05 == z && AnonymousClass024.A0l(A05.A04, str)) {
                return false;
            }
            A05.A0D(z);
            if (!TextUtils.isEmpty(str)) {
                A05.A04 = str;
            }
            A0H(A05);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0082, code lost:
        if (r10 == 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c0 A[Catch: all -> 0x01e2, TryCatch #3 {all -> 0x01e9, blocks: (B:114:0x002a, B:171:0x019e, B:185:0x01db, B:115:0x002e, B:116:0x0034, B:118:0x003a, B:120:0x005a, B:124:0x0064, B:143:0x00a1, B:145:0x00c0, B:146:0x00c7, B:148:0x00cd, B:149:0x00d4, B:152:0x0115, B:154:0x0134, B:155:0x0139, B:157:0x013d, B:159:0x0144, B:166:0x0168, B:167:0x017c, B:169:0x0182, B:170:0x018a, B:162:0x0156, B:137:0x008d, B:139:0x0094, B:141:0x009a, B:142:0x009e, B:135:0x0084, B:175:0x01a7, B:176:0x01ab, B:178:0x01b1, B:180:0x01c1, B:183:0x01d5, B:184:0x01d8), top: B:200:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cd A[Catch: all -> 0x01e2, TryCatch #3 {all -> 0x01e9, blocks: (B:114:0x002a, B:171:0x019e, B:185:0x01db, B:115:0x002e, B:116:0x0034, B:118:0x003a, B:120:0x005a, B:124:0x0064, B:143:0x00a1, B:145:0x00c0, B:146:0x00c7, B:148:0x00cd, B:149:0x00d4, B:152:0x0115, B:154:0x0134, B:155:0x0139, B:157:0x013d, B:159:0x0144, B:166:0x0168, B:167:0x017c, B:169:0x0182, B:170:0x018a, B:162:0x0156, B:137:0x008d, B:139:0x0094, B:141:0x009a, B:142:0x009e, B:135:0x0084, B:175:0x01a7, B:176:0x01ab, B:178:0x01b1, B:180:0x01c1, B:183:0x01d5, B:184:0x01d8), top: B:200:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0115 A[Catch: all -> 0x01e2, TryCatch #3 {all -> 0x01e9, blocks: (B:114:0x002a, B:171:0x019e, B:185:0x01db, B:115:0x002e, B:116:0x0034, B:118:0x003a, B:120:0x005a, B:124:0x0064, B:143:0x00a1, B:145:0x00c0, B:146:0x00c7, B:148:0x00cd, B:149:0x00d4, B:152:0x0115, B:154:0x0134, B:155:0x0139, B:157:0x013d, B:159:0x0144, B:166:0x0168, B:167:0x017c, B:169:0x0182, B:170:0x018a, B:162:0x0156, B:137:0x008d, B:139:0x0094, B:141:0x009a, B:142:0x009e, B:135:0x0084, B:175:0x01a7, B:176:0x01ab, B:178:0x01b1, B:180:0x01c1, B:183:0x01d5, B:184:0x01d8), top: B:200:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0134 A[Catch: all -> 0x01e2, TryCatch #3 {all -> 0x01e9, blocks: (B:114:0x002a, B:171:0x019e, B:185:0x01db, B:115:0x002e, B:116:0x0034, B:118:0x003a, B:120:0x005a, B:124:0x0064, B:143:0x00a1, B:145:0x00c0, B:146:0x00c7, B:148:0x00cd, B:149:0x00d4, B:152:0x0115, B:154:0x0134, B:155:0x0139, B:157:0x013d, B:159:0x0144, B:166:0x0168, B:167:0x017c, B:169:0x0182, B:170:0x018a, B:162:0x0156, B:137:0x008d, B:139:0x0094, B:141:0x009a, B:142:0x009e, B:135:0x0084, B:175:0x01a7, B:176:0x01ab, B:178:0x01b1, B:180:0x01c1, B:183:0x01d5, B:184:0x01d8), top: B:200:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x013d A[Catch: all -> 0x01e2, TryCatch #3 {all -> 0x01e9, blocks: (B:114:0x002a, B:171:0x019e, B:185:0x01db, B:115:0x002e, B:116:0x0034, B:118:0x003a, B:120:0x005a, B:124:0x0064, B:143:0x00a1, B:145:0x00c0, B:146:0x00c7, B:148:0x00cd, B:149:0x00d4, B:152:0x0115, B:154:0x0134, B:155:0x0139, B:157:0x013d, B:159:0x0144, B:166:0x0168, B:167:0x017c, B:169:0x0182, B:170:0x018a, B:162:0x0156, B:137:0x008d, B:139:0x0094, B:141:0x009a, B:142:0x009e, B:135:0x0084, B:175:0x01a7, B:176:0x01ab, B:178:0x01b1, B:180:0x01c1, B:183:0x01d5, B:184:0x01d8), top: B:200:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0144 A[Catch: all -> 0x01e2, TryCatch #3 {all -> 0x01e9, blocks: (B:114:0x002a, B:171:0x019e, B:185:0x01db, B:115:0x002e, B:116:0x0034, B:118:0x003a, B:120:0x005a, B:124:0x0064, B:143:0x00a1, B:145:0x00c0, B:146:0x00c7, B:148:0x00cd, B:149:0x00d4, B:152:0x0115, B:154:0x0134, B:155:0x0139, B:157:0x013d, B:159:0x0144, B:166:0x0168, B:167:0x017c, B:169:0x0182, B:170:0x018a, B:162:0x0156, B:137:0x008d, B:139:0x0094, B:141:0x009a, B:142:0x009e, B:135:0x0084, B:175:0x01a7, B:176:0x01ab, B:178:0x01b1, B:180:0x01c1, B:183:0x01d5, B:184:0x01d8), top: B:200:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0156 A[Catch: all -> 0x01e2, TryCatch #3 {all -> 0x01e9, blocks: (B:114:0x002a, B:171:0x019e, B:185:0x01db, B:115:0x002e, B:116:0x0034, B:118:0x003a, B:120:0x005a, B:124:0x0064, B:143:0x00a1, B:145:0x00c0, B:146:0x00c7, B:148:0x00cd, B:149:0x00d4, B:152:0x0115, B:154:0x0134, B:155:0x0139, B:157:0x013d, B:159:0x0144, B:166:0x0168, B:167:0x017c, B:169:0x0182, B:170:0x018a, B:162:0x0156, B:137:0x008d, B:139:0x0094, B:141:0x009a, B:142:0x009e, B:135:0x0084, B:175:0x01a7, B:176:0x01ab, B:178:0x01b1, B:180:0x01c1, B:183:0x01d5, B:184:0x01d8), top: B:200:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0J(java.util.List r31) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC013506m.A0J(java.util.List):boolean");
    }
}
