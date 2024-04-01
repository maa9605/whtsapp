package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.dns.DnsCacheEntrySerializable;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.01H */
/* loaded from: classes.dex */
public class C01H implements InterfaceC001000m {
    public static volatile C01H A02;
    public final AnonymousClass012 A00;
    public final HashMap A01 = new HashMap();

    public C01H(AnonymousClass012 anonymousClass012, final C000800k c000800k) {
        this.A00 = anonymousClass012;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.04Y
            {
                C01H.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c000800k.A01(C01H.this);
            }
        });
    }

    public static C01H A00() {
        if (A02 == null) {
            synchronized (C01H.class) {
                if (A02 == null) {
                    A02 = new C01H(AnonymousClass012.A00(), C000800k.A02);
                }
            }
        }
        return A02;
    }

    public C08120af A01(String str) {
        C000200d.A14("resolving ", str);
        synchronized (this) {
            HashMap hashMap = this.A01;
            List<DnsCacheEntrySerializable> list = (List) hashMap.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                int i = 0;
                for (DnsCacheEntrySerializable dnsCacheEntrySerializable : list) {
                    AnonymousClass012 anonymousClass012 = this.A00;
                    if (dnsCacheEntrySerializable.expirationTime != null && anonymousClass012.A05() >= dnsCacheEntrySerializable.expirationTime.longValue()) {
                        hashSet.add(dnsCacheEntrySerializable);
                    } else {
                        arrayList.add(dnsCacheEntrySerializable.inetAddress);
                        i = dnsCacheEntrySerializable.resolverType;
                    }
                }
                list.removeAll(hashSet);
                if (list.isEmpty()) {
                    hashMap.remove(str);
                }
                C08120af c08120af = new C08120af(new C08180ar(i, true), (InetAddress[]) arrayList.toArray(new InetAddress[0]));
                InetAddress[] inetAddressArr = c08120af.A04;
                if (inetAddressArr != null && inetAddressArr.length > 0) {
                    return c08120af;
                }
            }
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            A03(str, Arrays.asList(allByName), 0);
            return new C08120af(new C08180ar(0, false), allByName);
        } catch (UnknownHostException e) {
            StringBuilder sb = new StringBuilder("primary dns resolution failed for ");
            sb.append(str);
            Log.w(sb.toString(), e);
            try {
                AbstractCollection abstractCollection = (AbstractCollection) C1P8.A01(str, 0);
                ArrayList arrayList2 = new ArrayList(abstractCollection.size());
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C1P7) it.next()).A01);
                }
                A03(str, arrayList2, 1);
                return new C08120af(new C08180ar(1, false), (InetAddress[]) arrayList2.toArray(new InetAddress[0]));
            } catch (UnknownHostException e2) {
                StringBuilder sb2 = new StringBuilder("secondary dns resolution failed for ");
                sb2.append(str);
                Log.w(sb2.toString(), e2);
                try {
                    return A02(str, true);
                } catch (UnknownHostException e3) {
                    StringBuilder sb3 = new StringBuilder("hardcoded ip resolution failed for ");
                    sb3.append(str);
                    Log.w(sb3.toString(), e3);
                    throw e;
                }
            }
        }
    }

    public final C08120af A02(String str, boolean z) {
        List list = (List) C1P6.A00.get(str);
        if (list != null && !list.isEmpty()) {
            if (z) {
                A03(str, list, 2);
            }
            return new C08120af(new C08180ar(2, false), (InetAddress[]) list.toArray(new InetAddress[0]));
        }
        throw new UnknownHostException(C000200d.A0H("no hardcoded ips found for ", str));
    }

    public final void A03(String str, Iterable iterable, int i) {
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new DnsCacheEntrySerializable(Long.valueOf(currentTimeMillis), (InetAddress) it.next(), null, false, false, i));
        }
        synchronized (this) {
            this.A01.put(str, arrayList);
        }
    }

    @Override // X.InterfaceC001000m
    public void AIx(C05050Nc c05050Nc) {
        synchronized (this) {
            this.A01.clear();
        }
    }
}
