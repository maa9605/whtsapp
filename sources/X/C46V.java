package X;

import com.whatsapp.VideoFrameConverter;
import java.nio.ByteBuffer;

/* renamed from: X.46V */
/* loaded from: classes3.dex */
public class C46V {
    public static final int[] A0A = {2, 3, 4, 6, 8};
    public ByteBuffer A00;
    public final AnonymousClass359 A01;
    public final C57202or A03;
    public final InterfaceC57222ot A05;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public final C57212os A04 = new C57212os();
    public final Object A06 = new Object();
    public final C46U A02 = new C46U();

    public C46V(final AnonymousClass358 anonymousClass358) {
        InterfaceC57222ot interfaceC57222ot = new InterfaceC57222ot() { // from class: X.471
            {
                C46V.this = this;
            }

            @Override // X.InterfaceC57222ot
            public C57212os A8D() {
                int[] iArr;
                C46V c46v = C46V.this;
                if (c46v.A08) {
                    Object obj = c46v.A06;
                    synchronized (obj) {
                        c46v.A07 = true;
                        while (!c46v.A09 && c46v.A08) {
                            try {
                                obj.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                        if (!c46v.A08) {
                            c46v.A07 = false;
                        } else {
                            C46U c46u = c46v.A02;
                            byte[] bArr = c46u.A02;
                            if (bArr != null) {
                                C57212os c57212os = c46v.A04;
                                c57212os.A02 = bArr;
                                c57212os.A01 = c46u.A01;
                                c57212os.A00 = c46u.A00;
                            } else if (c46u.A03 != null) {
                                int i = 480;
                                int i2 = 640;
                                for (int i3 : C46V.A0A) {
                                    i2 = (c46u.A01 * i3) / 8;
                                    i = (i3 * c46u.A00) / 8;
                                    if (i2 >= 640 && i >= 480) {
                                        break;
                                    }
                                }
                                if (c46v.A08) {
                                    int i4 = i2 * i;
                                    ByteBuffer byteBuffer = c46v.A00;
                                    if (byteBuffer == null || byteBuffer.capacity() != i4) {
                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i4);
                                        c46v.A00 = allocateDirect;
                                        C57212os c57212os2 = c46v.A04;
                                        c57212os2.A02 = allocateDirect.array();
                                        c57212os2.A01 = i2;
                                        c57212os2.A00 = i;
                                    }
                                    C44X c44x = (C44X) c46u.A03[0];
                                    VideoFrameConverter.scalePlane(c44x.A01, c44x.A00, c46u.A01, c46u.A00, c46v.A00, i2, i2, i);
                                } else {
                                    c46v.A07 = false;
                                }
                            }
                            c46v.A07 = false;
                            obj.notify();
                            return c46v.A04;
                        }
                        obj.notify();
                        return null;
                    }
                }
                return null;
            }
        };
        this.A05 = interfaceC57222ot;
        this.A01 = new AnonymousClass359(this);
        this.A03 = new C57202or(3, interfaceC57222ot, new InterfaceC57182op() { // from class: X.35A
            @Override // X.InterfaceC57182op
            public final void AMP(C1D9 c1d9) {
                anonymousClass358.A00.A02(c1d9);
            }
        });
    }

    public void A00() {
        if (this.A08) {
            this.A08 = false;
            this.A03.A01();
        }
    }
}
