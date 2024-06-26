package org.spongycastle.jcajce.provider.digest;

import X.AbstractC40041rL;
import X.C000200d;
import X.C01Z;
import X.C0DP;
import X.C2iS;
import X.C49132Iq;
import X.C54092i4;
import X.C75313eh;
import X.C75383eo;
import X.InterfaceC002101a;

/* loaded from: classes2.dex */
public class MD5 {

    /* loaded from: classes2.dex */
    public class Mappings extends AbstractC40041rL {
        public static final String A00 = MD5.class.getName();

        @Override // X.C07I
        public void A00(InterfaceC002101a interfaceC002101a) {
            StringBuilder sb = new StringBuilder();
            String str = A00;
            C01Z c01z = (C01Z) interfaceC002101a;
            c01z.A00("MessageDigest.MD5", C000200d.A0L(sb, str, "$Digest"));
            AbstractC40041rL.A00(c01z, "MD5", C000200d.A0L(new StringBuilder(), str, "$HashMac"), C000200d.A0L(new StringBuilder(), str, "$KeyGenerator"));
        }
    }

    /* loaded from: classes2.dex */
    public class Digest extends C49132Iq implements Cloneable {
        public Digest() {
            super(new C0DP());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            C49132Iq c49132Iq = (C49132Iq) super.clone();
            c49132Iq.A00 = new C0DP((C0DP) this.A00);
            return c49132Iq;
        }
    }

    /* loaded from: classes2.dex */
    public class HashMac extends C2iS {
        public HashMac() {
            super(new C54092i4(new C0DP()));
        }
    }

    /* loaded from: classes2.dex */
    public class KeyGenerator extends C75383eo {
        public KeyGenerator() {
            super("HMACMD5", 128, new C75313eh());
        }
    }
}
