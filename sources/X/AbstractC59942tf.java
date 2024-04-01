package X;

import android.app.Application;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: X.2tf */
/* loaded from: classes2.dex */
public abstract class AbstractC59942tf {
    public String A00() {
        if (!(this instanceof C68413Jp)) {
            if (this instanceof C3A8) {
                C87083z5 c87083z5 = ((C3A8) this).A00;
                if ((c87083z5.A00 & 8) == 8) {
                    C87063z3 A0i = c87083z5.A0i();
                    if ((A0i.A00 & 4) == 4) {
                        return A0i.A03;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        C87083z5 c87083z52 = ((C68413Jp) this).A00;
        if ((c87083z52.A00 & 8) == 8) {
            C87063z3 A0i2 = c87083z52.A0i();
            if ((A0i2.A00 & 4) == 4) {
                return A0i2.A03;
            }
            return null;
        }
        return null;
    }

    public void A01(C001200o c001200o) {
        if (this instanceof C3A8) {
            return;
        }
        C3A7 c3a7 = (C3A7) this;
        Application application = c001200o.A00;
        C03780Ha c03780Ha = c3a7.A00;
        C03460Fu.A07(application, c03780Ha.A00, c03780Ha.A04, c3a7.A03, c3a7.A01, c03780Ha.A02);
        C0HZ A03 = C03460Fu.A03(c001200o.A00);
        if (A03 != null) {
            A03.toString();
        }
    }

    public void A02(OutputStream outputStream) {
        if (!(this instanceof C3A8)) {
            C3A7 c3a7 = (C3A7) this;
            if (!(c3a7 instanceof C68413Jp)) {
                C03780Ha c03780Ha = c3a7.A00;
                int i = 0;
                byte[][] bArr = {C03460Fu.A00, new byte[]{Byte.parseByte(c03780Ha.A00)}, c03780Ha.A04, c03780Ha.A02, c03780Ha.A01};
                do {
                    byte[] bArr2 = bArr[i];
                    Arrays.toString(bArr2);
                    outputStream.write(bArr2);
                    i++;
                } while (i < 5);
                return;
            }
            ((C68413Jp) c3a7).A00.A0A(outputStream);
            return;
        }
        ((C3A8) this).A00.A0A(outputStream);
    }

    public boolean A03(String str) {
        if (!(this instanceof C68413Jp)) {
            if (this instanceof C3A8) {
                return C03460Fu.A0E(((C3A8) this).A00, str);
            }
            return false;
        }
        return C03460Fu.A0E(((C68413Jp) this).A00, str);
    }

    public byte[] A04() {
        if (!(this instanceof C3A8)) {
            return ((C3A7) this).A02;
        }
        return ((C3A8) this).A01;
    }

    public byte[] A05() {
        if (!(this instanceof C3A8)) {
            return ((C3A7) this).A03;
        }
        return ((C3A8) this).A02;
    }
}
