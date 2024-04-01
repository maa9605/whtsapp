package X;

/* renamed from: X.1rL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC40041rL extends C07I {
    public static void A00(InterfaceC002101a interfaceC002101a, String str, String str2, String str3) {
        String A0H = C000200d.A0H("HMAC", str);
        C01Z c01z = (C01Z) interfaceC002101a;
        c01z.A00(C000200d.A0H("Mac.", A0H), str2);
        StringBuilder sb = new StringBuilder("Alg.Alias.Mac.HMAC-");
        sb.append(str);
        c01z.A00(sb.toString(), A0H);
        StringBuilder sb2 = new StringBuilder("Alg.Alias.Mac.HMAC/");
        sb2.append(str);
        c01z.A00(sb2.toString(), A0H);
        StringBuilder sb3 = new StringBuilder("KeyGenerator.");
        sb3.append(A0H);
        c01z.A00(sb3.toString(), str3);
        StringBuilder sb4 = new StringBuilder("Alg.Alias.KeyGenerator.HMAC-");
        sb4.append(str);
        c01z.A00(sb4.toString(), A0H);
        StringBuilder sb5 = new StringBuilder("Alg.Alias.KeyGenerator.HMAC/");
        sb5.append(str);
        c01z.A00(sb5.toString(), A0H);
    }
}
