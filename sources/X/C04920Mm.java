package X;

import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.0Mm */
/* loaded from: classes.dex */
public class C04920Mm {
    public static volatile C04920Mm A08;
    public final C02L A00;
    public final C40261rr A01;
    public final C001200o A02;
    public final C451820s A03;
    public final C0C9 A04;
    public final C05Y A05;
    public final C41521u3 A06;
    public final C07A A07;

    public C04920Mm(C001200o c001200o, C02L c02l, C05Y c05y, C41521u3 c41521u3, C40261rr c40261rr, C0C9 c0c9, C07A c07a, C451820s c451820s) {
        this.A02 = c001200o;
        this.A00 = c02l;
        this.A05 = c05y;
        this.A01 = c40261rr;
        this.A06 = c41521u3;
        this.A04 = c0c9;
        this.A07 = c07a;
        this.A03 = c451820s;
    }

    public static C04920Mm A00() {
        if (A08 == null) {
            synchronized (C04920Mm.class) {
                if (A08 == null) {
                    A08 = new C04920Mm(C001200o.A01, C02L.A00(), C05Y.A01(), C41521u3.A00(), C40261rr.A00(), C0C9.A00(), C07A.A01(), C451820s.A00());
                }
            }
        }
        return A08;
    }

    public static C465827k A01(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ArrayList arrayList = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1742926524) {
                if (hashCode == -1379070739 && nextName.equals("old_jid")) {
                    str = jsonReader.nextString();
                }
            } else if (nextName.equals("notify_jids")) {
                arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(jsonReader.nextString());
                }
            }
        }
        if (str == null || arrayList == null) {
            return null;
        }
        return new C465827k(str, arrayList);
    }

    public void A02() {
        Log.i("ChangeNumberManager/deleteChangeNumberContacts");
        new File(this.A02.A00.getFilesDir(), "change_number_contacts.json").delete();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0065, code lost:
        if (r3.equals(r2.A00) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03() {
        /*
            r7 = this;
            java.lang.String r0 = "changenumbermanager/sendchangenumber"
            com.whatsapp.util.Log.i(r0)
            X.02L r0 = r7.A00
            com.whatsapp.Me r6 = r0.A01()
            if (r6 == 0) goto Laa
            java.lang.String r3 = r6.jabber_id
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts"
            com.whatsapp.util.Log.i(r0)
            X.00o r0 = r7.A02
            android.app.Application r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "change_number_contacts.json"
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            boolean r0 = r2.exists()
            r5 = 0
            if (r0 == 0) goto L54
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L4c java.io.IOException -> L56
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L4c java.io.IOException -> L56
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.io.FileNotFoundException -> L4c java.io.IOException -> L56
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L4c java.io.IOException -> L56
            android.util.JsonReader r1 = new android.util.JsonReader     // Catch: java.io.FileNotFoundException -> L4c java.io.IOException -> L56
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> L4c java.io.IOException -> L56
            X.27k r2 = A01(r1)     // Catch: java.lang.Throwable -> L45
            r1.close()     // Catch: java.io.IOException -> L41 java.io.FileNotFoundException -> L43
            goto L5d
        L41:
            r1 = move-exception
            goto L58
        L43:
            r1 = move-exception
            goto L4e
        L45:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            throw r0     // Catch: java.io.FileNotFoundException -> L4c java.io.IOException -> L56
        L4c:
            r1 = move-exception
            r2 = r5
        L4e:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/notFoundJson "
            com.whatsapp.util.Log.w(r0, r1)
            goto L5d
        L54:
            r2 = r5
            goto L67
        L56:
            r1 = move-exception
            r2 = r5
        L58:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/ioErrorJson "
            com.whatsapp.util.Log.w(r0, r1)
        L5d:
            if (r2 == 0) goto L54
            java.lang.String r0 = r2.A00
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L54
        L67:
            X.1rr r0 = r7.A01
            java.util.Set r3 = r0.A02()
            if (r2 == 0) goto L95
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r0 = r2.A01
            java.util.List r4 = X.C003101m.A0F(r1, r0)
            r0 = r4
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r2 = r0.iterator()
        L7e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r1 = r2.next()
            r0 = r3
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L7e
            r2.remove()
            goto L7e
        L95:
            r4 = r5
        L96:
            X.05Y r3 = r7.A05
            java.lang.String r0 = r6.jabber_id
            X.0Mz r2 = new X.0Mz
            r2.<init>(r0, r4)
            r1 = 0
            r0 = 61
            android.os.Message r0 = android.os.Message.obtain(r5, r1, r0, r1, r2)
            r3.A09(r0)
            return
        Laa:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04920Mm.A03():void");
    }

    public boolean A04() {
        return this.A00.A01() != null;
    }
}
