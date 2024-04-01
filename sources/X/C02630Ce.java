package X;

import android.util.Base64;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Ce */
/* loaded from: classes.dex */
public class C02630Ce {
    public String A00;
    public Map A01 = new ConcurrentHashMap();
    public final AbstractC011205o A02;

    public C02630Ce(AbstractC011205o abstractC011205o) {
        if (abstractC011205o != null) {
            this.A02 = abstractC011205o;
            return;
        }
        throw null;
    }

    public static String A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        Collections.sort(arrayList);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                messageDigest.update(((String) it2.next()).getBytes());
            }
            byte[] digest = messageDigest.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder sb = new StringBuilder("1:");
            sb.append(Base64.encodeToString(bArr, 2));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static Set A01(Collection collection) {
        C000700j.A07(!collection.isEmpty());
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new C04430Kd((DeviceJid) it.next(), false));
        }
        return hashSet;
    }

    public Pair A02(UserJid userJid, C07D c07d) {
        C0D7 c0d7 = (C0D7) this.A01.get(userJid);
        if (c0d7 == null) {
            StringBuilder sb = new StringBuilder("GroupParticipants/refreshDevices/participant ");
            sb.append(userJid);
            sb.append(" doesn't exist");
            Log.w(sb.toString());
            Boolean bool = Boolean.FALSE;
            return new Pair(bool, bool);
        }
        ConcurrentHashMap concurrentHashMap = c0d7.A04;
        C07D A01 = C07D.A01(concurrentHashMap.keySet());
        Iterator it = c07d.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            C04250Jl c04250Jl = (C04250Jl) it;
            if (!c04250Jl.hasNext()) {
                break;
            }
            DeviceJid deviceJid = (DeviceJid) c04250Jl.next();
            if (!A01.A00.contains(deviceJid)) {
                C04430Kd c04430Kd = new C04430Kd(deviceJid, false);
                DeviceJid deviceJid2 = c04430Kd.A01;
                if (!concurrentHashMap.containsKey(deviceJid2)) {
                    concurrentHashMap.put(deviceJid2, c04430Kd);
                }
                z2 = true;
            }
        }
        Iterator it2 = A01.iterator();
        while (true) {
            C04250Jl c04250Jl2 = (C04250Jl) it2;
            if (!c04250Jl2.hasNext()) {
                break;
            }
            Object next = c04250Jl2.next();
            if (!c07d.A00.contains(next)) {
                concurrentHashMap.remove(next);
                z = true;
            }
        }
        if (z2 || z) {
            A07();
            if (z) {
                A08();
            }
        }
        return new Pair(Boolean.valueOf(z2), Boolean.valueOf(z));
    }

    public final C0D7 A03(UserJid userJid, Collection collection, int i, boolean z, boolean z2) {
        C0D7 c0d7 = (C0D7) this.A01.get(userJid);
        if (c0d7 != null) {
            c0d7.A01 = i;
            c0d7.A02 = z;
        } else {
            c0d7 = new C0D7(userJid, A01(collection), i, z);
            c0d7.A00 = this.A01.size();
            this.A01.put(userJid, c0d7);
            if (z2) {
                A07();
                return c0d7;
            }
        }
        return c0d7;
    }

    public C07D A04() {
        return C07D.A01(this.A01.keySet());
    }

    public C07D A05() {
        return C07D.A01(this.A01.values());
    }

    public ArrayList A06() {
        ArrayList arrayList = new ArrayList();
        for (C0D7 c0d7 : this.A01.values()) {
            if (c0d7.A01 != 0) {
                arrayList.add(c0d7);
            }
        }
        return arrayList;
    }

    public void A07() {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.A01.entrySet()) {
            Iterator it = ((C0D7) entry.getValue()).A00().iterator();
            while (true) {
                C04250Jl c04250Jl = (C04250Jl) it;
                if (c04250Jl.hasNext()) {
                    hashSet.add(((C04430Kd) c04250Jl.next()).A01);
                }
            }
        }
        this.A00 = C002501g.A0F(hashSet);
    }

    public final void A08() {
        for (C0D7 c0d7 : this.A01.values()) {
            for (C04430Kd c04430Kd : c0d7.A04.values()) {
                c04430Kd.A00 = false;
            }
        }
    }

    public void A09(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0D7 c0d7 = (C0D7) it.next();
            A03(c0d7.A03, C07D.A01(c0d7.A04.keySet()).A02(), c0d7.A01, c0d7.A02, false);
        }
        A07();
    }

    public void A0A(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (this.A01.remove(obj) != null) {
                z = true;
            }
        }
        if (z) {
            A07();
        }
    }

    public boolean A0B(C02L c02l) {
        c02l.A05();
        UserJid userJid = c02l.A03;
        return userJid != null && this.A01.containsKey(userJid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C02630Ce.class != obj.getClass()) {
            return false;
        }
        C02630Ce c02630Ce = (C02630Ce) obj;
        if (this.A02.equals(c02630Ce.A02) && this.A01.equals(c02630Ce.A01)) {
            String str = this.A00;
            String str2 = c02630Ce.A00;
            if (str != null) {
                return str.equals(str2);
            }
            return str2 == null;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A01.hashCode() + (this.A02.hashCode() * 31)) * 31;
        String str = this.A00;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("GroupParticipants{groupJid='");
        A0P.append(this.A02);
        A0P.append('\'');
        A0P.append(", participants=");
        A0P.append(this.A01);
        A0P.append(", participantHash='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
