package X;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0DA  reason: invalid class name */
/* loaded from: classes.dex */
public class C0DA extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099, C0D9 {
    public String A00;
    public List A01;
    public List A02;
    public final C06K A03;
    public final C05W A04;
    public final C001200o A05;
    public final C002301c A06;

    public C0DA(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k, AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 14);
        this.A05 = c001200o;
        this.A04 = c05w;
        this.A06 = c002301c;
        this.A03 = c06k;
        super.A01 = 1;
    }

    public C0DA(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k, C0DA c0da, AnonymousClass094 anonymousClass094, long j, boolean z) {
        super(c0da, anonymousClass094, j, z);
        this.A05 = c001200o;
        this.A04 = c05w;
        this.A06 = c002301c;
        this.A03 = c06k;
        super.A01 = 1;
        this.A01 = c0da.A01;
        this.A00 = c0da.A00;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        this.A00 = str;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        this.A00 = str;
    }

    public List A18() {
        List list = this.A01;
        if (list == null) {
            List A0z = AnonymousClass029.A0z(A15());
            this.A01 = A0z;
            return A0z;
        }
        return list;
    }

    public void A19(List list) {
        this.A01 = new ArrayList(list);
        this.A02 = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this.A01);
            A0w(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new AssertionError("ObjectOutputStream backed by ByteArrayOutputStream should not throw IOException");
        }
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C2FR c2fr = (C2FR) ((C40531sQ) c40541sR.A00).A0o().AVX();
        if (!TextUtils.isEmpty(this.A00)) {
            String str = this.A00;
            c2fr.A02();
            C2FS.A0B((C2FS) c2fr.A00, str);
        }
        List A18 = A18();
        for (int i = 0; i < A18.size() && i < 257; i++) {
            String str2 = (String) A18.get(i);
            C0CT AVX = C2FQ.A04.AVX();
            String A00 = C04110Ip.A00(this.A05, this.A04, this.A06, this.A03, str2);
            if (A00 != null) {
                AVX.A02();
                C2FQ.A0B((C2FQ) AVX.A00, A00);
            }
            AVX.A02();
            C2FQ.A0A((C2FQ) AVX.A00, str2);
            c2fr.A02();
            C2FS.A0A((C2FS) c2fr.A00, (C2FQ) AVX.A01());
        }
        C0CM c0cm = c40551sS.A02;
        byte[] bArr = c40551sS.A05;
        if (AnonymousClass029.A1U(this, c0cm, bArr)) {
            C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm, bArr);
            c2fr.A02();
            C2FS.A09((C2FS) c2fr.A00, A0G);
        }
        c40541sR.A02();
        C40531sQ.A0H((C40531sQ) c40541sR.A00, c2fr);
    }

    @Override // X.C0D9
    public AnonymousClass092 A6F(AnonymousClass094 anonymousClass094, long j) {
        return new C0DA(this.A05, this.A04, this.A06, this.A03, this, anonymousClass094, j, false);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0DA(this.A05, this.A04, this.A06, this.A03, this, anonymousClass094, this.A0E, true);
    }
}
