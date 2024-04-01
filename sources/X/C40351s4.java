package X;

import android.content.UriMatcher;

/* renamed from: X.1s4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40351s4 {
    public static volatile C40351s4 A02;
    public final UriMatcher A00;
    public final C00J A01;

    public C40351s4(final C02L c02l, final C05W c05w, final C018708s c018708s, final C0C8 c0c8, final C40371s6 c40371s6, final C0C7 c0c7) {
        this.A01 = C007203d.A00(new InterfaceC007103c() { // from class: X.3D6
            @Override // X.InterfaceC007103c
            public final Object get() {
                return new C40361s5(C02L.this, c05w, c018708s, c0c8, c40371s6, c0c7);
            }
        });
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A00 = uriMatcher;
        uriMatcher.addURI("com.whatsapp.provider.instrumentation", "contacts", 1);
    }
}
