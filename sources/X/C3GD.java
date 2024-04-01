package X;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: X.3GD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3GD implements C2zH {
    public ByteArrayOutputStream A00;

    @Override // X.C2zH
    public OutputStream AQY(InterfaceC02170Ad interfaceC02170Ad) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.A00 = byteArrayOutputStream;
        return byteArrayOutputStream;
    }
}
