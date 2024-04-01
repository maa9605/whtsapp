package X;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.25Q */
/* loaded from: classes2.dex */
public class C25Q {
    public static volatile C25Q A08;
    public final C05W A00;
    public final AnonymousClass060 A01;
    public final C000500h A02;
    public final C05M A03;
    public final C06J A04;
    public final C60112tw A05;
    public final C25N A06;
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();

    public C25Q(AnonymousClass012 anonymousClass012, C05M c05m, C44301yq c44301yq, C05W c05w, C000500h c000500h, C06J c06j, AnonymousClass060 anonymousClass060, C60112tw c60112tw) {
        this.A03 = c05m;
        this.A00 = c05w;
        this.A02 = c000500h;
        this.A04 = c06j;
        this.A01 = anonymousClass060;
        this.A05 = c60112tw;
        this.A06 = new C25N(anonymousClass012, c44301yq);
    }

    public static C25Q A00() {
        if (A08 == null) {
            synchronized (C25Q.class) {
                if (A08 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C05M A002 = C05M.A00();
                    C44301yq A003 = C44301yq.A00();
                    C05W A004 = C05W.A00();
                    C000500h A005 = C000500h.A00();
                    C06J A01 = C06J.A01();
                    AnonymousClass060 A006 = AnonymousClass060.A00();
                    if (C60112tw.A04 == null) {
                        synchronized (C60112tw.class) {
                            if (C60112tw.A04 == null) {
                                C60112tw.A04 = new C60112tw(C0C9.A00(), C03710Gt.A00(), C012406b.A00(), C05E.A00());
                            }
                        }
                    }
                    A08 = new C25Q(A00, A002, A003, A004, A005, A01, A006, C60112tw.A04);
                }
            }
        }
        return A08;
    }

    public static final boolean A01(C27791Ou c27791Ou) {
        C27631Od c27631Od = c27791Ou.A00;
        return c27631Od.A0G == 0 && c27631Od.A06 == 0;
    }

