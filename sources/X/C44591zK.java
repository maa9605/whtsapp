package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1zK */
/* loaded from: classes2.dex */
public class C44591zK {
    public final long A00;
    public final long A01;
    public final Set A02;
    public final Set A03;

    public C44591zK(long j, long j2, Set set, Set set2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = set;
        this.A03 = set2;
    }

    public static int A00(C44591zK c44591zK, C44591zK c44591zK2) {
        boolean A03 = A03(c44591zK, c44591zK2);
        boolean A032 = A03(c44591zK2, c44591zK);
        return A03 ? A032 ? 2 : 0 : A032 ? 1 : 3;
    }

    public static C44591zK A01(C44591zK c44591zK, C44591zK c44591zK2) {
        long max = Math.max(c44591zK.A00, c44591zK2.A00);
        long max2 = Math.max(c44591zK.A01, c44591zK2.A01);
        HashSet hashSet = new HashSet(c44591zK.A02);
        hashSet.addAll(c44591zK2.A02);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C2FF) it.next()).A00 < max) {
                it.remove();
            }
        }
        if (hashSet.size() > 1000) {
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList, new Comparator() { // from class: X.2uM
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((C2FF) obj2).A00 > ((C2FF) obj).A00 ? 1 : (((C2FF) obj2).A00 == ((C2FF) obj).A00 ? 0 : -1));
                }
            });
            List subList = arrayList.subList(0, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            hashSet = new HashSet(subList);
            max = ((C2FF) subList.get(subList.size() - 1)).A00;
        }
        HashSet hashSet2 = new HashSet(c44591zK.A03);
        hashSet2.addAll(c44591zK2.A03);
        if (max2 <= max) {
            max2 = 0;
        }
        return new C44591zK(max, max2, hashSet, hashSet2);
    }

    public static C44591zK A02(AnonymousClass208 anonymousClass208) {
        AbstractC005302j A02;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(anonymousClass208.A01);
        long millis2 = timeUnit.toMillis(anonymousClass208.A02);
        if (!((anonymousClass208.A00 & 1) == 1) || anonymousClass208.A03.size() != 0) {
            int i = anonymousClass208.A00;
            if (!((i & 1) == 1) || (i & 2) != 2 || millis2 > millis) {
                C0CX<C41F> c0cx = anonymousClass208.A03;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (C41F c41f : c0cx) {
                    if ((c41f.A00 & 1) == 1) {
                        C452421a c452421a = c41f.A02;
                        if (c452421a == null) {
                            c452421a = C452421a.A05;
                        }
                        int i2 = c452421a.A00;
                        if ((i2 & 2) == 2 && (i2 & 4) == 4 && (i2 & 1) == 1 && (A02 = AbstractC005302j.A02(c452421a.A03)) != null) {
                            UserJid nullable = UserJid.getNullable(c452421a.A02);
                            boolean z = c452421a.A04;
                            if (!C003101m.A0U(A02) || z || nullable != null) {
                                C2FF c2ff = new C2FF(TimeUnit.SECONDS.toMillis(c41f.A01), z, c452421a.A01, A02, nullable);
                                if (c2ff.A00 == 0) {
                                    hashSet2.add(c2ff);
                                } else {
                                    hashSet.add(c2ff);
                                }
                            }
                        }
                    }
                    return null;
                }
                if (hashSet.size() > 1000) {
                    return null;
                }
                return new C44591zK(millis, millis2, hashSet, hashSet2);
            }
        }
        return null;
    }

    public static boolean A03(C44591zK c44591zK, C44591zK c44591zK2) {
        for (Object obj : c44591zK2.A03) {
            if (!c44591zK.A02.contains(obj) && !c44591zK.A03.contains(obj)) {
                return false;
            }
        }
        for (C2FF c2ff : c44591zK2.A02) {
            if (c2ff.A00 > c44591zK.A00 && !c44591zK.A02.contains(c2ff) && !c44591zK.A03.contains(c2ff)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass208 A04() {
        C0CT AVX = AnonymousClass208.A04.AVX();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(this.A00);
        long seconds2 = timeUnit.toSeconds(this.A01);
        if (seconds > 0) {
            AVX.A02();
            AnonymousClass208 anonymousClass208 = (AnonymousClass208) AVX.A00;
            anonymousClass208.A00 |= 1;
            anonymousClass208.A01 = seconds;
        }
        if (seconds2 > 0) {
            AVX.A02();
            AnonymousClass208 anonymousClass2082 = (AnonymousClass208) AVX.A00;
            anonymousClass2082.A00 |= 2;
            anonymousClass2082.A02 = seconds2;
        }
        for (C2FF c2ff : this.A02) {
            C41F A00 = c2ff.A00();
            AVX.A02();
            AnonymousClass208 anonymousClass2083 = (AnonymousClass208) AVX.A00;
            if (A00 != null) {
                C0CX c0cx = anonymousClass2083.A03;
                if (!((C0CY) c0cx).A00) {
                    c0cx = C0AZ.A05(c0cx);
                    anonymousClass2083.A03 = c0cx;
                }
                c0cx.add(A00);
            } else {
                throw null;
            }
        }
        for (C2FF c2ff2 : this.A03) {
            C41F A002 = c2ff2.A00();
            AVX.A02();
            AnonymousClass208 anonymousClass2084 = (AnonymousClass208) AVX.A00;
            if (A002 != null) {
                C0CX c0cx2 = anonymousClass2084.A03;
                if (!((C0CY) c0cx2).A00) {
                    c0cx2 = C0AZ.A05(c0cx2);
                    anonymousClass2084.A03 = c0cx2;
                }
                c0cx2.add(A002);
            } else {
                throw null;
            }
        }
        return (AnonymousClass208) AVX.A01();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C44591zK.class != obj.getClass()) {
            return false;
        }
        C44591zK c44591zK = (C44591zK) obj;
        return this.A00 == c44591zK.A00 && this.A01 == c44591zK.A01 && this.A02.equals(c44591zK.A02) && this.A03.equals(c44591zK.A03);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), Long.valueOf(this.A01), this.A02, this.A03});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncdMessageRange{lastMessageTimestamp=");
        A0P.append(this.A00);
        A0P.append(", lastSystemMessageTimestamp=");
        A0P.append(this.A01);
        A0P.append(", messages=");
        A0P.append(this.A02);
        A0P.append(", messagesWithoutTimestamp=");
        A0P.append(this.A03);
        A0P.append('}');
        return A0P.toString();
    }
}
