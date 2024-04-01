package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* renamed from: X.3Ms */
/* loaded from: classes2.dex */
public class C68993Ms {
    public int A00;
    public int A01;
    public ArrayList A02;
    public Map A03;

    public C68993Ms() {
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = new ArrayList();
    }

    public C68993Ms(byte[] bArr) {
        int length = bArr.length;
        this.A03 = new HashMap();
        int i = 0;
        this.A01 = 0;
        this.A00 = 0;
        ArrayList arrayList = new ArrayList();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (i < length) {
            short s = wrap.getShort();
            byte[] bArr2 = new byte[2];
            wrap.get(bArr2);
            int A05 = C40841sx.A05(bArr2);
            byte[] bArr3 = new byte[A05];
            wrap.get(bArr3);
            arrayList.add(new C68983Mr(s, bArr3));
            this.A03.put(Short.valueOf(s), Integer.valueOf(this.A00));
            this.A00++;
            i += A05 + 4;
        }
        if (i == length) {
            this.A01 = i;
            this.A02 = new ArrayList();
            this.A02 = new ArrayList(arrayList);
            return;
        }
        throw new C27871Pc((byte) 80, new SSLException("Error while parsing extension"));
    }

    public C68983Mr A00(short s) {
        int intValue;
        Number number = (Number) this.A03.get(Short.valueOf(s));
        if (number == null || (intValue = number.intValue()) >= this.A00) {
            return null;
        }
        return (C68983Mr) this.A02.get(intValue);
    }

    public void A01(C68983Mr c68983Mr) {
        ArrayList arrayList = this.A02;
        int i = this.A00;
        arrayList.add(i, c68983Mr);
        this.A01 += c68983Mr.A01.length + 4;
        this.A00 = i + 1;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("extensions{extensions=");
        A0P.append(Arrays.toString(this.A02.toArray()));
        A0P.append(", idx=");
        A0P.append(this.A00);
        A0P.append(", totalNetworkBytes=");
        A0P.append(this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
