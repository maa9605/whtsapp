package X;

import android.database.Cursor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1yx */
/* loaded from: classes2.dex */
public class C44371yx {
    public static final byte[] A08 = "WhatsApp Patch Integrity".getBytes(Charset.forName("UTF-8"));
    public static volatile C44371yx A09;
    public final AbstractC000600i A00;
    public final C02L A01;
    public final C01B A02;
    public final C44331yt A03;
    public final C44311yr A04;
    public final C1z2 A05;
    public final C44401z0 A06;
    public final C44351yv A07;

    public C44371yx(AbstractC000600i abstractC000600i, C02L c02l, C01B c01b, C44311yr c44311yr, C44331yt c44331yt, C44351yv c44351yv, C44401z0 c44401z0, C1z2 c1z2) {
        this.A00 = abstractC000600i;
        this.A01 = c02l;
        this.A02 = c01b;
        this.A04 = c44311yr;
        this.A03 = c44331yt;
        this.A07 = c44351yv;
        this.A06 = c44401z0;
        this.A05 = c1z2;
    }

    public static C44371yx A00() {
        if (A09 == null) {
            synchronized (C44371yx.class) {
                if (A09 == null) {
                    A09 = new C44371yx(AbstractC000600i.A00(), C02L.A00(), C01B.A00(), C44311yr.A00(), C44331yt.A00(), C44351yv.A00(), C44401z0.A00(), C1z2.A00());
                }
            }
        }
        return A09;
    }

    public static byte[] A01(byte[] bArr, List list, byte[] bArr2, boolean z) {
        C000700j.A09(bArr.length == 128, "Current hash array must be of size 128");
        byte[] bArr3 = new byte[128];
        System.arraycopy(bArr, 0, bArr3, 0, 128);
        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr4 = (byte[]) it.next();
            if (bArr4 != null) {
                ByteBuffer wrap2 = ByteBuffer.wrap(C002701i.A1Y(bArr4, bArr2, 128));
                wrap2.order(ByteOrder.LITTLE_ENDIAN);
                wrap.mark();
                while (wrap.hasRemaining()) {
                    int position = wrap.position();
                    int i = wrap.getShort() & 65535;
                    int i2 = wrap2.getShort() & 65535;
                    int i3 = z ? i + i2 : i - i2;
                    int position2 = wrap.position();
                    wrap.position(position);
                    wrap.putShort((short) (((short) i3) & 65535));
                    wrap.position(position2);
                }
                wrap.reset();
            } else {
                throw null;
            }
        }
        return wrap.array();
    }

    public final void A02(String str, boolean z, int i) {
        if (!z) {
            this.A03.A02(i);
            this.A00.A09("anti-tampering-error", str, false);
            return;
        }
        throw new C44921zs(i);
    }

    public final byte[] A03(String str, String[] strArr, List list) {
        C0CD A01 = this.A06.A00.A01();
        try {
            Cursor A07 = A01.A02.A07("SELECT lt_hash FROM collection_versions WHERE collection_name = ?", new String[]{str});
            byte[] blob = (A07 == null || !A07.moveToFirst()) ? null : A07.getBlob(0);
            if (A07 != null) {
                A07.close();
            }
            if (blob == null) {
                blob = new byte[128];
            }
            C02A.A03(blob);
            Arrays.toString(strArr);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C02A.A03((byte[]) it.next()));
            }
            C44351yv c44351yv = this.A07;
            if (c44351yv != null) {
                ArrayList<byte[]> arrayList2 = new ArrayList();
                if (strArr.length != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    A01 = c44351yv.A01.A01();
                    try {
                        C0Jf c0Jf = new C0Jf(strArr, 998);
                        while (c0Jf.hasNext()) {
                            String[] strArr2 = (String[]) c0Jf.next();
                            arrayList3.clear();
                            arrayList3.add(str);
                            arrayList3.addAll(Arrays.asList(strArr2));
                            C0CE c0ce = A01.A02;
                            int length = strArr2.length;
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT mutation_mac FROM syncd_mutations WHERE collection_name = ? AND mutation_index IN ");
                            sb.append(C05P.A01(length));
                            Cursor A072 = c0ce.A07(sb.toString(), (String[]) arrayList3.toArray(C44351yv.A02));
                            while (A072.moveToNext()) {
                                byte[] blob2 = A072.getBlob(0);
                                if (blob2 != null) {
                                    arrayList2.add(blob2);
                                }
                            }
                            A072.close();
                        }
                        A01.close();
                    } finally {
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (byte[] bArr : arrayList2) {
                    arrayList4.add(C02A.A03(bArr));
                }
                byte[] bArr2 = A08;
                return A01(A01(blob, arrayList2, bArr2, false), list, bArr2, true);
            }
            throw null;
        } finally {
            try {
                throw th;
            } finally {
                try {
                    A01.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