    public final List A02(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC005302j abstractC005302j = (AbstractC005302j) it.next();
            if (this.A00.A09(abstractC005302j) != null) {
                arrayList.add(new C27791Ou(abstractC005302j, this.A04.A05(abstractC005302j)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public void A03(AtomicBoolean atomicBoolean) {
        boolean z;
        Cursor A07;
        SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet(this.A03.A0B());
        AnonymousClass060 anonymousClass060 = this.A01;
        Cursor A0D = anonymousClass060.A0D();
        try {
            if (A0D.getCount() != 0) {
                List A01 = AnonymousClass060.A01(hashSet2, A0D);
                AbstractCollection abstractCollection = (AbstractCollection) A01;
                abstractCollection.size();
                if (!abstractCollection.isEmpty()) {
                    anonymousClass060.A0T(A01);
                }
                A0D.close();
                z = true;
            } else {
                A0D.close();
                z = false;
            }
            if (z) {
                A07 = anonymousClass060.A0D();
            } else {
                C05E c05e = this.A05.A03;
                c05e.A05();
                A07 = c05e.A06.ACk().A07(C0HD.A0B, null);
            }
            try {
                A07.getCount();
                if (A07.moveToFirst()) {
                    boolean z2 = false;
                    while (!atomicBoolean.get()) {
                        if (arrayList.size() > 16 && !z2) {
                            SystemClock.elapsedRealtime();
                            z2 = true;
                        }
                        AbstractC005302j A02 = AbstractC005302j.A02(A07.getString(0));
                        if (A02 != null) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C27791Ou) it.next()).A01().equals(A02)) {
                                        break;
                                    }
                                } else {
                                    Iterator it2 = hashSet.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((AbstractC005302j) it2.next()).equals(A02)) {
                                                break;
                                            }
                                        } else {
                                            hashSet.add(A02);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if ((arrayList.size() < 16 && hashSet.size() >= 2) || (arrayList.size() >= 16 && hashSet.size() >= 5)) {
                            List A022 = A02(hashSet);
                            hashSet.clear();
                            AbstractList abstractList = (AbstractList) A022;
                            if (!abstractList.isEmpty()) {
                                arrayList.addAll(A022);
                                arrayList.size();
                                C60102tv c60102tv = new C60102tv(A022);
                                Iterator it3 = this.A07.iterator();
                                while (it3.hasNext()) {
                                    ((InterfaceC53992hs) it3.next()).AIN(c60102tv);
                                }
                                for (int i = 0; i < abstractList.size(); i++) {
                                    anonymousClass060.A0M((C27791Ou) abstractList.get(i));
                                }
                            }
                        }
                        if (!A07.moveToNext()) {
                            if (hashSet.size() > 0) {
                                arrayList.addAll(A02(hashSet));
                            }
                            Collections.sort(arrayList);
                        }
                    }
                    A07.close();
                    return;
                }
                A07.close();
                if (anonymousClass060 != null) {
                    try {
                        C0CD A0B = anonymousClass060.A0B();
                        C03790Hb A00 = A0B.A00();
                        Cursor A0D2 = anonymousClass060.A0D();
                        List A012 = AnonymousClass060.A01(hashSet2, A0D2);
                        anonymousClass060.A0T(A012);
                        A0D2.close();
                        if (((ArrayList) A012).size() == 0) {
                            C0CD A0A = anonymousClass060.A0A();
                            Cursor A05 = AnonymousClass061.A05(A0A, "wa_contact_storage_usage", new String[]{"jid"}, null, null, null, "CONTACT_STORAGE_USAGES");
                            try {
                                int count = A05.getCount();
                                A05.close();
                                A0A.close();
                                if (count != hashSet2.size()) {
                                    HashSet hashSet3 = new HashSet();
                                    HashSet hashSet4 = new HashSet(hashSet2);
                                    C0CD A0B2 = anonymousClass060.A0B();
                                    C03790Hb A002 = A0B2.A00();
                                    try {
                                        Cursor A052 = AnonymousClass061.A05(A0B2, "wa_contact_storage_usage", new String[]{"jid"}, null, null, null, "CONTACT_STORAGE_USAGES");
                                        while (A052.moveToNext()) {
                                            AbstractC005302j A023 = AbstractC005302j.A02(A052.getString(0));
                                            if (A023 == null) {
                                                Log.w("contact-manager-database/remove-copies-and-not-wa-contacts/jid is null or invalid!");
                                            } else if (hashSet4.contains(A023)) {
                                                hashSet4.remove(A023);
                                            } else {
                                                hashSet3.add(A023);
                                            }
                                        }
                                        A052.close();
                                        Iterator it4 = hashSet3.iterator();
                                        while (it4.hasNext()) {
                                            AnonymousClass061.A09(A0B2, "wa_contact_storage_usage", "jid = ? ", new String[]{((AbstractC005302j) it4.next()).getRawString()});
                                        }
                                        A002.A00();
                                        A002.close();
                                        A0B2.close();
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    if (A05 != null) {
                                        try {
                                            A05.close();
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        ContentValues contentValues = new ContentValues();
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            C27791Ou c27791Ou = (C27791Ou) it5.next();
                            AbstractC005302j A013 = c27791Ou.A01();
                            C27631Od c27631Od = c27791Ou.A00;
                            long j = c27631Od.A0G;
                            int i2 = c27631Od.A06;
                            contentValues.clear();
                            contentValues.put("conversation_size", Long.valueOf(j));
                            contentValues.put("conversation_message_count", Integer.valueOf(i2));
                            AnonymousClass061.A04(A0B, "wa_contact_storage_usage", contentValues, "jid = ?", new String[]{A013.getRawString()});
                        }
                        A00.A00();
                        A00.close();
                        A0B.close();
                    } catch (IllegalArgumentException e) {
                        Log.e("contact-mgr-db/unable to update batch on storage usage table", e);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        C27791Ou c27791Ou2 = (C27791Ou) it6.next();
                        if (c27791Ou2 != null && !A01(c27791Ou2)) {
                            arrayList2.add(c27791Ou2);
                        }
                    }
                    if (atomicBoolean.get()) {
                        return;
                    }
                    C25N c25n = this.A06;
                    c25n.A01.A0I("STORAGE_USAGE_CHAT_LIST_CACHE_TIME", String.valueOf(c25n.A00.A05()));
                    C60092tu c60092tu = new C60092tu(arrayList2);
                    Iterator it7 = this.A07.iterator();
                    while (it7.hasNext()) {
                        ((InterfaceC53992hs) it7.next()).AIM(c60092tu);
                    }
                    SystemClock.elapsedRealtime();
                    return;
                }
                throw null;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    if (A07 != null) {
                        try {
                            A07.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                if (A0D != null) {
                    try {
                        A0D.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th6;
            }
        }
    }

    public boolean A04(C03870Hl c03870Hl, InterfaceC36451kp interfaceC36451kp) {
        final C03870Hl c03870Hl2 = c03870Hl;
        AbstractC005302j abstractC005302j = c03870Hl2.A07;
        String rawString = abstractC005302j.getRawString();
        SharedPreferences sharedPreferences = this.A02.A00;
        if (rawString.equals(sharedPreferences.getString("storage_usage_deletion_jid", null))) {
            final int i = sharedPreferences.getInt("storage_usage_deletion_all_msg_cnt", 0);
            final int i2 = sharedPreferences.getInt("storage_usage_deletion_current_msg_cnt", 0);
            final C60112tw c60112tw = this.A05;
            final C3AB c3ab = new C3AB(this, interfaceC36451kp);
            C60112tw.A00(abstractC005302j, i, i2, c3ab);
            C0C9 c0c9 = c60112tw.A00;
            c0c9.A0J(abstractC005302j);
            return c0c9.A0f(c03870Hl2, new InterfaceC36451kp() { // from class: X.3Jy
                public int A00;
                public int A01;
                public int A02;

                @Override // X.C0HB
                public boolean AUW() {
                    return false;
                }

                @Override // X.InterfaceC36451kp
                public void AKU() {
                    C60112tw c60112tw2 = c60112tw;
                    C03710Gt c03710Gt = c60112tw2.A01;
                    C03870Hl c03870Hl3 = c03870Hl2;
                    c03710Gt.A07(c03870Hl3);
                    AbstractC005302j abstractC005302j2 = c03870Hl3.A07;
                    C3AB c3ab2 = c3ab;
                    if (c60112tw2 == null) {
                        throw null;
                    }
                    if (c3ab2 != null) {
                        C25Q c25q = c3ab2.A01;
                        C06J c06j = c25q.A04;
                        C27631Od A05 = c06j.A05(abstractC005302j2);
                        c25q.A02.A0D().remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt").remove("storage_usage_deletion_all_msg_cnt").apply();
                        c25q.A01.A0M(new C27791Ou(abstractC005302j2, c06j.A05(abstractC005302j2)));
                        Iterator it = c25q.A07.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC53992hs) it.next()).AJG(abstractC005302j2, A05);
                        }
                        c3ab2.A00.AKU();
                    }
                }

                @Override // X.InterfaceC36451kp
                public void ANO(int i3, int i4) {
                    int i5 = this.A02;
                    if (i5 == -1) {
                        i5 = Math.max(i / 100, 1);
                        this.A02 = i5;
                    }
                    int i6 = i2 + i3;
                    this.A00 = i6;
                    if (i6 - this.A01 > i5) {
                        C60112tw.A00(c03870Hl2.A07, i, i6, c3ab);
                        this.A01 = this.A00;
                    }
                }

                @Override // X.InterfaceC36451kp
                public void AOp() {
                    this.A00 = i2;
                }
            });
        }
        final C60112tw c60112tw2 = this.A05;
        final C3AB c3ab2 = new C3AB(this, interfaceC36451kp);
        if (c60112tw2 != null) {
            C0HC c0hc = new C0HC("storageUsageMsgStore/deleteMessagesForJid");
            c60112tw2.A02.A02(abstractC005302j);
            C0C9 c0c92 = c60112tw2.A00;
            String[] strArr = {String.valueOf(c0c92.A0K.A05(abstractC005302j))};
            C0CD A03 = c0c92.A0n.A03();
            try {
                Cursor A07 = A03.A02.A07("SELECT COUNT(*) FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8')", strArr);
                if (A07.moveToFirst()) {
                    long j = A07.getLong(0);
                    A07.close();
                    A03.close();
                    if (j != 0) {
                        if (!c03870Hl2.A0B) {
                            c03870Hl2 = new C03870Hl(c03870Hl2.A06, c03870Hl2.A01, abstractC005302j, c03870Hl2.A00, c03870Hl2.A04, c03870Hl2.A05, c03870Hl2.A0A, c03870Hl2.A02, c03870Hl2.A03, c03870Hl2.A09, c03870Hl2.A08, true);
                        }
                        C03710Gt c03710Gt = c60112tw2.A01;
                        AbstractC005302j abstractC005302j2 = c03870Hl2.A07;
                        final int A01 = c03710Gt.A01(abstractC005302j2);
                        C60112tw.A00(abstractC005302j2, A01, 0, c3ab2);
                        c0c92.A0J(abstractC005302j2);
                        final C03870Hl c03870Hl3 = c03870Hl2;
                        boolean A0f = c0c92.A0f(c03870Hl2, new InterfaceC36451kp() { // from class: X.3Jy
                            public int A00;
                            public int A01;
                            public int A02;

                            @Override // X.C0HB
                            public boolean AUW() {
                                return false;
                            }

                            @Override // X.InterfaceC36451kp
                            public void AKU() {
                                C60112tw c60112tw22 = c60112tw2;
                                C03710Gt c03710Gt2 = c60112tw22.A01;
                                C03870Hl c03870Hl32 = c03870Hl3;
                                c03710Gt2.A07(c03870Hl32);
                                AbstractC005302j abstractC005302j22 = c03870Hl32.A07;
                                C3AB c3ab22 = c3ab2;
                                if (c60112tw22 == null) {
                                    throw null;
                                }
                                if (c3ab22 != null) {
                                    C25Q c25q = c3ab22.A01;
                                    C06J c06j = c25q.A04;
                                    C27631Od A05 = c06j.A05(abstractC005302j22);
                                    c25q.A02.A0D().remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt").remove("storage_usage_deletion_all_msg_cnt").apply();
                                    c25q.A01.A0M(new C27791Ou(abstractC005302j22, c06j.A05(abstractC005302j22)));
                                    Iterator it = c25q.A07.iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC53992hs) it.next()).AJG(abstractC005302j22, A05);
                                    }
                                    c3ab22.A00.AKU();
                                }
                            }

                            @Override // X.InterfaceC36451kp
                            public void ANO(int i3, int i4) {
                                int i5 = this.A02;
                                if (i5 == -1) {
                                    i5 = Math.max(A01 / 100, 1);
                                    this.A02 = i5;
                                }
                                int i6 = i2 + i3;
                                this.A00 = i6;
                                if (i6 - this.A01 > i5) {
                                    C60112tw.A00(c03870Hl3.A07, A01, i6, c3ab2);
                                    this.A01 = this.A00;
                                }
                            }

                            @Override // X.InterfaceC36451kp
                            public void AOp() {
                                this.A00 = i2;
                            }
                        });
                        StringBuilder A0P = C000200d.A0P("storageUsageMsgStore/deleteMessagesForJid ");
                        A0P.append(abstractC005302j2);
                        A0P.append(" success:true time spent:");
                        A0P.append(c0hc.A01());
                        Log.i(A0P.toString());
                        return A0f;
                    }
                } else {
                    A07.close();
                    A03.close();
                }
                c0c92.A0g(abstractC005302j, null);
                C03710Gt c03710Gt2 = c60112tw2.A01;
                AbstractC005302j abstractC005302j22 = c03870Hl2.A07;
                final int A012 = c03710Gt2.A01(abstractC005302j22);
                C60112tw.A00(abstractC005302j22, A012, 0, c3ab2);
                c0c92.A0J(abstractC005302j22);
                final C03870Hl c03870Hl32 = c03870Hl2;
                boolean A0f2 = c0c92.A0f(c03870Hl2, new InterfaceC36451kp() { // from class: X.3Jy
                    public int A00;
                    public int A01;
                    public int A02;

                    @Override // X.C0HB
                    public boolean AUW() {
                        return false;
                    }

                    @Override // X.InterfaceC36451kp
                    public void AKU() {
                        C60112tw c60112tw22 = c60112tw2;
                        C03710Gt c03710Gt22 = c60112tw22.A01;
                        C03870Hl c03870Hl322 = c03870Hl32;
                        c03710Gt22.A07(c03870Hl322);
                        AbstractC005302j abstractC005302j222 = c03870Hl322.A07;
                        C3AB c3ab22 = c3ab2;
                        if (c60112tw22 == null) {
                            throw null;
                        }
                        if (c3ab22 != null) {
                            C25Q c25q = c3ab22.A01;
                            C06J c06j = c25q.A04;
                            C27631Od A05 = c06j.A05(abstractC005302j222);
                            c25q.A02.A0D().remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt").remove("storage_usage_deletion_all_msg_cnt").apply();
                            c25q.A01.A0M(new C27791Ou(abstractC005302j222, c06j.A05(abstractC005302j222)));
                            Iterator it = c25q.A07.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC53992hs) it.next()).AJG(abstractC005302j222, A05);
                            }
                            c3ab22.A00.AKU();
                        }
                    }

                    @Override // X.InterfaceC36451kp
                    public void ANO(int i3, int i4) {
                        int i5 = this.A02;
                        if (i5 == -1) {
                            i5 = Math.max(A012 / 100, 1);
                            this.A02 = i5;
                        }
                        int i6 = i2 + i3;
                        this.A00 = i6;
                        if (i6 - this.A01 > i5) {
                            C60112tw.A00(c03870Hl32.A07, A012, i6, c3ab2);
                            this.A01 = this.A00;
                        }
                    }

                    @Override // X.InterfaceC36451kp
                    public void AOp() {
                        this.A00 = i2;
                    }
                });
                StringBuilder A0P2 = C000200d.A0P("storageUsageMsgStore/deleteMessagesForJid ");
                A0P2.append(abstractC005302j22);
                A0P2.append(" success:true time spent:");
                A0P2.append(c0hc.A01());
                Log.i(A0P2.toString());
                return A0f2;
            } finally {
            }
        } else {
            throw null;
        }
    }
}
