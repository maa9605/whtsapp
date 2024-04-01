package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2K4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2K4 {
    public static volatile C2K4 A08;
    public final AbstractC000600i A00;
    public final C012005w A01;
    public final C018508q A02;
    public final AnonymousClass012 A03;
    public final C0C9 A04;
    public final C00A A05;
    public final InterfaceC002901k A06;
    public final Map A07 = new HashMap();

    public C2K4(AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C012005w c012005w, C0C9 c0c9, C00A c00a) {
        this.A03 = anonymousClass012;
        this.A02 = c018508q;
        this.A00 = abstractC000600i;
        this.A06 = interfaceC002901k;
        this.A01 = c012005w;
        this.A04 = c0c9;
        this.A05 = c00a;
    }

    public void A00(final AnonymousClass097 anonymousClass097) {
        byte b = anonymousClass097.A0m;
        final long A06 = this.A03.A06(anonymousClass097.A0E);
        final String str = anonymousClass097.A06;
        if (str == null) {
            this.A06.AS1(new RunnableEBaseShape3S0200000_I0_3(this, anonymousClass097, 1));
            return;
        }
        final C018508q c018508q = this.A02;
        final AbstractC000600i abstractC000600i = this.A00;
        int i = ((AnonymousClass092) anonymousClass097).A04;
        final ArrayList arrayList = new ArrayList(3);
        C012005w c012005w = this.A01;
        arrayList.add(c012005w.A0E(b, i, 2));
        arrayList.add(c012005w.A0E(b, i, 1));
        arrayList.add(c012005w.A0E(b, i, 3));
        C0CH c0ch = new C0CH(c018508q, abstractC000600i, arrayList, str, A06) { // from class: X.3LV
            public final long A00;
            public final C0HE A01;
            public final AbstractC000600i A02;
            public final String A03;
            public final Collection A04;

            {
                this.A02 = abstractC000600i;
                this.A03 = str;
                this.A04 = arrayList;
                this.A00 = A06;
                Executor executor = c018508q.A06;
                C0HE c0he = new C0HE();
                executor.execute(new RunnableC71983Yf(c0he, 10000L));
                this.A01 = c0he;
            }

            @Override // X.C0CH
            public Object A04() {
                C0HE c0he = this.A01;
                c0he.A02();
                ArrayList arrayList2 = new ArrayList();
                for (File file : this.A04) {
                    File[] listFiles = file.listFiles();
                    c0he.A02();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.isFile()) {
                                long abs = Math.abs(file2.lastModified() - this.A00);
                                if (abs <= 3600000) {
                                    arrayList2.add(new C63062z0(file2, abs));
                                }
                            }
                        }
                    }
                }
                c0he.A02();
                Collections.sort(arrayList2, new Comparator() { // from class: X.2yz
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return (((C63062z0) obj).A00 > ((C63062z0) obj2).A00 ? 1 : (((C63062z0) obj).A00 == ((C63062z0) obj2).A00 ? 0 : -1));
                    }
                });
                arrayList2.size();
                c0he.A02();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    File file3 = ((C63062z0) it.next()).A01;
                    c0he.A02();
                    try {
                    } catch (IOException e) {
                        Log.e("mediafilefindjob/run/ioexception", e);
                    }
                    if (this.A03.equals(C40841sx.A0I(file3))) {
                        return file3;
                    }
                }
                StringBuilder A0P = C000200d.A0P("file not found for hash ");
                A0P.append(this.A03);
                A0P.append("; job=");
                A0P.append(this);
                throw new FileNotFoundException(A0P.toString());
            }

            @Override // X.C0CH, X.C0CJ
            public void cancel() {
                super.cancel();
                this.A01.A01();
            }
        };
        this.A07.put(anonymousClass097, c0ch);
        C09H c09h = anonymousClass097.A02;
        if (c09h != null) {
            c09h.A0a = true;
            c09h.A0C = 0L;
            this.A05.A05(anonymousClass097, -1);
            C0CG c0cg = new C0CG() { // from class: X.3Fv
                @Override // X.C0CG
                public final void A54(Object obj) {
                    C2K4 c2k4 = C2K4.this;
                    AnonymousClass097 anonymousClass0972 = anonymousClass097;
                    File file = (File) obj;
                    c2k4.A07.remove(anonymousClass0972);
                    C09H c09h2 = anonymousClass0972.A02;
                    if (c09h2 != null) {
                        c09h2.A0a = false;
                        if (c09h2 != null) {
                            c09h2.A0L = false;
                            c09h2.A0F = file;
                            c09h2.A0A = file.length();
                            boolean z = true;
                            c09h2.A0O = true;
                            C09H c09h3 = anonymousClass0972.A02;
                            if (c09h3 != null) {
                                if (anonymousClass0972.A09 == null || c09h3.A0F == null) {
                                    z = C0D6.A00(((AnonymousClass092) anonymousClass0972).A08, 2) >= 0;
                                }
                                c09h2.A0P = z;
                                c2k4.A04.A0T(anonymousClass0972);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
            };
            Executor executor = c018508q.A06;
            ((C0CI) c0ch).A01.A03(c0cg, executor);
            ((C0CI) c0ch).A00.A03(new C0CG() { // from class: X.3Fu
                @Override // X.C0CG
                public final void A54(Object obj) {
                    C2K4.this.A01(anonymousClass097, (Throwable) obj);
                }
            }, executor);
            this.A06.AS1(c0ch);
            return;
        }
        throw null;
    }

    public final void A01(AnonymousClass097 anonymousClass097, Throwable th) {
        this.A07.remove(anonymousClass097);
        C09H c09h = anonymousClass097.A02;
        if (c09h != null) {
            c09h.A0a = false;
            this.A05.A05(anonymousClass097, -1);
            if (th instanceof FileNotFoundException) {
                this.A02.A05(R.string.invalid_url_for_download, 1);
                return;
            }
            return;
        }
        throw null;
    }
}
