package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.1t8 */
/* loaded from: classes2.dex */
public class C40951t8 {
    public static volatile C40951t8 A09;
    public final AnonymousClass031 A00;
    public final C018508q A01;
    public final C01B A02;
    public final C06K A03;
    public final C05W A04;
    public final C02E A05;
    public final C001200o A06;
    public final C002301c A07;
    public final C02C A08;

    public C40951t8(C001200o c001200o, C018508q c018508q, C01B c01b, C05W c05w, C02E c02e, C002301c c002301c, AnonymousClass031 anonymousClass031, C02C c02c, C06K c06k) {
        this.A06 = c001200o;
        this.A01 = c018508q;
        this.A02 = c01b;
        this.A04 = c05w;
        this.A05 = c02e;
        this.A07 = c002301c;
        this.A00 = anonymousClass031;
        this.A08 = c02c;
        this.A03 = c06k;
    }

    public static C40951t8 A00() {
        if (A09 == null) {
            synchronized (C40951t8.class) {
                if (A09 == null) {
                    A09 = new C40951t8(C001200o.A01, C018508q.A00(), C01B.A00(), C05W.A00(), C02E.A00(), C002301c.A00(), AnonymousClass031.A00(), C02C.A00(), C06K.A00());
                }
            }
        }
        return A09;
    }

    public C43321xD A01(String str) {
        C43271x8 c43271x8 = new C43271x8();
        try {
            C40961t9.A01(str, c43271x8);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (c43271x8.A04.size() <= 257) {
                StringBuilder A0P = C000200d.A0P("contactpicker/contact array separation (size: ");
                A0P.append(c43271x8.A04.size());
                A0P.append(")");
                C0HC c0hc = new C0HC(A0P.toString());
                for (C43281x9 c43281x9 : c43271x8.A04) {
                    C001200o c001200o = this.A06;
                    C05W c05w = this.A04;
                    C002301c c002301c = this.A07;
                    C04110Ip A06 = C04110Ip.A06(c001200o, c05w, c002301c, this.A03, c43281x9);
                    if (A06 != null) {
                        C43291xA c43291xA = new C43291xA(c002301c, this.A00);
                        try {
                            C43291xA.A01(this.A02, c05w, A06);
                            C04120Iq c04120Iq = new C04120Iq(c43291xA.A03(A06), A06);
                            arrayList2.add(c04120Iq);
                            arrayList.add(c04120Iq.A00);
                        } catch (C43301xB e) {
                            Log.e(e);
                            throw new C43301xB() { // from class: X.1xC
                            };
                        }
                    }
                }
                c0hc.A01();
                return new C43321xD(arrayList2, arrayList, arrayList2.size() == 1 ? ((C04120Iq) arrayList2.get(0)).A01.A08() : null);
            }
            StringBuilder A0P2 = C000200d.A0P("Too many vCards for a contact array message: ");
            A0P2.append(c43271x8.A04.size());
            Log.w(A0P2.toString());
            throw new C43301xB() { // from class: X.1xE
            };
        } catch (C43301xB unused) {
            throw new C43301xB() { // from class: X.1xF
            };
        }
    }

    public String A02(Uri uri) {
        ContentResolver A07 = this.A05.A07();
        if (A07 != null) {
            C02C c02c = this.A08;
            c02c.A03(uri);
            try {
                AssetFileDescriptor openAssetFileDescriptor = A07.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    c02c.A04(openAssetFileDescriptor.getParcelFileDescriptor());
                    FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
                    C43351xG c43351xG = new C43351xG(createInputStream, 10000000L);
                    String A0D = AnonymousClass024.A0D(c43351xG);
                    if (A0D != null) {
                        c43351xG.A02.close();
                        if (createInputStream != null) {
                            createInputStream.close();
                        }
                        openAssetFileDescriptor.close();
                        return A0D;
                    }
                    throw null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to open uri=");
                sb.append(uri);
                throw new IOException(sb.toString());
            } catch (SecurityException e) {
                throw new IOException(e);
            }
        }
        throw new IOException("Unable to open uri; cr=null");
    }

    public void A03(C43301xB c43301xB) {
        Log.e("vcardloader/exception", c43301xB);
        if (c43301xB instanceof C43341xF) {
            this.A01.A07(R.string.vcard_format_unsupport, 0);
        } else if (c43301xB instanceof C43331xE) {
            this.A01.A0E(this.A07.A0A(R.plurals.contact_array_message_reach_limit, 257L, 257), 0);
        } else if (!(c43301xB instanceof C43311xC)) {
        } else {
            this.A01.A07(R.string.must_have_displayname, 0);
        }
    }
}
