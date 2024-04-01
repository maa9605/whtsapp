package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0FE */
/* loaded from: classes.dex */
public class C0FE {
    public static volatile C0FE A0A;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C01B A02;
    public final C04h A03;
    public final AnonymousClass012 A04;
    public final C000500h A05;
    public final C0FD A06 = new C0FD() { // from class: X.1kl
        {
            C0FE.this = this;
        }

        @Override // X.C0FD
        public final C02630Ce A6h(AbstractC011205o abstractC011205o) {
            UserJid userJid;
            C0FE c0fe = C0FE.this;
            C02630Ce c02630Ce = new C02630Ce(abstractC011205o);
            AbstractC011205o abstractC011205o2 = c02630Ce.A02;
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            C0CD A03 = c0fe.A08.A03();
            try {
                C0CE c0ce = A03.A02;
                String rawString = abstractC011205o2.getRawString();
                int i = 0;
                Cursor A07 = c0ce.A07("SELECT jid, admin, pending, sent_sender_key FROM group_participants WHERE gjid = ?", new String[]{rawString});
                while (A07.moveToNext()) {
                    try {
                        String string = A07.getString(0);
                        if (TextUtils.isEmpty(string)) {
                            C02L c02l = c0fe.A01;
                            c02l.A05();
                            userJid = c02l.A03;
                            if (userJid == null) {
                                throw null;
                                break;
                            }
                        } else {
                            userJid = UserJid.get(string);
                        }
                        C0D7 c0d7 = new C0D7(userJid, A07.getInt(1), A07.getInt(2) == 1, (A07.isNull(3) ? 0 : A07.getInt(3)) == 1);
                        concurrentHashMap.put(c0d7.A03, c0d7);
                    } catch (C011305p e) {
                        Log.e("ParticipantMessageStore/getGroupParticipants invalid jid from db", e);
                    }
                }
                A07.close();
                A03.close();
                c02630Ce.A01 = concurrentHashMap;
                c02630Ce.A07();
                Iterator it = c02630Ce.A05().iterator();
                while (true) {
                    C04250Jl c04250Jl = (C04250Jl) it;
                    if (c04250Jl.hasNext()) {
                        ((C0D7) c04250Jl.next()).A00 = i;
                        i++;
                    } else {
                        return c02630Ce;
                    }
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
    };
    public final C02960Do A07;
    public final C05E A08;
    public final C05C A09;

    public C0FE(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C02L c02l, C01B c01b, C05C c05c, C04h c04h, C05E c05e, C000500h c000500h, C02960Do c02960Do) {
        this.A04 = anonymousClass012;
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A02 = c01b;
        this.A09 = c05c;
        this.A03 = c04h;
        this.A08 = c05e;
        this.A05 = c000500h;
        this.A07 = c02960Do;
    }

    public static C0FE A00() {
        if (A0A == null) {
            synchronized (C0FE.class) {
                if (A0A == null) {
                    A0A = new C0FE(AnonymousClass012.A00(), AbstractC000600i.A00(), C02L.A00(), C01B.A00(), C05C.A00(), C04h.A00(), C05E.A00(), C000500h.A00(), C02960Do.A02);
                }
            }
        }
        return A0A;
    }

    public Set A01(AbstractC011205o abstractC011205o) {
        HashSet hashSet = new HashSet();
        C0CD A03 = this.A08.A03();
        try {
            Cursor A09 = A03.A02.A09("group_participants", new String[]{"jid"}, "gjid = ?", new String[]{abstractC011205o.getRawString()}, null, "getGroupParticipantsSet/QUERY_GROUP_PARTICIPANTS");
            while (A09.moveToNext()) {
                String string = A09.getString(0);
                if (TextUtils.isEmpty(string)) {
                    C02L c02l = this.A01;
                    c02l.A05();
                    UserJid userJid = c02l.A03;
                    if (userJid == null) {
                        throw null;
                    }
                    hashSet.add(userJid);
                } else {
                    try {
                        hashSet.add(UserJid.get(string));
                    } catch (C011305p unused) {
                    }
                }
            }
            A09.close();
            A03.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    public Set A02(AbstractC011205o abstractC011205o, String str) {
        ?? arrayList;
        boolean z;
        Set A01 = A01(abstractC011205o);
        if (TextUtils.equals(C02630Ce.A00(A01), str)) {
            return A01;
        }
        C0CD A03 = this.A08.A03();
        try {
            Cursor A09 = A03.A02.A09("group_participants_history", new String[]{"jid", "action", "old_phash", "new_phash"}, "gjid = ?", new String[]{abstractC011205o.getRawString()}, "_id DESC", "getHistoricGroupParticipants/QUERY_GROUP_PARTICIPANTS_HISTORY");
            while (A09.moveToNext()) {
                String string = A09.getString(A09.getColumnIndexOrThrow("jid"));
                int i = A09.getInt(A09.getColumnIndexOrThrow("action"));
                String string2 = A09.getString(A09.getColumnIndexOrThrow("old_phash"));
                if (!TextUtils.equals(A09.getString(A09.getColumnIndexOrThrow("new_phash")), str)) {
                    if (string.equals("")) {
                        C02L c02l = this.A01;
                        c02l.A05();
                        arrayList = Collections.singletonList(c02l.A03);
                    } else {
                        arrayList = new ArrayList();
                        String[] split = TextUtils.split(string, ",");
                        for (String str2 : split) {
                            if (str2.equals("")) {
                                C02L c02l2 = this.A01;
                                c02l2.A05();
                                arrayList.add(c02l2.A03);
                            } else {
                                try {
                                    arrayList.add(UserJid.get(str2));
                                } catch (C011305p unused) {
                                }
                            }
                        }
                    }
                    if (i == 1) {
                        A01.removeAll(arrayList);
                        z = true;
                    } else if (i == 2) {
                        A01.addAll(arrayList);
                        z = true;
                    } else if (i != 3) {
                        z = false;
                    } else if (arrayList.size() != 2) {
                        z = false;
                    } else {
                        A01.remove(arrayList.get(1));
                        A01.add(arrayList.get(0));
                        z = true;
                    }
                    if (!z) {
                        A09.close();
                        A03.close();
                        return null;
                    }
                    if (!TextUtils.equals(string2, str)) {
                        if (TextUtils.equals(C02630Ce.A00(A01), str)) {
                        }
                    }
                    A09.close();
                    A03.close();
                    return A01;
                }
                A09.close();
                A03.close();
                return A01;
            }
            A09.close();
            A03.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    A03.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
    }

    public void A03(C02630Ce c02630Ce) {
        Iterator it = c02630Ce.A05().iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (c04250Jl.hasNext()) {
                A04(c02630Ce, (C0D7) c04250Jl.next(), false);
            } else {
                AbstractC011205o abstractC011205o = c02630Ce.A02;
                A05(abstractC011205o);
                C04h c04h = this.A03;
                c04h.A01.A01(new C27281Mt(abstractC011205o));
                return;
            }
        }
    }

    public final void A04(C02630Ce c02630Ce, C0D7 c0d7, boolean z) {
        if (c0d7.A04.get(DeviceJid.of(c0d7.A03)) == null) {
            AbstractC000600i abstractC000600i = this.A00;
            StringBuilder A0P = C000200d.A0P("grp=");
            A0P.append(c02630Ce.A02);
            A0P.append("participants=");
            A0P.append(c0d7.toString());
            A0P.append("props=");
            String A02 = this.A09.A02("participant_user_ready");
            A0P.append(A02 != null ? Integer.parseInt(A02) : 0);
            A0P.append("/");
            A0P.append(this.A02.A07(C01C.A2t));
            A0P.append("/");
            if (this.A05 != null) {
                A0P.append(2);
                abstractC000600i.A09("participant-message-store/group-participant-without-device", A0P.toString(), true);
            } else {
                throw null;
            }
        }
        Iterator it = c0d7.A00().iterator();
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (!c04250Jl.hasNext()) {
                return;
            }
            ((C04430Kd) c04250Jl.next()).A00 = z;
        }
    }

    public final void A05(AbstractC011205o abstractC011205o) {
        StringBuilder sb = new StringBuilder("msgstore/setParticipantsHaveSenderKey/");
        sb.append(abstractC011205o);
        sb.append(" value:");
        sb.append(false);
        Log.i(sb.toString());
        C0CD A04 = this.A08.A04();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sent_sender_key", (Boolean) false);
            A04.A02.A00("group_participants", contentValues, "gjid = ?", new String[]{abstractC011205o.getRawString()});
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

    public final void A06(AbstractC011205o abstractC011205o, Collection collection, int i, String str, String str2) {
        String join = TextUtils.join(",", collection);
        if (TextUtils.equals(str, str2)) {
            return;
        }
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("timestamp", Long.valueOf(this.A04.A05() / 1000));
        contentValues.put("gjid", abstractC011205o.getRawString());
        contentValues.put("jid", join);
        contentValues.put("action", Integer.valueOf(i));
        contentValues.put("old_phash", str);
        contentValues.put("new_phash", str2);
        C0CD A04 = this.A08.A04();
        try {
            A04.A02.A02("group_participants_history", contentValues);
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
