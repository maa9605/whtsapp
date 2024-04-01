package X;

import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.3tG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84143tG extends C0HS {
    public final C0C9 A00;
    public final AbstractC005302j A01;
    public final C2MV A02;
    public final WeakReference A03;

    public C84143tG(C0C9 c0c9, C2MV c2mv, InterfaceC73333bT interfaceC73333bT, AbstractC005302j abstractC005302j) {
        this.A00 = c0c9;
        this.A02 = c2mv;
        this.A03 = new WeakReference(interfaceC73333bT);
        this.A01 = abstractC005302j;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        C73353bV c73353bV;
        AnonymousClass094 anonymousClass094;
        DataInputStream dataInputStream;
        C2MV c2mv = this.A02;
        AbstractC005302j abstractC005302j = this.A01;
        AnonymousClass092 anonymousClass092 = null;
        if (c2mv != null) {
            C000700j.A04(abstractC005302j, "Jid cannot be null");
            File A02 = c2mv.A02(abstractC005302j);
            if (A02 != null && A02.exists()) {
                File A03 = c2mv.A03(abstractC005302j);
                if (A03 != null && A03.exists()) {
                    try {
                        dataInputStream = new DataInputStream(new FileInputStream(A03));
                    } catch (FileNotFoundException e) {
                        Log.e("draftvoicenotecache/getquotedmessagekey/ ", e);
                    } catch (IOException e2) {
                        Log.e("draftvoicenotecache/getquotedmessagekey/", e2);
                    } catch (IndexOutOfBoundsException e3) {
                        Log.e("draftvoicenotecache/getquotedmessagekey/", e3);
                        File A032 = c2mv.A03(abstractC005302j);
                        if (A032 != null && A032.exists()) {
                            A032.delete();
                        }
                    }
                    try {
                        byte[] bArr = new byte[(int) A03.length()];
                        dataInputStream.readFully(bArr);
                        String[] split = new String(bArr).split(":;:");
                        anonymousClass094 = new AnonymousClass094(AbstractC005302j.A02(split[0]), Boolean.valueOf(split[1]).booleanValue(), split[2]);
                        dataInputStream.close();
                        c73353bV = new C73353bV(A02, anonymousClass094);
                        anonymousClass092 = this.A00.A0F(c73353bV.A00);
                    } finally {
                    }
                }
                anonymousClass094 = null;
                c73353bV = new C73353bV(A02, anonymousClass094);
                anonymousClass092 = this.A00.A0F(c73353bV.A00);
            } else {
                c73353bV = null;
            }
            return new C73343bU(c73353bV, anonymousClass092);
        }
        throw null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C73343bU c73343bU = (C73343bU) obj;
        InterfaceC73333bT interfaceC73333bT = (InterfaceC73333bT) this.A03.get();
        if (interfaceC73333bT != null) {
            interfaceC73333bT.AO9(c73343bU);
        }
    }
}
