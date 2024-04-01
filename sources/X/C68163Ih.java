package X;

import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: X.3Ih  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68163Ih extends C0JL implements InterfaceC40221rn {
    public C68163Ih(HttpURLConnection httpURLConnection) {
        super(httpURLConnection);
    }

    @Override // X.InterfaceC40221rn
    public String A96() {
        return AnonymousClass024.A0D(AAe());
    }

    @Override // X.InterfaceC40221rn
    public String A9y() {
        return AnonymousClass024.A0D(this.A01.getErrorStream());
    }

    @Override // X.InterfaceC40221rn
    public String ACs() {
        return this.A01.getResponseMessage();
    }

    @Override // X.InterfaceC40221rn
    public List AEb(String str) {
        return this.A01.getHeaderFields().get(str);
    }
}
